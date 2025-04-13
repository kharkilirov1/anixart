package io.grpc.okhttp;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.p010io.BaseEncoding;
import io.grpc.Attributes;
import io.grpc.InternalMetadata;
import io.grpc.InternalStatus;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.AbstractClientStream;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.Http2ClientStreamTransportState;
import io.grpc.internal.ReadableBuffer;
import io.grpc.internal.ReadableBuffers;
import io.grpc.internal.StatsTraceContext;
import io.grpc.internal.TransportFrameUtil;
import io.grpc.internal.TransportTracer;
import io.grpc.internal.WritableBuffer;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.Header;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.GuardedBy;
import okio.Buffer;
import okio.ByteString;
import p000a.C0000a;

/* loaded from: classes3.dex */
class OkHttpClientStream extends AbstractClientStream {

    /* renamed from: r */
    public static final Buffer f59209r = new Buffer();

    /* renamed from: h */
    public final MethodDescriptor<?, ?> f59210h;

    /* renamed from: i */
    public final String f59211i;

    /* renamed from: j */
    public final StatsTraceContext f59212j;

    /* renamed from: k */
    public String f59213k;

    /* renamed from: l */
    public Object f59214l;

    /* renamed from: m */
    public volatile int f59215m;

    /* renamed from: n */
    public final TransportState f59216n;

    /* renamed from: o */
    public final Sink f59217o;

    /* renamed from: p */
    public final Attributes f59218p;

    /* renamed from: q */
    public boolean f59219q;

    public class Sink implements AbstractClientStream.Sink {

        /* renamed from: a */
        public final /* synthetic */ OkHttpClientStream f59220a;

