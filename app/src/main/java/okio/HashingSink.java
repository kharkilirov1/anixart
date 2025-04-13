package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashingSink.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Companion", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HashingSink extends ForwardingSink {

    /* compiled from: HashingSink.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/HashingSink$Companion;", "", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j2) throws IOException {
        Intrinsics.m32179h(source, "source");
        Util.m34510b(source.f68742c, 0L, j2);
        Intrinsics.m32176e(source.f68741b);
        if (0 >= j2) {
            super.write(source, j2);
        } else {
            Math.min(j2 - 0, r2.f68795c - r2.f68794b);
            Intrinsics.m32176e(null);
            throw null;
        }
    }
}
