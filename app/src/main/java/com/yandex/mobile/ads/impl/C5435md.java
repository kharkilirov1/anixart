package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.md */
/* loaded from: classes3.dex */
public final class C5435md {
    @Nullable
    /* renamed from: a */
    public static String m26615a(@NonNull String str) {
        try {
            return new String(Base64.decode(str.getBytes(), 0), "UTF-8");
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    public static String m26616a(@NonNull byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 0), "UTF-8");
        } catch (Exception e2) {
            String str = new String(bArr);
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            return str;
        }
    }
}
