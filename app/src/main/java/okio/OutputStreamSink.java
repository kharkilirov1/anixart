package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: JvmOkio.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class OutputStreamSink implements Sink {

    /* renamed from: b */
    public final OutputStream f68777b;

    /* renamed from: c */
    public final Timeout f68778c;

    public OutputStreamSink(@NotNull OutputStream outputStream, @NotNull Timeout timeout) {
        this.f68777b = outputStream;
        this.f68778c = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68777b.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f68777b.flush();
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout, reason: from getter */
    public Timeout getF68778c() {
        return this.f68778c;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("sink(");
        m24u.append(this.f68777b);
        m24u.append(')');
        return m24u.toString();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) {
        Intrinsics.m32179h(source, "source");
        Util.m34510b(source.f68742c, 0L, j2);
        while (j2 > 0) {
            this.f68778c.throwIfReached();
            Segment segment = source.f68741b;
            Intrinsics.m32176e(segment);
            int min = (int) Math.min(j2, segment.f68795c - segment.f68794b);
            this.f68777b.write(segment.f68793a, segment.f68794b, min);
            int i2 = segment.f68794b + min;
            segment.f68794b = i2;
            long j3 = min;
            j2 -= j3;
            source.f68742c -= j3;
            if (i2 == segment.f68795c) {
                source.f68741b = segment.m34613a();
                SegmentPool.m34617b(segment);
            }
        }
    }
}
