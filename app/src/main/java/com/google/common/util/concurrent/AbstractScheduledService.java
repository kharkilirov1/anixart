package com.google.common.util.concurrent;

import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class AbstractScheduledService implements Service {

    /* renamed from: b */
    public static final Logger f22084b = Logger.getLogger(AbstractScheduledService.class.getName());

    /* renamed from: a */
    public final AbstractService f22085a = new ServiceDelegate(null);

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1 */
    class C19551 extends Service.Listener {
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl, reason: invalid class name */
    class C1ThreadFactoryImpl implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            throw null;
        }
    }

    public static abstract class CustomScheduler extends Scheduler {

        public class ReschedulableCallable extends ForwardingFuture<Void> implements Callable<Void> {

            /* renamed from: b */
            public final Runnable f22086b;

            /* renamed from: c */
            public final ScheduledExecutorService f22087c;

            /* renamed from: d */
            public final AbstractService f22088d;

            /* renamed from: e */
            public final ReentrantLock f22089e;

            /* renamed from: f */
            @NullableDecl
            @GuardedBy
            public Future<Void> f22090f;

            /* renamed from: g */
            public final /* synthetic */ CustomScheduler f22091g;

            @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
            /* renamed from: G */
            public /* bridge */ /* synthetic */ Object mo11329H() {
                mo7455G();
                throw null;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture
            /* renamed from: H */
            public Future<? extends Void> mo7455G() {
                throw new UnsupportedOperationException("Only cancel and isCancelled is supported by this future");
            }

            /* renamed from: I */
            public void m12164I() {
                try {
                    Schedule m12162a = this.f22091g.m12162a();
                    this.f22089e.lock();
                    Throwable th = null;
                    try {
                        Future<Void> future = this.f22090f;
                        if (future == null || !future.isCancelled()) {
                            ScheduledExecutorService scheduledExecutorService = this.f22087c;
                            Objects.requireNonNull(m12162a);
                            this.f22090f = scheduledExecutorService.schedule(this, 0L, (TimeUnit) null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    this.f22089e.unlock();
                    if (th != null) {
                        this.f22088d.m12167d(th);
                    }
                } catch (Throwable th3) {
                    this.f22088d.m12167d(th3);
                }
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                this.f22086b.run();
                m12164I();
                return null;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                this.f22089e.lock();
                try {
                    return this.f22090f.cancel(z);
                } finally {
                    this.f22089e.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean isCancelled() {
                this.f22089e.lock();
                try {
                    return this.f22090f.isCancelled();
                } finally {
                    this.f22089e.unlock();
                }
            }
        }

        public static final class Schedule {
        }

        public CustomScheduler() {
            super(null);
        }

        /* renamed from: a */
        public abstract Schedule m12162a() throws Exception;
    }

    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1 */
        class C19561 extends Scheduler {
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2 */
        class C19572 extends Scheduler {
        }

        public Scheduler() {
        }

        public Scheduler(C19551 c19551) {
        }
    }

    public final class ServiceDelegate extends AbstractService {

        /* renamed from: i */
        @NullableDecl
        public volatile Future<?> f22092i;

        /* renamed from: j */
        public final ReentrantLock f22093j = new ReentrantLock();

        /* renamed from: k */
        public final Runnable f22094k = new Task();

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1 */
        class C19581 implements Supplier<String> {
            @Override // com.google.common.base.Supplier
            public String get() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2 */
        class RunnableC19592 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$3 */
        class RunnableC19603 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ServiceDelegate f22096b;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f22096b.f22093j.lock();
                    try {
                        if (this.f22096b.mo12136a() != Service.State.STOPPING) {
                            return;
                        }
                        Objects.requireNonNull(AbstractScheduledService.this);
                        this.f22096b.f22093j.unlock();
                        this.f22096b.m12168e();
                    } finally {
                        this.f22096b.f22093j.unlock();
                    }
                } catch (Throwable th) {
                    this.f22096b.m12167d(th);
                }
            }
        }

        public class Task implements Runnable {
            public Task() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ServiceDelegate serviceDelegate;
                ServiceDelegate.this.f22093j.lock();
                try {
                } catch (Throwable th) {
                    try {
                        try {
                            Objects.requireNonNull(AbstractScheduledService.this);
                        } finally {
                            ServiceDelegate.this.f22093j.unlock();
                        }
                    } catch (Exception e2) {
                        AbstractScheduledService.f22084b.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e2);
                    }
                    ServiceDelegate.this.m12167d(th);
                    ServiceDelegate.this.f22092i.cancel(false);
                    serviceDelegate = ServiceDelegate.this;
                }
                if (ServiceDelegate.this.f22092i.isCancelled()) {
                    return;
                }
                AbstractScheduledService.this.m12160b();
                serviceDelegate = ServiceDelegate.this;
                serviceDelegate.f22093j.unlock();
            }
        }

        public ServiceDelegate(C19551 c19551) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    /* renamed from: a */
    public final Service.State mo12136a() {
        return this.f22085a.mo12136a();
    }

    /* renamed from: b */
    public abstract void m12160b() throws Exception;

    /* renamed from: c */
    public String m12161c() {
        return getClass().getSimpleName();
    }

    public String toString() {
        String m12161c = m12161c();
        String valueOf = String.valueOf(mo12136a());
        return C1008a.m6437d(valueOf.length() + m12161c.length() + 3, m12161c, " [", valueOf, "]");
    }
}
