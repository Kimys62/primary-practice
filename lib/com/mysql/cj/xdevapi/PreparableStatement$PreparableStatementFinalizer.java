/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public static class PreparableStatement.PreparableStatementFinalizer
extends PhantomReference<PreparableStatement<?>> {
    int prepredStatementId;

    public PreparableStatement.PreparableStatementFinalizer(PreparableStatement<?> referent, ReferenceQueue<? super PreparableStatement<?>> q, int preparedStatementId) {
        super(referent, q);
        this.prepredStatementId = preparedStatementId;
    }

    public int getPreparedStatementId() {
        return this.prepredStatementId;
    }
}
