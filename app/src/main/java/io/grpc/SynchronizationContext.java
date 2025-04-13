package io.grpc;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class SynchronizationContext implements Executor {

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler f58321b;

    /* renamed from: c */
    public final Queue<Runnable> f58322c;

    /* renamed from: d */
    public final AtomicReference<Thread> f58323d;

    public static class ManagedRunnable implements Runnable {

        /* renamed from: b */
        public final Runnable f58327b;

        /* renamed from: c */
        public boolean f58328c;

        /* renamed from: d */
        public boolean f58329d;

        public ManagedRunnable(Runnable runnable) {
            Preconditions.m11187k(runnable, "task");
            this.f58327b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58328c) {
                return;
            }
            this.f58329d = true;
            this.f58327b.run();
        }
    }

    public static final class ScheduledHandle {

        /* renamed from: a */
        public final ManagedRunnable f58330a;

        /* renamed from: b */
        public final ScheduledFuture<?> f58331b;

        public ScheduledHandle(ManagedRunnable managedRunnable, ScheduledFuture scheduledFuture, RunnableC63141 runnableC63141) {
            this.f58330a = managedRunnable;
            Preconditions.m11187k(scheduledFuture, "future");
            this.f58331b = scheduledFuture;
        }

        /* renamed from: a */
        public void m30962a() {
            this.f58330a.f58328c = true;
            this.f58331b.cancel(false);
        }
    }

    /* renamed from: a */
    public final void m30959a() {
        while (this.f58323d.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f58322c.poll();
                    if (poll == null) {
                        break;
                    }
                    try {
                        poll.run();
                    } catch (Throwable th) {
                        this.f58321b.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f58323d.set(null);
                    throw th2;
                }
            }
            this.f58323d.set(null);
            if (this.f58322c.isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: b */
    public final ScheduledHandle m30960b(final Runnable runnable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        final ManagedRunnable managedRunnable = new ManagedRunnable(runnable);
        return new ScheduledHandle(managedRunnable, scheduledExecutorService.schedule(new Runnable() { // from class: io.grpc.SynchronizationContext.1
            @Override // java.lang.Runnable
            public void run() {
                SynchronizationContext.this.execute(managedRunnable);
            }

            public String toString() {
                return runnable.toString() + "(scheduled in SynchronizationContext)";
            }
        }, j2, timeUnit), null);
    }

    /* renamed from: c */
    public void m30961c() {
        Preconditions.m11192p(Thread.currentThread() == this.f58323d.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Queue<Runnable> queue = this.f58322c;
        Preconditions.m11187k(runnable, "runnable is null");
        queue.add(runnable);
        m30959a();
    }
}
