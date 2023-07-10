/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a;

import com.mysql.cj.protocol.a.NativeConstants;

static class NativePacketPayload.1 {
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringSelfDataType;
    static final /* synthetic */ int[] $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringLengthDataType;

    static {
        $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringLengthDataType = new int[NativeConstants.StringLengthDataType.values().length];
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringLengthDataType[NativeConstants.StringLengthDataType.STRING_FIXED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringLengthDataType[NativeConstants.StringLengthDataType.STRING_VAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringSelfDataType = new int[NativeConstants.StringSelfDataType.values().length];
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringSelfDataType[NativeConstants.StringSelfDataType.STRING_EOF.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringSelfDataType[NativeConstants.StringSelfDataType.STRING_TERM.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$StringSelfDataType[NativeConstants.StringSelfDataType.STRING_LENENC.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType = new int[NativeConstants.IntegerDataType.values().length];
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT1.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT2.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT3.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT4.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT6.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT8.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NativePacketPayload.1.$SwitchMap$com$mysql$cj$protocol$a$NativeConstants$IntegerDataType[NativeConstants.IntegerDataType.INT_LENENC.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
