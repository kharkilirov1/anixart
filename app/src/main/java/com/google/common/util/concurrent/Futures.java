package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1 */
    class RunnableC20051 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$2 */
    class FutureC20062 implements Future<Object> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public Object get() throws InterruptedException, ExecutionException {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$3 */
    class RunnableC20073 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static final class CallbackListener<V> implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r2 = this;
                r0 = 0
                com.google.common.util.concurrent.Futures.m12193a(r0)     // Catch: java.lang.Throwable -> L5 java.util.concurrent.ExecutionException -> L6
                throw r0     // Catch: java.lang.Throwable -> L5 java.util.concurrent.ExecutionException -> L6
            L5:
                throw r0
            L6:
                r1 = move-exception
                r1.getCause()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.Futures.CallbackListener.run():void");
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11172f(null);
            return m11166b.toString();
        }
    }

    @Beta
    @GwtCompatible
    @CanIgnoreReturnValue
    public static final class FutureCombiner<V> {

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1 */
        class CallableC20081 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                throw null;
            }
        }
    }

    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: c */
        public void mo12134c() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (super.cancel(z)) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: l */
        public String mo12135l() {
            return null;
        }
    }

    public static final class InCompletionOrderState<T> {
    }

    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: c */
        public void mo12134c() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: l */
        public String mo12135l() {
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <V> V m12193a(Future<V> future) throws ExecutionException {
        Preconditions.m11194r(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.m12209a(future);
    }

    /* renamed from: b */
    public static <V> ListenableFuture<V> m12194b(Throwable th) {
        Objects.requireNonNull(th);
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    /* renamed from: c */
    public static <V> ListenableFuture<V> m12195c(@NullableDecl V v) {
        return v == null ? (ListenableFuture<V>) ImmediateFuture.f22189c : new ImmediateFuture(v);
    }

    @Beta
    /* renamed from: d */
    public static <I, O> ListenableFuture<O> m12196d(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, final Executor executor) {
        int i2 = AbstractTransformFuture.f22117k;
        final AbstractTransformFuture.TransformFuture transformFuture = new AbstractTransformFuture.TransformFuture(listenableFuture, function);
        if (executor != DirectExecutor.INSTANCE) {
            executor = new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e2) {
                        transformFuture.mo12150o(e2);
                    }
                }
            };
        }
        listenableFuture.mo1145r(transformFuture, executor);
        return transformFuture;
    }
}
