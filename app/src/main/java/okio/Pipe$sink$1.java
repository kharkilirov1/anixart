package okio;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pipe.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Pipe$sink$1", "Lokio/Sink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Pipe$sink$1 implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // okio.Sink
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68778c() {
        return null;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) {
        Intrinsics.m32179h(source, "source");
        Objects.requireNonNull(null);
        throw null;
    }
}
