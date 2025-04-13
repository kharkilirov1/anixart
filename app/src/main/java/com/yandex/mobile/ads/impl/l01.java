package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class l01 {
    /* renamed from: a */
    public static boolean m26309a(@NonNull Context context) {
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return m29824a != null && m29824a.m23568G();
    }

    /* renamed from: b */
    public static boolean m26310b(@NonNull Context context) {
        return !m26311c(context);
    }

    /* renamed from: c */
    public static boolean m26311c(@NonNull Context context) {
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return m29824a == null || !m29824a.m23584W() || m26309a(context);
    }
}
