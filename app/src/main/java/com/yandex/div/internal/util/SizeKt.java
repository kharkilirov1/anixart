package com.yandex.div.internal.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.Dimension;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: Size.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"utils_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SizeKt {

    /* renamed from: a */
    public static final DisplayMetrics f33901a = Resources.getSystem().getDisplayMetrics();

    @Px
    /* renamed from: a */
    public static final float m17395a(@Dimension float f2) {
        return f2 * f33901a.density;
    }

    @Px
    /* renamed from: b */
    public static final int m17396b(@Dimension int i2) {
        return MathKt.m32223c(i2 * f33901a.density);
    }
}
