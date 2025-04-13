package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class fw0 {
    /* renamed from: a */
    public static void m24749a(@NonNull Uri.Builder builder, @Nullable Integer num) {
        if (num != null) {
            m24750a(builder, "cmp_present", Integer.toString(num.intValue()));
        }
    }

    /* renamed from: a */
    public static void m24750a(@NonNull Uri.Builder builder, @NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
