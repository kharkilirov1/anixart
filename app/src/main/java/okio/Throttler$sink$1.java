package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Throttler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Throttler$sink$1", "Lokio/ForwardingSink;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Throttler$sink$1 extends ForwardingSink {
    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j2) throws IOException {
        Intrinsics.m32179h(source, "source");
        if (j2 > 0) {
            throw null;
        }
    }
}
