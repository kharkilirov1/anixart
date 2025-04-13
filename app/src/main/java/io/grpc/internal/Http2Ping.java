package io.grpc.internal;

import com.google.common.base.Stopwatch;
import io.grpc.internal.ClientTransport;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public class Http2Ping {

    /* renamed from: g */
    public static final Logger f58716g = Logger.getLogger(Http2Ping.class.getName());

    /* renamed from: a */
    public final long f58717a;

    /* renamed from: b */
    public final Stopwatch f58718b;

    /* renamed from: c */
    @GuardedBy
    public Map<ClientTransport.PingCallback, Executor> f58719c = new LinkedHashMap();

    /* renamed from: d */
    @GuardedBy
    public boolean f58720d;

    /* renamed from: e */
    @GuardedBy
    public Throwable f58721e;

    /* renamed from: f */
    @GuardedBy
    public long f58722f;

    /* renamed from: io.grpc.internal.Http2Ping$1 */
    class RunnableC63981 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ClientTransport.PingCallback f58723b;

        /* renamed from: c */
        public final /* synthetic */ long f58724c;

        public RunnableC63981(ClientTransport.PingCallback pingCallback, long j2) {
            this.f58723b = pingCallback;
            this.f58724c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58723b.mo31062b(this.f58724c);
        }
    }

    /* renamed from: io.grpc.internal.Http2Ping$2 */
    class RunnableC63992 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ClientTransport.PingCallback f58725b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f58726c;

        public RunnableC63992(ClientTransport.PingCallback pingCallback, Throwable th) {
            this.f58725b = pingCallback;
            this.f58726c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58725b.mo31061a(this.f58726c);
        }
    }

    public Http2Ping(long j2, Stopwatch stopwatch) {
        this.f58717a = j2;
        this.f58718b = stopwatch;
    }

    /* renamed from: c */
    public static void m31109c(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f58716g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: e */
    public static void m31110e(ClientTransport.PingCallback pingCallback, Executor executor, Throwable th) {
        m31109c(executor, new RunnableC63992(pingCallback, th));
    }

    /* renamed from: a */
    public void m31111a(ClientTransport.PingCallback pingCallback, Executor executor) {
        synchronized (this) {
            if (!this.f58720d) {
                this.f58719c.put(pingCallback, executor);
            } else {
                Throwable th = this.f58721e;
                m31109c(executor, th != null ? new RunnableC63992(pingCallback, th) : new RunnableC63981(pingCallback, this.f58722f));
            }
        }
    }

    /* renamed from: b */
    public boolean m31112b() {
        synchronized (this) {
            if (this.f58720d) {
                return false;
            }
            this.f58720d = true;
            long m11213a = this.f58718b.m11213a(TimeUnit.NANOSECONDS);
            this.f58722f = m11213a;
            Map<ClientTransport.PingCallback, Executor> map = this.f58719c;
            this.f58719c = null;
            for (Map.Entry<ClientTransport.PingCallback, Executor> entry : map.entrySet()) {
                m31109c(entry.getValue(), new RunnableC63981(entry.getKey(), m11213a));
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m31113d(Throwable th) {
        synchronized (this) {
            if (this.f58720d) {
                return;
            }
            this.f58720d = true;
            this.f58721e = th;
            Map<ClientTransport.PingCallback, Executor> map = this.f58719c;
            this.f58719c = null;
            for (Map.Entry<ClientTransport.PingCallback, Executor> entry : map.entrySet()) {
                m31109c(entry.getValue(), new RunnableC63992(entry.getKey(), th));
            }
        }
    }
}
