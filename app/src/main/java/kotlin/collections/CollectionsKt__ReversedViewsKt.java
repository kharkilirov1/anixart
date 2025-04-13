package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import p000a.C0000a;

/* compiled from: ReversedViews.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    /* renamed from: b */
    public static final int m32051b(List list, int i2) {
        if (new IntRange(0, CollectionsKt.m32047x(list)).m32232d(i2)) {
            return CollectionsKt.m32047x(list) - i2;
        }
        StringBuilder m25v = C0000a.m25v("Element index ", i2, " must be in range [");
        m25v.append(new IntRange(0, CollectionsKt.m32047x(list)));
        m25v.append("].");
        throw new IndexOutOfBoundsException(m25v.toString());
    }
}
