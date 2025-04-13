package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.n6 */
/* loaded from: classes3.dex */
public final class C5474n6 {
    @ChecksSdkIntAtLeast
    /* renamed from: a */
    public static boolean m26805a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    /* renamed from: a */
    public static boolean m26806a(@Nullable Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
