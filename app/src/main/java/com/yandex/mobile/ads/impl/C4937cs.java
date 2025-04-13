package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.cs */
/* loaded from: classes3.dex */
public final class C4937cs implements InstreamAdPlayer {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f49343a;

    /* renamed from: b */
    @NonNull
    private final C5003e4 f49344b;

    /* renamed from: c */
    @NonNull
    private final C5103g4 f49345c;

    /* renamed from: d */
    @NonNull
    private final C5056f4 f49346d;

    /* renamed from: e */
    @NonNull
    private final zq0 f49347e;

    /* renamed from: f */
    @NonNull
    private final br0 f49348f;

    /* renamed from: g */
    @NonNull
    private final ss0 f49349g;

    public C4937cs(@NonNull C4794a6 c4794a6, @NonNull yq0 yq0Var, @NonNull ls0 ls0Var, @NonNull C5103g4 c5103g4, @NonNull C5056f4 c5056f4, @NonNull C5003e4 c5003e4) {
        this.f49343a = c4794a6;
        this.f49347e = yq0Var.m29965d();
        this.f49348f = yq0Var.m29966e();
        this.f49349g = ls0Var;
        this.f49345c = c5103g4;
        this.f49346d = c5056f4;
        this.f49344b = c5003e4;
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final long getAdDuration(@NonNull VideoAd videoAd) {
        return this.f49349g.mo24583a().m27098a();
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final long getAdPosition(@NonNull VideoAd videoAd) {
        return this.f49349g.mo24583a().m27099b();
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final float getVolume(@NonNull VideoAd videoAd) {
        Float m22925a = this.f49348f.m22925a();
        if (m22925a != null) {
            return m22925a.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final boolean isPlayingAd(@NonNull VideoAd videoAd) {
        return this.f49343a.m22380a(videoAd) != d40.f49559a && this.f49347e.m30284c();
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void pauseAd(@NonNull VideoAd videoAd) {
        try {
            this.f49346d.m24308c(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during play ad: %s", e2);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void playAd(@NonNull VideoAd videoAd) {
        try {
            this.f49346d.m24309d(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during play ad: %s", e2);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void prepareAd(@NonNull VideoAd videoAd) {
        try {
            this.f49345c.m24802a(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during ad prepare: %s", e2);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void releaseAd(@NonNull VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void resumeAd(@NonNull VideoAd videoAd) {
        try {
            this.f49346d.m24310e(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during play ad: %s", e2);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void setInstreamAdPlayerListener(@Nullable InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f49344b.m24004a(instreamAdPlayerListener);
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void setVolume(@NonNull VideoAd videoAd, float f2) {
        this.f49348f.m22926a(f2);
        this.f49344b.onVolumeChanged(videoAd, f2);
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void skipAd(@NonNull VideoAd videoAd) {
        try {
            this.f49346d.m24311f(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during play ad: %s", e2);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer
    public final void stopAd(@NonNull VideoAd videoAd) {
        try {
            this.f49346d.m24312g(videoAd);
        } catch (RuntimeException e2) {
            n60.m26810c("Exception during play ad: %s", e2);
        }
    }
}
