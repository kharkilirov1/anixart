package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class p10 {
    @NonNull
    /* renamed from: a */
    public static String m27141a(@NonNull String str, @NonNull ImageView.ScaleType scaleType) {
        StringBuilder m26356a = l60.m26356a("#S");
        m26356a.append(scaleType.ordinal());
        m26356a.append(str);
        return m26356a.toString();
    }

    @NonNull
    /* renamed from: a */
    public static String m27140a(@NonNull String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        StringBuilder m26356a = l60.m26356a("#S");
        m26356a.append(scaleType.ordinal());
        m26356a.append(str);
        return m26356a.toString();
    }
}
