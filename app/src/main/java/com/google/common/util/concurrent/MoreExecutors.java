package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@GwtCompatible
/* loaded from: classes2.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    class RunnableC20131 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$2 */
    class ExecutorC20142 implements Executor {

        /* renamed from: b */
        public final /* synthetic */ Executor f22202b;

        /* renamed from: c */
        public final /* synthetic */ Supplier f22203c;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f22202b.execute(Callables.m12175b(runnable, this.f22203c));
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    class C20153 extends WrappingExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: a */
        public Runnable mo12203a(Runnable runnable) {
            Callables.m12175b(runnable, null);
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: b */
        public <T> Callable<T> mo12204b(Callable<T> callable) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    class C20164 extends WrappingScheduledExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: a */
        public Runnable mo12203a(Runnable runnable) {
            Callables.m12175b(runnable, null);
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        /* renamed from: b */
        public <T> Callable<T> mo12204b(Callable<T> callable) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @VisibleForTesting
    @GwtIncompatible
    public static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        class RunnableC20181 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }
    }

    @GwtIncompatible
    public static final class DirectExecutorService extends AbstractListeningExecutorService {

        /* renamed from: b */
        public final Object f22206b = new Object();

        /* renamed from: c */
        @GuardedBy
        public int f22207c = 0;

        /* renamed from: d */
        @GuardedBy
        public boolean f22208d = false;

        /* renamed from: a */
        public final void m12205a() {
            synchronized (this.f22206b) {
                int i2 = this.f22207c - 1;
                this.f22207c = i2;
                if (i2 == 0) {
                    this.f22206b.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j2);
            synchronized (this.f22206b) {
                while (true) {
                    if (this.f22208d && this.f22207c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f22206b, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            synchronized (this.f22206b) {
                if (this.f22208d) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f22207c++;
            }
            try {
                runnable.run();
            } finally {
                m12205a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.f22206b) {
                z = this.f22208d;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.f22206b) {
                z = this.f22208d && this.f22207c == 0;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f22206b) {
                this.f22208d = true;
                if (this.f22207c == 0) {
                    this.f22206b.notifyAll();
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }
    }

    @GwtIncompatible
    public static class ListeningDecorator extends AbstractListeningExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
            throw null;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
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
    }

    /* renamed from: a */
    public static Executor m12201a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(4:29|30|31|(6:33|(1:5)(3:13|14|15)|6|7|8|9))|3|(0)(0)|6|7|8|9|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0033  */
    @com.google.common.annotations.GwtIncompatible
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Thread m12202b(java.lang.String r6, java.lang.Runnable r7) {
        /*
            java.util.Objects.requireNonNull(r6)
            java.util.Objects.requireNonNull(r7)
            java.lang.String r0 = "Couldn't invoke ThreadManager.currentRequestThreadFactory"
            java.lang.String r1 = "com.google.appengine.runtime.environment"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L13
            goto L30
        L13:
            java.lang.String r1 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "getCurrentEnvironment"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L30
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 != 0) goto L38
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            goto L4f
        L38:
            java.lang.String r1 = "com.google.appengine.api.ThreadManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            java.lang.String r4 = "currentRequestThreadFactory"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            java.util.concurrent.ThreadFactory r1 = (java.util.concurrent.ThreadFactory) r1     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.NoSuchMethodException -> L60 java.lang.ClassNotFoundException -> L67 java.lang.IllegalAccessException -> L6e
            r0 = r1
        L4f:
            java.lang.Thread r7 = r0.newThread(r7)
            r7.setName(r6)     // Catch: java.lang.SecurityException -> L56
        L56:
            return r7
        L57:
            r6 = move-exception
            java.lang.Throwable r6 = r6.getCause()
            com.google.common.base.Throwables.m11223d(r6)
            throw r3
        L60:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r0, r6)
            throw r7
        L67:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r0, r6)
            throw r7
        L6e:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.m12202b(java.lang.String, java.lang.Runnable):java.lang.Thread");
    }

    @GwtIncompatible
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* renamed from: c */
            public final ScheduledFuture<?> f22209c;

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean cancel = mo7455G().cancel(z);
                if (cancel) {
                    this.f22209c.cancel(z);
                }
                return cancel;
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.f22209c.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f22209c.getDelay(timeUnit);
            }
        }

        @GwtIncompatible
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {

            /* renamed from: i */
            public final Runnable f22210i;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                Objects.requireNonNull(runnable);
                this.f22210i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f22210i.run();
                } catch (Throwable th) {
                    mo12150o(th);
                    Throwables.m11225f(th);
                    throw new RuntimeException(th);
                }
            }
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
            new TrustedListenableFutureTask(callable);
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            new NeverSuccessfulListenableFutureTask(runnable);
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            new NeverSuccessfulListenableFutureTask(runnable);
            throw null;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            new TrustedListenableFutureTask(Executors.callable(runnable, null));
            throw null;
        }
    }
}
