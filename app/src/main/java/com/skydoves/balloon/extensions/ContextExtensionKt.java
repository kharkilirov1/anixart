package com.skydoves.balloon.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContextExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"balloon_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ContextExtensionKt {
    @NotNull
    /* renamed from: a */
    public static final Point m13873a(@NotNull Context displaySize) {
        Intrinsics.m32179h(displaySize, "$this$displaySize");
        Resources resources = displaySize.getResources();
        Intrinsics.m32178g(resources, "resources");
        int i2 = resources.getDisplayMetrics().widthPixels;
        Resources resources2 = displaySize.getResources();
        Intrinsics.m32178g(resources2, "resources");
        return new Point(i2, resources2.getDisplayMetrics().heightPixels);
    }

    /* renamed from: b */
    public static final float m13874b(@NotNull Context dp2Px, float f2) {
        Intrinsics.m32179h(dp2Px, "$this$dp2Px");
        Resources resources = dp2Px.getResources();
        Intrinsics.m32178g(resources, "resources");
        return f2 * resources.getDisplayMetrics().density;
    }

    /* renamed from: c */
    public static final int m13875c(@NotNull Context dp2Px, int i2) {
        Intrinsics.m32179h(dp2Px, "$this$dp2Px");
        Resources resources = dp2Px.getResources();
        Intrinsics.m32178g(resources, "resources");
        return (int) (i2 * resources.getDisplayMetrics().density);
    }
}
