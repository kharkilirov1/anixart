package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ForwardingObject;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes2.dex */
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo7455G() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: H */
        public final Future<V> mo7455G() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> mo7455G();

    public boolean cancel(boolean z) {
        return mo7455G().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return mo7455G().get();
    }

    public boolean isCancelled() {
        return mo7455G().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return mo7455G().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo7455G().get(j2, timeUnit);
    }
}
