package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: GzipSink.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class GzipSink implements Sink {

    /* renamed from: b */
    public boolean f68761b;

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        throw null;
     */
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.f68761b
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L7
        L7:
            r1 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9
        L9:
            throw r0     // Catch: java.lang.Throwable -> La
        La:
            r0 = 1
            r2.f68761b = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.GzipSink.close():void");
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        throw null;
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68778c() {
        throw null;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) throws IOException {
        Intrinsics.m32179h(source, "source");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        if (j2 == 0) {
            return;
        }
        Intrinsics.m32176e(source.f68741b);
        if (j2 <= 0) {
            throw null;
        }
        Math.min(j2, r4.f68795c - r4.f68794b);
        throw null;
    }
}
