package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.firebase.firestore.util.AsyncQueue;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AsyncQueue {

    /* renamed from: c */
    public final ArrayList<TimerId> f23001c = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<DelayedTask> f23000b = new ArrayList<>();

    /* renamed from: a */
    public final SynchronizedShutdownAwareExecutor f22999a = new SynchronizedShutdownAwareExecutor();

    public class DelayedTask {

        /* renamed from: a */
        public final Runnable f23002a;

        /* renamed from: b */
        public ScheduledFuture f23003b;

        /* renamed from: c */
        public final /* synthetic */ AsyncQueue f23004c;

        /* renamed from: a */
        public final void m12493a() {
            Assert.m12490b(this.f23003b != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f23003b = null;
            Assert.m12490b(this.f23004c.f23000b.remove(this), "Delayed task not found.", new Object[0]);
        }
    }

    public class SynchronizedShutdownAwareExecutor implements Executor {

        /* renamed from: b */
        public final ScheduledThreadPoolExecutor f23005b;

        /* renamed from: c */
        public final Thread f23006c;

        public class DelayedStartFactory implements Runnable, ThreadFactory {

            /* renamed from: b */
            public final CountDownLatch f23009b = new CountDownLatch(1);

            /* renamed from: c */
            public Runnable f23010c;

            public DelayedStartFactory(C21291 c21291) {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Assert.m12490b(this.f23010c == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f23010c = runnable;
                this.f23009b.countDown();
                return SynchronizedShutdownAwareExecutor.this.f23006c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f23009b.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f23010c.run();
            }
        }

        public SynchronizedShutdownAwareExecutor() {
            DelayedStartFactory delayedStartFactory = new DelayedStartFactory(null);
            Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(delayedStartFactory);
            this.f23006c = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.google.firebase.firestore.util.b
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    AsyncQueue.this.m12491a(th);
                }
            });
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, delayedStartFactory, AsyncQueue.this) { // from class: com.google.firebase.firestore.util.AsyncQueue.SynchronizedShutdownAwareExecutor.1
                @Override // java.util.concurrent.ThreadPoolExecutor
                public void afterExecute(Runnable runnable, Throwable th) {
                    super.afterExecute(runnable, th);
                    if (th == null && (runnable instanceof Future)) {
                        Future future = (Future) runnable;
                        try {
                            if (future.isDone()) {
                                future.get();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        } catch (CancellationException unused2) {
                        } catch (ExecutionException e2) {
                            th = e2.getCause();
                        }
                    }
                    if (th != null) {
                        AsyncQueue.this.m12491a(th);
                    }
                }
            };
            this.f23005b = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f23005b.execute(runnable);
        }
    }

    public enum TimerId {
        /* JADX INFO: Fake field, exist only in values array */
        ALL,
        /* JADX INFO: Fake field, exist only in values array */
        LISTEN_STREAM_IDLE,
        /* JADX INFO: Fake field, exist only in values array */
        LISTEN_STREAM_CONNECTION_BACKOFF,
        /* JADX INFO: Fake field, exist only in values array */
        WRITE_STREAM_IDLE,
        /* JADX INFO: Fake field, exist only in values array */
        WRITE_STREAM_CONNECTION_BACKOFF,
        /* JADX INFO: Fake field, exist only in values array */
        HEALTH_CHECK_TIMEOUT,
        /* JADX INFO: Fake field, exist only in values array */
        ONLINE_STATE_TIMEOUT,
        /* JADX INFO: Fake field, exist only in values array */
        GARBAGE_COLLECTION,
        /* JADX INFO: Fake field, exist only in values array */
        RETRY_TRANSACTION,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECTIVITY_ATTEMPT_TIMER,
        /* JADX INFO: Fake field, exist only in values array */
        INDEX_BACKFILL
    }

    /* renamed from: a */
    public void m12491a(final Throwable th) {
        this.f22999a.f23005b.shutdownNow();
        final int i2 = 0;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.firestore.util.a
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        Throwable th2 = (Throwable) th;
                        if (!(th2 instanceof OutOfMemoryError)) {
                            throw new RuntimeException("Internal error in Cloud Firestore (24.2.1).", th2);
                        }
                        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.2.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                        outOfMemoryError.initCause(th2);
                        throw outOfMemoryError;
                    case 1:
                        AsyncQueue.DelayedTask delayedTask = (AsyncQueue.DelayedTask) th;
                        delayedTask.f23004c.m12492b();
                        if (delayedTask.f23003b != null) {
                            delayedTask.m12493a();
                            delayedTask.f23002a.run();
                            return;
                        }
                        return;
                    default:
                        RuntimeException runtimeException = (RuntimeException) th;
                        int i3 = Util.f23027a;
                        throw runtimeException;
                }
            }
        });
    }

    /* renamed from: b */
    public void m12492b() {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f22999a.f23006c;
        if (thread == currentThread) {
            return;
        }
        Assert.m12489a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(this.f22999a.f23006c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        throw null;
    }
}
