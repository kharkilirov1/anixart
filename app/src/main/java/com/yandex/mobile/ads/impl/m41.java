package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class m41 {
    @Nullable
    /* renamed from: a */
    public static String m26568a(@NonNull Context context, @NonNull String str) {
        cz0 m29824a = xz0.m29823b().m29824a(context);
        C5353kr m23600i = m29824a != null ? m29824a.m23600i() : null;
        if (m23600i == null) {
            return null;
        }
        byte[] m25527a = new ie0(m23600i.m26178b(), m23600i.m26177a()).m25527a(str.getBytes());
        if (m25527a != null) {
            return Base64.encodeToString(m25527a, 2);
        }
        return null;
    }
}
