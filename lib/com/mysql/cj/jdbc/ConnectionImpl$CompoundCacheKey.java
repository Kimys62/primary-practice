/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

static class ConnectionImpl.CompoundCacheKey {
    final String componentOne;
    final String componentTwo;
    final int hashCode;

    ConnectionImpl.CompoundCacheKey(String partOne, String partTwo) {
        this.componentOne = partOne;
        this.componentTwo = partTwo;
        int hc = 17;
        hc = 31 * hc + (this.componentOne != null ? this.componentOne.hashCode() : 0);
        this.hashCode = hc = 31 * hc + (this.componentTwo != null ? this.componentTwo.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConnectionImpl.CompoundCacheKey.class.isAssignableFrom(obj.getClass())) {
            ConnectionImpl.CompoundCacheKey another = (ConnectionImpl.CompoundCacheKey)obj;
            if (this.componentOne == null ? another.componentOne == null : this.componentOne.equals(another.componentOne)) {
                return this.componentTwo == null ? another.componentTwo == null : this.componentTwo.equals(another.componentTwo);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }
}
