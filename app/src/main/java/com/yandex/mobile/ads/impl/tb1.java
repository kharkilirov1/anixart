package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class tb1 implements sb1 {

    /* renamed from: a */
    @Nullable
    private sb1 f55039a;

    /* renamed from: a */
    public final void m28583a(@Nullable sb1 sb1Var) {
        this.f55039a = sb1Var;
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdClicked(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdCompleted(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdError(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdPaused(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdResumed(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdSkipped(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStarted(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStopped(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onVolumeChanged(@NonNull VideoAd videoAd, float f2) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.onVolumeChanged(videoAd, f2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24000a(@NonNull l30 l30Var) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.mo24000a(l30Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24003a(@NonNull VideoAd videoAd) {
        sb1 sb1Var = this.f55039a;
        if (sb1Var != null) {
            sb1Var.mo24003a(videoAd);
        }
    }
}
