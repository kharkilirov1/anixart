package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class GlideExecutor implements ExecutorService {

    /* renamed from: c */
    public static final long f8403c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    public static volatile int f8404d;

    /* renamed from: b */
    public final ExecutorService f8405b;

    public static final class DefaultThreadFactory implements ThreadFactory {

        /* renamed from: b */
        public final String f8406b;

        /* renamed from: c */
        public final UncaughtThrowableStrategy f8407c;

        /* renamed from: d */
        public final boolean f8408d;

        /* renamed from: e */
        public int f8409e;

        public DefaultThreadFactory(String str, UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z) {
            this.f8406b = str;
            this.f8407c = uncaughtThrowableStrategy;
            this.f8408d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@NonNull Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-" + this.f8406b + "-thread-" + this.f8409e) { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(9);
                    if (DefaultThreadFactory.this.f8408d) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        DefaultThreadFactory.this.f8407c.mo5126a(th);
                    }
                }
            };
            this.f8409e = this.f8409e + 1;
            return thread;
        }
    }

    public interface UncaughtThrowableStrategy {

        /* renamed from: a */
        public static final UncaughtThrowableStrategy f8411a;

        /* renamed from: b */
        public static final UncaughtThrowableStrategy f8412b;

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1 */
        public class C08051 implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            /* renamed from: a */
            public void mo5126a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3 */
        public class C08073 implements UncaughtThrowableStrategy {
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            /* renamed from: a */
            public void mo5126a(Throwable th) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        }

        static {
            UncaughtThrowableStrategy uncaughtThrowableStrategy = new UncaughtThrowableStrategy() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.2
                @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
                /* renamed from: a */
                public void mo5126a(Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            };
            f8411a = uncaughtThrowableStrategy;
            f8412b = uncaughtThrowableStrategy;
        }

        /* renamed from: a */
        void mo5126a(Throwable th);
    }

    @VisibleForTesting
    public GlideExecutor(ExecutorService executorService) {
        this.f8405b = executorService;
    }

    /* renamed from: a */
    public static int m5121a() {
        if (f8404d == 0) {
            f8404d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f8404d;
    }

    /* renamed from: b */
    public static GlideExecutor m5122b() {
        return new GlideExecutor(new ThreadPoolExecutor(0, m5121a() >= 4 ? 2 : 1, f8403c, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory("animation", UncaughtThrowableStrategy.f8412b, true)));
    }

    /* renamed from: c */
    public static GlideExecutor m5123c() {
        return new GlideExecutor(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory("disk-cache", UncaughtThrowableStrategy.f8412b, true)));
    }

    /* renamed from: d */
    public static GlideExecutor m5124d() {
        int m5121a = m5121a();
        return new GlideExecutor(new ThreadPoolExecutor(m5121a, m5121a, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory("source", UncaughtThrowableStrategy.f8412b, false)));
    }

    /* renamed from: e */
    public static GlideExecutor m5125e() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f8403c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new DefaultThreadFactory("source-unlimited", UncaughtThrowableStrategy.f8412b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f8405b.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f8405b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f8405b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f8405b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f8405b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f8405b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f8405b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f8405b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f8405b.submit(runnable);
    }

    public String toString() {
        return this.f8405b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f8405b.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f8405b.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f8405b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f8405b.submit(callable);
    }
}
