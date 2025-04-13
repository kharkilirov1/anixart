package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", "", "T", "Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ComparableOpenEndRange) {
            throw null;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    @NotNull
    public String toString() {
        return "null..<null";
    }
}
