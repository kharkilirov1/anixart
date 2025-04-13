package okio;

import com.yandex.div2.C3033a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: GzipSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/GzipSource;", "Lokio/Source;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class GzipSource implements Source {

    /* renamed from: b */
    public byte f68762b;

    /* renamed from: c */
    public final RealBufferedSource f68763c;

    /* renamed from: d */
    public final Inflater f68764d;

    /* renamed from: e */
    public final InflaterSource f68765e;

    /* renamed from: f */
    public final CRC32 f68766f;

    public GzipSource(@NotNull Source source) {
        Intrinsics.m32179h(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f68763c = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f68764d = inflater;
        this.f68765e = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.f68766f = new CRC32();
    }

    /* renamed from: a */
    public final void m34595a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(C3033a.m17745g(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3, "%s: actual 0x%08x != expected 0x%08x", "java.lang.String.format(this, *args)"));
        }
    }

    /* renamed from: b */
    public final void m34596b(Buffer buffer, long j2, long j3) {
        Segment segment = buffer.f68741b;
        Intrinsics.m32176e(segment);
        while (true) {
            int i2 = segment.f68795c;
            int i3 = segment.f68794b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
        }
        while (j3 > 0) {
            int min = (int) Math.min(segment.f68795c - r7, j3);
            this.f68766f.update(segment.f68793a, (int) (segment.f68794b + j2), min);
            j3 -= min;
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
            j2 = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f68765e.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) throws IOException {
        long j3;
        Intrinsics.m32179h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f68762b == 0) {
            this.f68763c.mo34537c1(10L);
            byte m34539e = this.f68763c.f68789b.m34539e(3L);
            boolean z = ((m34539e >> 1) & 1) == 1;
            if (z) {
                m34596b(this.f68763c.f68789b, 0L, 10L);
            }
            m34595a("ID1ID2", 8075, this.f68763c.readShort());
            this.f68763c.skip(8L);
            if (((m34539e >> 2) & 1) == 1) {
                this.f68763c.mo34537c1(2L);
                if (z) {
                    m34596b(this.f68763c.f68789b, 0L, 2L);
                }
                long m34550k = this.f68763c.f68789b.m34550k();
                this.f68763c.mo34537c1(m34550k);
                if (z) {
                    j3 = m34550k;
                    m34596b(this.f68763c.f68789b, 0L, m34550k);
                } else {
                    j3 = m34550k;
                }
                this.f68763c.skip(j3);
            }
            if (((m34539e >> 3) & 1) == 1) {
                long m34612a = this.f68763c.m34612a((byte) 0, 0L, Long.MAX_VALUE);
                if (m34612a == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m34596b(this.f68763c.f68789b, 0L, m34612a + 1);
                }
                this.f68763c.skip(m34612a + 1);
            }
            if (((m34539e >> 4) & 1) == 1) {
                long m34612a2 = this.f68763c.m34612a((byte) 0, 0L, Long.MAX_VALUE);
                if (m34612a2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m34596b(this.f68763c.f68789b, 0L, m34612a2 + 1);
                }
                this.f68763c.skip(m34612a2 + 1);
            }
            if (z) {
                RealBufferedSource realBufferedSource = this.f68763c;
                realBufferedSource.mo34537c1(2L);
                m34595a("FHCRC", realBufferedSource.f68789b.m34550k(), (short) this.f68766f.getValue());
                this.f68766f.reset();
            }
            this.f68762b = (byte) 1;
        }
        if (this.f68762b == 1) {
            long j4 = sink.f68742c;
            long read = this.f68765e.read(sink, j2);
            if (read != -1) {
                m34596b(sink, j4, read);
                return read;
            }
            this.f68762b = (byte) 2;
        }
        if (this.f68762b == 2) {
            RealBufferedSource realBufferedSource2 = this.f68763c;
            realBufferedSource2.mo34537c1(4L);
            m34595a("CRC", Util.m34511c(realBufferedSource2.f68789b.readInt()), (int) this.f68766f.getValue());
            RealBufferedSource realBufferedSource3 = this.f68763c;
            realBufferedSource3.mo34537c1(4L);
            m34595a("ISIZE", Util.m34511c(realBufferedSource3.f68789b.readInt()), (int) this.f68764d.getBytesWritten());
            this.f68762b = (byte) 3;
            if (!this.f68763c.mo34529V()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.f68763c.getTimeout();
    }
}
