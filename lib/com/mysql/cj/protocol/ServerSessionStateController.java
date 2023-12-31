/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import com.mysql.cj.exceptions.ExceptionFactory;
import java.util.ArrayList;
import java.util.List;

public interface ServerSessionStateController {
    public static final int SESSION_TRACK_SYSTEM_VARIABLES = 0;
    public static final int SESSION_TRACK_SCHEMA = 1;
    public static final int SESSION_TRACK_STATE_CHANGE = 2;
    public static final int SESSION_TRACK_GTIDS = 3;
    public static final int SESSION_TRACK_TRANSACTION_CHARACTERISTICS = 4;
    public static final int SESSION_TRACK_TRANSACTION_STATE = 5;

    default public void setSessionStateChanges(ServerSessionStateChanges changes) {
        throw ExceptionFactory.createException(CJOperationNotSupportedException.class, "Not supported");
    }

    default public ServerSessionStateChanges getSessionStateChanges() {
        throw ExceptionFactory.createException(CJOperationNotSupportedException.class, "Not supported");
    }

    default public void addSessionStateChangesListener(SessionStateChangesListener l) {
        throw ExceptionFactory.createException(CJOperationNotSupportedException.class, "Not supported");
    }

    default public void removeSessionStateChangesListener(SessionStateChangesListener l) {
        throw ExceptionFactory.createException(CJOperationNotSupportedException.class, "Not supported");
    }

    public static class SessionStateChange {
        private int type;
        private List<String> values = new ArrayList<String>();

        public SessionStateChange(int type) {
            this.type = type;
        }

        public int getType() {
            return this.type;
        }

        public List<String> getValues() {
            return this.values;
        }

        public SessionStateChange addValue(String value) {
            this.values.add(value);
            return this;
        }
    }

    public static interface ServerSessionStateChanges {
        public List<SessionStateChange> getSessionStateChangesList();
    }

    @FunctionalInterface
    public static interface SessionStateChangesListener {
        public void handleSessionStateChanges(ServerSessionStateChanges var1);
    }
}
