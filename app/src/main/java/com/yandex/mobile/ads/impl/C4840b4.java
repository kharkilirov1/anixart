package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.b4 */
/* loaded from: classes3.dex */
public final class C4840b4 {
    /* renamed from: a */
    public static boolean m22715a(@NonNull AdPlaybackState adPlaybackState, int i2, int i3) {
        AdPlaybackState.AdGroup m6925b;
        int i4;
        return i2 < adPlaybackState.f12603c && (i4 = (m6925b = adPlaybackState.m6925b(i2)).f12610c) != -1 && i3 < i4 && m6925b.f12612e[i3] == 2;
    }
}
