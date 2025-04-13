package okio;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RealBufferedSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealBufferedSource implements BufferedSource {

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Buffer f68789b = new Buffer();

    /* renamed from: c */
    @JvmField
    public boolean f68790c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Source f68791d;

    public RealBufferedSource(@NotNull Source source) {
        this.f68791d = source;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: B0 */
    public ByteString mo34515B0() {
        this.f68789b.mo34569z0(this.f68791d);
        return this.f68789b.mo34515B0();
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: G */
    public ByteString mo34518G(long j2) {
        if (request(j2)) {
            return this.f68789b.mo34518G(j2);
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: M0 */
    public String mo34520M0() {
        return mo34546h0(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: P0 */
    public byte[] mo34523P0(long j2) {
        if (request(j2)) {
            return this.f68789b.mo34523P0(j2);
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: T */
    public byte[] mo34527T() {
        this.f68789b.mo34569z0(this.f68791d);
        return this.f68789b.mo34527T();
    }

    @Override // okio.BufferedSource
    /* renamed from: V */
    public boolean mo34529V() {
        if (!this.f68790c) {
            return this.f68789b.mo34529V() && this.f68791d.read(this.f68789b, (long) RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: X0 */
    public long mo34531X0(@NotNull Sink sink) {
        long j2 = 0;
        while (this.f68791d.read(this.f68789b, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != -1) {
            long m34534b = this.f68789b.m34534b();
            if (m34534b > 0) {
                j2 += m34534b;
                ((Buffer) sink).write(this.f68789b, m34534b);
            }
        }
        Buffer buffer = this.f68789b;
        long j3 = buffer.f68742c;
        if (j3 <= 0) {
            return j2;
        }
        long j4 = j2 + j3;
        ((Buffer) sink).write(buffer, j3);
        return j4;
    }

    /* renamed from: a */
    public long m34612a(byte b, long j2, long j3) {
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long m34542g = this.f68789b.m34542g(b, j2, j3);
            if (m34542g != -1) {
                return m34542g;
            }
            Buffer buffer = this.f68789b;
            long j4 = buffer.f68742c;
            if (j4 >= j3 || this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j4);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    /* renamed from: c0 */
    public void mo34536c0(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        try {
            if (!request(j2)) {
                throw new EOFException();
            }
            this.f68789b.mo34536c0(sink, j2);
        } catch (EOFException e2) {
            sink.mo34569z0(this.f68789b);
            throw e2;
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: c1 */
    public void mo34537c1(long j2) {
        if (!request(j2)) {
            throw new EOFException();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f68790c) {
            return;
        }
        this.f68790c = true;
        this.f68791d.close();
        Buffer buffer = this.f68789b;
        buffer.skip(buffer.f68742c);
    }

    @Override // okio.BufferedSource
    /* renamed from: e0 */
    public long mo34540e0(@NotNull ByteString targetBytes) {
        Intrinsics.m32179h(targetBytes, "targetBytes");
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = 0;
        while (true) {
            long m34547i = this.f68789b.m34547i(targetBytes, j2);
            if (m34547i != -1) {
                return m34547i;
            }
            Buffer buffer = this.f68789b;
            long j3 = buffer.f68742c;
            if (this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        kotlin.text.CharsKt.m33863b(16);
        kotlin.text.CharsKt.m33863b(16);
        r2 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.Intrinsics.m32178g(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.BufferedSource
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo34543g0() {
        /*
            r10 = this;
            r0 = 1
            r10.mo34537c1(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L57
            okio.Buffer r8 = r10.f68789b
            byte r8 = r8.m34539e(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2c
            r4 = 45
            byte r4 = (byte) r4
            if (r8 == r4) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r9 == 0) goto L2f
            goto L57
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            kotlin.text.CharsKt.m33863b(r2)
            kotlin.text.CharsKt.m33863b(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            okio.Buffer r0 = r10.f68789b
            long r0 = r0.mo34543g0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.mo34543g0():long");
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: h0 */
    public String mo34546h0(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("limit < 0: ", j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b = (byte) 10;
        long m34612a = m34612a(b, 0L, j3);
        if (m34612a != -1) {
            return BufferKt.m34624b(this.f68789b, m34612a);
        }
        if (j3 < Long.MAX_VALUE && request(j3) && this.f68789b.m34539e(j3 - 1) == ((byte) 13) && request(1 + j3) && this.f68789b.m34539e(j3) == b) {
            return BufferKt.m34624b(this.f68789b, j3);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.f68789b;
        buffer2.m34535c(buffer, 0L, Math.min(32, buffer2.f68742c));
        StringBuilder m24u = C0000a.m24u("\\n not found: limit=");
        m24u.append(Math.min(this.f68789b.f68742c, j2));
        m24u.append(" content=");
        m24u.append(buffer.mo34515B0().mo34577e());
        m24u.append("…");
        throw new EOFException(m24u.toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f68790c;
    }

    @Override // okio.BufferedSource
    /* renamed from: k1 */
    public long mo34551k1() {
        byte m34539e;
        mo34537c1(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!request(i3)) {
                break;
            }
            m34539e = this.f68789b.m34539e(i2);
            if ((m34539e < ((byte) 48) || m34539e > ((byte) 57)) && ((m34539e < ((byte) 97) || m34539e > ((byte) C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu)) && (m34539e < ((byte) 65) || m34539e > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            CharsKt.m33863b(16);
            CharsKt.m33863b(16);
            String num = Integer.toString(m34539e, 16);
            Intrinsics.m32178g(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return this.f68789b.mo34551k1();
    }

    @Override // okio.BufferedSource
    /* renamed from: m1 */
    public int mo34554m1(@NotNull Options options) {
        Intrinsics.m32179h(options, "options");
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int m34625c = BufferKt.m34625c(this.f68789b, options, true);
            if (m34625c != -2) {
                if (m34625c != -1) {
                    this.f68789b.skip(options.f68775c[m34625c].mo34576d());
                    return m34625c;
                }
            } else if (this.f68791d.read(this.f68789b, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.m34602d(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    /* renamed from: r0 */
    public boolean mo34561r0(long j2, @NotNull ByteString bytes) {
        int i2;
        Intrinsics.m32179h(bytes, "bytes");
        int mo34576d = bytes.mo34576d();
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 >= 0 && mo34576d >= 0 && bytes.mo34576d() - 0 >= mo34576d) {
            while (i2 < mo34576d) {
                long j3 = i2 + j2;
                i2 = (request(1 + j3) && this.f68789b.m34539e(j3) == bytes.mo34579h(0 + i2)) ? i2 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        Buffer buffer = this.f68789b;
        if (buffer.f68742c == 0 && this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
            return -1L;
        }
        return this.f68789b.read(sink, Math.min(j2, this.f68789b.f68742c));
    }

    @Override // okio.BufferedSource
    public byte readByte() {
        mo34537c1(1L);
        return this.f68789b.readByte();
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] bArr) {
        try {
            mo34537c1(bArr.length);
            this.f68789b.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                Buffer buffer = this.f68789b;
                long j2 = buffer.f68742c;
                if (j2 <= 0) {
                    throw e2;
                }
                int read = buffer.read(bArr, i2, (int) j2);
                if (read == -1) {
                    throw new AssertionError();
                }
                i2 += read;
            }
        }
    }

    @Override // okio.BufferedSource
    public int readInt() {
        mo34537c1(4L);
        return this.f68789b.readInt();
    }

    @Override // okio.BufferedSource
    public long readLong() {
        mo34537c1(8L);
        return this.f68789b.readLong();
    }

    @Override // okio.BufferedSource
    public short readShort() {
        mo34537c1(2L);
        return this.f68789b.readShort();
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        Buffer buffer;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            buffer = this.f68789b;
            if (buffer.f68742c >= j2) {
                return true;
            }
        } while (this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != -1);
        return false;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* renamed from: s, reason: from getter */
    public Buffer getF68789b() {
        return this.f68789b;
    }

    @Override // okio.BufferedSource
    public void skip(long j2) {
        if (!(!this.f68790c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            Buffer buffer = this.f68789b;
            if (buffer.f68742c == 0 && this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j2, this.f68789b.f68742c);
            this.f68789b.skip(min);
            j2 -= min;
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: t0 */
    public String mo34564t0(@NotNull Charset charset) {
        Intrinsics.m32179h(charset, "charset");
        this.f68789b.mo34569z0(this.f68791d);
        return this.f68789b.mo34564t0(charset);
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.f68791d.getTimeout();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("buffer(");
        m24u.append(this.f68791d);
        m24u.append(')');
        return m24u.toString();
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: x */
    public InputStream mo34568x() {
        return new InputStream() { // from class: okio.RealBufferedSource$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.f68790c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.f68789b.f68742c, Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.f68790c) {
                    throw new IOException("closed");
                }
                Buffer buffer = realBufferedSource.f68789b;
                if (buffer.f68742c == 0 && realBufferedSource.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                    return -1;
                }
                return RealBufferedSource.this.f68789b.readByte() & 255;
            }

            @NotNull
            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] data, int i2, int i3) {
                Intrinsics.m32179h(data, "data");
                if (!RealBufferedSource.this.f68790c) {
                    Util.m34510b(data.length, i2, i3);
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    Buffer buffer = realBufferedSource.f68789b;
                    if (buffer.f68742c == 0 && realBufferedSource.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
                        return -1;
                    }
                    return RealBufferedSource.this.f68789b.read(data, i2, i3);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.m32179h(sink, "sink");
        Buffer buffer = this.f68789b;
        if (buffer.f68742c == 0 && this.f68791d.read(buffer, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) == -1) {
            return -1;
        }
        return this.f68789b.read(sink);
    }
}
