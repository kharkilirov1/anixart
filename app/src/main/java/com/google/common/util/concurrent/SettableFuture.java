package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class SettableFuture<V> extends AbstractFuture.TrustedFuture<V> {
    @Override // com.google.common.util.concurrent.AbstractFuture.TrustedFuture, com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22049b instanceof AbstractFuture.Cancellation;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    /* renamed from: n */
    public boolean mo12149n(@NullableDecl V v) {
        return super.mo12149n(v);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    /* renamed from: o */
    public boolean mo12150o(Throwable th) {
        return super.mo12150o(th);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CanIgnoreReturnValue
    /* renamed from: p */
    public boolean mo12151p(ListenableFuture<? extends V> listenableFuture) {
        return super.mo12151p(listenableFuture);
    }
}
