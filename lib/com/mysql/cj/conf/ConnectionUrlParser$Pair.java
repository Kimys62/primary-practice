/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.conf;

public static class ConnectionUrlParser.Pair<T, U> {
    public final T left;
    public final U right;

    public ConnectionUrlParser.Pair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        StringBuilder asStr = new StringBuilder(super.toString());
        asStr.append(String.format(" :: { left: %s, right: %s }", this.left, this.right));
        return asStr.toString();
    }
}
