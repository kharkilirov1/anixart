package com.stfalcon.imageviewer.common.extensions;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: View.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"imageviewer_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ViewKt {
    /* renamed from: a */
    public static final void m14019a(@NotNull View animateAlpha, @Nullable Float f2, @Nullable Float f3, long j2) {
        Intrinsics.m32180i(animateAlpha, "$this$animateAlpha");
        animateAlpha.setAlpha(f2 != null ? f2.floatValue() : 0.0f);
        animateAlpha.clearAnimation();
        animateAlpha.animate().alpha(f3 != null ? f3.floatValue() : 0.0f).setDuration(j2).start();
    }

    /* renamed from: b */
    public static final void m14020b(@NotNull View applyMargin, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.m32180i(applyMargin, "$this$applyMargin");
        if (applyMargin.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = applyMargin.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : marginLayoutParams.getMarginStart());
            marginLayoutParams.topMargin = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
            marginLayoutParams.setMarginEnd(num3 != null ? num3.intValue() : marginLayoutParams.getMarginEnd());
            marginLayoutParams.bottomMargin = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
            applyMargin.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: c */
    public static final boolean m14021c(@Nullable View view) {
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            view.getLocalVisibleRect(new Rect());
            if (!Intrinsics.m32174c(r1, r2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final void m14022d(@NotNull View makeGone) {
        Intrinsics.m32180i(makeGone, "$this$makeGone");
        makeGone.setVisibility(8);
    }

    /* renamed from: e */
    public static final void m14023e(@NotNull View makeVisible) {
        Intrinsics.m32180i(makeVisible, "$this$makeVisible");
        makeVisible.setVisibility(0);
    }

    /* renamed from: f */
    public static final void m14024f(@NotNull View requestNewSize, int i2, int i3) {
        Intrinsics.m32180i(requestNewSize, "$this$requestNewSize");
        requestNewSize.getLayoutParams().width = i2;
        requestNewSize.getLayoutParams().height = i3;
        requestNewSize.setLayoutParams(requestNewSize.getLayoutParams());
    }
}
