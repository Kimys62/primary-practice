/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

protected static enum PreparableStatement.PreparedState {
    UNSUPPORTED,
    UNPREPARED,
    SUSPENDED,
    PREPARED,
    PREPARE,
    DEALLOCATE,
    REPREPARE;

}
