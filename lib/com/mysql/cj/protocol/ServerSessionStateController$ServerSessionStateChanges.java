/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.protocol.ServerSessionStateController;
import java.util.List;

public static interface ServerSessionStateController.ServerSessionStateChanges {
    public List<ServerSessionStateController.SessionStateChange> getSessionStateChangesList();
}
