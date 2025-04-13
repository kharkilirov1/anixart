package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Attributes;
import io.grpc.Codec;
import io.grpc.Compressor;
import io.grpc.CompressorRegistry;
import io.grpc.Context;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.Status;
import io.grpc.internal.StreamListener;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class ServerCallImpl<ReqT, RespT> extends ServerCall<ReqT, RespT> {

    /* renamed from: n */
    public static final Logger f59083n = Logger.getLogger(ServerCallImpl.class.getName());

    /* renamed from: a */
    public final ServerStream f59084a;

    /* renamed from: b */
    public final MethodDescriptor<ReqT, RespT> f59085b;

    /* renamed from: c */
    public final Tag f59086c;

    /* renamed from: d */
    public final Context.CancellableContext f59087d;

    /* renamed from: e */
    public final byte[] f59088e;

    /* renamed from: f */
    public final DecompressorRegistry f59089f;

    /* renamed from: g */
    public final CompressorRegistry f59090g;

    /* renamed from: h */
    public CallTracer f59091h;

    /* renamed from: i */
    public volatile boolean f59092i;

    /* renamed from: j */
    public boolean f59093j;

    /* renamed from: k */
    public boolean f59094k;

    /* renamed from: l */
    public Compressor f59095l;

    /* renamed from: m */
    public boolean f59096m;

    @VisibleForTesting
    public static final class ServerStreamListenerImpl<ReqT> implements ServerStreamListener {

        /* renamed from: a */
        public final ServerCallImpl<ReqT, ?> f59097a;

        /* renamed from: b */
        public final ServerCall.Listener<ReqT> f59098b;

        /* renamed from: c */
        public final Context.CancellableContext f59099c;

        public ServerStreamListenerImpl(ServerCallImpl<ReqT, ?> serverCallImpl, ServerCall.Listener<ReqT> listener, Context.CancellableContext cancellableContext) {
            this.f59097a = serverCallImpl;
            Preconditions.m11187k(listener, "listener must not be null");
            this.f59098b = listener;
            Preconditions.m11187k(cancellableContext, "context");
            this.f59099c = cancellableContext;
            cancellableContext.mo30830a(new Context.CancellationListener() { // from class: io.grpc.internal.ServerCallImpl.ServerStreamListenerImpl.1
                @Override // io.grpc.Context.CancellationListener
                /* renamed from: a */
                public void mo30840a(Context context) {
                    if (context.mo30832c() != null) {
                        ServerStreamListenerImpl.this.f59097a.f59092i = true;
                    }
                }
            }, MoreExecutors.m12201a());
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(StreamListener.MessageProducer messageProducer) {
            Tag tag = this.f59097a.f59086c;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                m31186g(messageProducer);
                Tag tag2 = this.f59097a.f59086c;
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Tag tag3 = this.f59097a.f59086c;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: b */
        public void mo31184b(Status status) {
            Tag tag = this.f59097a.f59086c;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                try {
                    if (status.m30945e()) {
                        this.f59098b.mo30847b();
                    } else {
                        this.f59097a.f59092i = true;
                        this.f59098b.mo30846a();
                    }
                    Tag tag2 = this.f59097a.f59086c;
                    Objects.requireNonNull(impl);
                } finally {
                    this.f59099c.m30838m(null);
                }
            } catch (Throwable th) {
                Tag tag3 = this.f59097a.f59086c;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.ServerStreamListener
        /* renamed from: c */
        public void mo31185c() {
            Tag tag = this.f59097a.f59086c;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                if (this.f59097a.f59092i) {
                    Tag tag2 = this.f59097a.f59086c;
                    Objects.requireNonNull(impl);
                } else {
                    this.f59098b.mo30848c();
                    Tag tag3 = this.f59097a.f59086c;
                    Objects.requireNonNull(impl);
                }
            } catch (Throwable th) {
                Tag tag4 = this.f59097a.f59086c;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
            Tag tag = this.f59097a.f59086c;
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            try {
                if (this.f59097a.f59092i) {
                    Tag tag2 = this.f59097a.f59086c;
                    Objects.requireNonNull(impl);
                } else {
                    this.f59098b.mo30850e();
                    Tag tag3 = this.f59097a.f59086c;
                    Objects.requireNonNull(impl);
                }
            } catch (Throwable th) {
                Tag tag4 = this.f59097a.f59086c;
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        /* renamed from: g */
        public final void m31186g(StreamListener.MessageProducer messageProducer) {
            if (this.f59097a.f59092i) {
                Logger logger = GrpcUtil.f58655a;
                while (messageProducer.next() != null) {
                }
                return;
            }
            while (true) {
                try {
                    InputStream next = messageProducer.next();
                    if (next == null) {
                        return;
                    }
                    try {
                        this.f59098b.mo30849d(this.f59097a.f59085b.f58224d.mo30924a(next));
                        next.close();
                    } finally {
                        GrpcUtil.m31092c(next);
                    }
                } catch (Throwable th) {
                    Logger logger2 = GrpcUtil.f58655a;
                    while (messageProducer.next() != null) {
                    }
                    Throwables.m11225f(th);
                    throw new RuntimeException(th);
                }
            }
        }
    }

    @Override // io.grpc.ServerCall
    /* renamed from: a */
    public void mo30861a(Status status, Metadata metadata) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            m31180l(status, metadata);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    /* renamed from: b */
    public Attributes mo30862b() {
        return this.f59084a.mo30996f();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: c */
    public String mo30863c() {
        return this.f59084a.mo30998l();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: d */
    public MethodDescriptor<ReqT, RespT> mo30870d() {
        return this.f59085b;
    }

    @Override // io.grpc.ServerCall
    /* renamed from: e */
    public boolean mo30864e() {
        return this.f59092i;
    }

    @Override // io.grpc.ServerCall
    /* renamed from: f */
    public boolean mo30933f() {
        if (this.f59094k) {
            return false;
        }
        return this.f59084a.mo30979b();
    }

    @Override // io.grpc.ServerCall
    /* renamed from: g */
    public void mo30865g(int i2) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            this.f59084a.mo30982g(i2);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    /* renamed from: h */
    public void mo30866h(Metadata metadata) {
        Impl impl = PerfMark.f59566a;
        Objects.requireNonNull(impl);
        try {
            m31182n(metadata);
            Objects.requireNonNull(impl);
        } catch (Throwable th) {
            Objects.requireNonNull(PerfMark.f59566a);
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    /* renamed from: i */
    public void mo30867i(RespT respt) {
        try {
            m31183o(respt);
        } finally {
            Objects.requireNonNull(PerfMark.f59566a);
        }
    }

    @Override // io.grpc.ServerCall
    /* renamed from: j */
    public void mo30868j(String str) {
        Preconditions.m11192p(!this.f59093j, "sendHeaders has been called");
        Compressor compressor = this.f59090g.f58089a.get(str);
        this.f59095l = compressor;
        Preconditions.m11184h(compressor != null, "Unable to find compressor by name %s", str);
    }

    @Override // io.grpc.ServerCall
    /* renamed from: k */
    public void mo30869k(boolean z) {
        this.f59084a.mo30980c(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r3.f59096m != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        m31181m(io.grpc.Status.f58286m.m30947g("Completed without a response"));
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31180l(io.grpc.Status r4, io.grpc.Metadata r5) {
        /*
            r3 = this;
            boolean r0 = r3.f59094k
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "call already closed"
            com.google.common.base.Preconditions.m11192p(r0, r2)
            r3.f59094k = r1     // Catch: java.lang.Throwable -> L43
            boolean r0 = r4.m30945e()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L3d
            io.grpc.MethodDescriptor<ReqT, RespT> r0 = r3.f59085b     // Catch: java.lang.Throwable -> L43
            io.grpc.MethodDescriptor$MethodType r0 = r0.f58221a     // Catch: java.lang.Throwable -> L43
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L43
            io.grpc.MethodDescriptor$MethodType r2 = io.grpc.MethodDescriptor.MethodType.UNARY     // Catch: java.lang.Throwable -> L43
            if (r0 == r2) goto L22
            io.grpc.MethodDescriptor$MethodType r2 = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING     // Catch: java.lang.Throwable -> L43
            if (r0 != r2) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L3d
            boolean r0 = r3.f59096m     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L3d
            io.grpc.Status r5 = io.grpc.Status.f58286m     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "Completed without a response"
            io.grpc.Status r5 = r5.m30947g(r0)     // Catch: java.lang.Throwable -> L43
            r3.m31181m(r5)     // Catch: java.lang.Throwable -> L43
        L33:
            io.grpc.internal.CallTracer r5 = r3.f59091h
            boolean r4 = r4.m30945e()
            r5.m31040a(r4)
            return
        L3d:
            io.grpc.internal.ServerStream r0 = r3.f59084a     // Catch: java.lang.Throwable -> L43
            r0.mo30997j(r4, r5)     // Catch: java.lang.Throwable -> L43
            goto L33
        L43:
            r5 = move-exception
            io.grpc.internal.CallTracer r0 = r3.f59091h
            boolean r4 = r4.m30945e()
            r0.m31040a(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ServerCallImpl.m31180l(io.grpc.Status, io.grpc.Metadata):void");
    }

    /* renamed from: m */
    public final void m31181m(Status status) {
        f59083n.log(Level.WARNING, "Cancelling the stream with status {0}", new Object[]{status});
        this.f59084a.mo30994a(status);
        this.f59091h.m31040a(status.m30945e());
    }

    /* renamed from: n */
    public final void m31182n(Metadata metadata) {
        Preconditions.m11192p(!this.f59093j, "sendHeaders has already been called");
        Preconditions.m11192p(!this.f59094k, "call is closed");
        metadata.m30897b(GrpcUtil.f58662h);
        metadata.m30897b(GrpcUtil.f58658d);
        if (this.f59095l == null) {
            this.f59095l = Codec.Identity.f58087a;
        } else {
            byte[] bArr = this.f59088e;
            if (bArr != null) {
                Iterable<String> m11207d = GrpcUtil.f58666l.m11207d(new String(bArr, GrpcUtil.f58656b));
                String mo30824a = this.f59095l.mo30824a();
                boolean z = false;
                if (m11207d instanceof Collection) {
                    try {
                        z = ((Collection) m11207d).contains(mo30824a);
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                } else {
                    Iterator<String> it = m11207d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (com.google.common.base.Objects.m11173a(it.next(), mo30824a)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    this.f59095l = Codec.Identity.f58087a;
                }
            } else {
                this.f59095l = Codec.Identity.f58087a;
            }
        }
        metadata.m30903h(GrpcUtil.f58658d, this.f59095l.mo30824a());
        this.f59084a.mo30981e(this.f59095l);
        Metadata.Key<byte[]> key = GrpcUtil.f58659e;
        metadata.m30897b(key);
        byte[] bArr2 = this.f59089f.f58131b;
        if (bArr2.length != 0) {
            metadata.m30903h(key, bArr2);
        }
        this.f59093j = true;
        this.f59084a.mo30995d(metadata);
    }

    /* renamed from: o */
    public final void m31183o(RespT respt) {
        Preconditions.m11192p(this.f59093j, "sendHeaders has not been called");
        Preconditions.m11192p(!this.f59094k, "call is closed");
        MethodDescriptor.MethodType methodType = this.f59085b.f58221a;
        Objects.requireNonNull(methodType);
        if ((methodType == MethodDescriptor.MethodType.UNARY || methodType == MethodDescriptor.MethodType.CLIENT_STREAMING) && this.f59096m) {
            m31181m(Status.f58286m.m30947g("Too many responses"));
            return;
        }
        this.f59096m = true;
        try {
            this.f59084a.mo30990r(this.f59085b.f58225e.mo30925b(respt));
            this.f59084a.flush();
        } catch (Error e2) {
            mo30861a(Status.f58279f.m30947g("Server sendMessage() failed with Error"), new Metadata());
            throw e2;
        } catch (RuntimeException e3) {
            mo30861a(Status.m30943d(e3), new Metadata());
        }
    }
}
