/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.oracle.bmc.ConfigFileReader
 *  com.oracle.bmc.ConfigFileReader$ConfigFile
 */
package com.mysql.cj.protocol.a.authentication;

import com.mysql.cj.Messages;
import com.mysql.cj.callback.MysqlCallbackHandler;
import com.mysql.cj.callback.UsernameCallback;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.RSAException;
import com.mysql.cj.protocol.AuthenticationPlugin;
import com.mysql.cj.protocol.ExportControlled;
import com.mysql.cj.protocol.Protocol;
import com.mysql.cj.protocol.a.NativeConstants;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.util.StringUtils;
import com.oracle.bmc.ConfigFileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.security.interfaces.RSAPrivateKey;
import java.util.Base64;
import java.util.List;

public class AuthenticationOciClient
implements AuthenticationPlugin<NativePacketPayload> {
    public static String PLUGIN_NAME = "authentication_oci_client";
    private String sourceOfAuthData = PLUGIN_NAME;
    protected Protocol<NativePacketPayload> protocol = null;
    private MysqlCallbackHandler usernameCallbackHandler = null;
    private String fingerprint = null;
    private RSAPrivateKey privateKey = null;

    @Override
    public void init(Protocol<NativePacketPayload> prot, MysqlCallbackHandler cbh) {
        this.protocol = prot;
        this.usernameCallbackHandler = cbh;
    }

    @Override
    public void reset() {
        this.fingerprint = null;
        this.privateKey = null;
    }

    @Override
    public void destroy() {
        this.reset();
    }

    @Override
    public String getProtocolPluginName() {
        return PLUGIN_NAME;
    }

    @Override
    public boolean requiresConfidentiality() {
        return false;
    }

    @Override
    public boolean isReusable() {
        return false;
    }

    @Override
    public void setAuthenticationParameters(String user, String password) {
        if (user == null && this.usernameCallbackHandler != null) {
            this.usernameCallbackHandler.handle(new UsernameCallback(System.getProperty("user.name")));
        }
    }

    @Override
    public void setSourceOfAuthData(String sourceOfAuthData) {
        this.sourceOfAuthData = sourceOfAuthData;
    }

    @Override
    public boolean nextAuthenticationStep(NativePacketPayload fromServer, List<NativePacketPayload> toServer) {
        toServer.clear();
        if (!this.sourceOfAuthData.equals(PLUGIN_NAME) || fromServer.getPayloadLength() == 0) {
            toServer.add(new NativePacketPayload(0));
            return true;
        }
        this.initializePrivateKey();
        byte[] nonce = fromServer.readBytes(NativeConstants.StringSelfDataType.STRING_EOF);
        byte[] signature = ExportControlled.sign(nonce, this.privateKey);
        if (signature == null) {
            signature = new byte[]{};
        }
        String payload = String.format("{\"fingerprint\":\"%s\", \"signature\":\"%s\"}", this.fingerprint, Base64.getEncoder().encodeToString(signature));
        toServer.add(new NativePacketPayload(payload.getBytes(Charset.defaultCharset())));
        return true;
    }

    private void initializePrivateKey() {
        ConfigFileReader.ConfigFile configFile;
        block11: {
            if (this.privateKey != null) {
                return;
            }
            try {
                String configFilePath = this.protocol.getPropertySet().getStringProperty(PropertyKey.ociConfigFile.getKeyName()).getStringValue();
                if (StringUtils.isNullOrEmpty(configFilePath)) {
                    configFile = ConfigFileReader.parseDefault();
                    break block11;
                }
                if (Files.exists(Paths.get(configFilePath, new String[0]), new LinkOption[0])) {
                    configFile = ConfigFileReader.parse((String)configFilePath);
                    break block11;
                }
                throw ExceptionFactory.createException("configuration file does not exist");
            }
            catch (NoClassDefFoundError e) {
                throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.SdkNotFound"), e);
            }
            catch (IOException e) {
                throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.OciConfigFileError"), e);
            }
        }
        this.fingerprint = configFile.get("fingerprint");
        if (StringUtils.isNullOrEmpty(this.fingerprint)) {
            throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.OciConfigFileMissingEntry"));
        }
        String keyFilePath = configFile.get("key_file");
        if (StringUtils.isNullOrEmpty(keyFilePath)) {
            throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.OciConfigFileMissingEntry"));
        }
        try {
            String key = new String(Files.readAllBytes(Paths.get(keyFilePath, new String[0])), Charset.defaultCharset());
            this.privateKey = ExportControlled.decodeRSAPrivateKey(key);
        }
        catch (IOException e) {
            throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.PrivateKeyNotFound"), e);
        }
        catch (RSAException | IllegalArgumentException e) {
            throw ExceptionFactory.createException(Messages.getString("AuthenticationOciClientPlugin.PrivateKeyNotValid"), e);
        }
    }
}
