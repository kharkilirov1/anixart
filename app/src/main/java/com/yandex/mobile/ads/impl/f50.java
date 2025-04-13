package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;

/* loaded from: classes3.dex */
public final class f50 implements SkipInfo {

    /* renamed from: a */
    private final long f50125a;

    public f50(long j2) {
        this.f50125a = j2;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f50125a;
    }
}
