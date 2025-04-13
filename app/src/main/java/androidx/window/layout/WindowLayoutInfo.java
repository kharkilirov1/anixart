package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowLayoutInfo.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WindowLayoutInfo {

    /* renamed from: a */
    @NotNull
    public final List<DisplayFeature> f6806a;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo
    public WindowLayoutInfo(@NotNull List<? extends DisplayFeature> list) {
        this.f6806a = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m32174c(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.m32174c(this.f6806a, ((WindowLayoutInfo) obj).f6806a);
    }

    public int hashCode() {
        return this.f6806a.hashCode();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m31989B(this.f6806a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
