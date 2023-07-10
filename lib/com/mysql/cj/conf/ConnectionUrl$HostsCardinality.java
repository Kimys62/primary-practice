/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

public static enum ConnectionUrl.HostsCardinality {
    SINGLE{

        @Override
        public boolean assertSize(int n) {
            return n == 1;
        }
    }
    ,
    MULTIPLE{

        @Override
        public boolean assertSize(int n) {
            return n > 1;
        }
    }
    ,
    ONE_OR_MORE{

        @Override
        public boolean assertSize(int n) {
            return n >= 1;
        }
    };


    public abstract boolean assertSize(int var1);
}
