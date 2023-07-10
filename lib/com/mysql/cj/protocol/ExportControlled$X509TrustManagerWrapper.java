/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.util.StringUtils;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.X509TrustManager;

public static class ExportControlled.X509TrustManagerWrapper
implements X509TrustManager {
    private X509TrustManager origTm = null;
    private boolean verifyServerCert = false;
    private String hostName = null;
    private CertificateFactory certFactory = null;
    private PKIXParameters validatorParams = null;
    private CertPathValidator validator = null;

    public ExportControlled.X509TrustManagerWrapper(X509TrustManager tm, boolean verifyServerCertificate, String hostName) throws CertificateException {
        this.origTm = tm;
        this.verifyServerCert = verifyServerCertificate;
        this.hostName = hostName;
        if (verifyServerCertificate) {
            try {
                Set<TrustAnchor> anch = Arrays.stream(tm.getAcceptedIssuers()).map(c -> new TrustAnchor((X509Certificate)c, null)).collect(Collectors.toSet());
                this.validatorParams = new PKIXParameters(anch);
                this.validatorParams.setRevocationEnabled(false);
                this.validator = CertPathValidator.getInstance("PKIX");
                this.certFactory = CertificateFactory.getInstance("X.509");
            }
            catch (Exception e) {
                throw new CertificateException(e);
            }
        }
    }

    public ExportControlled.X509TrustManagerWrapper(boolean verifyServerCertificate, String hostName) {
        this.verifyServerCert = verifyServerCertificate;
        this.hostName = hostName;
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return this.origTm != null ? this.origTm.getAcceptedIssuers() : new X509Certificate[]{};
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        for (int i = 0; i < chain.length; ++i) {
            chain[i].checkValidity();
        }
        if (this.validatorParams != null) {
            X509CertSelector certSelect = new X509CertSelector();
            certSelect.setSerialNumber(chain[0].getSerialNumber());
            try {
                CertPath certPath = this.certFactory.generateCertPath(Arrays.asList(chain));
                CertPathValidatorResult result = this.validator.validate(certPath, this.validatorParams);
                ((PKIXCertPathValidatorResult)result).getTrustAnchor().getTrustedCert().checkValidity();
            }
            catch (InvalidAlgorithmParameterException e) {
                throw new CertificateException(e);
            }
            catch (CertPathValidatorException e) {
                throw new CertificateException(e);
            }
        }
        if (this.verifyServerCert) {
            if (this.origTm == null) {
                throw new CertificateException("Can't verify server certificate because no trust manager is found.");
            }
            this.origTm.checkServerTrusted(chain, authType);
            if (this.hostName != null) {
                boolean hostNameVerified = false;
                Collection<List<?>> subjectAltNames = chain[0].getSubjectAlternativeNames();
                if (subjectAltNames != null) {
                    boolean sanVerification = false;
                    for (List<?> san : subjectAltNames) {
                        Integer nameType = (Integer)san.get(0);
                        if (nameType == 2) {
                            sanVerification = true;
                            if (!this.verifyHostName((String)san.get(1))) continue;
                            hostNameVerified = true;
                            break;
                        }
                        if (nameType != 7) continue;
                        sanVerification = true;
                        if (!this.hostName.equalsIgnoreCase((String)san.get(1))) continue;
                        hostNameVerified = true;
                        break;
                    }
                    if (sanVerification && !hostNameVerified) {
                        throw new CertificateException("Server identity verification failed. None of the DNS or IP Subject Alternative Name entries matched the server hostname/IP '" + this.hostName + "'.");
                    }
                }
                if (!hostNameVerified) {
                    String dn = chain[0].getSubjectX500Principal().getName("RFC2253");
                    String cn = null;
                    try {
                        LdapName ldapDN = new LdapName(dn);
                        for (Rdn rdn : ldapDN.getRdns()) {
                            if (!rdn.getType().equalsIgnoreCase("CN")) continue;
                            cn = rdn.getValue().toString();
                            break;
                        }
                    }
                    catch (InvalidNameException e) {
                        throw new CertificateException("Failed to retrieve the Common Name (CN) from the server certificate.");
                    }
                    if (!this.verifyHostName(cn)) {
                        throw new CertificateException("Server identity verification failed. The certificate Common Name '" + cn + "' does not match '" + this.hostName + "'.");
                    }
                }
            }
        }
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        this.origTm.checkClientTrusted(chain, authType);
    }

    private boolean verifyHostName(String ptn) {
        int indexOfStar = ptn.indexOf(42);
        if (indexOfStar >= 0 && indexOfStar < ptn.indexOf(46)) {
            String head = ptn.substring(0, indexOfStar);
            String tail = ptn.substring(indexOfStar + 1);
            return StringUtils.startsWithIgnoreCase(this.hostName, head) && StringUtils.endsWithIgnoreCase(this.hostName, tail) && this.hostName.substring(head.length(), this.hostName.length() - tail.length()).indexOf(46) == -1;
        }
        return this.hostName.equalsIgnoreCase(ptn);
    }
}
