package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveRanges.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {

    /* renamed from: e */
    @NotNull
    public static final Companion f63387e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final IntRange f63388f = new IntRange(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public IntRange(int i2, int i3) {
        super(i2, i3, 1);
    }

    /* renamed from: d */
    public boolean m32232d(int i2) {
        return this.f63380b <= i2 && i2 <= this.f63381c;
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (this.f63380b != intRange.f63380b || this.f63381c != intRange.f63381c) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public Integer m32233f() {
        return Integer.valueOf(this.f63380b);
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f63380b * 31) + this.f63381c;
    }

    @Override // kotlin.ranges.IntProgression
    public boolean isEmpty() {
        return this.f63380b > this.f63381c;
    }

    @Override // kotlin.ranges.IntProgression
    @NotNull
    public String toString() {
        return this.f63380b + ".." + this.f63381c;
    }
}
