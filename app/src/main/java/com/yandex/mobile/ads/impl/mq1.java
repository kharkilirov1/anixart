package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.wm0;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52782b;

    /* renamed from: c */
    public final /* synthetic */ Object f52783c;

    /* renamed from: d */
    public final /* synthetic */ Object f52784d;

    /* renamed from: e */
    public final /* synthetic */ Object f52785e;

    /* renamed from: f */
    public final /* synthetic */ Object f52786f;

    /* renamed from: g */
    public final /* synthetic */ Object f52787g;

    public /* synthetic */ mq1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.f52782b = i2;
        this.f52783c = obj;
        this.f52784d = obj2;
        this.f52785e = obj3;
        this.f52786f = obj4;
        this.f52787g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52782b) {
            case 0:
                ((wm0) this.f52783c).m29499a((CountDownLatch) this.f52784d, (List) this.f52785e, (C5535oe) this.f52786f, (wm0.InterfaceC5980b) this.f52787g);
                break;
            default:
                hg1.m25196b((ViewGroup) this.f52783c, (View) this.f52784d, (Context) this.f52785e, (SizeInfo) this.f52786f, (ViewTreeObserver.OnPreDrawListener) this.f52787g);
                break;
        }
    }
}
