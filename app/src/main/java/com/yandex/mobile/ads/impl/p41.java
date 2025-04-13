package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class p41 {
    @NonNull
    /* renamed from: a */
    public static String m27163a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase(Locale.US);
    }
}
