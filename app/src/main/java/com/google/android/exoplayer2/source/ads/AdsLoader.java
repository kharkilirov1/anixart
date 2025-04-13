package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.p009ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: classes.dex */
public interface AdsLoader {

    public interface EventListener {
        /* renamed from: a */
        void mo6940a(AdPlaybackState adPlaybackState);
    }

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i2, int i3);

    void handlePrepareError(AdsMediaSource adsMediaSource, int i2, int i3, IOException iOException);

    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
