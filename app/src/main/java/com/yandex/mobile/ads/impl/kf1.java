package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;

/* loaded from: classes3.dex */
public final class kf1 {
    @Nullable
    /* renamed from: a */
    public static int m26118a(@NonNull TypedArray typedArray) {
        int i2 = typedArray.getInt(C4632R.styleable.YandexAdsInternalMediaView_yandex_video_scale_type, -1);
        int[] m28465b = C5782t5.m28465b(3);
        if (i2 < 0 || i2 >= m28465b.length) {
            return 0;
        }
        return m28465b[i2];
    }
}
