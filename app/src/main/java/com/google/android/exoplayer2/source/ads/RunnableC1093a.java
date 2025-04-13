package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.ads.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1093a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f12660b;

    /* renamed from: c */
    public final /* synthetic */ AdsMediaSource f12661c;

    /* renamed from: d */
    public final /* synthetic */ AdsMediaSource.ComponentListener f12662d;

    public /* synthetic */ RunnableC1093a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i2) {
        this.f12660b = i2;
        this.f12661c = adsMediaSource;
        this.f12662d = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12660b) {
            case 0:
                AdsMediaSource adsMediaSource = this.f12661c;
                adsMediaSource.f12619m.start(adsMediaSource, adsMediaSource.f12621o, adsMediaSource.f12622p, adsMediaSource.f12620n, this.f12662d);
                break;
            default:
                AdsMediaSource adsMediaSource2 = this.f12661c;
                adsMediaSource2.f12619m.stop(adsMediaSource2, this.f12662d);
                break;
        }
    }
}
