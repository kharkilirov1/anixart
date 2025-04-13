package io.grpc.inprocess;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Grpc;
import io.grpc.InternalLogId;
import io.grpc.InternalMetadata;
import io.grpc.Metadata;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.StreamTracer;
import io.grpc.internal.ClientStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.GrpcAttributes;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.InUseStateAggregator;
import io.grpc.internal.InsightBuilder;
import io.grpc.internal.ManagedClientTransport;
import io.grpc.internal.NoopClientStream;
import io.grpc.internal.ServerListener;
import io.grpc.internal.ServerStream;
import io.grpc.internal.ServerStreamListener;
import io.grpc.internal.ServerTransport;
import io.grpc.internal.ServerTransportListener;
import io.grpc.internal.StatsTraceContext;
import io.grpc.internal.StreamListener;
import java.io.InputStream;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
final class InProcessTransport implements ServerTransport, ConnectionClientTransport {

    /* renamed from: r */
    public static final Logger f58342r = Logger.getLogger(InProcessTransport.class.getName());

    /* renamed from: a */
    public final InternalLogId f58343a;

    /* renamed from: b */
    public final SocketAddress f58344b;

    /* renamed from: c */
    public final int f58345c;

    /* renamed from: d */
    public final String f58346d;

    /* renamed from: e */
    public final String f58347e;

    /* renamed from: f */
    public final Optional<ServerListener> f58348f;

    /* renamed from: g */
    public final boolean f58349g;

    /* renamed from: h */
    public ScheduledExecutorService f58350h;

    /* renamed from: i */
    public ServerTransportListener f58351i;

    /* renamed from: j */
    public Attributes f58352j;

    /* renamed from: k */
    public ManagedClientTransport.Listener f58353k;

    /* renamed from: l */
    @GuardedBy
    public boolean f58354l;

    /* renamed from: m */
    @GuardedBy
    public boolean f58355m;

    /* renamed from: n */
    @GuardedBy
    public Status f58356n;

    /* renamed from: o */
    @GuardedBy
    public final Set<InProcessStream> f58357o;

    /* renamed from: p */
    public final Attributes f58358p;

    /* renamed from: q */
    @GuardedBy
    public final InUseStateAggregator<InProcessStream> f58359q;

    /* renamed from: io.grpc.inprocess.InProcessTransport$4 */
    class C63254 extends NoopClientStream {

        /* renamed from: b */
        public final /* synthetic */ StatsTraceContext f58364b;

        /* renamed from: c */
        public final /* synthetic */ Status f58365c;

        @Override // io.grpc.internal.NoopClientStream, io.grpc.internal.ClientStream
        /* renamed from: q */
        public void mo30976q(ClientStreamListener clientStreamListener) {
            this.f58364b.m31199b();
            this.f58364b.m31205h(this.f58365c);
            clientStreamListener.mo31055f(this.f58365c, ClientStreamListener.RpcProgress.PROCESSED, new Metadata());
        }
    }

    public class InProcessStream {

        /* renamed from: a */
        public final InProcessClientStream f58369a;

        /* renamed from: b */
        public final CallOptions f58370b;

        /* renamed from: c */
        public final Metadata f58371c;

        /* renamed from: d */
        public volatile String f58372d;

        /* renamed from: e */
        public final /* synthetic */ InProcessTransport f58373e;

        public class InProcessClientStream implements ClientStream {

            /* renamed from: a */
            public final StatsTraceContext f58374a;

            /* renamed from: b */
            @GuardedBy
            public ServerStreamListener f58375b;

            /* renamed from: c */
            @GuardedBy
            public int f58376c;

            /* renamed from: d */
            @GuardedBy
            public ArrayDeque<StreamListener.MessageProducer> f58377d;

            /* renamed from: e */
            @GuardedBy
            public boolean f58378e;

            /* renamed from: f */
            @GuardedBy
            public boolean f58379f;

            /* renamed from: g */
            public final /* synthetic */ InProcessStream f58380g;

