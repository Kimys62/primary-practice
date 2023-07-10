/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.sasl;

import com.mysql.cj.sasl.ScramShaSaslClientFactory;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.ProviderException;

private static final class ScramShaSaslProvider.ProviderService
extends Provider.Service {
    public ScramShaSaslProvider.ProviderService(Provider provider, String type, String algorithm, String className) {
        super(provider, type, algorithm, className, null, null);
    }

    @Override
    public Object newInstance(Object constructorParameter) throws NoSuchAlgorithmException {
        String type = this.getType();
        if (constructorParameter != null) {
            throw new InvalidParameterException("constructorParameter not used with " + type + " engines");
        }
        String algorithm = this.getAlgorithm();
        if (type.equals("SaslClientFactory")) {
            if (algorithm.equals("MYSQLCJ-SCRAM-SHA-1")) {
                return new ScramShaSaslClientFactory();
            }
            if (algorithm.equals("MYSQLCJ-SCRAM-SHA-256")) {
                return new ScramShaSaslClientFactory();
            }
        }
        throw new ProviderException("No implementation for " + algorithm + " " + type);
    }
}
