package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e60 {

    /* renamed from: a */
    private static boolean f49825a = true;

    @JvmStatic
    /* renamed from: a */
    public static final void m24035a(boolean z) {
        f49825a = z;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m24036b(@NotNull String format, @NotNull Object... args) {
        Intrinsics.m32179h(format, "format");
        Intrinsics.m32179h(args, "args");
        if (f49825a) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.m32178g(format2, "format(locale, format, *args)");
            Log.i("YandexAds", "[Integration] " + format2);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m24037c(@NotNull String format, @NotNull Object... args) {
        Intrinsics.m32179h(format, "format");
        Intrinsics.m32179h(args, "args");
        if (f49825a) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.m32178g(format2, "format(locale, format, *args)");
            Log.w("YandexAds", "[Integration] " + format2);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m24034a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.m32179h(format, "format");
        Intrinsics.m32179h(args, "args");
        if (f49825a) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.m32178g(format2, "format(locale, format, *args)");
            Log.e("YandexAds", "[Integration] " + format2);
        }
    }
}
