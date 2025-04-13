package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Status;
import io.grpc.internal.ClientTransport;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public class KeepAliveManager {

    /* renamed from: a */
    public final ScheduledExecutorService f58790a;

    /* renamed from: b */
    @GuardedBy
    public final Stopwatch f58791b;

    /* renamed from: c */
    public final KeepAlivePinger f58792c;

    /* renamed from: d */
    public final boolean f58793d;

    /* renamed from: e */
    @GuardedBy
    public State f58794e;

    /* renamed from: f */
    @GuardedBy
    public ScheduledFuture<?> f58795f;

    /* renamed from: g */
    @GuardedBy
    public ScheduledFuture<?> f58796g;

    /* renamed from: h */
    public final Runnable f58797h;

    /* renamed from: i */
    public final Runnable f58798i;

    /* renamed from: j */
    public final long f58799j;

    /* renamed from: k */
    public final long f58800k;

    public static final class ClientKeepAlivePinger implements KeepAlivePinger {

        /* renamed from: a */
        public final ConnectionClientTransport f58803a;

        public ClientKeepAlivePinger(ConnectionClientTransport connectionClientTransport) {
            this.f58803a = connectionClientTransport;
        }

        @Override // io.grpc.internal.KeepAliveManager.KeepAlivePinger
        /* renamed from: a */
        public void mo31135a() {
            this.f58803a.mo30968a(Status.f58287n.m30947g("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.KeepAliveManager.KeepAlivePinger
        /* renamed from: b */
        public void mo31136b() {
            this.f58803a.mo30971f(new ClientTransport.PingCallback() { // from class: io.grpc.internal.KeepAliveManager.ClientKeepAlivePinger.1
                @Override // io.grpc.internal.ClientTransport.PingCallback
                /* renamed from: a */
                public void mo31061a(Throwable th) {
                    ClientKeepAlivePinger.this.f58803a.mo30968a(Status.f58287n.m30947g("Keepalive failed. The connection is likely gone"));
                }

                @Override // io.grpc.internal.ClientTransport.PingCallback
                /* renamed from: b */
                public void mo31062b(long j2) {
                }
            }, MoreExecutors.m12201a());
        }
    }

    public interface KeepAlivePinger {
        /* renamed from: a */
        void mo31135a();

        /* renamed from: b */
        void mo31136b();
    }

    public enum State {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public KeepAliveManager(KeepAlivePinger keepAlivePinger, ScheduledExecutorService scheduledExecutorService, long j2, long j3, boolean z) {
        Stopwatch stopwatch = new Stopwatch();
        this.f58794e = State.IDLE;
        this.f58797h = new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.KeepAliveManager.1
            @Override // java.lang.Runnable
            public void run() {
                KeepAliveManager keepAliveManager;
                boolean z2;
                synchronized (KeepAliveManager.this) {
                    keepAliveManager = KeepAliveManager.this;
                    State state = keepAliveManager.f58794e;
                    State state2 = State.DISCONNECTED;
                    if (state != state2) {
                        keepAliveManager.f58794e = state2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    keepAliveManager.f58792c.mo31135a();
                }
            }
        });
        this.f58798i = new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.KeepAliveManager.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z2;
                synchronized (KeepAliveManager.this) {
                    KeepAliveManager keepAliveManager = KeepAliveManager.this;
                    keepAliveManager.f58796g = null;
                    State state = keepAliveManager.f58794e;
                    State state2 = State.PING_SCHEDULED;
                    if (state == state2) {
                        z2 = true;
                        keepAliveManager.f58794e = State.PING_SENT;
                        keepAliveManager.f58795f = keepAliveManager.f58790a.schedule(keepAliveManager.f58797h, keepAliveManager.f58800k, TimeUnit.NANOSECONDS);
                    } else {
                        if (state == State.PING_DELAYED) {
                            ScheduledExecutorService scheduledExecutorService2 = keepAliveManager.f58790a;
                            Runnable runnable = keepAliveManager.f58798i;
                            long j4 = keepAliveManager.f58799j;
                            Stopwatch stopwatch2 = keepAliveManager.f58791b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            keepAliveManager.f58796g = scheduledExecutorService2.schedule(runnable, j4 - stopwatch2.m11213a(timeUnit), timeUnit);
                            KeepAliveManager.this.f58794e = state2;
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    KeepAliveManager.this.f58792c.mo31136b();
                }
            }
        });
        this.f58792c = keepAlivePinger;
        Preconditions.m11187k(scheduledExecutorService, "scheduler");
        this.f58790a = scheduledExecutorService;
        this.f58791b = stopwatch;
        this.f58799j = j2;
        this.f58800k = j3;
        this.f58793d = z;
        stopwatch.m11215c();
        stopwatch.m11216d();
    }

    /* renamed from: a */
    public synchronized void m31131a() {
        State state = State.IDLE_AND_PING_SENT;
        synchronized (this) {
            Stopwatch stopwatch = this.f58791b;
            stopwatch.m11215c();
            stopwatch.m11216d();
            State state2 = this.f58794e;
            State state3 = State.PING_SCHEDULED;
            if (state2 == state3) {
                this.f58794e = State.PING_DELAYED;
            } else if (state2 == State.PING_SENT || state2 == state) {
                ScheduledFuture<?> scheduledFuture = this.f58795f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f58794e == state) {
                    this.f58794e = State.IDLE;
                } else {
                    this.f58794e = state3;
                    Preconditions.m11192p(this.f58796g == null, "There should be no outstanding pingFuture");
                    this.f58796g = this.f58790a.schedule(this.f58798i, this.f58799j, TimeUnit.NANOSECONDS);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m31132b() {
        State state = this.f58794e;
        if (state == State.IDLE) {
            this.f58794e = State.PING_SCHEDULED;
            if (this.f58796g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f58790a;
                Runnable runnable = this.f58798i;
                long j2 = this.f58799j;
                Stopwatch stopwatch = this.f58791b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f58796g = scheduledExecutorService.schedule(runnable, j2 - stopwatch.m11213a(timeUnit), timeUnit);
            }
        } else if (state == State.IDLE_AND_PING_SENT) {
            this.f58794e = State.PING_SENT;
        }
    }

    /* renamed from: c */
    public synchronized void m31133c() {
        if (this.f58793d) {
            return;
        }
        State state = this.f58794e;
        if (state == State.PING_SCHEDULED || state == State.PING_DELAYED) {
            this.f58794e = State.IDLE;
        }
        if (this.f58794e == State.PING_SENT) {
            this.f58794e = State.IDLE_AND_PING_SENT;
        }
    }

    /* renamed from: d */
    public synchronized void m31134d() {
        State state = this.f58794e;
        State state2 = State.DISCONNECTED;
        if (state != state2) {
            this.f58794e = state2;
            ScheduledFuture<?> scheduledFuture = this.f58795f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f58796g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f58796g = null;
            }
        }
    }
}
