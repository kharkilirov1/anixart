package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SplitInfo.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/SplitInfo;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SplitInfo {

    /* renamed from: a */
    @NotNull
    public final ActivityStack f6722a;

    /* renamed from: b, reason: from toString */
    @NotNull
    public final ActivityStack secondaryActivityStack;

    /* renamed from: c */
    public final float f6724c;

    public SplitInfo(@NotNull ActivityStack activityStack, @NotNull ActivityStack activityStack2, float f2) {
        this.f6722a = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.f6724c = f2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (Intrinsics.m32174c(this.f6722a, splitInfo.f6722a) && Intrinsics.m32174c(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return (this.f6724c > splitInfo.f6724c ? 1 : (this.f6724c == splitInfo.f6724c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f6724c) + ((this.secondaryActivityStack.hashCode() + (this.f6722a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SplitInfo:{");
        StringBuilder m24u2 = C0000a.m24u("primaryActivityStack=");
        m24u2.append(this.f6722a);
        m24u2.append(',');
        m24u.append(m24u2.toString());
        m24u.append("secondaryActivityStack=" + this.secondaryActivityStack + ',');
        m24u.append("splitRatio=" + this.f6724c + '}');
        String sb = m24u.toString();
        Intrinsics.m32178g(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
