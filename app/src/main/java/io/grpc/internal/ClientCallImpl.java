package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.Codec;
import io.grpc.Compressor;
import io.grpc.CompressorRegistry;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ManagedChannelServiceConfig;
import io.grpc.internal.StreamListener;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class ClientCallImpl<ReqT, RespT> extends ClientCall<ReqT, RespT> {

    /* renamed from: t */
    public static final Logger f58474t = Logger.getLogger(ClientCallImpl.class.getName());

    /* renamed from: u */
    public static final byte[] f58475u = "gzip".getBytes(StandardCharsets.US_ASCII);

    /* renamed from: a */
    public final MethodDescriptor<ReqT, RespT> f58476a;

    /* renamed from: b */
    public final Tag f58477b;

    /* renamed from: c */
    public final Executor f58478c;

    /* renamed from: d */
    public final boolean f58479d;

    /* renamed from: e */
    public final CallTracer f58480e;

    /* renamed from: f */
    public final Context f58481f;

    /* renamed from: g */
    public volatile ScheduledFuture<?> f58482g;

    /* renamed from: h */
    public final boolean f58483h;

    /* renamed from: i */
    public CallOptions f58484i;

    /* renamed from: j */
    public ClientStream f58485j;

    /* renamed from: k */
    public volatile boolean f58486k;

    /* renamed from: l */
    public boolean f58487l;

    /* renamed from: m */
    public boolean f58488m;

    /* renamed from: n */
    public final ClientStreamProvider f58489n;

    /* renamed from: p */
    public final ScheduledExecutorService f58491p;

    /* renamed from: q */
    public boolean f58492q;

    /* renamed from: o */
    public final ClientCallImpl<ReqT, RespT>.ContextCancellationListener f58490o = new ContextCancellationListener(null);

    /* renamed from: r */
    public DecompressorRegistry f58493r = DecompressorRegistry.f58129d;

    /* renamed from: s */
    public CompressorRegistry f58494s = CompressorRegistry.f58088b;

    public class ClientStreamListenerImpl implements ClientStreamListener {

        /* renamed from: a */
        public final ClientCall.Listener<RespT> f58500a;

        /* renamed from: b */
        public Status f58501b;

        public ClientStreamListenerImpl(ClientCall.Listener<RespT> listener) {
            this.f58500a = listener;
        }

        /* renamed from: g */
        public static void m31051g(ClientStreamListenerImpl clientStreamListenerImpl, Status status) {
            clientStreamListenerImpl.f58501b = status;
            ClientCallImpl.this.f58485j.mo30978a(status);
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(StreamListener.MessageProducer messageProducer) {
            Tag tag = ClientCallImpl.this.f58477b;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            PerfMark.m31344a();
            try {
                ClientCallImpl.this.f58478c.execute(new ContextRunnable(Impl.f59565b, messageProducer) { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1MessagesAvailable

                    /* renamed from: c */
                    public final /* synthetic */ StreamListener.MessageProducer f58505c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(ClientCallImpl.this.f58481f);
                        this.f58505c = messageProducer;
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag2 = ClientCallImpl.this.f58477b;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            m31057b();
                            Tag tag3 = ClientCallImpl.this.f58477b;
                            Objects.requireNonNull(impl2);
                        } catch (Throwable th) {
                            Tag tag4 = ClientCallImpl.this.f58477b;
                            Objects.requireNonNull(PerfMark.f59566a);
                            throw th;
                        }
                    }

                    /* renamed from: b */
                    public final void m31057b() {
                        if (ClientStreamListenerImpl.this.f58501b != null) {
                            GrpcUtil.m31091b(this.f58505c);
                            return;
                        }
                        while (true) {
                            try {
                                InputStream next = this.f58505c.next();
                                if (next == null) {
                                    return;
                                }
                                try {
                                    ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                                    clientStreamListenerImpl.f58500a.mo12485c(ClientCallImpl.this.f58476a.f58225e.mo30924a(next));
                                    next.close();
                                } catch (Throwable th) {
                                    GrpcUtil.m31092c(next);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                GrpcUtil.m31091b(this.f58505c);
                                ClientStreamListenerImpl.m31051g(ClientStreamListenerImpl.this, Status.f58279f.m30946f(th2).m30947g("Failed to read message."));
                                return;
                            }
                        }
                    }
                });
                Tag tag2 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Tag tag3 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: d */
        public void mo31053d(Metadata metadata) {
            Tag tag = ClientCallImpl.this.f58477b;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            PerfMark.m31344a();
            try {
                ClientCallImpl.this.f58478c.execute(new ContextRunnable(Impl.f59565b, metadata) { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1HeadersRead

                    /* renamed from: c */
                    public final /* synthetic */ Metadata f58503c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(ClientCallImpl.this.f58481f);
                        this.f58503c = metadata;
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag2 = ClientCallImpl.this.f58477b;
                        Impl impl2 = PerfMark.f59566a;
                        Objects.requireNonNull(impl2);
                        Objects.requireNonNull(impl2);
                        try {
                            ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                            if (clientStreamListenerImpl.f58501b == null) {
                                try {
                                    clientStreamListenerImpl.f58500a.mo12484b(this.f58503c);
                                } catch (Throwable th) {
                                    ClientStreamListenerImpl.m31051g(ClientStreamListenerImpl.this, Status.f58279f.m30946f(th).m30947g("Failed to read headers"));
                                }
                            }
                        } finally {
                            Tag tag3 = ClientCallImpl.this.f58477b;
                            Objects.requireNonNull(PerfMark.f59566a);
                        }
                    }
                });
                Tag tag2 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Tag tag3 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
            MethodDescriptor.MethodType methodType = ClientCallImpl.this.f58476a.f58221a;
            Objects.requireNonNull(methodType);
            if (methodType == MethodDescriptor.MethodType.UNARY || methodType == MethodDescriptor.MethodType.SERVER_STREAMING) {
                return;
            }
            Tag tag = ClientCallImpl.this.f58477b;
            Objects.requireNonNull(PerfMark.f59566a);
            PerfMark.m31344a();
            try {
                ClientCallImpl.this.f58478c.execute(new ContextRunnable(Impl.f59565b) { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1StreamOnReady
                    {
                        super(ClientCallImpl.this.f58481f);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        Tag tag2 = ClientCallImpl.this.f58477b;
                        Impl impl = PerfMark.f59566a;
                        Objects.requireNonNull(impl);
                        Objects.requireNonNull(impl);
                        try {
                            ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                            if (clientStreamListenerImpl.f58501b == null) {
                                try {
                                    clientStreamListenerImpl.f58500a.mo12486d();
                                } catch (Throwable th) {
                                    ClientStreamListenerImpl.m31051g(ClientStreamListenerImpl.this, Status.f58279f.m30946f(th).m30947g("Failed to call onReady."));
                                }
                            }
                        } finally {
                            Tag tag3 = ClientCallImpl.this.f58477b;
                            Objects.requireNonNull(PerfMark.f59566a);
                        }
                    }
                });
                Tag tag2 = ClientCallImpl.this.f58477b;
            } catch (Throwable th) {
                Tag tag3 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: f */
        public void mo31055f(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
            Tag tag = ClientCallImpl.this.f58477b;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                m31056h(status, metadata);
                Tag tag2 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Tag tag3 = ClientCallImpl.this.f58477b;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        /* renamed from: h */
        public final void m31056h(Status status, Metadata metadata) {
            ClientCallImpl clientCallImpl = ClientCallImpl.this;
            Logger logger = ClientCallImpl.f58474t;
            Deadline m31046h = clientCallImpl.m31046h();
            if (status.f58291a == Status.Code.CANCELLED && m31046h != null && m31046h.m30854d()) {
                InsightBuilder insightBuilder = new InsightBuilder();
                ClientCallImpl.this.f58485j.mo30987n(insightBuilder);
                status = Status.f58281h.m30944a("ClientCall was cancelled at or after deadline. " + insightBuilder);
                metadata = new Metadata();
            }
            PerfMark.m31344a();
            ClientCallImpl.this.f58478c.execute(new ContextRunnable(Impl.f59565b, status, metadata) { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1StreamClosed

                /* renamed from: c */
                public final /* synthetic */ Status f58507c;

                /* renamed from: d */
                public final /* synthetic */ Metadata f58508d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(ClientCallImpl.this.f58481f);
                    this.f58507c = status;
                    this.f58508d = metadata;
                }

                @Override // io.grpc.internal.ContextRunnable
                /* renamed from: a */
                public void mo31050a() {
                    Tag tag = ClientCallImpl.this.f58477b;
                    Impl impl = PerfMark.f59566a;
                    Objects.requireNonNull(impl);
                    Objects.requireNonNull(impl);
                    try {
                        m31058b();
                        Tag tag2 = ClientCallImpl.this.f58477b;
                        Objects.requireNonNull(impl);
                    } catch (Throwable th) {
                        Tag tag3 = ClientCallImpl.this.f58477b;
                        Objects.requireNonNull(PerfMark.f59566a);
                        throw th;
                    }
                }

                /* renamed from: b */
                public final void m31058b() {
                    Status status2 = this.f58507c;
                    Metadata metadata2 = this.f58508d;
                    Status status3 = ClientStreamListenerImpl.this.f58501b;
                    if (status3 != null) {
                        metadata2 = new Metadata();
                        status2 = status3;
                    }
                    ClientCallImpl.this.f58486k = true;
                    try {
                        ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                        ClientCallImpl clientCallImpl2 = ClientCallImpl.this;
                        ClientCall.Listener<RespT> listener = clientStreamListenerImpl.f58500a;
                        Objects.requireNonNull(clientCallImpl2);
                        listener.mo12483a(status2, metadata2);
                    } finally {
                        ClientCallImpl.this.m31047i();
                        ClientCallImpl.this.f58480e.m31040a(status2.m30945e());
                    }
                }
            });
        }
    }

    public interface ClientStreamProvider {
        /* renamed from: a */
        ClientStream mo31059a(MethodDescriptor<?, ?> methodDescriptor, CallOptions callOptions, Metadata metadata, Context context);
    }

    public final class ContextCancellationListener implements Context.CancellationListener {
        public ContextCancellationListener(C63471 c63471) {
        }

        @Override // io.grpc.Context.CancellationListener
        /* renamed from: a */
        public void mo30840a(Context context) {
            ClientCallImpl.this.f58485j.mo30978a(Contexts.m30845a(context));
        }
    }

    public class DeadlineTimer implements Runnable {

        /* renamed from: b */
        public final long f58512b;

        public DeadlineTimer(long j2) {
            this.f58512b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InsightBuilder insightBuilder = new InsightBuilder();
            ClientCallImpl.this.f58485j.mo30987n(insightBuilder);
            long abs = Math.abs(this.f58512b);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f58512b) % timeUnit.toNanos(1L);
            StringBuilder m24u = C0000a.m24u("deadline exceeded after ");
            if (this.f58512b < 0) {
                m24u.append('-');
            }
            m24u.append(nanos);
            m24u.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            m24u.append("s. ");
            m24u.append(insightBuilder);
            ClientCallImpl.this.f58485j.mo30978a(Status.f58281h.m30944a(m24u.toString()));
        }
    }

    public ClientCallImpl(MethodDescriptor methodDescriptor, Executor executor, CallOptions callOptions, ClientStreamProvider clientStreamProvider, ScheduledExecutorService scheduledExecutorService, CallTracer callTracer) {
        this.f58476a = methodDescriptor;
        String str = methodDescriptor.f58222b;
        System.identityHashCode(this);
        Objects.requireNonNull(PerfMark.f59566a);
        this.f58477b = Impl.f59564a;
        if (executor == MoreExecutors.m12201a()) {
            this.f58478c = new SerializeReentrantCallsDirectExecutor();
            this.f58479d = true;
        } else {
            this.f58478c = new SerializingExecutor(executor);
            this.f58479d = false;
        }
        this.f58480e = null;
        this.f58481f = Context.m30829g();
        MethodDescriptor.MethodType methodType = methodDescriptor.f58221a;
        this.f58483h = methodType == MethodDescriptor.MethodType.UNARY || methodType == MethodDescriptor.MethodType.SERVER_STREAMING;
        this.f58484i = callOptions;
        this.f58489n = null;
        this.f58491p = null;
    }

    @Override // io.grpc.ClientCall
    /* renamed from: a */
    public void mo30812a(@Nullable String str, @Nullable Throwable th) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            m31045g(str, th);
            Objects.requireNonNull(impl);
        } catch (Throwable th2) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th2;
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: b */
    public void mo12487b() {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            Preconditions.m11192p(this.f58485j != null, "Not started");
            Preconditions.m11192p(!this.f58487l, "call was cancelled");
            Preconditions.m11192p(!this.f58488m, "call already half-closed");
            this.f58488m = true;
            this.f58485j.mo30988o();
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: c */
    public void mo30813c(int i2) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            boolean z = true;
            Preconditions.m11192p(this.f58485j != null, "Not started");
            if (i2 < 0) {
                z = false;
            }
            Preconditions.m11179c(z, "Number requested must be non-negative");
            this.f58485j.mo30982g(i2);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: d */
    public void mo30814d(ReqT reqt) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            m31048j(reqt);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    /* renamed from: e */
    public void mo30815e(boolean z) {
        Preconditions.m11192p(this.f58485j != null, "Not started");
        this.f58485j.mo30980c(z);
    }

    @Override // io.grpc.ClientCall
    /* renamed from: f */
    public void mo30816f(ClientCall.Listener<RespT> listener, Metadata metadata) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            m31049k(listener, metadata);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    /* renamed from: g */
    public final void m31045g(@Nullable String str, @Nullable Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f58474t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f58487l) {
            return;
        }
        this.f58487l = true;
        try {
            if (this.f58485j != null) {
                Status status = Status.f58279f;
                Status m30947g = str != null ? status.m30947g(str) : status.m30947g("Call cancelled without message");
                if (th != null) {
                    m30947g = m30947g.m30946f(th);
                }
                this.f58485j.mo30978a(m30947g);
            }
        } finally {
            m31047i();
        }
    }

    @Nullable
    /* renamed from: h */
    public final Deadline m31046h() {
        Deadline deadline = this.f58484i.f58059a;
        Deadline mo30834i = this.f58481f.mo30834i();
        if (deadline != null) {
            if (mo30834i == null) {
                return deadline;
            }
            deadline.m30852b(mo30834i);
            deadline.m30852b(mo30834i);
            if (deadline.f58126c - mo30834i.f58126c < 0) {
                return deadline;
            }
        }
        return mo30834i;
    }

    /* renamed from: i */
    public final void m31047i() {
        this.f58481f.mo30836k(this.f58490o);
        ScheduledFuture<?> scheduledFuture = this.f58482g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: j */
    public final void m31048j(ReqT reqt) {
        Preconditions.m11192p(this.f58485j != null, "Not started");
        Preconditions.m11192p(!this.f58487l, "call was cancelled");
        Preconditions.m11192p(!this.f58488m, "call was half-closed");
        try {
            ClientStream clientStream = this.f58485j;
            if (clientStream instanceof RetriableStream) {
                ((RetriableStream) clientStream).m31160F(reqt);
            } else {
                clientStream.mo30990r(this.f58476a.f58224d.mo30925b(reqt));
            }
            if (this.f58483h) {
                return;
            }
            this.f58485j.flush();
        } catch (Error e2) {
            this.f58485j.mo30978a(Status.f58279f.m30947g("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.f58485j.mo30978a(Status.f58279f.m30946f(e3).m30947g("Failed to stream message"));
        }
    }

    /* renamed from: k */
    public final void m31049k(final ClientCall.Listener<RespT> listener, Metadata metadata) {
        Compressor compressor;
        CallOptions callOptions;
        Preconditions.m11192p(this.f58485j == null, "Already started");
        Preconditions.m11192p(!this.f58487l, "call was cancelled");
        Preconditions.m11187k(listener, "observer");
        Preconditions.m11187k(metadata, "headers");
        if (this.f58481f.mo30835j()) {
            this.f58485j = NoopClientStream.f58932a;
            this.f58478c.execute(new ContextRunnable() { // from class: io.grpc.internal.ClientCallImpl.1ClosedByContext
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(ClientCallImpl.this.f58481f);
                }

                @Override // io.grpc.internal.ContextRunnable
                /* renamed from: a */
                public void mo31050a() {
                    ClientCallImpl clientCallImpl = ClientCallImpl.this;
                    ClientCall.Listener listener2 = listener;
                    Status m30845a = Contexts.m30845a(clientCallImpl.f58481f);
                    Metadata metadata2 = new Metadata();
                    Objects.requireNonNull(clientCallImpl);
                    listener2.mo12483a(m30845a, metadata2);
                }
            });
            return;
        }
        ManagedChannelServiceConfig.MethodInfo methodInfo = (ManagedChannelServiceConfig.MethodInfo) this.f58484i.m30803a(ManagedChannelServiceConfig.MethodInfo.f58872g);
        if (methodInfo != null) {
            Long l2 = methodInfo.f58873a;
            if (l2 != null) {
                long longValue = l2.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                Deadline.SystemTicker systemTicker = Deadline.f58121e;
                Deadline.m30851a(timeUnit, "units");
                Deadline deadline = new Deadline(systemTicker, timeUnit.toNanos(longValue), true);
                Deadline deadline2 = this.f58484i.f58059a;
                if (deadline2 == null || deadline.compareTo(deadline2) < 0) {
                    CallOptions callOptions2 = this.f58484i;
                    Objects.requireNonNull(callOptions2);
                    CallOptions callOptions3 = new CallOptions(callOptions2);
                    callOptions3.f58059a = deadline;
                    this.f58484i = callOptions3;
                }
            }
            Boolean bool = methodInfo.f58874b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    CallOptions callOptions4 = this.f58484i;
                    Objects.requireNonNull(callOptions4);
                    callOptions = new CallOptions(callOptions4);
                    callOptions.f58066h = Boolean.TRUE;
                } else {
                    CallOptions callOptions5 = this.f58484i;
                    Objects.requireNonNull(callOptions5);
                    callOptions = new CallOptions(callOptions5);
                    callOptions.f58066h = Boolean.FALSE;
                }
                this.f58484i = callOptions;
            }
            Integer num = methodInfo.f58875c;
            if (num != null) {
                CallOptions callOptions6 = this.f58484i;
                Integer num2 = callOptions6.f58067i;
                if (num2 != null) {
                    this.f58484i = callOptions6.m30805c(Math.min(num2.intValue(), methodInfo.f58875c.intValue()));
                } else {
                    this.f58484i = callOptions6.m30805c(num.intValue());
                }
            }
            Integer num3 = methodInfo.f58876d;
            if (num3 != null) {
                CallOptions callOptions7 = this.f58484i;
                Integer num4 = callOptions7.f58068j;
                if (num4 != null) {
                    this.f58484i = callOptions7.m30806d(Math.min(num4.intValue(), methodInfo.f58876d.intValue()));
                } else {
                    this.f58484i = callOptions7.m30806d(num3.intValue());
                }
            }
        }
        final String str = this.f58484i.f58063e;
        if (str != null) {
            compressor = this.f58494s.f58089a.get(str);
            if (compressor == null) {
                this.f58485j = NoopClientStream.f58932a;
                this.f58478c.execute(new ContextRunnable() { // from class: io.grpc.internal.ClientCallImpl.1ClosedByNotFoundCompressor
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(ClientCallImpl.this.f58481f);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    /* renamed from: a */
                    public void mo31050a() {
                        ClientCallImpl clientCallImpl = ClientCallImpl.this;
                        ClientCall.Listener listener2 = listener;
                        Status m30947g = Status.f58286m.m30947g(String.format("Unable to find compressor by name %s", str));
                        Metadata metadata2 = new Metadata();
                        Logger logger = ClientCallImpl.f58474t;
                        Objects.requireNonNull(clientCallImpl);
                        listener2.mo12483a(m30947g, metadata2);
                    }
                });
                return;
            }
        } else {
            compressor = Codec.Identity.f58087a;
        }
        DecompressorRegistry decompressorRegistry = this.f58493r;
        boolean z = this.f58492q;
        metadata.m30897b(GrpcUtil.f58662h);
        Metadata.Key<String> key = GrpcUtil.f58658d;
        metadata.m30897b(key);
        if (compressor != Codec.Identity.f58087a) {
            metadata.m30903h(key, compressor.mo30824a());
        }
        Metadata.Key<byte[]> key2 = GrpcUtil.f58659e;
        metadata.m30897b(key2);
        byte[] bArr = decompressorRegistry.f58131b;
        if (bArr.length != 0) {
            metadata.m30903h(key2, bArr);
        }
        metadata.m30897b(GrpcUtil.f58660f);
        Metadata.Key<byte[]> key3 = GrpcUtil.f58661g;
        metadata.m30897b(key3);
        if (z) {
            metadata.m30903h(key3, f58475u);
        }
        Deadline m31046h = m31046h();
        if (m31046h != null && m31046h.m30854d()) {
            this.f58485j = new FailingClientStream(Status.f58281h.m30947g("ClientCall started after deadline exceeded: " + m31046h), GrpcUtil.m31093d(this.f58484i, metadata, 0, false));
        } else {
            Deadline mo30834i = this.f58481f.mo30834i();
            Deadline deadline3 = this.f58484i.f58059a;
            Logger logger = f58474t;
            if (logger.isLoggable(Level.FINE) && m31046h != null && m31046h.equals(mo30834i)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, m31046h.m30855e(timeUnit2)))));
                if (deadline3 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(deadline3.m30855e(timeUnit2))));
                }
                logger.fine(sb.toString());
            }
            this.f58485j = this.f58489n.mo31059a(this.f58476a, this.f58484i, metadata, this.f58481f);
        }
        if (this.f58479d) {
            this.f58485j.mo30991s();
        }
        String str2 = this.f58484i.f58061c;
        if (str2 != null) {
            this.f58485j.mo30986m(str2);
        }
        Integer num5 = this.f58484i.f58067i;
        if (num5 != null) {
            this.f58485j.mo30983h(num5.intValue());
        }
        Integer num6 = this.f58484i.f58068j;
        if (num6 != null) {
            this.f58485j.mo30984i(num6.intValue());
        }
        if (m31046h != null) {
            this.f58485j.mo30989p(m31046h);
        }
        this.f58485j.mo30981e(compressor);
        boolean z2 = this.f58492q;
        if (z2) {
            this.f58485j.mo30993u(z2);
        }
        this.f58485j.mo30985k(this.f58493r);
        this.f58480e.m31041b();
        this.f58485j.mo30976q(new ClientStreamListenerImpl(listener));
        this.f58481f.mo30830a(this.f58490o, MoreExecutors.m12201a());
        if (m31046h != null && !m31046h.equals(this.f58481f.mo30834i()) && this.f58491p != null) {
            TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
            long m30855e = m31046h.m30855e(timeUnit3);
            this.f58482g = this.f58491p.schedule(new LogExceptionRunnable(new DeadlineTimer(m30855e)), m30855e, timeUnit3);
        }
        if (this.f58486k) {
            m31047i();
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("method", this.f58476a);
        return m11166b.toString();
    }
}
