package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.impl.wz0;

/* loaded from: classes3.dex */
final class kk1 implements wz0.InterfaceC5998a {

    /* renamed from: a */
    public final /* synthetic */ Context f52002a;

    /* renamed from: b */
    public final /* synthetic */ BidderTokenLoadListener f52003b;

    /* renamed from: c */
    public final /* synthetic */ lk1 f52004c;

    public kk1(lk1 lk1Var, Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f52004c = lk1Var;
        this.f52002a = context;
        this.f52003b = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
    /* renamed from: a */
    public final void mo26147a(@NonNull C5961w7 c5961w7, @NonNull C5507nr c5507nr) {
        jk1 jk1Var;
        Handler handler;
        Handler handler2;
        jk1Var = this.f52004c.f52440b;
        String m25900a = jk1Var.m25900a(this.f52002a, c5961w7, c5507nr);
        if (m25900a != null) {
            handler2 = this.f52004c.f52441c;
            handler2.post(new hn1(this.f52003b, m25900a, 4));
        } else {
            handler = this.f52004c.f52441c;
            handler.post(new lp1(this.f52003b, 1));
        }
    }

    @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
    /* renamed from: a */
    public final void mo26146a(@NonNull C5563p2 c5563p2) {
        Handler handler;
        handler = this.f52004c.f52441c;
        handler.post(new lp1(this.f52003b, 0));
    }
}
