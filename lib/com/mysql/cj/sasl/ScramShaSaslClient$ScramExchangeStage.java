/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.sasl;

protected static enum ScramShaSaslClient.ScramExchangeStage {
    TERMINATED(null),
    SERVER_FINAL(TERMINATED),
    SERVER_FIRST_CLIENT_FINAL(SERVER_FINAL),
    CLIENT_FIRST(SERVER_FIRST_CLIENT_FINAL);

    private ScramShaSaslClient.ScramExchangeStage next;

    private ScramShaSaslClient.ScramExchangeStage(ScramShaSaslClient.ScramExchangeStage next) {
        this.next = next;
    }

    public ScramShaSaslClient.ScramExchangeStage getNext() {
        return this.next == null ? this : this.next;
    }
}
