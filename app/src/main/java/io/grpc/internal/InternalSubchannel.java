package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.errorprone.annotations.ForOverride;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.BackoffPolicy;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransportFactory;
import io.grpc.internal.ManagedClientTransport;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes3.dex */
final class InternalSubchannel implements InternalInstrumented<InternalChannelz.ChannelStats>, TransportProvider {

    /* renamed from: a */
    public final InternalLogId f58729a;

    /* renamed from: b */
    public final String f58730b;

    /* renamed from: c */
    public final String f58731c;

    /* renamed from: d */
    public final BackoffPolicy.Provider f58732d;

    /* renamed from: e */
    public final Callback f58733e;

    /* renamed from: f */
    public final ClientTransportFactory f58734f;

    /* renamed from: g */
    public final ScheduledExecutorService f58735g;

    /* renamed from: h */
    public final InternalChannelz f58736h;

    /* renamed from: i */
    public final CallTracer f58737i;

    /* renamed from: j */
    public final ChannelLogger f58738j;

    /* renamed from: k */
    public final SynchronizationContext f58739k;

    /* renamed from: l */
    public final Index f58740l;

    /* renamed from: m */
    public volatile List<EquivalentAddressGroup> f58741m;

    /* renamed from: n */
    public BackoffPolicy f58742n;

    /* renamed from: o */
    public final Stopwatch f58743o;

    /* renamed from: p */
    @Nullable
    public SynchronizationContext.ScheduledHandle f58744p;

    /* renamed from: q */
    @Nullable
    public SynchronizationContext.ScheduledHandle f58745q;

    /* renamed from: r */
    @Nullable
    public ManagedClientTransport f58746r;

    /* renamed from: s */
    public final Collection<ConnectionClientTransport> f58747s;

    /* renamed from: t */
    public final InUseStateAggregator<ConnectionClientTransport> f58748t;

    /* renamed from: u */
    @Nullable
    public ConnectionClientTransport f58749u;

    /* renamed from: v */
    @Nullable
    public volatile ManagedClientTransport f58750v;

    /* renamed from: w */
    public volatile ConnectivityStateInfo f58751w;

    /* renamed from: x */
    public Status f58752x;

    /* renamed from: io.grpc.internal.InternalSubchannel$1 */
    public class C64011 extends InUseStateAggregator<ConnectionClientTransport> {

        /* renamed from: b */
        public final /* synthetic */ InternalSubchannel f58753b;

        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: a */
        public void mo30974a() {
            InternalSubchannel internalSubchannel = this.f58753b;
            internalSubchannel.f58733e.mo31121a(internalSubchannel);
        }

        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: b */
        public void mo30975b() {
            InternalSubchannel internalSubchannel = this.f58753b;
            internalSubchannel.f58733e.mo31122b(internalSubchannel);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$2 */
    class RunnableC64022 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InternalSubchannel f58755b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58755b.f58751w.f58096a == ConnectivityState.IDLE) {
                this.f58755b.f58738j.mo30810a(ChannelLogger.ChannelLogLevel.INFO, "CONNECTING as requested");
                InternalSubchannel.m31117d(this.f58755b, ConnectivityState.CONNECTING);
                InternalSubchannel.m31118g(this.f58755b);
            }
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$3 */
    class RunnableC64033 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InternalSubchannel f58756b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58756b.f58751w.f58096a != ConnectivityState.TRANSIENT_FAILURE) {
                return;
            }
            InternalSubchannel internalSubchannel = this.f58756b;
            internalSubchannel.f58739k.m30961c();
            SynchronizationContext.ScheduledHandle scheduledHandle = internalSubchannel.f58744p;
            if (scheduledHandle != null) {
                scheduledHandle.m30962a();
                internalSubchannel.f58744p = null;
                internalSubchannel.f58742n = null;
            }
            this.f58756b.f58738j.mo30810a(ChannelLogger.ChannelLogLevel.INFO, "CONNECTING; backoff interrupted");
            InternalSubchannel.m31117d(this.f58756b, ConnectivityState.CONNECTING);
            InternalSubchannel.m31118g(this.f58756b);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$4 */
    class RunnableC64044 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f58757b;

