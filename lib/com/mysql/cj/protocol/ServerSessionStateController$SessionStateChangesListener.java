/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.protocol.ServerSessionStateController;

@FunctionalInterface
public static interface ServerSessionStateController.SessionStateChangesListener {
    public void handleSessionStateChanges(ServerSessionStateController.ServerSessionStateChanges var1);
}
