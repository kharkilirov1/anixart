package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashingSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Companion", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HashingSource extends ForwardingSource {

    /* compiled from: HashingSource.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/HashingSource$Companion;", "", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long j2) throws IOException {
        Intrinsics.m32179h(sink, "sink");
        long read = super.read(sink, j2);
        if (read != -1) {
            long j3 = sink.f68742c;
            long j4 = j3 - read;
            Segment segment = sink.f68741b;
            Intrinsics.m32176e(segment);
            while (j3 > j4) {
                segment = segment.f68799g;
                Intrinsics.m32176e(segment);
                j3 -= segment.f68795c - segment.f68794b;
            }
            if (j3 < sink.f68742c) {
                Intrinsics.m32176e(null);
                throw null;
            }
        }
        return read;
    }
}
