package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.M0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4536M0 {

    /* renamed from: a */
    private static final List<String> f47302a = Arrays.asList("passive", "gps");

    /* renamed from: a */
    public static boolean m21458a(@NonNull Context context, @Nullable String str) {
        return (str == null || !f47302a.contains(str)) ? m21459b(context) || m21457a(context) : m21459b(context);
    }

    /* renamed from: b */
    public static boolean m21459b(@NonNull Context context) {
        return ContextCompat.m1668a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* renamed from: a */
    public static boolean m21457a(@NonNull Context context) {
        return ContextCompat.m1668a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