        @Override // io.grpc.internal.AbstractClientStream.Sink
        /* renamed from: a */
        public void mo31010a(Status status) {
            Objects.requireNonNull(PerfMark.f59566a);
            try {
                synchronized (this.f59220a.f59216n.f59234y) {
                    this.f59220a.f59216n.m31223p(status, true, null);
                }
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        /* renamed from: b */
        public void mo31011b(WritableBuffer writableBuffer, boolean z, boolean z2, int i2) {
            Impl impl;
            Buffer buffer;
            if (writableBuffer == null) {
                Buffer buffer2 = OkHttpClientStream.f59209r;
                buffer = OkHttpClientStream.f59209r;
            } else {
                buffer = ((OkHttpWritableBuffer) writableBuffer).f59316a;
                int i3 = (int) buffer.f68742c;
                if (i3 > 0) {
                    OkHttpClientStream okHttpClientStream = this.f59220a;
                    Buffer buffer3 = OkHttpClientStream.f59209r;
                    AbstractStream.TransportState mo31003w = okHttpClientStream.mo31003w();
                    synchronized (mo31003w.f58418b) {
                        mo31003w.f58421e += i3;
                    }
                }
            }
            try {
                synchronized (this.f59220a.f59216n.f59234y) {
                    TransportState.m31222o(this.f59220a.f59216n, buffer, z, z2);
                    TransportTracer transportTracer = this.f59220a.f58390a;
                    Objects.requireNonNull(transportTracer);
                    if (i2 != 0) {
                        transportTracer.f59173f += i2;
                        transportTracer.f59168a.mo31206a();
                    }
                }
                Objects.requireNonNull(impl);
            } finally {
                Objects.requireNonNull(PerfMark.f59566a);
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        /* renamed from: c */
        public void mo31012c(Metadata metadata, byte[] bArr) {
            Impl impl = PerfMark.f59566a;
            Objects.requireNonNull(impl);
            String str = "/" + this.f59220a.f59210h.f58222b;
            if (bArr != null) {
                this.f59220a.f59219q = true;
                StringBuilder m27x = C0000a.m27x(str, "?");
                m27x.append(BaseEncoding.f21808a.m12030c(bArr));
                str = m27x.toString();
            }
            try {
                synchronized (this.f59220a.f59216n.f59234y) {
                    TransportState.m31221n(this.f59220a.f59216n, metadata, str);
                }
                Objects.requireNonNull(impl);
            } catch (Throwable th) {
                Objects.requireNonNull(PerfMark.f59566a);
                throw th;
            }
        }
    }

    public class TransportState extends Http2ClientStreamTransportState {

        /* renamed from: A */
        @GuardedBy
        public Buffer f59221A;

        /* renamed from: B */
        public boolean f59222B;

        /* renamed from: C */
        public boolean f59223C;

        /* renamed from: D */
        @GuardedBy
        public boolean f59224D;

        /* renamed from: E */
        @GuardedBy
        public int f59225E;

        /* renamed from: F */
        @GuardedBy
        public int f59226F;

        /* renamed from: G */
        @GuardedBy
        public final ExceptionHandlingFrameWriter f59227G;

        /* renamed from: H */
        @GuardedBy
        public final OutboundFlowController f59228H;

        /* renamed from: I */
        @GuardedBy
        public final OkHttpClientTransport f59229I;

        /* renamed from: J */
        @GuardedBy
        public boolean f59230J;

        /* renamed from: K */
        public final Tag f59231K;

        /* renamed from: L */
        public final /* synthetic */ OkHttpClientStream f59232L;

        /* renamed from: x */
        public final int f59233x;

        /* renamed from: y */
        public final Object f59234y;

        /* renamed from: z */
        @GuardedBy
        public List<Header> f59235z;

        /* renamed from: n */
        public static void m31221n(TransportState transportState, Metadata metadata, String str) {
            boolean z;
            OkHttpClientStream okHttpClientStream = transportState.f59232L;
            String str2 = okHttpClientStream.f59213k;
            String str3 = okHttpClientStream.f59211i;
            boolean z2 = okHttpClientStream.f59219q;
            boolean z3 = transportState.f59229I.f59277y == null;
            Header header = Headers.f59193a;
            Preconditions.m11187k(metadata, "headers");
            Preconditions.m11187k(str, "defaultPath");
            Preconditions.m11187k(str2, "authority");
            metadata.m30897b(GrpcUtil.f58663i);
            metadata.m30897b(GrpcUtil.f58664j);
            Metadata.Key<String> key = GrpcUtil.f58665k;
            metadata.m30897b(key);
            ArrayList arrayList = new ArrayList(metadata.f58208b + 7);
            if (z3) {
                arrayList.add(Headers.f59194b);
            } else {
                arrayList.add(Headers.f59193a);
            }
            if (z2) {
                arrayList.add(Headers.f59196d);
            } else {
                arrayList.add(Headers.f59195c);
            }
            arrayList.add(new Header(Header.f59426h, str2));
            arrayList.add(new Header(Header.f59424f, str));
            arrayList.add(new Header(key.f58214a, str3));
            arrayList.add(Headers.f59197e);
            arrayList.add(Headers.f59198f);
            Logger logger = TransportFrameUtil.f59165a;
            byte[][] m30880b = InternalMetadata.m30880b(metadata);
            int i2 = 0;
            for (int i3 = 0; i3 < m30880b.length; i3 += 2) {
                byte[] bArr = m30880b[i3];
                byte[] bArr2 = m30880b[i3 + 1];
                if (TransportFrameUtil.m31207a(bArr, TransportFrameUtil.f59166b)) {
                    m30880b[i2] = bArr;
                    m30880b[i2 + 1] = InternalMetadata.f58182b.m12030c(bArr2).getBytes(Charsets.f20502a);
                } else {
                    for (byte b : bArr2) {
                        if (b < 32 || b > 126) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        m30880b[i2] = bArr;
                        m30880b[i2 + 1] = bArr2;
                    } else {
                        String str4 = new String(bArr, Charsets.f20502a);
                        Logger logger2 = TransportFrameUtil.f59165a;
                        StringBuilder m28y = C0000a.m28y("Metadata key=", str4, ", value=");
                        m28y.append(Arrays.toString(bArr2));
                        m28y.append(" contains invalid ASCII characters");
                        logger2.warning(m28y.toString());
                    }
                }
                i2 += 2;
            }
            if (i2 != m30880b.length) {
                m30880b = (byte[][]) Arrays.copyOfRange(m30880b, 0, i2);
            }
            for (int i4 = 0; i4 < m30880b.length; i4 += 2) {
                ByteString m34573i = ByteString.m34573i(m30880b[i4]);
                String m34586p = m34573i.m34586p();
                if ((m34586p.startsWith(":") || GrpcUtil.f58663i.f58214a.equalsIgnoreCase(m34586p) || GrpcUtil.f58665k.f58214a.equalsIgnoreCase(m34586p)) ? false : true) {
                    arrayList.add(new Header(m34573i, ByteString.m34573i(m30880b[i4 + 1])));
                }
            }
            transportState.f59235z = arrayList;
            OkHttpClientTransport okHttpClientTransport = transportState.f59229I;
            OkHttpClientStream okHttpClientStream2 = transportState.f59232L;
            Status status = okHttpClientTransport.f59271s;
            if (status != null) {
                okHttpClientStream2.f59216n.m31017k(status, ClientStreamListener.RpcProgress.REFUSED, true, new Metadata());
            } else if (okHttpClientTransport.f59265m.size() < okHttpClientTransport.f59239A) {
                okHttpClientTransport.m31244w(okHttpClientStream2);
            } else {
                okHttpClientTransport.f59240B.add(okHttpClientStream2);
                okHttpClientTransport.m31241t(okHttpClientStream2);
            }
        }

        /* renamed from: o */
        public static void m31222o(TransportState transportState, Buffer buffer, boolean z, boolean z2) {
            if (transportState.f59224D) {
                return;
            }
            if (!transportState.f59230J) {
                Preconditions.m11192p(transportState.f59232L.f59215m != -1, "streamId should be set");
                transportState.f59228H.m31263a(z, transportState.f59232L.f59215m, buffer, z2);
            } else {
                transportState.f59221A.write(buffer, (int) buffer.f68742c);
                transportState.f59222B |= z;
                transportState.f59223C |= z2;
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.TransportState, io.grpc.internal.MessageDeframer.Listener
        @GuardedBy
        /* renamed from: b */
        public void mo31013b(boolean z) {
            ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
            if (this.f58408o) {
                this.f59229I.m31232j(this.f59232L.f59215m, null, rpcProgress, false, null, null);
            } else {
                this.f59229I.m31232j(this.f59232L.f59215m, null, rpcProgress, false, ErrorCode.CANCEL, null);
            }
            super.mo31013b(z);
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        @GuardedBy
        /* renamed from: c */
        public void mo31034c(int i2) {
            int i3 = this.f59226F - i2;
            this.f59226F = i3;
            float f2 = i3;
            int i4 = this.f59233x;
            if (f2 <= i4 * 0.5f) {
                int i5 = i4 - i3;
                this.f59225E += i5;
                this.f59226F = i3 + i5;
                this.f59227G.windowUpdate(this.f59232L.f59215m, i5);
            }
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        @GuardedBy
        /* renamed from: d */
        public void mo31035d(Throwable th) {
            m31223p(Status.m30943d(th), true, new Metadata());
        }

        @Override // io.grpc.internal.ApplicationThreadDeframerListener.TransportExecutor
        @GuardedBy
        /* renamed from: e */
        public void mo31036e(Runnable runnable) {
            synchronized (this.f59234y) {
                runnable.run();
            }
        }

        @GuardedBy
        /* renamed from: p */
        public final void m31223p(Status status, boolean z, Metadata metadata) {
            ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
            if (this.f59224D) {
                return;
            }
            this.f59224D = true;
            if (!this.f59230J) {
                this.f59229I.m31232j(this.f59232L.f59215m, status, rpcProgress, z, ErrorCode.CANCEL, metadata);
                return;
            }
            OkHttpClientTransport okHttpClientTransport = this.f59229I;
            OkHttpClientStream okHttpClientStream = this.f59232L;
            okHttpClientTransport.f59240B.remove(okHttpClientStream);
            okHttpClientTransport.m31239q(okHttpClientStream);
            this.f59235z = null;
            Buffer buffer = this.f59221A;
            buffer.skip(buffer.f68742c);
            this.f59230J = false;
            if (metadata == null) {
                metadata = new Metadata();
            }
            m31017k(status, rpcProgress, true, metadata);
        }

        @GuardedBy
        /* renamed from: q */
        public void m31224q(Status status, boolean z, Metadata metadata) {
            m31223p(status, z, metadata);
        }

        @GuardedBy
        /* renamed from: r */
        public void m31225r(Buffer buffer, boolean z) {
            ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
            int i2 = this.f59225E - ((int) buffer.f68742c);
            this.f59225E = i2;
            if (i2 < 0) {
                this.f59227G.mo31217d(this.f59232L.f59215m, ErrorCode.FLOW_CONTROL_ERROR);
                this.f59229I.m31232j(this.f59232L.f59215m, Status.f58286m.m30947g("Received data size exceeded our receiving window size"), rpcProgress, false, null, null);
                return;
            }
            OkHttpReadableBuffer okHttpReadableBuffer = new OkHttpReadableBuffer(buffer);
            Status status = this.f58712r;
            boolean z2 = false;
            if (status != null) {
                StringBuilder m24u = C0000a.m24u("DATA-----------------------------\n");
                Charset charset = this.f58714t;
                ReadableBuffer readableBuffer = ReadableBuffers.f58955a;
                Preconditions.m11187k(charset, "charset");
                int mo31070r = okHttpReadableBuffer.mo31070r();
                byte[] bArr = new byte[mo31070r];
                okHttpReadableBuffer.mo31071u0(bArr, 0, mo31070r);
                m24u.append(new String(bArr, charset));
                this.f58712r = status.m30944a(m24u.toString());
                okHttpReadableBuffer.close();
                if (this.f58712r.f58292b.length() > 1000 || z) {
                    m31223p(this.f58712r, false, this.f58713s);
                    return;
                }
                return;
            }
            if (!this.f58715u) {
                m31223p(Status.f58286m.m30947g("headers not received before payload"), false, new Metadata());
                return;
            }
            int mo31070r2 = okHttpReadableBuffer.mo31070r();
            try {
                if (this.f58409p) {
                    AbstractClientStream.f58389g.log(Level.INFO, "Received data on closed stream");
                    okHttpReadableBuffer.close();
                } else {
                    try {
                        this.f58417a.mo31033k(okHttpReadableBuffer);
                    } catch (Throwable th) {
                        try {
                            mo31035d(th);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z2) {
                                okHttpReadableBuffer.close();
                            }
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (mo31070r2 > 0) {
                        this.f58712r = Status.f58286m.m30947g("Received unexpected EOS on non-empty DATA frame from server");
                    } else {
                        this.f58712r = Status.f58286m.m30947g("Received unexpected EOS on empty DATA frame from server");
                    }
                    Metadata metadata = new Metadata();
                    this.f58713s = metadata;
                    m31017k(this.f58712r, rpcProgress, false, metadata);
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = true;
            }
        }

        /* JADX WARN: Finally extract failed */
        @GuardedBy
        /* renamed from: s */
        public void m31226s(List<Header> list, boolean z) {
            Status status;
            StringBuilder sb;
            Status m30944a;
            Status m30944a2;
            if (z) {
                byte[][] m31274a = Utils.m31274a(list);
                Charset charset = InternalMetadata.f58181a;
                Metadata metadata = new Metadata(m31274a);
                if (this.f58712r == null && !this.f58715u) {
                    Status m31108m = m31108m(metadata);
                    this.f58712r = m31108m;
                    if (m31108m != null) {
                        this.f58713s = metadata;
                    }
                }
                Status status2 = this.f58712r;
                if (status2 != null) {
                    Status m30944a3 = status2.m30944a("trailers: " + metadata);
                    this.f58712r = m30944a3;
                    m31224q(m30944a3, false, this.f58713s);
                    return;
                }
                Metadata.Key<Status> key = InternalStatus.f58184b;
                Status status3 = (Status) metadata.m30899d(key);
                if (status3 != null) {
                    m30944a2 = status3.m30947g((String) metadata.m30899d(InternalStatus.f58183a));
                } else if (this.f58715u) {
                    m30944a2 = Status.f58280g.m30947g("missing GRPC status in response");
                } else {
                    Integer num = (Integer) metadata.m30899d(Http2ClientStreamTransportState.f58711w);
                    m30944a2 = (num != null ? GrpcUtil.m31096g(num.intValue()) : Status.f58286m.m30947g("missing HTTP status code")).m30944a("missing GRPC status, inferred error from HTTP status code");
                }
                metadata.m30897b(Http2ClientStreamTransportState.f58711w);
                metadata.m30897b(key);
                metadata.m30897b(InternalStatus.f58183a);
                if (this.f58409p) {
                    AbstractClientStream.f58389g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{m30944a2, metadata});
                    return;
                } else {
                    this.f58401h.m31198a(metadata);
                    m31017k(m30944a2, ClientStreamListener.RpcProgress.PROCESSED, false, metadata);
                    return;
                }
            }
            byte[][] m31274a2 = Utils.m31274a(list);
            Charset charset2 = InternalMetadata.f58181a;
            Metadata metadata2 = new Metadata(m31274a2);
            Status status4 = this.f58712r;
            if (status4 != null) {
                this.f58712r = status4.m30944a("headers: " + metadata2);
                return;
            }
            try {
                if (this.f58715u) {
                    status = Status.f58286m.m30947g("Received headers twice");
                    this.f58712r = status;
                    sb = new StringBuilder();
                } else {
                    Metadata.Key<Integer> key2 = Http2ClientStreamTransportState.f58711w;
                    Integer num2 = (Integer) metadata2.m30899d(key2);
                    if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                        this.f58715u = true;
                        Status m31108m2 = m31108m(metadata2);
                        this.f58712r = m31108m2;
                        if (m31108m2 != null) {
                            m30944a = m31108m2.m30944a("headers: " + metadata2);
                            this.f58712r = m30944a;
                            this.f58713s = metadata2;
                            this.f58714t = Http2ClientStreamTransportState.m31107l(metadata2);
                        }
                        metadata2.m30897b(key2);
                        metadata2.m30897b(InternalStatus.f58184b);
                        metadata2.m30897b(InternalStatus.f58183a);
                        m31016j(metadata2);
                        status = this.f58712r;
                        if (status == null) {
                            return;
                        } else {
                            sb = new StringBuilder();
                        }
                    } else {
                        status = this.f58712r;
                        if (status == null) {
                            return;
                        } else {
                            sb = new StringBuilder();
                        }
                    }
                }
                sb.append("headers: ");
                sb.append(metadata2);
                m30944a = status.m30944a(sb.toString());
                this.f58712r = m30944a;
                this.f58713s = metadata2;
                this.f58714t = Http2ClientStreamTransportState.m31107l(metadata2);
            } catch (Throwable th) {
                Status status5 = this.f58712r;
                if (status5 != null) {
                    this.f58712r = status5.m30944a("headers: " + metadata2);
                    this.f58713s = metadata2;
                    this.f58714t = Http2ClientStreamTransportState.m31107l(metadata2);
                }
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: f */
    public Attributes mo31060f() {
        return this.f59218p;
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: m */
    public void mo30986m(String str) {
        Preconditions.m11187k(str, "authority");
        this.f59213k = str;
    }

    @Override // io.grpc.internal.AbstractClientStream, io.grpc.internal.AbstractStream
    /* renamed from: w */
    public AbstractStream.TransportState mo31003w() {
        return this.f59216n;
    }

    @Override // io.grpc.internal.AbstractClientStream
    /* renamed from: x */
    public AbstractClientStream.Sink mo31004x() {
        return this.f59217o;
    }

    @Override // io.grpc.internal.AbstractClientStream
    /* renamed from: y */
    public AbstractClientStream.TransportState mo31003w() {
        return this.f59216n;
    }
}
