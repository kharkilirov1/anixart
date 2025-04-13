package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h21 {
    /* renamed from: a */
    public static boolean m25033a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false);
    }
}
