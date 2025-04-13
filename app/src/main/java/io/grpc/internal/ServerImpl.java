package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Attributes;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.Status;
import io.grpc.internal.ServerCallImpl;
import io.grpc.internal.StreamListener;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ServerImpl extends Server implements InternalInstrumented<InternalChannelz.ServerStats> {

    /* renamed from: b */
    public static final Logger f59104b = Logger.getLogger(ServerImpl.class.getName());

    /* renamed from: c */
    public static final ServerStreamListener f59105c = new NoopListener(null);

    @VisibleForTesting
    public static final class ContextCloser implements Runnable {

        /* renamed from: b */
        public final Context.CancellableContext f59106b;

        /* renamed from: c */
        public final Throwable f59107c;

        public ContextCloser(Context.CancellableContext cancellableContext, Throwable th) {
            this.f59106b = cancellableContext;
            this.f59107c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59106b.m30838m(this.f59107c);
        }
    }

    @VisibleForTesting
    public static final class JumpToApplicationThreadServerStreamListener implements ServerStreamListener {

        /* renamed from: a */
        public final Executor f59108a;

        /* renamed from: b */
        public final Executor f59109b;

        /* renamed from: c */
        public final Context.CancellableContext f59110c;

        /* renamed from: d */
        public final ServerStream f59111d;

        /* renamed from: e */
        public final Tag f59112e;

        /* renamed from: f */
        public ServerStreamListener f59113f;

        /* renamed from: g */
        public static ServerStreamListener m31187g(JumpToApplicationThreadServerStreamListener jumpToApplicationThreadServerStreamListener) {
            ServerStreamListener serverStreamListener = jumpToApplicationThreadServerStreamListener.f59113f;
            if (serverStreamListener != null) {
                return serverStreamListener;
            }
            throw new IllegalStateException("listener unset");
        }

        /* renamed from: h */
        public static void m31188h(JumpToApplicationThreadServerStreamListener jumpToApplicationThreadServerStreamListener, Throwable th) {
            jumpToApplicationThreadServerStreamListener.f59111d.mo30997j(Status.f58280g.m30946f(th), new Metadata());
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(StreamListener.MessageProducer messageProducer) {
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            PerfMark.m31344a();
            try {
                this.f59108a.execute(new ContextRunnable(Impl.f59565b, messageProducer) { // from class: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.1MessagesAvailable

                    /* renamed from: c */
                    public final /* synthetic */ StreamListener.MessageProducer f59117c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(JumpToApplicationThreadServerStreamListener.this.f59110c);
                        this.f59117c = messageProducer;
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag = JumpToApplicationThreadServerStreamListener.this.f59112e;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            JumpToApplicationThreadServerStreamListener.m31187g(JumpToApplicationThreadServerStreamListener.this).mo31052a(this.f59117c);
                            Tag tag2 = JumpToApplicationThreadServerStreamListener.this.f59112e;
                            Objects.requireNonNull(impl2);
                        } finally {
                        }
                    }
                });
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: b */
        public void mo31184b(Status status) {
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                if (!status.m30945e()) {
                    this.f59109b.execute(new ContextCloser(this.f59110c, status.f58293c));
                }
                PerfMark.m31344a();
                this.f59108a.execute(new ContextRunnable(Impl.f59565b, status) { // from class: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.1Closed

                    /* renamed from: c */
                    public final /* synthetic */ Status f59114c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(JumpToApplicationThreadServerStreamListener.this.f59110c);
                        this.f59114c = status;
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag = JumpToApplicationThreadServerStreamListener.this.f59112e;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            JumpToApplicationThreadServerStreamListener.m31187g(JumpToApplicationThreadServerStreamListener.this).mo31184b(this.f59114c);
                            Tag tag2 = JumpToApplicationThreadServerStreamListener.this.f59112e;
                            Objects.requireNonNull(impl2);
                        } catch (Throwable th) {
                            Tag tag3 = JumpToApplicationThreadServerStreamListener.this.f59112e;
                            Objects.requireNonNull(PerfMark.f59566a);
                            throw th;
                        }
                    }
                });
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: c */
        public void mo31185c() {
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            PerfMark.m31344a();
            try {
                this.f59108a.execute(new ContextRunnable(Impl.f59565b) { // from class: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.1HalfClosed
                    {
                        super(JumpToApplicationThreadServerStreamListener.this.f59110c);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag = JumpToApplicationThreadServerStreamListener.this.f59112e;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            JumpToApplicationThreadServerStreamListener.m31187g(JumpToApplicationThreadServerStreamListener.this).mo31185c();
                            Tag tag2 = JumpToApplicationThreadServerStreamListener.this.f59112e;
                            Objects.requireNonNull(impl2);
                        } finally {
                        }
                    }
                });
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            PerfMark.m31344a();
            try {
                this.f59108a.execute(new ContextRunnable(Impl.f59565b) { // from class: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.1OnReady
                    {
                        super(JumpToApplicationThreadServerStreamListener.this.f59110c);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag = JumpToApplicationThreadServerStreamListener.this.f59112e;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            JumpToApplicationThreadServerStreamListener.m31187g(JumpToApplicationThreadServerStreamListener.this).mo31054e();
                            Tag tag2 = JumpToApplicationThreadServerStreamListener.this.f59112e;
                            Objects.requireNonNull(impl2);
                        } finally {
                        }
                    }
                });
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @VisibleForTesting
        /* renamed from: i */
        public void m31189i(ServerStreamListener serverStreamListener) {
            Preconditions.m11187k(serverStreamListener, "listener must not be null");
            Preconditions.m11192p(this.f59113f == null, "Listener already set");
            this.f59113f = serverStreamListener;
        }
    }

    public static final class NoopListener implements ServerStreamListener {
        public NoopListener() {
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(StreamListener.MessageProducer messageProducer) {
            while (true) {
                InputStream next = messageProducer.next();
                if (next == null) {
                    return;
                }
                try {
                    next.close();
                } catch (IOException e2) {
                    while (true) {
                        InputStream next2 = messageProducer.next();
                        if (next2 == null) {
                            throw new RuntimeException(e2);
                        }
                        try {
                            next2.close();
                        } catch (IOException e3) {
                            ServerImpl.f59104b.log(Level.WARNING, "Exception closing stream", (Throwable) e3);
                        }
                    }
                }
            }
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: b */
        public void mo31184b(Status status) {
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: c */
        public void mo31185c() {
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
        }

        public NoopListener(C64621 c64621) {
        }
    }

    public final class ServerListenerImpl implements ServerListener {
    }

    public final class ServerTransportListenerImpl implements ServerTransportListener {

        /* renamed from: a */
        public final ServerTransport f59120a;

        /* renamed from: b */
        public Future<?> f59121b;

        /* renamed from: c */
        public final /* synthetic */ ServerImpl f59122c;

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1 */
        class RunnableC64631 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1HandleServerCall, reason: invalid class name */
        final class C1HandleServerCall extends ContextRunnable {

            /* renamed from: c */
            public final /* synthetic */ Context.CancellableContext f59123c;

            /* renamed from: d */
            public final /* synthetic */ SettableFuture f59124d;

            /* renamed from: e */
            public final /* synthetic */ String f59125e;

            /* renamed from: f */
            public final /* synthetic */ Metadata f59126f;

            /* renamed from: g */
            public final /* synthetic */ ServerStream f59127g;

            /* renamed from: h */
            public final /* synthetic */ JumpToApplicationThreadServerStreamListener f59128h;

            /* renamed from: i */
            public final /* synthetic */ ServerTransportListenerImpl f59129i;

            @Override // io.grpc.internal.ContextRunnable
            /* renamed from: a */
            public void mo31050a() {
                Impl impl = PerfMark.f59566a;
                Objects.requireNonNull(impl);
                Objects.requireNonNull(impl);
                try {
                    m31193b();
                    Objects.requireNonNull(impl);
                } catch (Throwable th) {
                    Objects.requireNonNull(PerfMark.f59566a);
                    throw th;
                }
            }

            /* renamed from: b */
            public final void m31193b() {
                ServerStreamListener serverStreamListener = ServerImpl.f59105c;
                if (this.f59124d.isCancelled()) {
                    return;
                }
                try {
                    this.f59128h.m31189i(ServerTransportListenerImpl.m31190c(this.f59129i, this.f59125e, (ServerCallParameters) Futures.m12193a(this.f59124d), this.f59126f));
                    this.f59123c.mo30830a(new Context.CancellationListener() { // from class: io.grpc.internal.ServerImpl.ServerTransportListenerImpl.1HandleServerCall.1ServerStreamCancellationListener
                        @Override // io.grpc.Context.CancellationListener
                        /* renamed from: a */
                        public void mo30840a(Context context) {
                            Status m30845a = Contexts.m30845a(context);
                            if (Status.f58281h.f58291a.equals(m30845a.f58291a)) {
                                C1HandleServerCall.this.f59127g.mo30994a(m30845a);
                            }
                        }
                    }, MoreExecutors.m12201a());
                } finally {
                }
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1MethodLookup, reason: invalid class name */
        final class C1MethodLookup extends ContextRunnable {

            /* renamed from: c */
            public final /* synthetic */ Context.CancellableContext f59131c;

            /* renamed from: d */
            public final /* synthetic */ ServerStream f59132d;

            /* renamed from: e */
            public final /* synthetic */ JumpToApplicationThreadServerStreamListener f59133e;

            /* renamed from: f */
            public final /* synthetic */ SettableFuture f59134f;

            /* renamed from: g */
            public final /* synthetic */ ServerTransportListenerImpl f59135g;

            @Override // io.grpc.internal.ContextRunnable
            /* renamed from: a */
            public void mo31050a() {
                Impl impl = PerfMark.f59566a;
                Objects.requireNonNull(impl);
                Objects.requireNonNull(impl);
                try {
                    m31194b();
                    throw null;
                } catch (Throwable th) {
                    Objects.requireNonNull(PerfMark.f59566a);
                    throw th;
                }
            }

            /* renamed from: b */
            public final void m31194b() {
                try {
                    ServerImpl serverImpl = this.f59135g.f59122c;
                    Logger logger = ServerImpl.f59104b;
                    Objects.requireNonNull(serverImpl);
                    throw null;
                } catch (Throwable th) {
                    this.f59133e.m31189i(ServerImpl.f59105c);
                    this.f59132d.mo30997j(Status.m30943d(th), new Metadata());
                    this.f59131c.m30838m(null);
                    this.f59134f.cancel(false);
                    throw th;
                }
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1TransportShutdownNow, reason: invalid class name */
        class C1TransportShutdownNow implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ServerTransportListenerImpl f59136b;

            @Override // java.lang.Runnable
            public void run() {
                this.f59136b.f59120a.mo30968a(Status.f58279f.m30947g("Handshake timeout exceeded"));
            }
        }

        public final class ServerCallParameters<ReqT, RespT> {

            /* renamed from: a */
            public ServerCallImpl<ReqT, RespT> f59137a;

            /* renamed from: b */
            public ServerCallHandler<ReqT, RespT> f59138b;
        }

        /* renamed from: c */
        public static ServerStreamListener m31190c(ServerTransportListenerImpl serverTransportListenerImpl, String str, ServerCallParameters serverCallParameters, Metadata metadata) {
            Objects.requireNonNull(serverTransportListenerImpl);
            ServerCall.Listener mo30934a = serverCallParameters.f59138b.mo30934a(serverCallParameters.f59137a, metadata);
            if (mo30934a == null) {
                throw new NullPointerException(C0000a.m14k("startCall() returned a null listener for method ", str));
            }
            ServerCallImpl<ReqT, RespT> serverCallImpl = serverCallParameters.f59137a;
            return new ServerCallImpl.ServerStreamListenerImpl(serverCallImpl, mo30934a, serverCallImpl.f59087d);
        }

        @Override // io.grpc.internal.ServerTransportListener
        /* renamed from: a */
        public void mo31191a() {
            Future<?> future = this.f59121b;
            if (future != null) {
                future.cancel(false);
                this.f59121b = null;
            }
            ServerImpl serverImpl = this.f59122c;
            Logger logger = ServerImpl.f59104b;
            Objects.requireNonNull(serverImpl);
            throw null;
        }

        @Override // io.grpc.internal.ServerTransportListener
        /* renamed from: b */
        public Attributes mo31192b(Attributes attributes) {
            this.f59121b.cancel(false);
            this.f59121b = null;
            ServerImpl serverImpl = this.f59122c;
            Logger logger = ServerImpl.f59104b;
            Objects.requireNonNull(serverImpl);
            throw null;
        }
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return null;
    }

    public String toString() {
        MoreObjects.m11166b(this);
        throw null;
    }
}
