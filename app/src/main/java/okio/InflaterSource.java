package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: InflaterSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class InflaterSource implements Source {

    /* renamed from: b */
    public int f68767b;

    /* renamed from: c */
    public boolean f68768c;

    /* renamed from: d */
    public final BufferedSource f68769d;

    /* renamed from: e */
    public final Inflater f68770e;

    public InflaterSource(@NotNull BufferedSource bufferedSource, @NotNull Inflater inflater) {
        this.f68769d = bufferedSource;
        this.f68770e = inflater;
    }

    /* renamed from: a */
    public final long m34597a(@NotNull Buffer buffer, long j2) throws IOException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        if (!(!this.f68768c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            Segment m34565u = buffer.m34565u(1);
            int min = (int) Math.min(j2, 8192 - m34565u.f68795c);
            m34598b();
            int inflate = this.f68770e.inflate(m34565u.f68793a, m34565u.f68795c, min);
            int i2 = this.f68767b;
            if (i2 != 0) {
                int remaining = i2 - this.f68770e.getRemaining();
                this.f68767b -= remaining;
                this.f68769d.skip(remaining);
            }
            if (inflate > 0) {
                m34565u.f68795c += inflate;
                long j3 = inflate;
                buffer.f68742c += j3;
                return j3;
            }
            if (m34565u.f68794b == m34565u.f68795c) {
                buffer.f68741b = m34565u.m34613a();
                SegmentPool.m34617b(m34565u);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: b */
    public final boolean m34598b() throws IOException {
        if (!this.f68770e.needsInput()) {
            return false;
        }
        if (this.f68769d.mo34529V()) {
            return true;
        }
        Segment segment = this.f68769d.getF68789b().f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68795c;
        int i3 = segment.f68794b;
        int i4 = i2 - i3;
        this.f68767b = i4;
        this.f68770e.setInput(segment.f68793a, i3, i4);
        return false;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f68768c) {
            return;
        }
        this.f68770e.end();
        this.f68768c = true;
        this.f68769d.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) throws IOException {
        Intrinsics.m32179h(sink, "sink");
        do {
            long m34597a = m34597a(sink, j2);
            if (m34597a > 0) {
                return m34597a;
            }
            if (this.f68770e.finished() || this.f68770e.needsDictionary()) {
                return -1L;
            }
        } while (!this.f68769d.mo34529V());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68772c() {
        return this.f68769d.getF68772c();
    }

    public InflaterSource(@NotNull Source source, @NotNull Inflater inflater) {
        this.f68769d = Okio.m34602d(source);
        this.f68770e = inflater;
    }
}
