/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol;

import java.nio.ByteBuffer;

public interface MessageHeader {
    public ByteBuffer getBuffer();

    public int getMessageSize();

    public byte getMessageSequence();
}
