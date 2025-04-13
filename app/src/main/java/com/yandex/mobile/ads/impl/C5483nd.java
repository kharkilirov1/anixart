package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nd */
/* loaded from: classes3.dex */
public final class C5483nd {
    @Nullable
    /* renamed from: a */
    public static String m26844a(@NonNull String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 2);
        } catch (Throwable th) {
            n60.m26808a(th, th.getMessage(), new Object[0]);
            return null;
        }
    }
}
