package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: DeflaterSink.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DeflaterSink implements Sink {

    /* renamed from: b */
    public boolean f68757b;

    /* renamed from: c */
    public final BufferedSink f68758c;

    /* renamed from: d */
    public final Deflater f68759d;

    public DeflaterSink(@NotNull Sink sink, @NotNull Deflater deflater) {
        this.f68758c = Okio.m34601c(sink);
        this.f68759d = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void m34593a(boolean z) {
        Segment m34565u;
        int deflate;
        Buffer f68789b = this.f68758c.getF68789b();
        while (true) {
            m34565u = f68789b.m34565u(1);
            if (z) {
                Deflater deflater = this.f68759d;
                byte[] bArr = m34565u.f68793a;
                int i2 = m34565u.f68795c;
                deflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f68759d;
                byte[] bArr2 = m34565u.f68793a;
                int i3 = m34565u.f68795c;
                deflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (deflate > 0) {
                m34565u.f68795c += deflate;
                f68789b.f68742c += deflate;
                this.f68758c.mo34541f0();
            } else if (this.f68759d.needsInput()) {
                break;
            }
        }
        if (m34565u.f68794b == m34565u.f68795c) {
            f68789b.f68741b = m34565u.m34613a();
            SegmentPool.m34617b(m34565u);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f68757b) {
            return;
        }
        Throwable th = null;
        try {
            this.f68759d.finish();
            m34593a(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f68759d.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f68758c.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f68757b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        m34593a(true);
        this.f68758c.flush();
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68778c() {
        return this.f68758c.getF68778c();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DeflaterSink(");
        m24u.append(this.f68758c);
        m24u.append(')');
        return m24u.toString();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) throws IOException {
        Intrinsics.m32179h(source, "source");
        Util.m34510b(source.f68742c, 0L, j2);
        while (j2 > 0) {
            Segment segment = source.f68741b;
            Intrinsics.m32176e(segment);
            int min = (int) Math.min(j2, segment.f68795c - segment.f68794b);
            this.f68759d.setInput(segment.f68793a, segment.f68794b, min);
            m34593a(false);
            long j3 = min;
            source.f68742c -= j3;
            int i2 = segment.f68794b + min;
            segment.f68794b = i2;
            if (i2 == segment.f68795c) {
                source.f68741b = segment.m34613a();
                SegmentPool.m34617b(segment);
            }
            j2 -= j3;
        }
    }
}
