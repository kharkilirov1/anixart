package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.p010io.ByteStreams;
import io.grpc.Attributes;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Grpc;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StreamTracer;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.MessageFramer;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class AbstractClientStream extends AbstractStream implements ClientStream, MessageFramer.Sink {

    /* renamed from: g */
    public static final Logger f58389g = Logger.getLogger(AbstractClientStream.class.getName());

    /* renamed from: a */
    public final TransportTracer f58390a;

    /* renamed from: b */
    public final Framer f58391b;

    /* renamed from: c */
    public boolean f58392c;

    /* renamed from: d */
    public boolean f58393d;

    /* renamed from: e */
    public Metadata f58394e;

    /* renamed from: f */
    public volatile boolean f58395f;

    public class GetFramer implements Framer {

        /* renamed from: a */
        public Metadata f58396a;

        /* renamed from: b */
        public boolean f58397b;

        /* renamed from: c */
        public final StatsTraceContext f58398c;

        /* renamed from: d */
        public byte[] f58399d;

        /* renamed from: e */
        public final /* synthetic */ AbstractClientStream f58400e;

        @Override // io.grpc.internal.Framer
        /* renamed from: c */
        public Framer mo31006c(boolean z) {
            return this;
        }

        @Override // io.grpc.internal.Framer
        public void close() {
            this.f58397b = true;
            Preconditions.m11192p(this.f58399d != null, "Lack of request message. GET request is only supported for unary requests");
            this.f58400e.mo31004x().mo31012c(this.f58396a, this.f58399d);
            this.f58399d = null;
            this.f58396a = null;
        }

        @Override // io.grpc.internal.Framer
        /* renamed from: e */
        public Framer mo31007e(Compressor compressor) {
            return this;
        }

        @Override // io.grpc.internal.Framer
        /* renamed from: f */
        public void mo31008f(InputStream inputStream) {
            Preconditions.m11192p(this.f58399d == null, "writePayload should not be called multiple times");
            try {
                this.f58399d = ByteStreams.m12046c(inputStream);
                this.f58398c.m31203f(0);
                StatsTraceContext statsTraceContext = this.f58398c;
                byte[] bArr = this.f58399d;
                statsTraceContext.m31204g(0, bArr.length, bArr.length);
                StatsTraceContext statsTraceContext2 = this.f58398c;
                long length = this.f58399d.length;
                for (StreamTracer streamTracer : statsTraceContext2.f59158a) {
                    streamTracer.mo30956g(length);
                }
                StatsTraceContext statsTraceContext3 = this.f58398c;
                long length2 = this.f58399d.length;
                for (StreamTracer streamTracer2 : statsTraceContext3.f59158a) {
                    streamTracer2.mo30957h(length2);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // io.grpc.internal.Framer
        public void flush() {
        }

        @Override // io.grpc.internal.Framer
        /* renamed from: i */
        public void mo31009i(int i2) {
        }

        @Override // io.grpc.internal.Framer
        public boolean isClosed() {
            return this.f58397b;
        }
    }

    public interface Sink {
        /* renamed from: a */
        void mo31010a(Status status);

        /* renamed from: b */
        void mo31011b(@Nullable WritableBuffer writableBuffer, boolean z, boolean z2, int i2);

        /* renamed from: c */
        void mo31012c(Metadata metadata, @Nullable byte[] bArr);
    }

    public static abstract class TransportState extends AbstractStream.TransportState {

        /* renamed from: h */
        public final StatsTraceContext f58401h;

        /* renamed from: i */
        public boolean f58402i;

        /* renamed from: j */
        public ClientStreamListener f58403j;

        /* renamed from: k */
        public boolean f58404k;

        /* renamed from: l */
        public DecompressorRegistry f58405l;

        /* renamed from: m */
        public boolean f58406m;

        /* renamed from: n */
        public Runnable f58407n;

        /* renamed from: o */
        public volatile boolean f58408o;

        /* renamed from: p */
        public boolean f58409p;

        /* renamed from: q */
        public boolean f58410q;

        @Override // io.grpc.internal.MessageDeframer.Listener
        /* renamed from: b */
        public void mo31013b(boolean z) {
            Preconditions.m11192p(this.f58409p, "status should have been reported on deframer closed");
            this.f58406m = true;
            if (this.f58410q && z) {
                m31017k(Status.f58286m.m30947g("Encountered end-of-stream mid-frame"), ClientStreamListener.RpcProgress.PROCESSED, true, new Metadata());
            }
            Runnable runnable = this.f58407n;
            if (runnable != null) {
                runnable.run();
                this.f58407n = null;
            }
        }

        @Override // io.grpc.internal.AbstractStream.TransportState
        /* renamed from: g */
        public StreamListener mo31014g() {
            return this.f58403j;
        }

        /* renamed from: i */
        public final void m31015i(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
            if (this.f58402i) {
                return;
            }
            this.f58402i = true;
            this.f58401h.m31205h(status);
            this.f58403j.mo31055f(status, rpcProgress, metadata);
            TransportTracer transportTracer = this.f58419c;
            if (transportTracer != null) {
                transportTracer.m31208a(status.m30945e());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31016j(io.grpc.Metadata r7) {
            /*
                r6 = this;
                boolean r0 = r6.f58409p
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                com.google.common.base.Preconditions.m11192p(r0, r2)
                io.grpc.internal.StatsTraceContext r0 = r6.f58401h
                io.grpc.StreamTracer[] r0 = r0.f59158a
                int r2 = r0.length
                r3 = 0
                r4 = 0
            L10:
                if (r4 >= r2) goto L1c
                r5 = r0[r4]
                io.grpc.ClientStreamTracer r5 = (io.grpc.ClientStreamTracer) r5
                r5.mo30820j()
                int r4 = r4 + 1
                goto L10
            L1c:
                io.grpc.Metadata$Key<java.lang.String> r0 = io.grpc.internal.GrpcUtil.f58660f
                java.lang.Object r0 = r7.m30899d(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r6.f58404k
                if (r2 == 0) goto L84
                if (r0 == 0) goto L84
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L63
                io.grpc.internal.GzipInflatingBuffer r0 = new io.grpc.internal.GzipInflatingBuffer
                r0.<init>()
                io.grpc.internal.MessageDeframer r2 = r6.f58420d
                io.grpc.Decompressor r4 = r2.f58884f
                io.grpc.Codec r5 = io.grpc.Codec.Identity.f58087a
                if (r4 != r5) goto L41
                r4 = 1
                goto L42
            L41:
                r4 = 0
            L42:
                java.lang.String r5 = "per-message decompressor already set"
                com.google.common.base.Preconditions.m11192p(r4, r5)
                io.grpc.internal.GzipInflatingBuffer r4 = r2.f58885g
                if (r4 != 0) goto L4d
                r4 = 1
                goto L4e
            L4d:
                r4 = 0
            L4e:
                java.lang.String r5 = "full stream decompressor already set"
                com.google.common.base.Preconditions.m11192p(r4, r5)
                r2.f58885g = r0
                r0 = 0
                r2.f58892n = r0
                io.grpc.internal.ApplicationThreadDeframer r0 = new io.grpc.internal.ApplicationThreadDeframer
                io.grpc.internal.MessageDeframer r2 = r6.f58420d
                r0.<init>(r6, r6, r2)
                r6.f58417a = r0
                r0 = 1
                goto L85
            L63:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L84
                io.grpc.Status r7 = io.grpc.Status.f58286m
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.Status r7 = r7.m30947g(r0)
                io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
                r0.<init>(r7)
                r6.mo31035d(r0)
                return
            L84:
                r0 = 0
            L85:
                io.grpc.Metadata$Key<java.lang.String> r2 = io.grpc.internal.GrpcUtil.f58658d
                java.lang.Object r2 = r7.m30899d(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto Ld2
                io.grpc.DecompressorRegistry r4 = r6.f58405l
                io.grpc.Decompressor r4 = r4.m30857a(r2)
                if (r4 != 0) goto Lb0
                io.grpc.Status r7 = io.grpc.Status.f58286m
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.Status r7 = r7.m30947g(r0)
                io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
                r0.<init>(r7)
                r6.mo31035d(r0)
                return
            Lb0:
                io.grpc.Codec r1 = io.grpc.Codec.Identity.f58087a
                if (r4 == r1) goto Ld2
                if (r0 == 0) goto Lcd
                io.grpc.Status r7 = io.grpc.Status.f58286m
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.Status r7 = r7.m30947g(r0)
                io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
                r0.<init>(r7)
                r6.mo31035d(r0)
                return
            Lcd:
                io.grpc.internal.Deframer r0 = r6.f58417a
                r0.mo31032j(r4)
            Ld2:
                io.grpc.internal.ClientStreamListener r0 = r6.f58403j
                r0.mo31053d(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.AbstractClientStream.TransportState.m31016j(io.grpc.Metadata):void");
        }

        /* renamed from: k */
        public final void m31017k(final Status status, final ClientStreamListener.RpcProgress rpcProgress, boolean z, final Metadata metadata) {
            Preconditions.m11187k(status, "status");
            Preconditions.m11187k(metadata, "trailers");
            if (!this.f58409p || z) {
                this.f58409p = true;
                this.f58410q = status.m30945e();
                synchronized (this.f58418b) {
                    this.f58423g = true;
                }
                if (this.f58406m) {
                    this.f58407n = null;
                    m31015i(status, rpcProgress, metadata);
                    return;
                }
                this.f58407n = new Runnable() { // from class: io.grpc.internal.AbstractClientStream.TransportState.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TransportState.this.m31015i(status, rpcProgress, metadata);
                    }
                };
                if (z) {
                    this.f58417a.close();
                } else {
                    this.f58417a.mo31031i();
                }
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: a */
    public final void mo30978a(Status status) {
        Preconditions.m11179c(!status.m30945e(), "Should not cancel with OK status");
        this.f58395f = true;
        mo31004x().mo31010a(status);
    }

    @Override // io.grpc.internal.AbstractStream, io.grpc.internal.Stream
    /* renamed from: b */
    public final boolean mo30979b() {
        return super.mo30979b() && !this.f58395f;
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: h */
    public void mo30983h(int i2) {
        mo31003w().f58417a.mo31030h(i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: i */
    public void mo30984i(int i2) {
        this.f58391b.mo31009i(i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: k */
    public final void mo30985k(DecompressorRegistry decompressorRegistry) {
        TransportState mo31003w = mo31003w();
        Preconditions.m11192p(mo31003w.f58403j == null, "Already called start");
        Preconditions.m11187k(decompressorRegistry, "decompressorRegistry");
        mo31003w.f58405l = decompressorRegistry;
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: n */
    public final void mo30987n(InsightBuilder insightBuilder) {
        Attributes mo31060f = mo31060f();
        insightBuilder.m31116b("remote_addr", mo31060f.f58054a.get(Grpc.f58142a));
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: o */
    public final void mo30988o() {
        if (mo31003w().f58408o) {
            return;
        }
        mo31003w().f58408o = true;
        this.f58391b.close();
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: p */
    public void mo30989p(Deadline deadline) {
        Metadata metadata = this.f58394e;
        Metadata.Key<Long> key = GrpcUtil.f58657c;
        metadata.m30897b(key);
        this.f58394e.m30903h(key, Long.valueOf(Math.max(0L, deadline.m30855e(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: q */
    public final void mo30976q(ClientStreamListener clientStreamListener) {
        TransportState mo31003w = mo31003w();
        Preconditions.m11192p(mo31003w.f58403j == null, "Already called setListener");
        Preconditions.m11187k(clientStreamListener, "listener");
        mo31003w.f58403j = clientStreamListener;
        if (this.f58393d) {
            return;
        }
        mo31004x().mo31012c(this.f58394e, null);
        this.f58394e = null;
    }

    @Override // io.grpc.internal.MessageFramer.Sink
    /* renamed from: t */
    public final void mo31001t(WritableBuffer writableBuffer, boolean z, boolean z2, int i2) {
        Preconditions.m11179c(writableBuffer != null || z, "null frame before EOS");
        mo31004x().mo31011b(writableBuffer, z, z2, i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: u */
    public final void mo30993u(boolean z) {
        mo31003w().f58404k = z;
    }

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: v */
    public final Framer mo31002v() {
        return this.f58391b;
    }

    /* renamed from: x */
    public abstract Sink mo31004x();

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract TransportState mo31003w();
}