        /* renamed from: c */
        public final /* synthetic */ InternalSubchannel f58758c;

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r8 = this;
                io.grpc.ConnectivityState r0 = io.grpc.ConnectivityState.READY
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.internal.InternalSubchannel$Index r1 = r1.f58740l
                java.net.SocketAddress r1 = r1.m31125a()
                io.grpc.internal.InternalSubchannel r2 = r8.f58758c
                io.grpc.internal.InternalSubchannel$Index r2 = r2.f58740l
                java.util.List r3 = r8.f58757b
                r2.f58774a = r3
                r2.m31126b()
                io.grpc.internal.InternalSubchannel r2 = r8.f58758c
                java.util.List r3 = r8.f58757b
                r2.f58741m = r3
                io.grpc.internal.InternalSubchannel r2 = r8.f58758c
                io.grpc.ConnectivityStateInfo r2 = r2.f58751w
                io.grpc.ConnectivityState r2 = r2.f58096a
                r3 = 0
                if (r2 == r0) goto L2e
                io.grpc.internal.InternalSubchannel r2 = r8.f58758c
                io.grpc.ConnectivityStateInfo r2 = r2.f58751w
                io.grpc.ConnectivityState r2 = r2.f58096a
                io.grpc.ConnectivityState r4 = io.grpc.ConnectivityState.CONNECTING
                if (r2 != r4) goto L93
            L2e:
                io.grpc.internal.InternalSubchannel r2 = r8.f58758c
                io.grpc.internal.InternalSubchannel$Index r2 = r2.f58740l
                r4 = 0
                r5 = 0
            L34:
                java.util.List<io.grpc.EquivalentAddressGroup> r6 = r2.f58774a
                int r6 = r6.size()
                if (r5 >= r6) goto L55
                java.util.List<io.grpc.EquivalentAddressGroup> r6 = r2.f58774a
                java.lang.Object r6 = r6.get(r5)
                io.grpc.EquivalentAddressGroup r6 = (io.grpc.EquivalentAddressGroup) r6
                java.util.List<java.net.SocketAddress> r6 = r6.f58135a
                int r6 = r6.indexOf(r1)
                r7 = -1
                if (r6 != r7) goto L50
                int r5 = r5 + 1
                goto L34
            L50:
                r2.f58775b = r5
                r2.f58776c = r6
                r4 = 1
            L55:
                if (r4 != 0) goto L93
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.ConnectivityStateInfo r1 = r1.f58751w
                io.grpc.ConnectivityState r1 = r1.f58096a
                if (r1 != r0) goto L76
                io.grpc.internal.InternalSubchannel r0 = r8.f58758c
                io.grpc.internal.ManagedClientTransport r0 = r0.f58750v
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                r1.f58750v = r3
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.internal.InternalSubchannel$Index r1 = r1.f58740l
                r1.m31126b()
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.ConnectivityState r2 = io.grpc.ConnectivityState.IDLE
                io.grpc.internal.InternalSubchannel.m31117d(r1, r2)
                goto L94
            L76:
                io.grpc.internal.InternalSubchannel r0 = r8.f58758c
                io.grpc.internal.ConnectionClientTransport r0 = r0.f58749u
                io.grpc.Status r1 = io.grpc.Status.f58287n
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                io.grpc.Status r1 = r1.m30947g(r2)
                r0.mo30969b(r1)
                io.grpc.internal.InternalSubchannel r0 = r8.f58758c
                r0.f58749u = r3
                io.grpc.internal.InternalSubchannel$Index r0 = r0.f58740l
                r0.m31126b()
                io.grpc.internal.InternalSubchannel r0 = r8.f58758c
                io.grpc.internal.InternalSubchannel.m31118g(r0)
            L93:
                r0 = r3
            L94:
                if (r0 == 0) goto Lcd
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.SynchronizationContext$ScheduledHandle r2 = r1.f58745q
                if (r2 == 0) goto Lb6
                io.grpc.internal.ManagedClientTransport r1 = r1.f58746r
                io.grpc.Status r2 = io.grpc.Status.f58287n
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                io.grpc.Status r2 = r2.m30947g(r4)
                r1.mo30969b(r2)
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                io.grpc.SynchronizationContext$ScheduledHandle r1 = r1.f58745q
                r1.m30962a()
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                r1.f58745q = r3
                r1.f58746r = r3
            Lb6:
                io.grpc.internal.InternalSubchannel r1 = r8.f58758c
                r1.f58746r = r0
                io.grpc.SynchronizationContext r2 = r1.f58739k
                io.grpc.internal.InternalSubchannel$4$1 r3 = new io.grpc.internal.InternalSubchannel$4$1
                r3.<init>()
                r4 = 5
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.ScheduledExecutorService r7 = r1.f58735g
                io.grpc.SynchronizationContext$ScheduledHandle r0 = r2.m30960b(r3, r4, r6, r7)
                r1.f58745q = r0
            Lcd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.InternalSubchannel.RunnableC64044.run():void");
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$5 */
    class RunnableC64055 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Status f58760b;

