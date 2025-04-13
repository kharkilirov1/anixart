package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.e4 */
/* loaded from: classes3.dex */
public final class C5003e4 implements InstreamAdPlayerListener {

    /* renamed from: a */
    @NonNull
    private final C6058y5 f49799a;

    /* renamed from: b */
    @Nullable
    private InstreamAdPlayerListener f49800b;

    public C5003e4(@NonNull C6058y5 c6058y5) {
        this.f49799a = c6058y5;
    }

    /* renamed from: a */
    public final void m24004a(@Nullable InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f49800b = instreamAdPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingFinished(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdCompleted(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdPaused(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdPrepared(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdResumed(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdSkipped(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdStarted(@NonNull VideoAd videoAd) {
        this.f49799a.m29862a();
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdStopped(@NonNull VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onError(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerError instreamAdPlayerError) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onError(videoAd, instreamAdPlayerError);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onVolumeChanged(@NonNull VideoAd videoAd, float f2) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f49800b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onVolumeChanged(videoAd, f2);
        }
    }
}
