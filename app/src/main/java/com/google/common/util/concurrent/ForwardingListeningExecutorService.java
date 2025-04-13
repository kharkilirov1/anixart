package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    @Override // com.google.common.util.concurrent.ForwardingExecutorService
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListeningExecutorService mo7455G();

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return mo7456H().submit((Callable) callable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return mo7456H().submit(callable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public ListenableFuture<?> submit(Runnable runnable) {
        return mo7456H().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return mo7456H().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Runnable runnable, T t) {
        return mo7456H().submit(runnable, (Runnable) t);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return mo7456H().submit(runnable, (Runnable) obj);
    }
}
