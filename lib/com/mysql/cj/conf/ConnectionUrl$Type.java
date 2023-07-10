/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

import com.mysql.cj.Messages;
import com.mysql.cj.conf.ConnectionUrl;
import com.mysql.cj.conf.ConnectionUrlParser;
import com.mysql.cj.conf.PropertyDefinitions;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.UnsupportedConnectionStringException;
import com.mysql.cj.util.Util;
import java.util.Map;
import java.util.Properties;

public static enum ConnectionUrl.Type {
    FAILOVER_DNS_SRV_CONNECTION("jdbc:mysql+srv:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.FailoverDnsSrvConnectionUrl"),
    LOADBALANCE_DNS_SRV_CONNECTION("jdbc:mysql+srv:loadbalance:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl"),
    REPLICATION_DNS_SRV_CONNECTION("jdbc:mysql+srv:replication:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.ReplicationDnsSrvConnectionUrl"),
    XDEVAPI_DNS_SRV_SESSION("mysqlx+srv:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.XDevApiDnsSrvConnectionUrl"),
    SINGLE_CONNECTION("jdbc:mysql:", ConnectionUrl.HostsCardinality.SINGLE, "com.mysql.cj.conf.url.SingleConnectionUrl", PropertyKey.dnsSrv, FAILOVER_DNS_SRV_CONNECTION),
    FAILOVER_CONNECTION("jdbc:mysql:", ConnectionUrl.HostsCardinality.MULTIPLE, "com.mysql.cj.conf.url.FailoverConnectionUrl", PropertyKey.dnsSrv, FAILOVER_DNS_SRV_CONNECTION),
    LOADBALANCE_CONNECTION("jdbc:mysql:loadbalance:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.LoadBalanceConnectionUrl", PropertyKey.dnsSrv, LOADBALANCE_DNS_SRV_CONNECTION),
    REPLICATION_CONNECTION("jdbc:mysql:replication:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.ReplicationConnectionUrl", PropertyKey.dnsSrv, REPLICATION_DNS_SRV_CONNECTION),
    XDEVAPI_SESSION("mysqlx:", ConnectionUrl.HostsCardinality.ONE_OR_MORE, "com.mysql.cj.conf.url.XDevApiConnectionUrl", PropertyKey.xdevapiDnsSrv, XDEVAPI_DNS_SRV_SESSION);

    private String scheme;
    private ConnectionUrl.HostsCardinality cardinality;
    private String implementingClass;
    private PropertyKey dnsSrvPropertyKey;
    private ConnectionUrl.Type alternateDnsSrvType;

    private ConnectionUrl.Type(String scheme, ConnectionUrl.HostsCardinality cardinality, String implementingClass) {
        this(scheme, cardinality, implementingClass, null, null);
    }

    private ConnectionUrl.Type(String scheme, ConnectionUrl.HostsCardinality cardinality, String implementingClass, PropertyKey dnsSrvPropertyKey, ConnectionUrl.Type alternateDnsSrvType) {
        this.scheme = scheme;
        this.cardinality = cardinality;
        this.implementingClass = implementingClass;
        this.dnsSrvPropertyKey = dnsSrvPropertyKey;
        this.alternateDnsSrvType = alternateDnsSrvType;
    }

    public String getScheme() {
        return this.scheme;
    }

    public ConnectionUrl.HostsCardinality getCardinality() {
        return this.cardinality;
    }

    public String getImplementingClass() {
        return this.implementingClass;
    }

    public PropertyKey getDnsSrvPropertyKey() {
        return this.dnsSrvPropertyKey;
    }

    public ConnectionUrl.Type getAlternateDnsSrvType() {
        return this.alternateDnsSrvType;
    }

    public static ConnectionUrl.Type fromValue(String scheme, int n) {
        for (ConnectionUrl.Type t : ConnectionUrl.Type.values()) {
            if (!t.getScheme().equalsIgnoreCase(scheme) || n >= 0 && !t.getCardinality().assertSize(n)) continue;
            return t;
        }
        if (n < 0) {
            throw ExceptionFactory.createException(UnsupportedConnectionStringException.class, Messages.getString("ConnectionString.5", new Object[]{scheme}));
        }
        throw ExceptionFactory.createException(UnsupportedConnectionStringException.class, Messages.getString("ConnectionString.6", new Object[]{scheme, n}));
    }

    public static ConnectionUrl getConnectionUrlInstance(ConnectionUrlParser parser, Properties info) {
        int hostsCount = parser.getHosts().size();
        ConnectionUrl.Type type = ConnectionUrl.Type.fromValue(parser.getScheme(), hostsCount);
        PropertyKey dnsSrvPropKey = type.getDnsSrvPropertyKey();
        if (dnsSrvPropKey != null && type.getAlternateDnsSrvType() != null) {
            if (info != null && info.containsKey(dnsSrvPropKey.getKeyName())) {
                if (((Boolean)PropertyDefinitions.getPropertyDefinition(dnsSrvPropKey).parseObject(info.getProperty(dnsSrvPropKey.getKeyName()), null)).booleanValue()) {
                    type = ConnectionUrl.Type.fromValue(type.getAlternateDnsSrvType().getScheme(), hostsCount);
                }
            } else {
                Map<String, String> parsedProperties = parser.getProperties();
                if (parsedProperties.containsKey(dnsSrvPropKey.getKeyName()) && ((Boolean)PropertyDefinitions.getPropertyDefinition(dnsSrvPropKey).parseObject(parsedProperties.get(dnsSrvPropKey.getKeyName()), null)).booleanValue()) {
                    type = ConnectionUrl.Type.fromValue(type.getAlternateDnsSrvType().getScheme(), hostsCount);
                }
            }
        }
        return type.getImplementingInstance(parser, info);
    }

    public static boolean isSupported(String scheme) {
        for (ConnectionUrl.Type t : ConnectionUrl.Type.values()) {
            if (!t.getScheme().equalsIgnoreCase(scheme)) continue;
            return true;
        }
        return false;
    }

    private ConnectionUrl getImplementingInstance(ConnectionUrlParser parser, Properties info) {
        return (ConnectionUrl)Util.getInstance(this.getImplementingClass(), new Class[]{ConnectionUrlParser.class, Properties.class}, new Object[]{parser, info}, null);
    }
}
