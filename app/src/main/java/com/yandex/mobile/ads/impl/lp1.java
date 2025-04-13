package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.BidderTokenLoadListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52490b;

    /* renamed from: c */
    public final /* synthetic */ BidderTokenLoadListener f52491c;

    public /* synthetic */ lp1(BidderTokenLoadListener bidderTokenLoadListener, int i2) {
        this.f52490b = i2;
        this.f52491c = bidderTokenLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52490b) {
            case 0:
                this.f52491c.onBidderTokenFailedToLoad("Cannot load bidder token. SDK initialization failed.");
                break;
            default:
                this.f52491c.onBidderTokenFailedToLoad("Cannot load bidder token. Token generation failed");
                break;
        }
    }
}
