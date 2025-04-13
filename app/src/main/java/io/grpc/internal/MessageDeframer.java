package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import io.grpc.Decompressor;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.StreamTracer;
import io.grpc.internal.ReadableBuffers;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes3.dex */
public class MessageDeframer implements Closeable, Deframer {

    /* renamed from: b */
    public Listener f58880b;

    /* renamed from: c */
    public int f58881c;

    /* renamed from: d */
    public final StatsTraceContext f58882d;

    /* renamed from: e */
    public final TransportTracer f58883e;

    /* renamed from: f */
    public Decompressor f58884f;

    /* renamed from: g */
    public GzipInflatingBuffer f58885g;

    /* renamed from: h */
    public byte[] f58886h;

    /* renamed from: i */
    public int f58887i;

    /* renamed from: j */
    public State f58888j;

    /* renamed from: k */
    public int f58889k;

    /* renamed from: l */
    public boolean f58890l;

    /* renamed from: m */
    public CompositeReadableBuffer f58891m;

    /* renamed from: n */
    public CompositeReadableBuffer f58892n;

    /* renamed from: o */
    public long f58893o;

    /* renamed from: p */
    public boolean f58894p;

    /* renamed from: q */
    public int f58895q;

    /* renamed from: r */
    public int f58896r;

    /* renamed from: s */
    public boolean f58897s;

    /* renamed from: t */
    public volatile boolean f58898t;

    /* renamed from: io.grpc.internal.MessageDeframer$1 */
    public static /* synthetic */ class C64321 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58899a;

