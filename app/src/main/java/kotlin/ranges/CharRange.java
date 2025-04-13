package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveRanges.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    static {
        new CharRange((char) 1, (char) 0);
    }

    public CharRange(char c2, char c3) {
        super(c2, c3, 1);
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CharRange) {
            if (!isEmpty() || !((CharRange) obj).isEmpty()) {
                CharRange charRange = (CharRange) obj;
                if (this.f63373b != charRange.f63373b || this.f63374c != charRange.f63374c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f63373b * 31) + this.f63374c;
    }

    @Override // kotlin.ranges.CharProgression
    public boolean isEmpty() {
        return Intrinsics.m32181j(this.f63373b, this.f63374c) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    @NotNull
    public String toString() {
        return this.f63373b + ".." + this.f63374c;
    }
}
