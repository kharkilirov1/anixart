package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.ads.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1094b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f12663b;

    /* renamed from: c */
    public final /* synthetic */ Object f12664c;

    /* renamed from: d */
    public final /* synthetic */ Object f12665d;

    public /* synthetic */ RunnableC1094b(Object obj, Object obj2, int i2) {
        this.f12663b = i2;
        this.f12664c = obj;
        this.f12665d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12663b) {
            case 0:
                AdsMediaSource.AdPrepareListener adPrepareListener = (AdsMediaSource.AdPrepareListener) this.f12664c;
                MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) this.f12665d;
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                adsMediaSource.f12619m.handlePrepareComplete(adsMediaSource, mediaPeriodId.f12357b, mediaPeriodId.f12358c);
                break;
            default:
                AdsMediaSource.ComponentListener componentListener = (AdsMediaSource.ComponentListener) this.f12664c;
                AdPlaybackState adPlaybackState = (AdPlaybackState) this.f12665d;
                if (!componentListener.f12638b) {
                    AdsMediaSource adsMediaSource2 = AdsMediaSource.this;
                    AdPlaybackState adPlaybackState2 = adsMediaSource2.f12627u;
                    if (adPlaybackState2 == null) {
                        AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdsMediaSource.AdMediaSourceHolder[adPlaybackState.f12603c][];
                        adsMediaSource2.f12628v = adMediaSourceHolderArr;
                        Arrays.fill(adMediaSourceHolderArr, new AdsMediaSource.AdMediaSourceHolder[0]);
                    } else {
                        Assertions.m7516d(adPlaybackState.f12603c == adPlaybackState2.f12603c);
                    }
                    adsMediaSource2.f12627u = adPlaybackState;
                    adsMediaSource2.m6941O();
                    adsMediaSource2.m6942P();
                    break;
                }
                break;
        }
    }
}