        /* renamed from: c */
        public final /* synthetic */ InternalSubchannel f58761c;

        @Override // java.lang.Runnable
        public void run() {
            ConnectivityState connectivityState = this.f58761c.f58751w.f58096a;
            ConnectivityState connectivityState2 = ConnectivityState.SHUTDOWN;
            if (connectivityState == connectivityState2) {
                return;
            }
            InternalSubchannel internalSubchannel = this.f58761c;
            internalSubchannel.f58752x = this.f58760b;
            ManagedClientTransport managedClientTransport = internalSubchannel.f58750v;
            InternalSubchannel internalSubchannel2 = this.f58761c;
            ConnectionClientTransport connectionClientTransport = internalSubchannel2.f58749u;
            internalSubchannel2.f58750v = null;
            InternalSubchannel internalSubchannel3 = this.f58761c;
            internalSubchannel3.f58749u = null;
            internalSubchannel3.f58739k.m30961c();
            internalSubchannel3.m31119h(ConnectivityStateInfo.m30827a(connectivityState2));
            this.f58761c.f58740l.m31126b();
            if (this.f58761c.f58747s.isEmpty()) {
                InternalSubchannel internalSubchannel4 = this.f58761c;
                SynchronizationContext synchronizationContext = internalSubchannel4.f58739k;
                synchronizationContext.f58322c.add(internalSubchannel4.new RunnableC64066());
                synchronizationContext.m30959a();
            }
            InternalSubchannel internalSubchannel5 = this.f58761c;
            internalSubchannel5.f58739k.m30961c();
            SynchronizationContext.ScheduledHandle scheduledHandle = internalSubchannel5.f58744p;
            if (scheduledHandle != null) {
                scheduledHandle.m30962a();
                internalSubchannel5.f58744p = null;
                internalSubchannel5.f58742n = null;
            }
            SynchronizationContext.ScheduledHandle scheduledHandle2 = this.f58761c.f58745q;
            if (scheduledHandle2 != null) {
                scheduledHandle2.m30962a();
                this.f58761c.f58746r.mo30969b(this.f58760b);
                InternalSubchannel internalSubchannel6 = this.f58761c;
                internalSubchannel6.f58745q = null;
                internalSubchannel6.f58746r = null;
            }
            if (managedClientTransport != null) {
                managedClientTransport.mo30969b(this.f58760b);
            }
            if (connectionClientTransport != null) {
                connectionClientTransport.mo30969b(this.f58760b);
            }
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$6 */
    class RunnableC64066 implements Runnable {
        public RunnableC64066() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InternalSubchannel.this.f58738j.mo30810a(ChannelLogger.ChannelLogLevel.INFO, "Terminated");
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            internalSubchannel.f58733e.mo31124d(internalSubchannel);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$7 */
    class RunnableC64077 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ConnectionClientTransport f58763b;

        /* renamed from: c */
        public final /* synthetic */ boolean f58764c;

        public RunnableC64077(ConnectionClientTransport connectionClientTransport, boolean z) {
            this.f58763b = connectionClientTransport;
            this.f58764c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InternalSubchannel.this.f58748t.m31114c(this.f58763b, this.f58764c);
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$8 */
    class RunnableC64088 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Status f58766b;

        /* renamed from: c */
        public final /* synthetic */ InternalSubchannel f58767c;

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(this.f58767c.f58747s).iterator();
            while (it.hasNext()) {
                ((ManagedClientTransport) it.next()).mo30968a(this.f58766b);
            }
        }
    }

    /* renamed from: io.grpc.internal.InternalSubchannel$9 */
    class RunnableC64099 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            new InternalChannelz.ChannelStats.Builder();
            throw null;
        }
    }

    @VisibleForTesting
    public static final class CallTracingTransport extends ForwardingConnectionClientTransport {

        /* renamed from: a */
        public final ConnectionClientTransport f58768a;

        /* renamed from: b */
        public final CallTracer f58769b;

        /* renamed from: io.grpc.internal.InternalSubchannel$CallTracingTransport$1 */
        class C64101 extends ForwardingClientStream {

            /* renamed from: a */
            public final /* synthetic */ ClientStream f58770a;

            /* renamed from: b */
            public final /* synthetic */ CallTracingTransport f58771b;

            @Override // io.grpc.internal.ForwardingClientStream, io.grpc.internal.ClientStream
            /* renamed from: q */
            public void mo30976q(final ClientStreamListener clientStreamListener) {
                this.f58771b.f58769b.m31041b();
                mo31086t().mo30976q(new ForwardingClientStreamListener() { // from class: io.grpc.internal.InternalSubchannel.CallTracingTransport.1.1
                    @Override // io.grpc.internal.ForwardingClientStreamListener, io.grpc.internal.ClientStreamListener
                    /* renamed from: f */
                    public void mo31055f(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
                        C64101.this.f58771b.f58769b.m31040a(status.m30945e());
                        mo31087g().mo31055f(status, rpcProgress, metadata);
                    }

                    @Override // io.grpc.internal.ForwardingClientStreamListener
                    /* renamed from: g */
                    public ClientStreamListener mo31087g() {
                        return clientStreamListener;
                    }
                });
            }

            @Override // io.grpc.internal.ForwardingClientStream
            /* renamed from: t */
            public ClientStream mo31086t() {
                return this.f58770a;
            }
        }

        public CallTracingTransport(ConnectionClientTransport connectionClientTransport, CallTracer callTracer, C64011 c64011) {
            this.f58768a = connectionClientTransport;
            this.f58769b = callTracer;
        }

        @Override // io.grpc.internal.ForwardingConnectionClientTransport
        /* renamed from: d */
        public ConnectionClientTransport mo31039d() {
            return this.f58768a;
        }
    }

    public static abstract class Callback {
        @ForOverride
        /* renamed from: a */
        public void mo31121a(InternalSubchannel internalSubchannel) {
        }

        @ForOverride
        /* renamed from: b */
        public void mo31122b(InternalSubchannel internalSubchannel) {
        }

        @ForOverride
        /* renamed from: c */
        public void mo31123c(InternalSubchannel internalSubchannel, ConnectivityStateInfo connectivityStateInfo) {
        }

        @ForOverride
        /* renamed from: d */
        public void mo31124d(InternalSubchannel internalSubchannel) {
        }
    }

    @VisibleForTesting
    public static final class Index {

        /* renamed from: a */
        public List<EquivalentAddressGroup> f58774a;

        /* renamed from: b */
        public int f58775b;

        /* renamed from: c */
        public int f58776c;

        /* renamed from: a */
        public SocketAddress m31125a() {
            return this.f58774a.get(this.f58775b).f58135a.get(this.f58776c);
        }

        /* renamed from: b */
        public void m31126b() {
            this.f58775b = 0;
            this.f58776c = 0;
        }
    }

    public class TransportListener implements ManagedClientTransport.Listener {

        /* renamed from: a */
        public final ConnectionClientTransport f58777a;

        /* renamed from: b */
        public boolean f58778b = false;

        public TransportListener(ConnectionClientTransport connectionClientTransport, SocketAddress socketAddress) {
            this.f58777a = connectionClientTransport;
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: a */
        public void mo31127a() {
            Preconditions.m11192p(this.f58778b, "transportShutdown() must be called before transportTerminated().");
            InternalSubchannel.this.f58738j.mo30811b(ChannelLogger.ChannelLogLevel.INFO, "{0} Terminated", this.f58777a.mo30881e());
            InternalChannelz.m30874b(InternalSubchannel.this.f58736h.f58154d, this.f58777a);
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            ConnectionClientTransport connectionClientTransport = this.f58777a;
            SynchronizationContext synchronizationContext = internalSubchannel.f58739k;
            synchronizationContext.f58322c.add(internalSubchannel.new RunnableC64077(connectionClientTransport, false));
            synchronizationContext.m30959a();
            SynchronizationContext synchronizationContext2 = InternalSubchannel.this.f58739k;
            synchronizationContext2.f58322c.add(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.3
                @Override // java.lang.Runnable
                public void run() {
                    TransportListener transportListener = TransportListener.this;
                    InternalSubchannel.this.f58747s.remove(transportListener.f58777a);
                    if (InternalSubchannel.this.f58751w.f58096a == ConnectivityState.SHUTDOWN && InternalSubchannel.this.f58747s.isEmpty()) {
                        InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                        SynchronizationContext synchronizationContext3 = internalSubchannel2.f58739k;
                        synchronizationContext3.f58322c.add(internalSubchannel2.new RunnableC64066());
                        synchronizationContext3.m30959a();
                    }
                }
            });
            synchronizationContext2.m30959a();
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: b */
        public void mo31128b(final Status status) {
            InternalSubchannel.this.f58738j.mo30811b(ChannelLogger.ChannelLogLevel.INFO, "{0} SHUTDOWN with {1}", this.f58777a.mo30881e(), InternalSubchannel.this.m31120i(status));
            this.f58778b = true;
            SynchronizationContext synchronizationContext = InternalSubchannel.this.f58739k;
            synchronizationContext.f58322c.add(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.2
                @Override // java.lang.Runnable
                public void run() {
                    if (InternalSubchannel.this.f58751w.f58096a == ConnectivityState.SHUTDOWN) {
                        return;
                    }
                    ManagedClientTransport managedClientTransport = InternalSubchannel.this.f58750v;
                    TransportListener transportListener = TransportListener.this;
                    ConnectionClientTransport connectionClientTransport = transportListener.f58777a;
                    if (managedClientTransport == connectionClientTransport) {
                        InternalSubchannel.this.f58750v = null;
                        InternalSubchannel.this.f58740l.m31126b();
                        InternalSubchannel.m31117d(InternalSubchannel.this, ConnectivityState.IDLE);
                        return;
                    }
                    InternalSubchannel internalSubchannel = InternalSubchannel.this;
                    if (internalSubchannel.f58749u == connectionClientTransport) {
                        Preconditions.m11194r(internalSubchannel.f58751w.f58096a == ConnectivityState.CONNECTING, "Expected state is CONNECTING, actual state is %s", InternalSubchannel.this.f58751w.f58096a);
                        Index index = InternalSubchannel.this.f58740l;
                        EquivalentAddressGroup equivalentAddressGroup = index.f58774a.get(index.f58775b);
                        int i2 = index.f58776c + 1;
                        index.f58776c = i2;
                        if (i2 >= equivalentAddressGroup.f58135a.size()) {
                            index.f58775b++;
                            index.f58776c = 0;
                        }
                        Index index2 = InternalSubchannel.this.f58740l;
                        if (index2.f58775b < index2.f58774a.size()) {
                            InternalSubchannel.m31118g(InternalSubchannel.this);
                            return;
                        }
                        InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                        internalSubchannel2.f58749u = null;
                        internalSubchannel2.f58740l.m31126b();
                        final InternalSubchannel internalSubchannel3 = InternalSubchannel.this;
                        Status status2 = status;
                        internalSubchannel3.f58739k.m30961c();
                        Preconditions.m11179c(!status2.m30945e(), "The error status must not be OK");
                        internalSubchannel3.m31119h(new ConnectivityStateInfo(ConnectivityState.TRANSIENT_FAILURE, status2));
                        if (internalSubchannel3.f58742n == null) {
                            internalSubchannel3.f58742n = internalSubchannel3.f58732d.get();
                        }
                        long mo31038a = internalSubchannel3.f58742n.mo31038a();
                        Stopwatch stopwatch = internalSubchannel3.f58743o;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        long m11213a = mo31038a - stopwatch.m11213a(timeUnit);
                        internalSubchannel3.f58738j.mo30811b(ChannelLogger.ChannelLogLevel.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", internalSubchannel3.m31120i(status2), Long.valueOf(m11213a));
                        Preconditions.m11192p(internalSubchannel3.f58744p == null, "previous reconnectTask is not done");
                        internalSubchannel3.f58744p = internalSubchannel3.f58739k.m30960b(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.1EndOfCurrentBackoff
                            @Override // java.lang.Runnable
                            public void run() {
                                InternalSubchannel internalSubchannel4 = InternalSubchannel.this;
                                internalSubchannel4.f58744p = null;
                                internalSubchannel4.f58738j.mo30810a(ChannelLogger.ChannelLogLevel.INFO, "CONNECTING after backoff");
                                InternalSubchannel.m31117d(InternalSubchannel.this, ConnectivityState.CONNECTING);
                                InternalSubchannel.m31118g(InternalSubchannel.this);
                            }
                        }, m11213a, timeUnit, internalSubchannel3.f58735g);
                    }
                }
            });
            synchronizationContext.m30959a();
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: c */
        public void mo31129c() {
            InternalSubchannel.this.f58738j.mo30810a(ChannelLogger.ChannelLogLevel.INFO, "READY");
            SynchronizationContext synchronizationContext = InternalSubchannel.this.f58739k;
            synchronizationContext.f58322c.add(new Runnable() { // from class: io.grpc.internal.InternalSubchannel.TransportListener.1
                @Override // java.lang.Runnable
                public void run() {
                    TransportListener transportListener = TransportListener.this;
                    InternalSubchannel internalSubchannel = InternalSubchannel.this;
                    internalSubchannel.f58742n = null;
                    if (internalSubchannel.f58752x != null) {
                        Preconditions.m11192p(internalSubchannel.f58750v == null, "Unexpected non-null activeTransport");
                        TransportListener transportListener2 = TransportListener.this;
                        transportListener2.f58777a.mo30969b(InternalSubchannel.this.f58752x);
                        return;
                    }
                    ConnectionClientTransport connectionClientTransport = internalSubchannel.f58749u;
                    ConnectionClientTransport connectionClientTransport2 = transportListener.f58777a;
                    if (connectionClientTransport == connectionClientTransport2) {
                        internalSubchannel.f58750v = connectionClientTransport2;
                        InternalSubchannel internalSubchannel2 = InternalSubchannel.this;
                        internalSubchannel2.f58749u = null;
                        ConnectivityState connectivityState = ConnectivityState.READY;
                        internalSubchannel2.f58739k.m30961c();
                        internalSubchannel2.m31119h(ConnectivityStateInfo.m30827a(connectivityState));
                    }
                }
            });
            synchronizationContext.m30959a();
        }

        @Override // io.grpc.internal.ManagedClientTransport.Listener
        /* renamed from: d */
        public void mo31130d(boolean z) {
            InternalSubchannel internalSubchannel = InternalSubchannel.this;
            ConnectionClientTransport connectionClientTransport = this.f58777a;
            SynchronizationContext synchronizationContext = internalSubchannel.f58739k;
            synchronizationContext.f58322c.add(internalSubchannel.new RunnableC64077(connectionClientTransport, z));
            synchronizationContext.m30959a();
        }
    }

    @VisibleForTesting
    public static final class TransportLogger extends ChannelLogger {

        /* renamed from: a */
        public InternalLogId f58784a;

        @Override // io.grpc.ChannelLogger
        /* renamed from: a */
        public void mo30810a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
            InternalLogId internalLogId = this.f58784a;
            Level m31042d = ChannelLoggerImpl.m31042d(channelLogLevel);
            if (ChannelTracer.f58466e.isLoggable(m31042d)) {
                ChannelTracer.m31044a(internalLogId, m31042d, str);
            }
        }

        @Override // io.grpc.ChannelLogger
        /* renamed from: b */
        public void mo30811b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
            InternalLogId internalLogId = this.f58784a;
            Level m31042d = ChannelLoggerImpl.m31042d(channelLogLevel);
            if (ChannelTracer.f58466e.isLoggable(m31042d)) {
                ChannelTracer.m31044a(internalLogId, m31042d, MessageFormat.format(str, objArr));
            }
        }
    }

    /* renamed from: d */
    public static void m31117d(InternalSubchannel internalSubchannel, ConnectivityState connectivityState) {
        internalSubchannel.f58739k.m30961c();
        internalSubchannel.m31119h(ConnectivityStateInfo.m30827a(connectivityState));
    }

    /* renamed from: g */
    public static void m31118g(InternalSubchannel internalSubchannel) {
        SocketAddress socketAddress;
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress;
        internalSubchannel.f58739k.m30961c();
        Preconditions.m11192p(internalSubchannel.f58744p == null, "Should have no reconnectTask scheduled");
        Index index = internalSubchannel.f58740l;
        if (index.f58775b == 0 && index.f58776c == 0) {
            Stopwatch stopwatch = internalSubchannel.f58743o;
            stopwatch.m11215c();
            stopwatch.m11216d();
        }
        SocketAddress m31125a = internalSubchannel.f58740l.m31125a();
        if (m31125a instanceof HttpConnectProxiedSocketAddress) {
            httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) m31125a;
            socketAddress = httpConnectProxiedSocketAddress.f58146c;
        } else {
            socketAddress = m31125a;
            httpConnectProxiedSocketAddress = null;
        }
        Index index2 = internalSubchannel.f58740l;
        Attributes attributes = index2.f58774a.get(index2.f58775b).f58136b;
        String str = (String) attributes.f58054a.get(EquivalentAddressGroup.f58134d);
        ClientTransportFactory.ClientTransportOptions clientTransportOptions = new ClientTransportFactory.ClientTransportOptions();
        if (str == null) {
            str = internalSubchannel.f58730b;
        }
        Preconditions.m11187k(str, "authority");
        clientTransportOptions.f58518a = str;
        clientTransportOptions.f58519b = attributes;
        clientTransportOptions.f58520c = internalSubchannel.f58731c;
        clientTransportOptions.f58521d = httpConnectProxiedSocketAddress;
        TransportLogger transportLogger = new TransportLogger();
        transportLogger.f58784a = internalSubchannel.f58729a;
        CallTracingTransport callTracingTransport = new CallTracingTransport(internalSubchannel.f58734f.mo30964x0(socketAddress, clientTransportOptions, transportLogger), internalSubchannel.f58737i, null);
        transportLogger.f58784a = callTracingTransport.mo30881e();
        InternalChannelz.m30873a(internalSubchannel.f58736h.f58154d, callTracingTransport);
        internalSubchannel.f58749u = callTracingTransport;
        internalSubchannel.f58747s.add(callTracingTransport);
        Runnable mo30970c = callTracingTransport.mo31039d().mo30970c(internalSubchannel.new TransportListener(callTracingTransport, socketAddress));
        if (mo30970c != null) {
            internalSubchannel.f58739k.f58322c.add(mo30970c);
        }
        internalSubchannel.f58738j.mo30811b(ChannelLogger.ChannelLogLevel.INFO, "Started transport {0}", transportLogger.f58784a);
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return this.f58729a;
    }

    /* renamed from: h */
    public final void m31119h(ConnectivityStateInfo connectivityStateInfo) {
        this.f58739k.m30961c();
        if (this.f58751w.f58096a != connectivityStateInfo.f58096a) {
            Preconditions.m11192p(this.f58751w.f58096a != ConnectivityState.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + connectivityStateInfo);
            this.f58751w = connectivityStateInfo;
            this.f58733e.mo31123c(this, connectivityStateInfo);
        }
    }

    /* renamed from: i */
    public final String m31120i(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.f58291a);
        if (status.f58292b != null) {
            sb.append("(");
            sb.append(status.f58292b);
            sb.append(")");
        }
        return sb.toString();
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11169c("logId", this.f58729a.f58180c);
        m11166b.m11171e("addressGroups", this.f58741m);
        return m11166b.toString();
    }
}
