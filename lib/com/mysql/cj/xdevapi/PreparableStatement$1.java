/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.PreparableStatement;

static class PreparableStatement.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState;

    static {
        $SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState = new int[PreparableStatement.PreparedState.values().length];
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.UNSUPPORTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.UNPREPARED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.SUSPENDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.PREPARE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.PREPARED.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.DEALLOCATE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PreparableStatement.1.$SwitchMap$com$mysql$cj$xdevapi$PreparableStatement$PreparedState[PreparableStatement.PreparedState.REPREPARE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
