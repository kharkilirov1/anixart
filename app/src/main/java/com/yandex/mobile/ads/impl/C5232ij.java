package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ij */
/* loaded from: classes3.dex */
public final class C5232ij {
    @JvmStatic
    /* renamed from: a */
    public static final int m25548a(@Nullable String str) {
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return -16777216;
        }
    }
}
