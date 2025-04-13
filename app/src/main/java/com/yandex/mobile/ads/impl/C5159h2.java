package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.h2 */
/* loaded from: classes3.dex */
public final class C5159h2 {

    /* renamed from: a */
    @NonNull
    private final f40 f50795a;

    /* renamed from: b */
    @NonNull
    private final sb1 f50796b;

    public C5159h2(@NonNull f40 f40Var, @NonNull tb1 tb1Var) {
        this.f50795a = f40Var;
        this.f50796b = tb1Var;
    }

    /* renamed from: a */
    public final void m25024a(@NonNull VideoAd videoAd, float f2) {
        this.f50796b.onVolumeChanged(videoAd, f2);
    }

    /* renamed from: b */
    public final void m25025b(@NonNull VideoAd videoAd) {
        this.f50796b.onAdError(videoAd);
    }

    /* renamed from: c */
    public final void m25026c(@NonNull VideoAd videoAd) {
        this.f50796b.onAdPaused(videoAd);
    }

    /* renamed from: d */
    public final void m25027d(@NonNull VideoAd videoAd) {
        this.f50796b.mo24000a(new l30(this.f50795a, videoAd));
    }

    /* renamed from: e */
    public final void m25028e(@NonNull VideoAd videoAd) {
        this.f50796b.onAdResumed(videoAd);
    }

    /* renamed from: f */
    public final void m25029f(@NonNull VideoAd videoAd) {
        this.f50796b.onAdSkipped(videoAd);
    }

    /* renamed from: g */
    public final void m25030g(@NonNull VideoAd videoAd) {
        this.f50796b.onAdStarted(videoAd);
    }

    /* renamed from: h */
    public final void m25031h(@NonNull VideoAd videoAd) {
        this.f50796b.onAdStopped(videoAd);
    }

    /* renamed from: i */
    public final void m25032i(@NonNull VideoAd videoAd) {
        this.f50796b.mo24003a(videoAd);
    }

    /* renamed from: a */
    public final void m25023a(@NonNull VideoAd videoAd) {
        this.f50796b.onAdCompleted(videoAd);
    }

    /* renamed from: a */
    public final void m25022a() {
        this.f50795a.m24316a((ub1) null);
    }
}
