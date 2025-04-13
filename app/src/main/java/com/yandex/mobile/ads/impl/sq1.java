package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.widget.ImageView;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.eg0;
import com.yandex.mobile.ads.impl.hf1;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f54801b;

    /* renamed from: c */
    public final /* synthetic */ Object f54802c;

    /* renamed from: d */
    public final /* synthetic */ Object f54803d;

    /* renamed from: e */
    public final /* synthetic */ Object f54804e;

    public /* synthetic */ sq1(Object obj, Object obj2, Object obj3, int i2) {
        this.f54801b = i2;
        this.f54802c = obj;
        this.f54803d = obj2;
        this.f54804e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54801b) {
            case 0:
                ((zb0) this.f54802c).m30123a((AbstractC4698p.a) this.f54803d, (bc0.C4858b) this.f54804e);
                break;
            case 1:
                ((cc0.C4914a) this.f54802c).m23199a((cc0) this.f54803d, (rb0) this.f54804e);
                break;
            case 2:
                eg0.m24144b((Context) this.f54802c, (ka0) this.f54803d, (eg0.InterfaceC5025a) this.f54804e);
                break;
            case 3:
                ((hf1.C5183a) this.f54802c).m25167b((C5606pv) this.f54803d, (C5873um) this.f54804e);
                break;
            case 4:
                k21.m26014a((k21) this.f54802c, (RectF) this.f54803d, (ImageView) this.f54804e);
                break;
            case 5:
                ((lk1) this.f54802c).m26489a((Context) this.f54803d, (BidderTokenLoadListener) this.f54804e);
                break;
            case 6:
                ((qe0) this.f54802c).m27709c((Context) this.f54803d, (InitializationListener) this.f54804e);
                break;
            case 7:
                ((InterfaceC5790tb.a) this.f54802c).m28542b((C5606pv) this.f54803d, (C5873um) this.f54804e);
                break;
            case 8:
                ((AbstractC5794td) this.f54802c).m28597a((BiddingSettings) this.f54803d, (d91) this.f54804e);
                break;
            case 9:
                u30.m28850a((Set) this.f54802c, (VideoAd) this.f54803d, (InstreamAdPlayerError) this.f54804e);
                break;
            default:
                uc0.m28981a((uc0) this.f54802c, (qg1) this.f54803d, (lg1) this.f54804e);
                break;
        }
    }
}
