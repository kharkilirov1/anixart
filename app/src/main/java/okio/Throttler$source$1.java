package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Throttler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"okio/Throttler$source$1", "Lokio/ForwardingSource;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Throttler$source$1 extends ForwardingSource {
    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        throw null;
    }
}
