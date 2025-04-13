package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
final class b91 {
    @NonNull
    /* renamed from: a */
    public static AdPlaybackState m22752a(@NonNull AdPlaybackState adPlaybackState, long j2) {
        if (adPlaybackState.f12605e != j2) {
            adPlaybackState = new AdPlaybackState(adPlaybackState.f12602b, adPlaybackState.f12607g, adPlaybackState.f12604d, j2, adPlaybackState.f12606f);
        }
        for (int i2 = 0; i2 < adPlaybackState.f12603c; i2++) {
            if (adPlaybackState.m6925b(i2).f12609b > j2) {
                adPlaybackState = adPlaybackState.m6932j(i2);
            }
        }
        return adPlaybackState;
    }
}
