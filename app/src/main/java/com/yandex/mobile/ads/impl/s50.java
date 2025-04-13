package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAd;

/* loaded from: classes3.dex */
public final class s50 {
    @NonNull
    /* renamed from: a */
    public static l50 m28071a(@NonNull InstreamAd instreamAd) {
        if (instreamAd instanceof l50) {
            return (l50) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
