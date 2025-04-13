package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.xj */
/* loaded from: classes3.dex */
public final class C6029xj implements sb1 {

    /* renamed from: a */
    @NonNull
    private final sb1[] f56488a;

    public C6029xj(@NonNull sb1... sb1VarArr) {
        this.f56488a = sb1VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24000a(@NonNull l30 l30Var) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.mo24000a(l30Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdClicked(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdCompleted(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdError(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdPaused(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdResumed(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdSkipped(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStarted(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStopped(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onVolumeChanged(@NonNull VideoAd videoAd, float f2) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.onVolumeChanged(videoAd, f2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24003a(@NonNull VideoAd videoAd) {
        for (sb1 sb1Var : this.f56488a) {
            sb1Var.mo24003a(videoAd);
        }
    }
}
