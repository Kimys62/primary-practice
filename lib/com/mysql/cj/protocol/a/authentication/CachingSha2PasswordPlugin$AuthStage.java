/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a.authentication;

public static enum CachingSha2PasswordPlugin.AuthStage {
    FAST_AUTH_SEND_SCRAMBLE,
    FAST_AUTH_READ_RESULT,
    FAST_AUTH_COMPLETE,
    FULL_AUTH;

}
