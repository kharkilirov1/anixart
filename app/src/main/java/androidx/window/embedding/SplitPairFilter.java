package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplitPairFilter.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SplitPairFilter {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        Objects.requireNonNull(splitPairFilter);
        if (!Intrinsics.m32174c(null, null)) {
            return false;
        }
        Objects.requireNonNull(splitPairFilter);
        if (!Intrinsics.m32174c(null, null)) {
            return false;
        }
        Objects.requireNonNull(splitPairFilter);
        return Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        throw null;
    }

    @NotNull
    public String toString() {
        return "SplitPairFilter{primaryActivityName=null, secondaryActivityName=null, secondaryActivityAction=null}";
    }
}
