/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.x;

import com.mysql.cj.exceptions.CJCommunicationsException;
import com.mysql.cj.protocol.MessageListener;
import com.mysql.cj.protocol.x.XMessage;
import com.mysql.cj.protocol.x.XMessageHeader;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

private class SyncMessageReader.ListenersDispatcher
implements Runnable {
    private static final long POLL_TIMEOUT = 100L;
    boolean started = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Object object = SyncMessageReader.this.waitingSyncOperationMonitor;
        synchronized (object) {
            this.started = true;
            block10: while (true) {
                try {
                    while (true) {
                        MessageListener<XMessage> l;
                        if ((l = SyncMessageReader.this.messageListenerQueue.poll(100L, TimeUnit.MILLISECONDS)) == null) {
                            Object object2 = SyncMessageReader.this.dispatchingThreadMonitor;
                            synchronized (object2) {
                                if (SyncMessageReader.this.messageListenerQueue.peek() == null) {
                                    SyncMessageReader.this.dispatchingThread = null;
                                    break block10;
                                }
                                continue block10;
                            }
                        }
                        try {
                            XMessageHeader hdr;
                            XMessage msg = null;
                            while (!l.processMessage(msg = SyncMessageReader.this.readMessage((Optional<XMessage>)null, hdr = SyncMessageReader.this.readHeader()))) {
                            }
                            continue block10;
                        }
                        catch (Throwable t) {
                            l.error(t);
                            continue;
                        }
                        break;
                    }
                }
                catch (InterruptedException e) {
                    throw new CJCommunicationsException("Read operation interrupted.", e);
                }
            }
        }
    }
}
