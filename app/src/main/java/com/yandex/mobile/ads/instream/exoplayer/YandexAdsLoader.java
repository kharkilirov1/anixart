package com.yandex.mobile.ads.instream.exoplayer;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.p009ui.AdViewProvider;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.yandex.mobile.ads.impl.C6059y6;
import com.yandex.mobile.ads.impl.j40;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.Collections;

@MainThread
/* loaded from: classes3.dex */
public class YandexAdsLoader implements AdsLoader {
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* renamed from: a */
    @NonNull
    private final j40 f57452a;

    public YandexAdsLoader(@NonNull Context context, @NonNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f57452a = new C6059y6(context, instreamAdRequestConfiguration).m29863a();
    }

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader
    public void handlePrepareComplete(@Nullable AdsMediaSource adsMediaSource, int i2, int i3) {
        this.f57452a.m25782a(i2, i3);
    }

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader
    public void handlePrepareError(@Nullable AdsMediaSource adsMediaSource, int i2, int i3, @Nullable IOException iOException) {
        this.f57452a.m25783a(i2, i3, iOException);
    }

    public void release() {
        this.f57452a.m25781a();
    }

    public void requestAds(@Nullable ViewGroup viewGroup) {
        this.f57452a.m25784a(viewGroup, Collections.emptyList());
    }

    public void setPlayer(@Nullable Player player) {
        this.f57452a.m25785a(player);
    }

    public void setSupportedContentTypes(int... iArr) {
    }

    public void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f57452a.m25787a(videoAdPlaybackListener);
    }

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader
    public void start(@Nullable AdsMediaSource adsMediaSource, @Nullable DataSpec dataSpec, @Nullable Object obj, @Nullable AdViewProvider adViewProvider, @Nullable AdsLoader.EventListener eventListener) {
        if (eventListener != null) {
            this.f57452a.m25786a(eventListener, adViewProvider, obj);
        } else {
            n60.m26810c("Start called with null eventListener", new Object[0]);
        }
    }

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader
    public void stop(@Nullable AdsMediaSource adsMediaSource, @Nullable AdsLoader.EventListener eventListener) {
        this.f57452a.m25788b();
    }
}