            @Override // io.grpc.internal.ClientStream
            /* renamed from: a */
            public void mo30978a(Status status) {
                Status m30966d = InProcessTransport.m30966d(status, this.f58380g.f58373e.f58349g);
                m30992t(m30966d, m30966d);
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: b */
            public synchronized boolean mo30979b() {
                if (this.f58379f) {
                    return false;
                }
                return this.f58376c > 0;
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: c */
            public void mo30980c(boolean z) {
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: e */
            public void mo30981e(Compressor compressor) {
            }

            @Override // io.grpc.internal.Stream
            public void flush() {
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: g */
            public void mo30982g(int i2) {
                Objects.requireNonNull(this.f58380g);
                throw null;
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: h */
            public void mo30983h(int i2) {
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: i */
            public void mo30984i(int i2) {
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: k */
            public void mo30985k(DecompressorRegistry decompressorRegistry) {
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: m */
            public void mo30986m(String str) {
                this.f58380g.f58372d = str;
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: n */
            public void mo30987n(InsightBuilder insightBuilder) {
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: o */
            public synchronized void mo30988o() {
                if (this.f58379f) {
                    return;
                }
                if (this.f58377d.isEmpty()) {
                    this.f58375b.mo31185c();
                } else {
                    this.f58378e = true;
                }
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: p */
            public void mo30989p(Deadline deadline) {
                Metadata metadata = this.f58380g.f58371c;
                Metadata.Key<Long> key = GrpcUtil.f58657c;
                metadata.m30897b(key);
                this.f58380g.f58371c.m30903h(key, Long.valueOf(Math.max(0L, deadline.m30855e(TimeUnit.NANOSECONDS))));
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: q */
            public void mo30976q(ClientStreamListener clientStreamListener) {
                Objects.requireNonNull(this.f58380g);
                throw null;
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: r */
            public synchronized void mo30990r(InputStream inputStream) {
                if (!this.f58379f) {
                    this.f58374a.m31203f(0);
                    this.f58374a.m31204g(0, -1L, -1L);
                    Objects.requireNonNull(this.f58380g);
                    Objects.requireNonNull(null);
                    throw null;
                }
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: s */
            public void mo30991s() {
            }

            /* renamed from: t */
            public final synchronized boolean m30992t(Status status, Status status2) {
                if (!this.f58379f) {
                    this.f58379f = true;
                    while (true) {
                        StreamListener.MessageProducer poll = this.f58377d.poll();
                        if (poll == null) {
                            Objects.requireNonNull(this.f58380g);
                            Objects.requireNonNull(null);
                            throw null;
                        }
                        while (true) {
                            InputStream next = poll.next();
                            if (next != null) {
                                try {
                                    next.close();
                                } catch (Throwable th) {
                                    InProcessTransport.f58342r.log(Level.WARNING, "Exception closing stream", th);
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override // io.grpc.internal.ClientStream
            /* renamed from: u */
            public void mo30993u(boolean z) {
            }
        }

        public class InProcessServerStream implements ServerStream {

            /* renamed from: a */
            @GuardedBy
            public ClientStreamListener f58381a;

            /* renamed from: b */
            @GuardedBy
            public int f58382b;

            /* renamed from: c */
            @GuardedBy
            public ArrayDeque<StreamListener.MessageProducer> f58383c;

            /* renamed from: d */
            @GuardedBy
            public Status f58384d;

            /* renamed from: e */
            @GuardedBy
            public Metadata f58385e;

            /* renamed from: f */
            @GuardedBy
            public boolean f58386f;

            /* renamed from: g */
            public final /* synthetic */ InProcessStream f58387g;

            @Override // io.grpc.internal.ServerStream
            /* renamed from: a */
            public void mo30994a(Status status) {
                if (m30999t(Status.f58279f.m30947g("server cancelled stream"))) {
                    this.f58387g.f58369a.m30992t(status, status);
                    InProcessStream.m30977a(this.f58387g);
                }
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: b */
            public synchronized boolean mo30979b() {
                if (this.f58386f) {
                    return false;
                }
                return this.f58382b > 0;
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: c */
            public void mo30980c(boolean z) {
            }

            @Override // io.grpc.internal.ServerStream
            /* renamed from: d */
            public void mo30995d(Metadata metadata) {
                int m30967g;
                if (this.f58387g.f58373e.f58345c != Integer.MAX_VALUE && (m30967g = InProcessTransport.m30967g(metadata)) > this.f58387g.f58373e.f58345c) {
                    Status m30947g = Status.f58279f.m30947g("Client cancelled the RPC");
                    this.f58387g.f58369a.m30992t(m30947g, m30947g);
                    m31000v(Status.f58284k.m30947g(String.format("Response header metadata larger than %d: %d", Integer.valueOf(this.f58387g.f58373e.f58345c), Integer.valueOf(m30967g))), new Metadata());
                    return;
                }
                synchronized (this) {
                    if (this.f58386f) {
                        return;
                    }
                    for (StreamTracer streamTracer : this.f58387g.f58369a.f58374a.f59158a) {
                        ((ClientStreamTracer) streamTracer).mo30820j();
                    }
                    this.f58381a.mo31053d(metadata);
                }
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: e */
            public void mo30981e(Compressor compressor) {
            }

            @Override // io.grpc.internal.ServerStream
            /* renamed from: f */
            public Attributes mo30996f() {
                return this.f58387g.f58373e.f58352j;
            }

            @Override // io.grpc.internal.Stream
            public void flush() {
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: g */
            public void mo30982g(int i2) {
                boolean z;
                InProcessClientStream inProcessClientStream = this.f58387g.f58369a;
                synchronized (inProcessClientStream) {
                    z = false;
                    if (!inProcessClientStream.f58379f) {
                        int i3 = inProcessClientStream.f58376c;
                        boolean z2 = i3 > 0;
                        inProcessClientStream.f58376c = i3 + i2;
                        while (inProcessClientStream.f58376c > 0 && !inProcessClientStream.f58377d.isEmpty()) {
                            inProcessClientStream.f58376c--;
                            inProcessClientStream.f58375b.mo31052a(inProcessClientStream.f58377d.poll());
                        }
                        if (inProcessClientStream.f58377d.isEmpty() && inProcessClientStream.f58378e) {
                            inProcessClientStream.f58378e = false;
                            inProcessClientStream.f58375b.mo31185c();
                        }
                        boolean z3 = inProcessClientStream.f58376c > 0;
                        if (!z2 && z3) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    synchronized (this) {
                        if (!this.f58386f) {
                            this.f58381a.mo31054e();
                        }
                    }
                }
            }

            @Override // io.grpc.internal.ServerStream
            /* renamed from: j */
            public void mo30997j(Status status, Metadata metadata) {
                this.f58387g.f58369a.m30992t(Status.f58278e, status);
                if (this.f58387g.f58373e.f58345c != Integer.MAX_VALUE) {
                    String str = status.f58292b;
                    int m30967g = InProcessTransport.m30967g(metadata) + (str == null ? 0 : str.length());
                    int i2 = this.f58387g.f58373e.f58345c;
                    if (m30967g > i2) {
                        status = Status.f58284k.m30947g(String.format("Response header metadata larger than %d: %d", Integer.valueOf(i2), Integer.valueOf(m30967g)));
                        metadata = new Metadata();
                    }
                }
                m31000v(status, metadata);
            }

            @Override // io.grpc.internal.ServerStream
            /* renamed from: l */
            public String mo30998l() {
                return this.f58387g.f58372d;
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: r */
            public synchronized void mo30990r(InputStream inputStream) {
                if (!this.f58386f) {
                    throw null;
                }
            }

            @Override // io.grpc.internal.Stream
            /* renamed from: s */
            public void mo30991s() {
            }

            /* renamed from: t */
            public final synchronized boolean m30999t(Status status) {
                if (this.f58386f) {
                    return false;
                }
                this.f58386f = true;
                while (true) {
                    StreamListener.MessageProducer poll = this.f58383c.poll();
                    if (poll == null) {
                        this.f58387g.f58369a.f58374a.m31205h(status);
                        this.f58381a.mo31055f(status, ClientStreamListener.RpcProgress.PROCESSED, new Metadata());
                        return true;
                    }
                    while (true) {
                        InputStream next = poll.next();
                        if (next != null) {
                            try {
                                next.close();
                            } catch (Throwable th) {
                                InProcessTransport.f58342r.log(Level.WARNING, "Exception closing stream", th);
                            }
                        }
                    }
                }
            }

            /* renamed from: v */
            public final void m31000v(Status status, Metadata metadata) {
                Status m30966d = InProcessTransport.m30966d(status, this.f58387g.f58373e.f58349g);
                synchronized (this) {
                    if (this.f58386f) {
                        return;
                    }
                    if (this.f58383c.isEmpty()) {
                        this.f58386f = true;
                        this.f58387g.f58369a.f58374a.m31198a(metadata);
                        this.f58387g.f58369a.f58374a.m31205h(m30966d);
                        this.f58381a.mo31055f(m30966d, ClientStreamListener.RpcProgress.PROCESSED, metadata);
                    } else {
                        this.f58384d = m30966d;
                        this.f58385e = metadata;
                    }
                    InProcessStream.m30977a(this.f58387g);
                }
            }
        }

        /* renamed from: a */
        public static void m30977a(InProcessStream inProcessStream) {
            synchronized (inProcessStream.f58373e) {
                boolean remove = inProcessStream.f58373e.f58357o.remove(inProcessStream);
                if (GrpcUtil.m31097h(inProcessStream.f58370b)) {
                    inProcessStream.f58373e.f58359q.m31114c(inProcessStream, false);
                }
                if (inProcessStream.f58373e.f58357o.isEmpty() && remove) {
                    InProcessTransport inProcessTransport = inProcessStream.f58373e;
                    if (inProcessTransport.f58354l) {
                        inProcessTransport.m30973i();
                    }
                }
            }
        }
    }

    public static class SingleMessageProducer implements StreamListener.MessageProducer {

        /* renamed from: b */
        public InputStream f58388b;

        @Override // io.grpc.internal.StreamListener.MessageProducer
        @Nullable
        public InputStream next() {
            InputStream inputStream = this.f58388b;
            this.f58388b = null;
            return inputStream;
        }
    }

    public InProcessTransport(SocketAddress socketAddress, int i2, String str, String str2, Attributes attributes, boolean z) {
        Optional<ServerListener> m11174a = Optional.m11174a();
        this.f58357o = Collections.newSetFromMap(new IdentityHashMap());
        this.f58359q = new InUseStateAggregator<InProcessStream>() { // from class: io.grpc.inprocess.InProcessTransport.1
            @Override // io.grpc.internal.InUseStateAggregator
            /* renamed from: a */
            public void mo30974a() {
                InProcessTransport.this.f58353k.mo31130d(true);
            }

            @Override // io.grpc.internal.InUseStateAggregator
            /* renamed from: b */
            public void mo30975b() {
                InProcessTransport.this.f58353k.mo31130d(false);
            }
        };
        this.f58344b = socketAddress;
        this.f58345c = i2;
        this.f58346d = str;
        this.f58347e = GrpcUtil.m31094e("inprocess", str2);
        Preconditions.m11187k(attributes, "eagAttrs");
        Attributes.Builder m30799a = Attributes.m30799a();
        m30799a.m30802b(GrpcAttributes.f58653a, SecurityLevel.PRIVACY_AND_INTEGRITY);
        m30799a.m30802b(GrpcAttributes.f58654b, attributes);
        m30799a.m30802b(Grpc.f58142a, socketAddress);
        m30799a.m30802b(Grpc.f58143b, socketAddress);
        this.f58358p = m30799a.m30801a();
        this.f58348f = m11174a;
        this.f58343a = InternalLogId.m30878a(InProcessTransport.class, socketAddress.toString());
        this.f58349g = z;
    }

    /* renamed from: d */
    public static Status m30966d(Status status, boolean z) {
        if (status == null) {
            return null;
        }
        Status m30947g = Status.m30942c(status.f58291a.f58312b).m30947g(status.f58292b);
        return z ? m30947g.m30946f(status.f58293c) : m30947g;
    }

    /* renamed from: g */
    public static int m30967g(Metadata metadata) {
        long j2 = 0;
        for (int i2 = 0; i2 < InternalMetadata.m30880b(metadata).length; i2 += 2) {
            j2 += r5[i2].length + 32 + r5[i2 + 1].length;
        }
        return (int) Math.min(j2, ParserMinimalBase.MAX_INT_L);
    }

    @Override // io.grpc.internal.ServerTransport, io.grpc.internal.ManagedClientTransport
    /* renamed from: a */
    public void mo30968a(Status status) {
        Preconditions.m11187k(status, "reason");
        synchronized (this) {
            mo30969b(status);
            if (this.f58355m) {
                return;
            }
            Iterator it = new ArrayList(this.f58357o).iterator();
            while (it.hasNext()) {
                InProcessStream.InProcessClientStream inProcessClientStream = ((InProcessStream) it.next()).f58369a;
                Status m30966d = m30966d(status, inProcessClientStream.f58380g.f58373e.f58349g);
                inProcessClientStream.m30992t(m30966d, m30966d);
            }
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: b */
    public synchronized void mo30969b(Status status) {
        if (this.f58354l) {
            return;
        }
        this.f58356n = status;
        m30972h(status);
        if (this.f58357o.isEmpty()) {
            m30973i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0014, B:8:0x0016, B:9:0x0017, B:13:0x0030, B:15:0x0034, B:19:0x0056, B:22:0x005d, B:23:0x0019, B:25:0x001d, B:26:0x005e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0014, B:8:0x0016, B:9:0x0017, B:13:0x0030, B:15:0x0034, B:19:0x0056, B:22:0x005d, B:23:0x0019, B:25:0x001d, B:26:0x005e), top: B:2:0x0001 }] */
    @Override // io.grpc.internal.ManagedClientTransport
    @javax.annotation.CheckReturnValue
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.Runnable mo30970c(io.grpc.internal.ManagedClientTransport.Listener r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f58353k = r3     // Catch: java.lang.Throwable -> L5f
            com.google.common.base.Optional<io.grpc.internal.ServerListener> r3 = r2.f58348f     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r3.mo11117c()     // Catch: java.lang.Throwable -> L5f
            r0 = 0
            if (r3 != 0) goto L5e
            java.net.SocketAddress r3 = r2.f58344b     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.ConcurrentMap<java.lang.String, io.grpc.inprocess.InProcessServer> r1 = io.grpc.inprocess.InProcessServer.f58341a     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r3 instanceof io.grpc.inprocess.AnonymousInProcessSocketAddress     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L19
            io.grpc.inprocess.AnonymousInProcessSocketAddress r3 = (io.grpc.inprocess.AnonymousInProcessSocketAddress) r3     // Catch: java.lang.Throwable -> L5f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5f
            goto L2d
        L19:
            boolean r1 = r3 instanceof io.grpc.inprocess.InProcessSocketAddress     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L2d
            java.util.concurrent.ConcurrentMap<java.lang.String, io.grpc.inprocess.InProcessServer> r1 = io.grpc.inprocess.InProcessServer.f58341a     // Catch: java.lang.Throwable -> L5f
            io.grpc.inprocess.InProcessSocketAddress r3 = (io.grpc.inprocess.InProcessSocketAddress) r3     // Catch: java.lang.Throwable -> L5f
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L5f
            io.grpc.inprocess.InProcessServer r3 = (io.grpc.inprocess.InProcessServer) r3     // Catch: java.lang.Throwable -> L5f
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r3 != 0) goto L5d
            io.grpc.internal.ServerTransportListener r3 = r2.f58351i     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L56
            io.grpc.Status r3 = io.grpc.Status.f58287n     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "Could not find server: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.net.SocketAddress r1 = r2.f58344b     // Catch: java.lang.Throwable -> L5f
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            io.grpc.Status r3 = r3.m30947g(r0)     // Catch: java.lang.Throwable -> L5f
            r2.f58356n = r3     // Catch: java.lang.Throwable -> L5f
            io.grpc.inprocess.InProcessTransport$2 r0 = new io.grpc.inprocess.InProcessTransport$2     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)
            return r0
        L56:
            io.grpc.inprocess.InProcessTransport$3 r3 = new io.grpc.inprocess.InProcessTransport$3     // Catch: java.lang.Throwable -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)
            return r3
        L5d:
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.inprocess.InProcessTransport.mo30970c(io.grpc.internal.ManagedClientTransport$Listener):java.lang.Runnable");
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return this.f58343a;
    }

    @Override // io.grpc.internal.ClientTransport
    /* renamed from: f */
    public synchronized void mo30971f(final ClientTransport.PingCallback pingCallback, Executor executor) {
        if (this.f58355m) {
            final Status status = this.f58356n;
            executor.execute(new Runnable(this) { // from class: io.grpc.inprocess.InProcessTransport.5
                @Override // java.lang.Runnable
                public void run() {
                    ClientTransport.PingCallback pingCallback2 = pingCallback;
                    Status status2 = status;
                    Objects.requireNonNull(status2);
                    pingCallback2.mo31061a(new StatusRuntimeException(status2));
                }
            });
        } else {
            executor.execute(new Runnable(this) { // from class: io.grpc.inprocess.InProcessTransport.6
                @Override // java.lang.Runnable
                public void run() {
                    pingCallback.mo31062b(0L);
                }
            });
        }
    }

    /* renamed from: h */
    public final synchronized void m30972h(Status status) {
        if (this.f58354l) {
            return;
        }
        this.f58354l = true;
        this.f58353k.mo31128b(status);
    }

    /* renamed from: i */
    public final synchronized void m30973i() {
        if (this.f58355m) {
            return;
        }
        this.f58355m = true;
        if (this.f58350h != null) {
            throw null;
        }
        this.f58353k.mo31127a();
        ServerTransportListener serverTransportListener = this.f58351i;
        if (serverTransportListener != null) {
            serverTransportListener.mo31191a();
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11169c("logId", this.f58343a.f58180c);
        m11166b.m11171e("address", this.f58344b);
        return m11166b.toString();
    }
}
