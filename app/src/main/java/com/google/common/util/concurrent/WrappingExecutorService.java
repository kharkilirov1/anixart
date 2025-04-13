package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: classes2.dex */
abstract class WrappingExecutorService implements ExecutorService {
    /* renamed from: a */
    public Runnable mo12203a(Runnable runnable) {
        final Callable mo12204b = mo12204b(Executors.callable(runnable, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.WrappingExecutorService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    mo12204b.call();
                } catch (Exception e2) {
                    Throwables.m11225f(e2);
                    throw new RuntimeException(e2);
                }
            }
        };
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        throw null;
    }

    /* renamed from: b */
    public abstract <T> Callable<T> mo12204b(Callable<T> callable);

    /* renamed from: c */
    public final <T> ImmutableList<Callable<T>> m12210c(Collection<? extends Callable<T>> collection) {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        Iterator<? extends Callable<T>> it = collection.iterator();
        while (it.hasNext()) {
            builder.m11640d(mo12204b(it.next()));
        }
        return builder.m11641e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo12203a(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        m12210c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        m12210c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        mo12203a(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        m12210c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        m12210c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        mo12203a(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        Objects.requireNonNull(callable);
        mo12204b(callable);
        throw null;
    }
}
