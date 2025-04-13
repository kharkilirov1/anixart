package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class t30 {

    /* renamed from: a */
    @NonNull
    private final InstreamAdPlayer f54936a;

    /* renamed from: b */
    @NonNull
    private final u30 f54937b = new u30();

    public t30(@NonNull InstreamAdPlayer instreamAdPlayer) {
        this.f54936a = instreamAdPlayer;
    }

    /* renamed from: a */
    public final void m28443a(@NonNull VideoAd videoAd, float f2) {
        this.f54936a.setVolume(videoAd, f2);
    }

    /* renamed from: b */
    public final void m28447b(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f54937b.m28872b(videoAd, instreamAdPlayerListener);
    }

    /* renamed from: c */
    public final float m28448c(@NonNull VideoAd videoAd) {
        return this.f54936a.getVolume(videoAd);
    }

    /* renamed from: d */
    public final boolean m28449d(@NonNull VideoAd videoAd) {
        return this.f54936a.isPlayingAd(videoAd);
    }

    /* renamed from: e */
    public final void m28450e(@NonNull VideoAd videoAd) {
        this.f54936a.pauseAd(videoAd);
    }

    /* renamed from: f */
    public final void m28451f(@NonNull VideoAd videoAd) {
        this.f54936a.playAd(videoAd);
    }

    /* renamed from: g */
    public final void m28452g(@NonNull VideoAd videoAd) {
        this.f54936a.prepareAd(videoAd);
    }

    /* renamed from: h */
    public final void m28453h(@NonNull VideoAd videoAd) {
        this.f54936a.releaseAd(videoAd);
    }

    /* renamed from: i */
    public final void m28454i(@NonNull VideoAd videoAd) {
        this.f54936a.resumeAd(videoAd);
    }

    /* renamed from: j */
    public final void m28455j(@NonNull VideoAd videoAd) {
        this.f54936a.skipAd(videoAd);
    }

    /* renamed from: k */
    public final void m28456k(@NonNull VideoAd videoAd) {
        this.f54936a.stopAd(videoAd);
    }

    /* renamed from: a */
    public final void m28444a(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f54937b.m28871a(videoAd, instreamAdPlayerListener);
    }

    /* renamed from: b */
    public final void m28446b() {
        this.f54936a.setInstreamAdPlayerListener(null);
        this.f54937b.m28870a();
    }

    /* renamed from: a */
    public final void m28442a() {
        this.f54936a.setInstreamAdPlayerListener(this.f54937b);
    }

    /* renamed from: a */
    public final long m28441a(@NonNull VideoAd videoAd) {
        return this.f54936a.getAdDuration(videoAd);
    }

    /* renamed from: b */
    public final long m28445b(@NonNull VideoAd videoAd) {
        return this.f54936a.getAdPosition(videoAd);
    }
}
