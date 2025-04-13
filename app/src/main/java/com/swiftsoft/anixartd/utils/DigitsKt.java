package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Digits.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"app_release"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DigitsKt {
    /* renamed from: a */
    public static final int m16320a(float f2, @NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static final int m16321b(int i2, @NotNull Context context) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static final int m16322c(int i2, @NotNull View view) {
        return (int) TypedValue.applyDimension(1, i2, view.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public static String m16323d(double d, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        double d2 = 1.0d;
        for (int i4 = 0; i4 < i2; i4++) {
            d2 *= 10;
        }
        return StringsKt.m33891Q(String.valueOf(Math.rint(d * d2) / d2), ".0", "", false, 4, null);
    }

    @NotNull
    /* renamed from: e */
    public static final String m16324e(int i2) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(' ');
        String format = new DecimalFormat("#,###.##", decimalFormatSymbols).format(Integer.valueOf(i2));
        Intrinsics.m32178g(format, "formatter.format(this)");
        return format;
    }

    @NotNull
    /* renamed from: f */
    public static final String m16325f(long j2) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(' ');
        String format = new DecimalFormat("#,###.##", decimalFormatSymbols).format(j2);
        Intrinsics.m32178g(format, "formatter.format(this)");
        return format;
    }
}
