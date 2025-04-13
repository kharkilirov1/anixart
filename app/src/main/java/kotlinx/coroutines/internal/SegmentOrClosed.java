package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "Lkotlinx/coroutines/internal/Segment;", "S", "", "value", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@JvmInline
/* loaded from: classes3.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    @NotNull
    /* renamed from: a */
    public static final S m34328a(Object obj) {
        if (obj != ConcurrentLinkedListKt.f68241a) {
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SegmentOrClosed)) {
            return false;
        }
        Objects.requireNonNull((SegmentOrClosed) obj);
        return Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "SegmentOrClosed(value=null)";
    }
}
