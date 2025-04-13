package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes2.dex */
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* renamed from: b */
        public final ListenableFuture<V> f22181b;

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f22181b;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: H */
        public Future mo7455G() {
            return this.f22181b;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture
        /* renamed from: I */
        public final ListenableFuture<V> mo7455G() {
            return this.f22181b;
        }
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public abstract ListenableFuture<? extends V> mo7455G();

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public void mo1145r(Runnable runnable, Executor executor) {
        mo7455G().mo1145r(runnable, executor);
    }
}
