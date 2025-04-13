package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class w11 implements id1 {

    /* renamed from: a */
    @NonNull
    private final v11 f55989a;

    /* renamed from: b */
    @Nullable
    private final SkipInfo f55990b;

    /* renamed from: c */
    private boolean f55991c;

    public w11(@NonNull i40 i40Var, @NonNull VideoAd videoAd) {
        this.f55990b = videoAd.getSkipInfo();
        this.f55989a = new v11(i40Var);
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        SkipInfo skipInfo;
        if (this.f55991c || (skipInfo = this.f55990b) == null) {
            return;
        }
        if (j3 < skipInfo.getSkipOffset()) {
            this.f55989a.m29170a(this.f55990b.getSkipOffset(), j3);
        } else {
            this.f55989a.m29169a();
            this.f55991c = true;
        }
    }
}