        static {
            int[] iArr = new int[State.values().length];
            f58899a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58899a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface Listener {
        /* renamed from: a */
        void mo31026a(StreamListener.MessageProducer messageProducer);

        /* renamed from: b */
        void mo31013b(boolean z);

        /* renamed from: c */
        void mo31034c(int i2);

        /* renamed from: d */
        void mo31035d(Throwable th);
    }

    public static class SingleMessageProducer implements StreamListener.MessageProducer {

        /* renamed from: b */
        public InputStream f58900b;

        public SingleMessageProducer(InputStream inputStream, C64321 c64321) {
            this.f58900b = inputStream;
        }

        @Override // io.grpc.internal.StreamListener.MessageProducer
        @Nullable
        public InputStream next() {
            InputStream inputStream = this.f58900b;
            this.f58900b = null;
            return inputStream;
        }
    }

    public enum State {
        HEADER,
        BODY
    }

    /* renamed from: a */
    public final void m31143a() {
        if (this.f58894p) {
            return;
        }
        this.f58894p = true;
        while (true) {
            try {
                if (this.f58898t || this.f58893o <= 0 || !m31147l()) {
                    break;
                }
                int ordinal = this.f58888j.ordinal();
                if (ordinal == 0) {
                    m31146e();
                } else {
                    if (ordinal != 1) {
                        throw new AssertionError("Invalid state: " + this.f58888j);
                    }
                    m31145c();
                    this.f58893o--;
                }
            } finally {
                this.f58894p = false;
            }
        }
        if (this.f58898t) {
            close();
            return;
        }
        if (this.f58897s && m31144b()) {
            close();
        }
    }

    /* renamed from: b */
    public final boolean m31144b() {
        GzipInflatingBuffer gzipInflatingBuffer = this.f58885g;
        if (gzipInflatingBuffer == null) {
            return this.f58892n.f58529d == 0;
        }
        Preconditions.m11192p(true ^ gzipInflatingBuffer.f58687j, "GzipInflatingBuffer is closed");
        return gzipInflatingBuffer.f58693p;
    }

    /* renamed from: c */
    public final void m31145c() {
        InputStream bufferInputStream;
        this.f58882d.m31201d(this.f58895q, this.f58896r, -1L);
        this.f58896r = 0;
        if (this.f58890l) {
            Decompressor decompressor = this.f58884f;
            if (decompressor == Codec.Identity.f58087a) {
                throw new StatusRuntimeException(Status.f58286m.m30947g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                CompositeReadableBuffer compositeReadableBuffer = this.f58891m;
                ReadableBuffer readableBuffer = ReadableBuffers.f58955a;
                bufferInputStream = new SizeEnforcingInputStream(decompressor.mo30825b(new ReadableBuffers.BufferInputStream(compositeReadableBuffer)), this.f58881c, this.f58882d);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            StatsTraceContext statsTraceContext = this.f58882d;
            long j2 = this.f58891m.f58529d;
            for (StreamTracer streamTracer : statsTraceContext.f59158a) {
                streamTracer.mo30952c(j2);
            }
            CompositeReadableBuffer compositeReadableBuffer2 = this.f58891m;
            ReadableBuffer readableBuffer2 = ReadableBuffers.f58955a;
            bufferInputStream = new ReadableBuffers.BufferInputStream(compositeReadableBuffer2);
        }
        this.f58891m = null;
        this.f58880b.mo31026a(new SingleMessageProducer(bufferInputStream, null));
        this.f58888j = State.HEADER;
        this.f58889k = 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.Deframer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r6 = this;
            boolean r0 = r6.isClosed()
            if (r0 == 0) goto L7
            return
        L7:
            io.grpc.internal.CompositeReadableBuffer r0 = r6.f58891m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.f58529d
            if (r0 <= 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r3 = 0
            io.grpc.internal.GzipInflatingBuffer r4 = r6.f58885g     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L3f
            if (r0 != 0) goto L39
            boolean r0 = r4.f58687j     // Catch: java.lang.Throwable -> L59
            r0 = r0 ^ r1
            java.lang.String r5 = "GzipInflatingBuffer is closed"
            com.google.common.base.Preconditions.m11192p(r0, r5)     // Catch: java.lang.Throwable -> L59
            io.grpc.internal.GzipInflatingBuffer$GzipMetadataReader r0 = r4.f58681d     // Catch: java.lang.Throwable -> L59
            int r0 = io.grpc.internal.GzipInflatingBuffer.GzipMetadataReader.m31104c(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L34
            io.grpc.internal.GzipInflatingBuffer$State r0 = r4.f58686i     // Catch: java.lang.Throwable -> L59
            io.grpc.internal.GzipInflatingBuffer$State r4 = io.grpc.internal.GzipInflatingBuffer.State.HEADER     // Catch: java.lang.Throwable -> L59
            if (r0 == r4) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = 1
        L35:
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            io.grpc.internal.GzipInflatingBuffer r0 = r6.f58885g     // Catch: java.lang.Throwable -> L59
            r0.close()     // Catch: java.lang.Throwable -> L59
            r0 = r1
        L3f:
            io.grpc.internal.CompositeReadableBuffer r1 = r6.f58892n     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.lang.Throwable -> L59
        L46:
            io.grpc.internal.CompositeReadableBuffer r1 = r6.f58891m     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L59
        L4d:
            r6.f58885g = r3
            r6.f58892n = r3
            r6.f58891m = r3
            io.grpc.internal.MessageDeframer$Listener r1 = r6.f58880b
            r1.mo31013b(r0)
            return
        L59:
            r0 = move-exception
            r6.f58885g = r3
            r6.f58892n = r3
            r6.f58891m = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.MessageDeframer.close():void");
    }

    /* renamed from: e */
    public final void m31146e() {
        int readUnsignedByte = this.f58891m.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw new StatusRuntimeException(Status.f58286m.m30947g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f58890l = (readUnsignedByte & 1) != 0;
        CompositeReadableBuffer compositeReadableBuffer = this.f58891m;
        compositeReadableBuffer.m31019a(4);
        int readUnsignedByte2 = compositeReadableBuffer.readUnsignedByte() | (compositeReadableBuffer.readUnsignedByte() << 24) | (compositeReadableBuffer.readUnsignedByte() << 16) | (compositeReadableBuffer.readUnsignedByte() << 8);
        this.f58889k = readUnsignedByte2;
        if (readUnsignedByte2 < 0 || readUnsignedByte2 > this.f58881c) {
            throw new StatusRuntimeException(Status.f58284k.m30947g(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f58881c), Integer.valueOf(this.f58889k))));
        }
        int i2 = this.f58895q + 1;
        this.f58895q = i2;
        this.f58882d.m31200c(i2);
        TransportTracer transportTracer = this.f58883e;
        transportTracer.f59174g.mo31037a(1L);
        transportTracer.f59168a.mo31206a();
        this.f58888j = State.BODY;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: g */
    public void mo31029g(int i2) {
        Preconditions.m11179c(i2 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f58893o += i2;
        m31143a();
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: h */
    public void mo31030h(int i2) {
        this.f58881c = i2;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: i */
    public void mo31031i() {
        if (isClosed()) {
            return;
        }
        if (m31144b()) {
            close();
        } else {
            this.f58897s = true;
        }
    }

    public boolean isClosed() {
        return this.f58892n == null && this.f58885g == null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: j */
    public void mo31032j(Decompressor decompressor) {
        Preconditions.m11192p(this.f58885g == null, "Already set full stream decompressor");
        Preconditions.m11187k(decompressor, "Can't pass an empty decompressor");
        this.f58884f = decompressor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:3:0x0007, B:5:0x000d, B:10:0x0017, B:12:0x001b, B:26:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    @Override // io.grpc.internal.Deframer
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo31033k(io.grpc.internal.ReadableBuffer r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            com.google.common.base.Preconditions.m11187k(r6, r0)
            r0 = 0
            r1 = 1
            boolean r2 = r5.isClosed()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L14
            boolean r2 = r5.f58897s     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            if (r2 != 0) goto L3a
            io.grpc.internal.GzipInflatingBuffer r2 = r5.f58885g     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L2b
            boolean r3 = r2.f58687j     // Catch: java.lang.Throwable -> L38
            r3 = r3 ^ r1
            java.lang.String r4 = "GzipInflatingBuffer is closed"
            com.google.common.base.Preconditions.m11192p(r3, r4)     // Catch: java.lang.Throwable -> L38
            io.grpc.internal.CompositeReadableBuffer r3 = r2.f58679b     // Catch: java.lang.Throwable -> L38
            r3.m31065b(r6)     // Catch: java.lang.Throwable -> L38
            r2.f58693p = r0     // Catch: java.lang.Throwable -> L38
            goto L30
        L2b:
            io.grpc.internal.CompositeReadableBuffer r2 = r5.f58892n     // Catch: java.lang.Throwable -> L38
            r2.m31065b(r6)     // Catch: java.lang.Throwable -> L38
        L30:
            r5.m31143a()     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r1 = move-exception
            r0 = r1
            r1 = 0
            goto L41
        L38:
            r0 = move-exception
            goto L41
        L3a:
            r0 = 1
        L3b:
            if (r0 == 0) goto L40
            r6.close()
        L40:
            return
        L41:
            if (r1 == 0) goto L46
            r6.close()
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.MessageDeframer.mo31033k(io.grpc.internal.ReadableBuffer):void");
    }

    /* renamed from: l */
    public final boolean m31147l() {
        int i2;
        State state = State.BODY;
        int i3 = 0;
        try {
            if (this.f58891m == null) {
                this.f58891m = new CompositeReadableBuffer();
            }
            int i4 = 0;
            i2 = 0;
            while (true) {
                try {
                    int i5 = this.f58889k - this.f58891m.f58529d;
                    if (i5 <= 0) {
                        if (i4 > 0) {
                            this.f58880b.mo31034c(i4);
                            if (this.f58888j == state) {
                                if (this.f58885g != null) {
                                    this.f58882d.m31202e(i2);
                                    this.f58896r += i2;
                                } else {
                                    this.f58882d.m31202e(i4);
                                    this.f58896r += i4;
                                }
                            }
                        }
                        return true;
                    }
                    if (this.f58885g != null) {
                        try {
                            byte[] bArr = this.f58886h;
                            if (bArr == null || this.f58887i == bArr.length) {
                                this.f58886h = new byte[Math.min(i5, 2097152)];
                                this.f58887i = 0;
                            }
                            int m31100a = this.f58885g.m31100a(this.f58886h, this.f58887i, Math.min(i5, this.f58886h.length - this.f58887i));
                            GzipInflatingBuffer gzipInflatingBuffer = this.f58885g;
                            int i6 = gzipInflatingBuffer.f58691n;
                            gzipInflatingBuffer.f58691n = 0;
                            i4 += i6;
                            int i7 = gzipInflatingBuffer.f58692o;
                            gzipInflatingBuffer.f58692o = 0;
                            i2 += i7;
                            if (m31100a == 0) {
                                if (i4 > 0) {
                                    this.f58880b.mo31034c(i4);
                                    if (this.f58888j == state) {
                                        if (this.f58885g != null) {
                                            this.f58882d.m31202e(i2);
                                            this.f58896r += i2;
                                        } else {
                                            this.f58882d.m31202e(i4);
                                            this.f58896r += i4;
                                        }
                                    }
                                }
                                return false;
                            }
                            CompositeReadableBuffer compositeReadableBuffer = this.f58891m;
                            byte[] bArr2 = this.f58886h;
                            int i8 = this.f58887i;
                            ReadableBuffer readableBuffer = ReadableBuffers.f58955a;
                            compositeReadableBuffer.m31065b(new ReadableBuffers.ByteArrayWrapper(bArr2, i8, m31100a));
                            this.f58887i += m31100a;
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        } catch (DataFormatException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        int i9 = this.f58892n.f58529d;
                        if (i9 == 0) {
                            if (i4 > 0) {
                                this.f58880b.mo31034c(i4);
                                if (this.f58888j == state) {
                                    if (this.f58885g != null) {
                                        this.f58882d.m31202e(i2);
                                        this.f58896r += i2;
                                    } else {
                                        this.f58882d.m31202e(i4);
                                        this.f58896r += i4;
                                    }
                                }
                            }
                            return false;
                        }
                        int min = Math.min(i5, i9);
                        i4 += min;
                        this.f58891m.m31065b(this.f58892n.mo31063O(min));
                    }
                } catch (Throwable th) {
                    int i10 = i4;
                    th = th;
                    i3 = i10;
                    if (i3 > 0) {
                        this.f58880b.mo31034c(i3);
                        if (this.f58888j == state) {
                            if (this.f58885g != null) {
                                this.f58882d.m31202e(i2);
                                this.f58896r += i2;
                            } else {
                                this.f58882d.m31202e(i3);
                                this.f58896r += i3;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 0;
        }
    }

    @VisibleForTesting
    public static final class SizeEnforcingInputStream extends FilterInputStream {

        /* renamed from: b */
        public final int f58901b;

        /* renamed from: c */
        public final StatsTraceContext f58902c;

        /* renamed from: d */
        public long f58903d;

        /* renamed from: e */
        public long f58904e;

        /* renamed from: f */
        public long f58905f;

        public SizeEnforcingInputStream(InputStream inputStream, int i2, StatsTraceContext statsTraceContext) {
            super(inputStream);
            this.f58905f = -1L;
            this.f58901b = i2;
            this.f58902c = statsTraceContext;
        }

        /* renamed from: a */
        public final void m31148a() {
            long j2 = this.f58904e;
            long j3 = this.f58903d;
            if (j2 > j3) {
                long j4 = j2 - j3;
                for (StreamTracer streamTracer : this.f58902c.f59158a) {
                    streamTracer.mo30952c(j4);
                }
                this.f58903d = this.f58904e;
            }
        }

        /* renamed from: b */
        public final void m31149b() {
            long j2 = this.f58904e;
            int i2 = this.f58901b;
            if (j2 > i2) {
                throw new StatusRuntimeException(Status.f58284k.m30947g(String.format("Decompressed gRPC message exceeds maximum size %d", Integer.valueOf(i2))));
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f58905f = this.f58904e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f58904e++;
            }
            m31149b();
            m31148a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f58905f == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f58904e = this.f58905f;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(j2);
            this.f58904e += skip;
            m31149b();
            m31148a();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int read = ((FilterInputStream) this).in.read(bArr, i2, i3);
            if (read != -1) {
                this.f58904e += read;
            }
            m31149b();
            m31148a();
            return read;
        }
    }
}
