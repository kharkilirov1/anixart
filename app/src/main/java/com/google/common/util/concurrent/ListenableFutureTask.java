package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtIncompatible
/* loaded from: classes2.dex */
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* renamed from: b */
    public final ExecutionList f22197b;

    public ListenableFutureTask(Callable<V> callable) {
        super(callable);
        this.f22197b = new ExecutionList();
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f22197b.m12185b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        return nanos <= 2147483647999999999L ? (V) super.get(j2, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* renamed from: r */
    public void mo1145r(Runnable runnable, Executor executor) {
        this.f22197b.m12184a(runnable, executor);
    }
}
