package kotlin.ranges;

import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/ranges/OpenEndDoubleRange;", "Lkotlin/ranges/OpenEndRange;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class OpenEndDoubleRange implements OpenEndRange<Double> {
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof OpenEndDoubleRange)) {
            return false;
        }
        Objects.requireNonNull((OpenEndDoubleRange) obj);
        return true;
    }

    public int hashCode() {
        return -1;
    }

    @NotNull
    public String toString() {
        return "0.0..<0.0";
    }
}
