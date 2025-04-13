package androidx.window.embedding;

import android.graphics.Rect;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplitRule.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "Api30Impl", "LayoutDir", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public class SplitRule extends EmbeddingRule {

    /* renamed from: a */
    public final int f6725a = 0;

    /* renamed from: b */
    public final int f6726b = 0;

    /* renamed from: c */
    public final float f6727c = 0.5f;

    /* renamed from: d */
    public final int f6728d = 3;

    /* compiled from: SplitRule.kt */
    @RequiresApi
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, m31884d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "a", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Api30Impl {
        @DoNotInline
        @NotNull
        /* renamed from: a */
        public final Rect m4430a(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.m32179h(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.m32178g(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* compiled from: SplitRule.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/SplitRule$LayoutDir;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0}, m31888xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface LayoutDir {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.f6725a == splitRule.f6725a && this.f6726b == splitRule.f6726b) {
            return ((this.f6727c > splitRule.f6727c ? 1 : (this.f6727c == splitRule.f6727c ? 0 : -1)) == 0) && this.f6728d == splitRule.f6728d;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f6727c) + (((this.f6725a * 31) + this.f6726b) * 31)) * 31) + this.f6728d;
    }
}
