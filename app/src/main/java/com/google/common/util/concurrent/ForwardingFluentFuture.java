package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
/* loaded from: classes2.dex */
final class ForwardingFluentFuture<V> extends FluentFuture<V> {

    /* renamed from: i */
    public final ListenableFuture<V> f22180i;

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f22180i.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f22180i.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22180i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.f22180i.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public void mo1145r(Runnable runnable, Executor executor) {
        this.f22180i.mo1145r(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String toString() {
        return this.f22180i.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f22180i.get(j2, timeUnit);
    }
}
