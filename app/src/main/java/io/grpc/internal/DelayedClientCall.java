package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ClientCall;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public class DelayedClientCall<ReqT, RespT> extends ClientCall<ReqT, RespT> {

    /* renamed from: j */
    public static final Logger f58534j = Logger.getLogger(DelayedClientCall.class.getName());

    /* renamed from: k */
    public static final ClientCall<Object, Object> f58535k = new ClientCall<Object, Object>() { // from class: io.grpc.internal.DelayedClientCall.7
        @Override // io.grpc.ClientCall
        /* renamed from: a */
        public void mo30812a(String str, Throwable th) {
        }

        @Override // io.grpc.ClientCall
        /* renamed from: b */
        public void mo12487b() {
        }

        @Override // io.grpc.ClientCall
        /* renamed from: c */
        public void mo30813c(int i2) {
        }

        @Override // io.grpc.ClientCall
        /* renamed from: d */
        public void mo30814d(Object obj) {
        }

        @Override // io.grpc.ClientCall
        /* renamed from: f */
        public void mo30816f(ClientCall.Listener<Object> listener, Metadata metadata) {
        }
    };

    /* renamed from: a */
    @Nullable
    public final ScheduledFuture<?> f58536a;

    /* renamed from: b */
    public final Executor f58537b;

    /* renamed from: c */
    public final Context f58538c;

    /* renamed from: d */
    public volatile boolean f58539d;

    /* renamed from: e */
    public ClientCall.Listener<RespT> f58540e;

    /* renamed from: f */
    public ClientCall<ReqT, RespT> f58541f;

    /* renamed from: g */
    @GuardedBy
    public Status f58542g;

    /* renamed from: h */
    @GuardedBy
    public List<Runnable> f58543h;

    /* renamed from: i */
    @GuardedBy
    public DelayedListener<RespT> f58544i;

    /* renamed from: io.grpc.internal.DelayedClientCall$1DeadlineExceededRunnable, reason: invalid class name */
    class C1DeadlineExceededRunnable implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f58548b;

        /* renamed from: c */
        public final /* synthetic */ DelayedClientCall f58549c;

        @Override // java.lang.Runnable
        public void run() {
            DelayedClientCall delayedClientCall = this.f58549c;
            Status m30947g = Status.f58281h.m30947g(this.f58548b.toString());
            Logger logger = DelayedClientCall.f58534j;
            delayedClientCall.m31074h(m30947g, true);
        }
    }

    public final class CloseListenerRunnable extends ContextRunnable {

        /* renamed from: c */
        public final ClientCall.Listener<RespT> f58560c;

        /* renamed from: d */
        public final Status f58561d;

        public CloseListenerRunnable(DelayedClientCall delayedClientCall, ClientCall.Listener<RespT> listener, Status status) {
            super(delayedClientCall.f58538c);
            this.f58560c = listener;
            this.f58561d = status;
        }

        @Override // io.grpc.internal.ContextRunnable
        /* renamed from: a */
        public void mo31050a() {
            this.f58560c.mo12483a(this.f58561d, new Metadata());
        }
    }

    public static final class DelayedListener<RespT> extends ClientCall.Listener<RespT> {

        /* renamed from: a */
        public final ClientCall.Listener<RespT> f58562a;

        /* renamed from: b */
        public volatile boolean f58563b;

        /* renamed from: c */
        @GuardedBy
        public List<Runnable> f58564c = new ArrayList();

        public DelayedListener(ClientCall.Listener<RespT> listener) {
            this.f58562a = listener;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(final Status status, final Metadata metadata) {
            m31078e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.3
                @Override // java.lang.Runnable
                public void run() {
                    DelayedListener.this.f58562a.mo12483a(status, metadata);
                }
            });
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: b */
        public void mo12484b(final Metadata metadata) {
            if (this.f58563b) {
                this.f58562a.mo12484b(metadata);
            } else {
                m31078e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DelayedListener.this.f58562a.mo12484b(metadata);
                    }
                });
            }
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(final RespT respt) {
            if (this.f58563b) {
                this.f58562a.mo12485c(respt);
            } else {
                m31078e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DelayedListener.this.f58562a.mo12485c(respt);
                    }
                });
            }
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: d */
        public void mo12486d() {
            if (this.f58563b) {
                this.f58562a.mo12486d();
            } else {
                m31078e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.4
                    @Override // java.lang.Runnable
                    public void run() {
                        DelayedListener.this.f58562a.mo12486d();
                    }
                });
            }
        }

        /* renamed from: e */
        public final void m31078e(Runnable runnable) {
            synchronized (this) {
                if (this.f58563b) {
                    runnable.run();
                } else {
                    this.f58564c.add(runnable);
                }
            }
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: a */
    public final void mo30812a(@Nullable String str, @Nullable Throwable th) {
        Status status = Status.f58279f;
        Status m30947g = str != null ? status.m30947g(str) : status.m30947g("Call cancelled without message");
        if (th != null) {
            m30947g = m30947g.m30946f(th);
        }
        m31074h(m30947g, false);
    }

    @Override // io.grpc.ClientCall
    /* renamed from: b */
    public final void mo12487b() {
        m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.6
            @Override // java.lang.Runnable
            public void run() {
                DelayedClientCall.this.f58541f.mo12487b();
            }
        });
    }

    @Override // io.grpc.ClientCall
    /* renamed from: c */
    public final void mo30813c(final int i2) {
        if (this.f58539d) {
            this.f58541f.mo30813c(i2);
        } else {
            m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.5
                @Override // java.lang.Runnable
                public void run() {
                    DelayedClientCall.this.f58541f.mo30813c(i2);
                }
            });
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: d */
    public final void mo30814d(final ReqT reqt) {
        if (this.f58539d) {
            this.f58541f.mo30814d(reqt);
        } else {
            m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    DelayedClientCall.this.f58541f.mo30814d(reqt);
                }
            });
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: e */
    public final void mo30815e(final boolean z) {
        if (this.f58539d) {
            this.f58541f.mo30815e(z);
        } else {
            m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.4
                @Override // java.lang.Runnable
                public void run() {
                    DelayedClientCall.this.f58541f.mo30815e(z);
                }
            });
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: f */
    public final void mo30816f(final ClientCall.Listener<RespT> listener, final Metadata metadata) {
        Status status;
        boolean z;
        Preconditions.m11192p(this.f58540e == null, "already started");
        synchronized (this) {
            Preconditions.m11187k(listener, "listener");
            this.f58540e = listener;
            status = this.f58542g;
            z = this.f58539d;
            if (!z) {
                DelayedListener<RespT> delayedListener = new DelayedListener<>(listener);
                this.f58544i = delayedListener;
                listener = delayedListener;
            }
        }
        if (status != null) {
            this.f58537b.execute(new CloseListenerRunnable(this, listener, status));
        } else if (z) {
            this.f58541f.mo30816f(listener, metadata);
        } else {
            m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.1
                @Override // java.lang.Runnable
                public void run() {
                    DelayedClientCall.this.f58541f.mo30816f(listener, metadata);
                }
            });
        }
    }

    /* renamed from: g */
    public void mo31073g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m31074h(final Status status, boolean z) {
        boolean z2;
        ClientCall.Listener<RespT> listener;
        synchronized (this) {
            if (this.f58541f == null) {
                m31077k(f58535k);
                z2 = false;
                listener = this.f58540e;
                this.f58542g = status;
            } else {
                if (z) {
                    return;
                }
                z2 = true;
                listener = null;
            }
            if (z2) {
                m31075i(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ClientCall<ReqT, RespT> clientCall = DelayedClientCall.this.f58541f;
                        Status status2 = status;
                        clientCall.mo30812a(status2.f58292b, status2.f58293c);
                    }
                });
            } else {
                if (listener != null) {
                    this.f58537b.execute(new CloseListenerRunnable(this, listener, status));
                }
                m31076j();
            }
            mo31073g();
        }
    }

    /* renamed from: i */
    public final void m31075i(Runnable runnable) {
        synchronized (this) {
            if (this.f58539d) {
                runnable.run();
            } else {
                this.f58543h.add(runnable);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31076j() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f58543h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f58543h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f58539d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.DelayedClientCall$DelayedListener<RespT> r0 = r3.f58544i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f58537b
            io.grpc.internal.DelayedClientCall$1DrainListenerRunnable r2 = new io.grpc.internal.DelayedClientCall$1DrainListenerRunnable
            r2.<init>(r3)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f58543h     // Catch: java.lang.Throwable -> L42
            r3.f58543h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.DelayedClientCall.m31076j():void");
    }

    @GuardedBy
    /* renamed from: k */
    public final void m31077k(ClientCall<ReqT, RespT> clientCall) {
        ClientCall<ReqT, RespT> clientCall2 = this.f58541f;
        Preconditions.m11194r(clientCall2 == null, "realCall already set to %s", clientCall2);
        ScheduledFuture<?> scheduledFuture = this.f58536a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f58541f = clientCall;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("realCall", this.f58541f);
        return m11166b.toString();
    }
}
