package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: JvmOkio.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class InputStreamSource implements Source {

    /* renamed from: b */
    public final InputStream f68771b;

    /* renamed from: c */
    public final Timeout f68772c;

    public InputStreamSource(@NotNull InputStream inputStream, @NotNull Timeout timeout) {
        this.f68771b = inputStream;
        this.f68772c = timeout;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68771b.close();
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        try {
            this.f68772c.throwIfReached();
            Segment m34565u = sink.m34565u(1);
            int read = this.f68771b.read(m34565u.f68793a, m34565u.f68795c, (int) Math.min(j2, 8192 - m34565u.f68795c));
            if (read != -1) {
                m34565u.f68795c += read;
                long j3 = read;
                sink.f68742c += j3;
                return j3;
            }
            if (m34565u.f68794b != m34565u.f68795c) {
                return -1L;
            }
            sink.f68741b = m34565u.m34613a();
            SegmentPool.m34617b(m34565u);
            return -1L;
        } catch (AssertionError e2) {
            if (Okio.m34603e(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout, reason: from getter */
    public Timeout getF68772c() {
        return this.f68772c;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("source(");
        m24u.append(this.f68771b);
        m24u.append(')');
        return m24u.toString();
    }
}
