package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveRanges.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    static {
        new LongRange(1L, 0L);
    }

    public LongRange(long j2, long j3) {
        super(j2, j3, 1L);
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LongRange) {
            if (!isEmpty() || !((LongRange) obj).isEmpty()) {
                LongRange longRange = (LongRange) obj;
                if (this.f63389b != longRange.f63389b || this.f63390c != longRange.f63390c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.f63389b;
        long j3 = 31 * (j2 ^ (j2 >>> 32));
        long j4 = this.f63390c;
        return (int) (j3 + (j4 ^ (j4 >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression
    public boolean isEmpty() {
        return this.f63389b > this.f63390c;
    }

    @Override // kotlin.ranges.LongProgression
    @NotNull
    public String toString() {
        return this.f63389b + ".." + this.f63390c;
    }
}
