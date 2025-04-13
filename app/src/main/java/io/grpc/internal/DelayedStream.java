package io.grpc.internal;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.common.base.Preconditions;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
class DelayedStream implements ClientStream {

    /* renamed from: a */
    public volatile boolean f58577a;

    /* renamed from: b */
    public ClientStreamListener f58578b;

    /* renamed from: c */
    public ClientStream f58579c;

    /* renamed from: d */
    @GuardedBy
    public Status f58580d;

    /* renamed from: f */
    @GuardedBy
    public DelayedStreamListener f58582f;

    /* renamed from: g */
    @GuardedBy
    public long f58583g;

    /* renamed from: h */
    @GuardedBy
    public long f58584h;

    /* renamed from: e */
    @GuardedBy
    public List<Runnable> f58581e = new ArrayList();

    /* renamed from: i */
    public List<Runnable> f58585i = new ArrayList();

    /* renamed from: io.grpc.internal.DelayedStream$4 */
    class RunnableC63774 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DelayedStream f58603b;

        @Override // java.lang.Runnable
        public void run() {
            this.f58603b.m31081v();
        }
    }

    public static class DelayedStreamListener implements ClientStreamListener {

        /* renamed from: a */
        public final ClientStreamListener f58612a;

        /* renamed from: b */
        public volatile boolean f58613b;

        /* renamed from: c */
        @GuardedBy
        public List<Runnable> f58614c = new ArrayList();

        public DelayedStreamListener(ClientStreamListener clientStreamListener) {
            this.f58612a = clientStreamListener;
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(final StreamListener.MessageProducer messageProducer) {
            if (this.f58613b) {
                this.f58612a.mo31052a(messageProducer);
            } else {
                m31084g(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DelayedStreamListener.this.f58612a.mo31052a(messageProducer);
                    }
                });
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: d */
        public void mo31053d(final Metadata metadata) {
            m31084g(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.3
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStreamListener.this.f58612a.mo31053d(metadata);
                }
            });
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
            if (this.f58613b) {
                this.f58612a.mo31054e();
            } else {
                m31084g(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DelayedStreamListener.this.f58612a.mo31054e();
                    }
                });
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: f */
        public void mo31055f(final Status status, final ClientStreamListener.RpcProgress rpcProgress, final Metadata metadata) {
            m31084g(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.4
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStreamListener.this.f58612a.mo31055f(status, rpcProgress, metadata);
                }
            });
        }

        /* renamed from: g */
        public final void m31084g(Runnable runnable) {
            synchronized (this) {
                if (this.f58613b) {
                    runnable.run();
                } else {
                    this.f58614c.add(runnable);
                }
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: a */
    public void mo30978a(final Status status) {
        boolean z = true;
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        Preconditions.m11187k(status, "reason");
        synchronized (this) {
            if (this.f58579c == null) {
                m31083y(NoopClientStream.f58932a);
                this.f58580d = status;
                z = false;
            }
        }
        if (z) {
            m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.8
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStream.this.f58579c.mo30978a(status);
                }
            });
            return;
        }
        m31081v();
        mo31079x(status);
        this.f58578b.mo31055f(status, ClientStreamListener.RpcProgress.PROCESSED, new Metadata());
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: b */
    public boolean mo30979b() {
        if (this.f58577a) {
            return this.f58579c.mo30979b();
        }
        return false;
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: c */
    public void mo30980c(final boolean z) {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        if (this.f58577a) {
            this.f58579c.mo30980c(z);
        } else {
            m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.15
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStream.this.f58579c.mo30980c(z);
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: e */
    public void mo30981e(final Compressor compressor) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        Preconditions.m11187k(compressor, "compressor");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.12
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30981e(compressor);
            }
        });
    }

    @Override // io.grpc.internal.Stream
    public void flush() {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        if (this.f58577a) {
            this.f58579c.flush();
        } else {
            m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.7
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStream.this.f58579c.flush();
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: g */
    public void mo30982g(final int i2) {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        if (this.f58577a) {
            this.f58579c.mo30982g(i2);
        } else {
            m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.10
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStream.this.f58579c.mo30982g(i2);
                }
            });
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: h */
    public void mo30983h(final int i2) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.1
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30983h(i2);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: i */
    public void mo30984i(final int i2) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.2
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30984i(i2);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: k */
    public void mo30985k(final DecompressorRegistry decompressorRegistry) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        Preconditions.m11187k(decompressorRegistry, "decompressorRegistry");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.14
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30985k(decompressorRegistry);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: m */
    public void mo30986m(final String str) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        Preconditions.m11187k(str, "authority");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.5
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30986m(str);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: n */
    public void mo30987n(InsightBuilder insightBuilder) {
        synchronized (this) {
            if (this.f58578b == null) {
                return;
            }
            if (this.f58579c != null) {
                insightBuilder.m31116b("buffered_nanos", Long.valueOf(this.f58584h - this.f58583g));
                this.f58579c.mo30987n(insightBuilder);
            } else {
                insightBuilder.m31116b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f58583g));
                insightBuilder.f58728a.add("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: o */
    public void mo30988o() {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.9
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30988o();
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: p */
    public void mo30989p(final Deadline deadline) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.3
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30989p(deadline);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: q */
    public void mo30976q(ClientStreamListener clientStreamListener) {
        Status status;
        boolean z;
        Preconditions.m11187k(clientStreamListener, "listener");
        Preconditions.m11192p(this.f58578b == null, "already started");
        synchronized (this) {
            status = this.f58580d;
            z = this.f58577a;
            if (!z) {
                DelayedStreamListener delayedStreamListener = new DelayedStreamListener(clientStreamListener);
                this.f58582f = delayedStreamListener;
                clientStreamListener = delayedStreamListener;
            }
            this.f58578b = clientStreamListener;
            this.f58583g = System.nanoTime();
        }
        if (status != null) {
            clientStreamListener.mo31055f(status, ClientStreamListener.RpcProgress.PROCESSED, new Metadata());
        } else if (z) {
            m31082w(clientStreamListener);
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: r */
    public void mo30990r(final InputStream inputStream) {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        Preconditions.m11187k(inputStream, ThrowableDeserializer.PROP_NAME_MESSAGE);
        if (this.f58577a) {
            this.f58579c.mo30990r(inputStream);
        } else {
            m31080t(new Runnable() { // from class: io.grpc.internal.DelayedStream.6
                @Override // java.lang.Runnable
                public void run() {
                    DelayedStream.this.f58579c.mo30990r(inputStream);
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: s */
    public void mo30991s() {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.11
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30991s();
            }
        });
    }

    /* renamed from: t */
    public final void m31080t(Runnable runnable) {
        Preconditions.m11192p(this.f58578b != null, "May only be called after start");
        synchronized (this) {
            if (this.f58577a) {
                runnable.run();
            } else {
                this.f58581e.add(runnable);
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: u */
    public void mo30993u(final boolean z) {
        Preconditions.m11192p(this.f58578b == null, "May only be called before start");
        this.f58585i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.13
            @Override // java.lang.Runnable
            public void run() {
                DelayedStream.this.f58579c.mo30993u(z);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[ORIG_RETURN, RETURN] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31081v() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List<java.lang.Runnable> r1 = r6.f58581e     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.f58581e = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.f58577a = r1     // Catch: java.lang.Throwable -> L6d
            io.grpc.internal.DelayedStream$DelayedStreamListener r2 = r6.f58582f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r4 = r2.f58614c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.f58614c = r0     // Catch: java.lang.Throwable -> L4b
            r2.f58613b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L4e
        L2d:
            java.util.List<java.lang.Runnable> r4 = r2.f58614c     // Catch: java.lang.Throwable -> L4b
            r2.f58614c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List<java.lang.Runnable> r1 = r6.f58581e     // Catch: java.lang.Throwable -> L6d
            r6.f58581e = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.DelayedStream.m31081v():void");
    }

    /* renamed from: w */
    public final void m31082w(ClientStreamListener clientStreamListener) {
        Iterator<Runnable> it = this.f58585i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f58585i = null;
        this.f58579c.mo30976q(clientStreamListener);
    }

    /* renamed from: x */
    public void mo31079x(Status status) {
    }

    @GuardedBy
    /* renamed from: y */
    public final void m31083y(ClientStream clientStream) {
        ClientStream clientStream2 = this.f58579c;
        Preconditions.m11194r(clientStream2 == null, "realStream already set to %s", clientStream2);
        this.f58579c = clientStream;
        this.f58584h = System.nanoTime();
    }
}
