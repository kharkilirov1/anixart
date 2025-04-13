package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

/* loaded from: classes3.dex */
public final class gd1 implements AdPodInfo {

    /* renamed from: a */
    private final int f50550a;

    /* renamed from: b */
    private final int f50551b;

    public gd1(int i2, int i3) {
        this.f50551b = i2;
        this.f50550a = i3;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f50550a;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f50551b;
    }
}
