package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewsKt {
    /* renamed from: a */
    public static ReadWriteProperty m17186a(Object obj, Function1 function1, int i2) {
        return new AppearanceAffectingViewProperty(obj, null);
    }

    @NotNull
    /* renamed from: b */
    public static final <T> ReadWriteProperty<View, T> m17187b(T t, @Nullable Function1<? super T, ? extends T> function1) {
        return new DimensionAffectingViewProperty(t, function1);
    }

    /* renamed from: c */
    public static ReadWriteProperty m17188c(Object obj, Function1 function1, int i2) {
        return new DimensionAffectingViewProperty(obj, null);
    }

    /* renamed from: d */
    public static final boolean m17189d(int i2) {
        return View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE;
    }

    /* renamed from: e */
    public static final boolean m17190e(int i2) {
        return View.MeasureSpec.getMode(i2) == 1073741824;
    }

    /* renamed from: f */
    public static final boolean m17191f(int i2) {
        return View.MeasureSpec.getMode(i2) == 0;
    }

    /* renamed from: g */
    public static final int m17192g(int i2) {
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* renamed from: h */
    public static final int m17193h(int i2) {
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    /* renamed from: i */
    public static final int m17194i() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
