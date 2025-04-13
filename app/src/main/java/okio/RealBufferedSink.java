package okio;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RealBufferedSink.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/RealBufferedSink;", "Lokio/BufferedSink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealBufferedSink implements BufferedSink {

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Buffer f68785b = new Buffer();

    /* renamed from: c */
    @JvmField
    public boolean f68786c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Sink f68787d;

    public RealBufferedSink(@NotNull Sink sink) {
        this.f68787d = sink;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: A0 */
    public BufferedSink mo34514A0(long j2) {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.mo34514A0(j2);
        return mo34541f0();
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: F, reason: from getter */
    public Buffer getF68785b() {
        return this.f68785b;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: J */
    public BufferedSink mo34519J() {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        Buffer buffer = this.f68785b;
        long j2 = buffer.f68742c;
        if (j2 > 0) {
            this.f68787d.write(buffer, j2);
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: T0 */
    public BufferedSink mo34528T0(@NotNull ByteString byteString) {
        Intrinsics.m32179h(byteString, "byteString");
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.m34566v(byteString);
        mo34541f0();
        return this;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f68786c) {
            return;
        }
        Throwable th = null;
        try {
            Buffer buffer = this.f68785b;
            long j2 = buffer.f68742c;
            if (j2 > 0) {
                this.f68787d.write(buffer, j2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f68787d.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f68786c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: f0 */
    public BufferedSink mo34541f0() {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        long m34534b = this.f68785b.m34534b();
        if (m34534b > 0) {
            this.f68787d.write(this.f68785b, m34534b);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        Buffer buffer = this.f68785b;
        long j2 = buffer.f68742c;
        if (j2 > 0) {
            this.f68787d.write(buffer, j2);
        }
        this.f68787d.flush();
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: g1 */
    public BufferedSink mo34544g1(long j2) {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.mo34544g1(j2);
        mo34541f0();
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: i1 */
    public OutputStream mo34548i1() {
        return new OutputStream() { // from class: okio.RealBufferedSink$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.f68786c) {
                    return;
                }
                realBufferedSink.flush();
            }

            @NotNull
            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.f68786c) {
                    throw new IOException("closed");
                }
                realBufferedSink.f68785b.m34524Q((byte) i2);
                RealBufferedSink.this.mo34541f0();
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int i2, int i3) {
                Intrinsics.m32179h(data, "data");
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.f68786c) {
                    realBufferedSink.f68785b.m34521N(data, i2, i3);
                    RealBufferedSink.this.mo34541f0();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f68786c;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: p0 */
    public BufferedSink mo34559p0(@NotNull String string) {
        Intrinsics.m32179h(string, "string");
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.m34516D0(string);
        return mo34541f0();
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: s */
    public Buffer getF68789b() {
        return this.f68785b;
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68778c() {
        return this.f68787d.getF68778c();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("buffer(");
        m24u.append(this.f68787d);
        m24u.append(')');
        return m24u.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) {
        Intrinsics.m32179h(source, "source");
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f68785b.write(source);
        mo34541f0();
        return write;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeByte(int i2) {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.m34524Q(i2);
        mo34541f0();
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeInt(int i2) {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.m34532Z(i2);
        return mo34541f0();
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink writeShort(int i2) {
        if (!(!this.f68786c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f68785b.m34556n0(i2);
        mo34541f0();
        return this;
    }

    @Override // okio.BufferedSink
    /* renamed from: z0 */
    public long mo34569z0(@NotNull Source source) {
        Intrinsics.m32179h(source, "source");
        long j2 = 0;
        while (true) {
            long read = source.read(this.f68785b, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            if (read == -1) {
                return j2;
            }
            j2 += read;
            mo34541f0();
        }
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) {
        Intrinsics.m32179h(source, "source");
        if (!this.f68786c) {
            this.f68785b.write(source, j2);
            mo34541f0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] source) {
        Intrinsics.m32179h(source, "source");
        if (!this.f68786c) {
            this.f68785b.m34567w(source);
            mo34541f0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull byte[] source, int i2, int i3) {
        Intrinsics.m32179h(source, "source");
        if (!this.f68786c) {
            this.f68785b.m34521N(source, i2, i3);
            mo34541f0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
