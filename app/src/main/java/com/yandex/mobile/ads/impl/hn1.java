package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.C5354ks;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.hf1;
import com.yandex.mobile.ads.impl.rm0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.Reward;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f51015b;

    /* renamed from: c */
    public final /* synthetic */ Object f51016c;

    /* renamed from: d */
    public final /* synthetic */ Object f51017d;

    public /* synthetic */ hn1(Object obj, Object obj2, int i2) {
        this.f51015b = i2;
        this.f51016c = obj;
        this.f51017d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51015b) {
            case 0:
                ((c40) this.f51016c).m23018b((String) this.f51017d);
                break;
            case 1:
                ((c40) this.f51016c).m23016a((InstreamAd) this.f51017d);
                break;
            case 2:
                ((InterfaceC5588pe) this.f51016c).mo27320a((String) this.f51017d);
                break;
            case 3:
                ((C5246is) this.f51016c).m25628a((C5354ks.d) this.f51017d);
                break;
            case 4:
                ((BidderTokenLoadListener) this.f51016c).onBidderTokenLoaded((String) this.f51017d);
                break;
            case 5:
                ((C5354ks) this.f51016c).m26199a((vq0) this.f51017d);
                break;
            case 6:
                ((us0) this.f51016c).m29105b((e01) this.f51017d);
                break;
            case 7:
                ((ci0) this.f51016c).m23276a((AdImpressionData) this.f51017d);
                break;
            case 8:
                ((d50) this.f51016c).m23805a((String) this.f51017d);
                break;
            case 9:
                C4963da.m23846a((C4963da) this.f51016c, (AdRequestConfiguration) this.f51017d);
                break;
            case 10:
                dt0.m23930a((dt0) this.f51016c, (C6063y9) this.f51017d);
                break;
            case 11:
                dt0.m23931a((C5563p2) this.f51016c, (dt0) this.f51017d);
                break;
            case 12:
                et0.m24255a((et0) this.f51016c, (ImpressionData) this.f51017d);
                break;
            case 13:
                et0.m24254a((et0) this.f51016c, (AdError) this.f51017d);
                break;
            case 14:
                gt0.m24971a((gt0) this.f51016c, (AdRequestError) this.f51017d);
                break;
            case 15:
                ((hf1.C5183a) this.f51016c).m25163a((Exception) this.f51017d);
                break;
            case 16:
                ((hf1.C5183a) this.f51016c).m25168b((String) this.f51017d);
                break;
            case 17:
                ((hf1.C5183a) this.f51016c).m25162a((lf1) this.f51017d);
                break;
            case 18:
                ht0.m25362a((ht0) this.f51016c, (ImpressionData) this.f51017d);
                break;
            case 19:
                ((ii0) this.f51016c).m25539a((View) this.f51017d);
                break;
            case 20:
                it0.m25729a((it0) this.f51016c, (AdRequestError) this.f51017d);
                break;
            case 21:
                jt0.m25940a((jt0) this.f51016c, (ImpressionData) this.f51017d);
                break;
            case 22:
                jt0.m25941a((jt0) this.f51016c, (Reward) this.f51017d);
                break;
            case 23:
                ((l31) this.f51016c).m26338a((SurfaceTexture) this.f51017d);
                break;
            case 24:
                p30.m27156a((p30) this.f51016c, (InstreamAdRequestConfiguration) this.f51017d);
                break;
            case 25:
                ((r90) this.f51016c).m27875a((String) this.f51017d);
                break;
            case 26:
                ((rm0) this.f51016c).m27949a((rm0.InterfaceC5698b) this.f51017d);
                break;
            case 27:
                ((InterfaceC5790tb.a) this.f51016c).m28544b((String) this.f51017d);
                break;
            case 28:
                tg0.m28648a((tg0) this.f51016c, (ViewPager2) this.f51017d);
                break;
            default:
                C5953w2.m29361a((C5953w2) this.f51016c, (C4790a3) this.f51017d);
                break;
        }
    }
}
