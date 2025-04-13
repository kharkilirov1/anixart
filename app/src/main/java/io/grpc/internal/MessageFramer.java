package io.grpc.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.Preconditions;
import com.google.common.p010io.ByteStreams;
import io.grpc.Compressor;
import io.grpc.Drainable;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class MessageFramer implements Framer {

    /* renamed from: a */
    public final Sink f58909a;

    /* renamed from: b */
    public int f58910b;

    /* renamed from: c */
    public WritableBuffer f58911c;

    /* renamed from: d */
    public Compressor f58912d;

    /* renamed from: e */
    public boolean f58913e;

    /* renamed from: f */
    public final OutputStreamAdapter f58914f;

    /* renamed from: g */
    public final ByteBuffer f58915g;

    /* renamed from: h */
    public final WritableBufferAllocator f58916h;

    /* renamed from: i */
    public final StatsTraceContext f58917i;

    /* renamed from: j */
    public boolean f58918j;

    /* renamed from: k */
    public int f58919k;

    /* renamed from: l */
    public int f58920l;

    /* renamed from: m */
    public long f58921m;

    public class OutputStreamAdapter extends OutputStream {

        /* renamed from: b */
        public final /* synthetic */ MessageFramer f58925b;

        @Override // java.io.OutputStream
        public void write(int i2) {
            write(new byte[]{(byte) i2}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            this.f58925b.m31154g(bArr, i2, i3);
        }
    }

    public interface Sink {
        /* renamed from: t */
        void mo31001t(@Nullable WritableBuffer writableBuffer, boolean z, boolean z2, int i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static int m31150h(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof Drainable) {
            return ((Drainable) inputStream).mo30858a(outputStream);
        }
        int i2 = ByteStreams.f21841a;
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(outputStream);
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
        Preconditions.m11183g(j2 <= ParserMinimalBase.MAX_INT_L, "Message size overflow: %s", j2);
        return (int) j2;
    }

    /* renamed from: a */
    public final void m31151a(boolean z, boolean z2) {
        WritableBuffer writableBuffer = this.f58911c;
        this.f58911c = null;
        this.f58909a.mo31001t(writableBuffer, z, z2, this.f58919k);
        this.f58919k = 0;
    }

    /* renamed from: b */
    public final void m31152b(BufferChainOutputStream bufferChainOutputStream, boolean z) {
        Iterator<WritableBuffer> it = bufferChainOutputStream.f58922b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().mo31211r();
        }
        this.f58915g.clear();
        this.f58915g.put(z ? (byte) 1 : (byte) 0).putInt(i2);
        WritableBuffer mo31212a = this.f58916h.mo31212a(5);
        mo31212a.write(this.f58915g.array(), 0, this.f58915g.position());
        if (i2 == 0) {
            this.f58911c = mo31212a;
            return;
        }
        this.f58909a.mo31001t(mo31212a, false, false, this.f58919k - 1);
        this.f58919k = 1;
        List<WritableBuffer> list = bufferChainOutputStream.f58922b;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.f58909a.mo31001t(list.get(i3), false, false, 0);
        }
        this.f58911c = list.get(list.size() - 1);
        this.f58921m = i2;
    }

    @Override // io.grpc.internal.Framer
    /* renamed from: c */
    public Framer mo31006c(boolean z) {
        this.f58913e = z;
        return this;
    }

    @Override // io.grpc.internal.Framer
    public void close() {
        WritableBuffer writableBuffer;
        if (this.f58918j) {
            return;
        }
        this.f58918j = true;
        WritableBuffer writableBuffer2 = this.f58911c;
        if (writableBuffer2 != null && writableBuffer2.mo31211r() == 0 && (writableBuffer = this.f58911c) != null) {
            writableBuffer.release();
            this.f58911c = null;
        }
        m31151a(true, true);
    }

    /* renamed from: d */
    public final int m31153d(InputStream inputStream) throws IOException {
        BufferChainOutputStream bufferChainOutputStream = new BufferChainOutputStream(null);
        OutputStream mo30826c = this.f58912d.mo30826c(bufferChainOutputStream);
        try {
            int m31150h = m31150h(inputStream, mo30826c);
            mo30826c.close();
            int i2 = this.f58910b;
            if (i2 >= 0 && m31150h > i2) {
                throw new StatusRuntimeException(Status.f58284k.m30947g(String.format("message too large %d > %d", Integer.valueOf(m31150h), Integer.valueOf(this.f58910b))));
            }
            m31152b(bufferChainOutputStream, true);
            return m31150h;
        } catch (Throwable th) {
            mo30826c.close();
            throw th;
        }
    }

    @Override // io.grpc.internal.Framer
    /* renamed from: e */
    public Framer mo31007e(Compressor compressor) {
        this.f58912d = compressor;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[LOOP:0: B:24:0x0072->B:25:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[LOOP:1: B:28:0x0083->B:29:0x0085, LOOP_END] */
    @Override // io.grpc.internal.Framer
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo31008f(java.io.InputStream r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Failed to frame message"
            boolean r1 = r10.f58918j
            if (r1 != 0) goto Lb9
            int r1 = r10.f58919k
            r2 = 1
            int r1 = r1 + r2
            r10.f58919k = r1
            int r1 = r10.f58920l
            int r1 = r1 + r2
            r10.f58920l = r1
            r3 = 0
            r10.f58921m = r3
            io.grpc.internal.StatsTraceContext r3 = r10.f58917i
            r3.m31203f(r1)
            boolean r1 = r10.f58913e
            r3 = 0
            if (r1 == 0) goto L27
            io.grpc.Compressor r1 = r10.f58912d
            io.grpc.Codec r4 = io.grpc.Codec.Identity.f58087a
            if (r1 == r4) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            boolean r4 = r11 instanceof io.grpc.KnownLength     // Catch: java.lang.RuntimeException -> L97 java.io.IOException -> La8
            r5 = -1
            if (r4 != 0) goto L34
            boolean r4 = r11 instanceof java.io.ByteArrayInputStream     // Catch: java.lang.RuntimeException -> L97 java.io.IOException -> La8
            if (r4 == 0) goto L32
            goto L34
        L32:
            r4 = -1
            goto L38
        L34:
            int r4 = r11.available()     // Catch: java.lang.RuntimeException -> L97 java.io.IOException -> La8
        L38:
            if (r4 == 0) goto L41
            if (r1 == 0) goto L41
            int r11 = r10.m31153d(r11)     // Catch: java.lang.RuntimeException -> L97 java.io.IOException -> La8
            goto L45
        L41:
            int r11 = r10.m31155j(r11, r4)     // Catch: java.lang.RuntimeException -> L97 java.io.IOException -> La8
        L45:
            if (r4 == r5) goto L6b
            if (r11 != r4) goto L4a
            goto L6b
        L4a:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r0[r2] = r11
            java.lang.String r11 = "Message length inaccurate %s != %s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            io.grpc.Status r0 = io.grpc.Status.f58286m
            io.grpc.Status r11 = r0.m30947g(r11)
            io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
            r0.<init>(r11)
            throw r0
        L6b:
            io.grpc.internal.StatsTraceContext r0 = r10.f58917i
            long r8 = (long) r11
            io.grpc.StreamTracer[] r11 = r0.f59158a
            int r0 = r11.length
            r1 = 0
        L72:
            if (r1 >= r0) goto L7c
            r2 = r11[r1]
            r2.mo30956g(r8)
            int r1 = r1 + 1
            goto L72
        L7c:
            io.grpc.internal.StatsTraceContext r11 = r10.f58917i
            long r0 = r10.f58921m
            io.grpc.StreamTracer[] r11 = r11.f59158a
            int r2 = r11.length
        L83:
            if (r3 >= r2) goto L8d
            r4 = r11[r3]
            r4.mo30957h(r0)
            int r3 = r3 + 1
            goto L83
        L8d:
            io.grpc.internal.StatsTraceContext r4 = r10.f58917i
            int r5 = r10.f58920l
            long r6 = r10.f58921m
            r4.m31204g(r5, r6, r8)
            return
        L97:
            r11 = move-exception
            io.grpc.Status r1 = io.grpc.Status.f58286m
            io.grpc.Status r0 = r1.m30947g(r0)
            io.grpc.Status r11 = r0.m30946f(r11)
            io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
            r0.<init>(r11)
            throw r0
        La8:
            r11 = move-exception
            io.grpc.Status r1 = io.grpc.Status.f58286m
            io.grpc.Status r0 = r1.m30947g(r0)
            io.grpc.Status r11 = r0.m30946f(r11)
            io.grpc.StatusRuntimeException r0 = new io.grpc.StatusRuntimeException
            r0.<init>(r11)
            throw r0
        Lb9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Framer already closed"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.MessageFramer.mo31008f(java.io.InputStream):void");
    }

    @Override // io.grpc.internal.Framer
    public void flush() {
        WritableBuffer writableBuffer = this.f58911c;
        if (writableBuffer == null || writableBuffer.mo31211r() <= 0) {
            return;
        }
        m31151a(false, true);
    }

    /* renamed from: g */
    public final void m31154g(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            WritableBuffer writableBuffer = this.f58911c;
            if (writableBuffer != null && writableBuffer.mo31209a() == 0) {
                m31151a(false, false);
            }
            if (this.f58911c == null) {
                this.f58911c = this.f58916h.mo31212a(i3);
            }
            int min = Math.min(i3, this.f58911c.mo31209a());
            this.f58911c.write(bArr, i2, min);
            i2 += min;
            i3 -= min;
        }
    }

    @Override // io.grpc.internal.Framer
    /* renamed from: i */
    public void mo31009i(int i2) {
        Preconditions.m11192p(this.f58910b == -1, "max size already set");
        this.f58910b = i2;
    }

    @Override // io.grpc.internal.Framer
    public boolean isClosed() {
        return this.f58918j;
    }

    /* renamed from: j */
    public final int m31155j(InputStream inputStream, int i2) throws IOException {
        if (i2 == -1) {
            BufferChainOutputStream bufferChainOutputStream = new BufferChainOutputStream(null);
            int m31150h = m31150h(inputStream, bufferChainOutputStream);
            int i3 = this.f58910b;
            if (i3 >= 0 && m31150h > i3) {
                throw new StatusRuntimeException(Status.f58284k.m30947g(String.format("message too large %d > %d", Integer.valueOf(m31150h), Integer.valueOf(this.f58910b))));
            }
            m31152b(bufferChainOutputStream, false);
            return m31150h;
        }
        this.f58921m = i2;
        int i4 = this.f58910b;
        if (i4 >= 0 && i2 > i4) {
            throw new StatusRuntimeException(Status.f58284k.m30947g(String.format("message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.f58910b))));
        }
        this.f58915g.clear();
        this.f58915g.put((byte) 0).putInt(i2);
        if (this.f58911c == null) {
            this.f58911c = this.f58916h.mo31212a(this.f58915g.position() + i2);
        }
        m31154g(this.f58915g.array(), 0, this.f58915g.position());
        return m31150h(inputStream, this.f58914f);
    }

    public final class BufferChainOutputStream extends OutputStream {

        /* renamed from: b */
        public final List<WritableBuffer> f58922b = new ArrayList();

        /* renamed from: c */
        public WritableBuffer f58923c;

        public BufferChainOutputStream(C64331 c64331) {
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            WritableBuffer writableBuffer = this.f58923c;
            if (writableBuffer == null || writableBuffer.mo31209a() <= 0) {
                write(new byte[]{(byte) i2}, 0, 1);
            } else {
                this.f58923c.mo31210b((byte) i2);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            if (this.f58923c == null) {
                WritableBuffer mo31212a = MessageFramer.this.f58916h.mo31212a(i3);
                this.f58923c = mo31212a;
                this.f58922b.add(mo31212a);
            }
            while (i3 > 0) {
                int min = Math.min(i3, this.f58923c.mo31209a());
                if (min == 0) {
                    WritableBuffer mo31212a2 = MessageFramer.this.f58916h.mo31212a(Math.max(i3, this.f58923c.mo31211r() * 2));
                    this.f58923c = mo31212a2;
                    this.f58922b.add(mo31212a2);
                } else {
                    this.f58923c.write(bArr, i2, min);
                    i2 += min;
                    i3 -= min;
                }
            }
        }
    }
}
