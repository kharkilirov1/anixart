package okio;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pipe.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Pipe$source$1", "Lokio/Source;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Pipe$source$1 implements Source {
    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68772c() {
        return null;
    }
}
