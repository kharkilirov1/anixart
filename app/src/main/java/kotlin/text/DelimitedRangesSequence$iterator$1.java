package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: Strings.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class DelimitedRangesSequence$iterator$1 implements Iterator<IntRange>, KMappedMarker {

    /* renamed from: b */
    public int f66862b = -1;

    /* renamed from: c */
    public int f66863c;

    /* renamed from: d */
    public int f66864d;

    /* renamed from: e */
    @Nullable
    public IntRange f66865e;

    /* renamed from: f */
    public int f66866f;

    /* renamed from: g */
    public final /* synthetic */ DelimitedRangesSequence f66867g;

    public DelimitedRangesSequence$iterator$1(DelimitedRangesSequence delimitedRangesSequence) {
        this.f66867g = delimitedRangesSequence;
        int m32239f = RangesKt.m32239f(delimitedRangesSequence.f66859b, 0, delimitedRangesSequence.f66858a.length());
        this.f66863c = m32239f;
        this.f66864d = m32239f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6 < r3) goto L9;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m33866a() {
        /*
            r7 = this;
            int r0 = r7.f66864d
            r1 = 0
            if (r0 >= 0) goto Lc
            r7.f66862b = r1
            r0 = 0
            r7.f66865e = r0
            goto L82
        Lc:
            kotlin.text.DelimitedRangesSequence r2 = r7.f66867g
            int r3 = r2.f66860c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1b
            int r6 = r7.f66866f
            int r6 = r6 + r5
            r7.f66866f = r6
            if (r6 >= r3) goto L23
        L1b:
            java.lang.CharSequence r2 = r2.f66858a
            int r2 = r2.length()
            if (r0 <= r2) goto L37
        L23:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f66863c
            kotlin.text.DelimitedRangesSequence r2 = r7.f66867g
            java.lang.CharSequence r2 = r2.f66858a
            int r2 = kotlin.text.StringsKt.m33876B(r2)
            r0.<init>(r1, r2)
            r7.f66865e = r0
            r7.f66864d = r4
            goto L80
        L37:
            kotlin.text.DelimitedRangesSequence r0 = r7.f66867g
            kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r0.f66861d
            java.lang.CharSequence r0 = r0.f66858a
            int r3 = r7.f66864d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.invoke(r0, r3)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L5f
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f66863c
            kotlin.text.DelimitedRangesSequence r2 = r7.f66867g
            java.lang.CharSequence r2 = r2.f66858a
            int r2 = kotlin.text.StringsKt.m33876B(r2)
            r0.<init>(r1, r2)
            r7.f66865e = r0
            r7.f66864d = r4
            goto L80
        L5f:
            A r2 = r0.f63055b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            B r0 = r0.f63056c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f66863c
            kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.m32243j(r3, r2)
            r7.f66865e = r3
            int r2 = r2 + r0
            r7.f66863c = r2
            if (r0 != 0) goto L7d
            r1 = 1
        L7d:
            int r2 = r2 + r1
            r7.f66864d = r2
        L80:
            r7.f66862b = r5
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence$iterator$1.m33866a():void");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f66862b == -1) {
            m33866a();
        }
        return this.f66862b == 1;
    }

    @Override // java.util.Iterator
    public IntRange next() {
        if (this.f66862b == -1) {
            m33866a();
        }
        if (this.f66862b == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f66865e;
        Intrinsics.m32177f(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f66865e = null;
        this.f66862b = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
