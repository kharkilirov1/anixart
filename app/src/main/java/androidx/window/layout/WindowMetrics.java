package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: WindowMetrics.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/WindowMetrics;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WindowMetrics {

    /* renamed from: a */
    @NotNull
    public final Bounds f6807a;

    @RestrictTo
    public WindowMetrics(@NotNull Rect rect) {
        this.f6807a = new Bounds(rect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m32174c(WindowMetrics.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.m32174c(this.f6807a, ((WindowMetrics) obj).f6807a);
    }

    public int hashCode() {
        return this.f6807a.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("WindowMetrics { bounds: ");
        Bounds bounds = this.f6807a;
        Objects.requireNonNull(bounds);
        m24u.append(new Rect(bounds.f6680a, bounds.f6681b, bounds.f6682c, bounds.f6683d));
        m24u.append(" }");
        return m24u.toString();
    }
}
