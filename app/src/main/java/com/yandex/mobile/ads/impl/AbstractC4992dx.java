package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.AbstractC4992dx;

/* renamed from: com.yandex.mobile.ads.impl.dx */
/* loaded from: classes3.dex */
public abstract class AbstractC4992dx<T extends AbstractC4992dx<T>> extends f71 {

    /* renamed from: m */
    @NonNull
    private final AdResponse<String> f49752m;

    /* renamed from: n */
    @NonNull
    private final InterfaceC5607pw f49753n;

    /* renamed from: o */
    @NonNull
    private final C5724s3 f49754o;

    /* renamed from: p */
    @NonNull
    private final InterfaceC5148gw<T> f49755p;

    /* renamed from: q */
    @NonNull
    private final C5659qw f49756q;

    /* renamed from: r */
    @NonNull
    private final t41 f49757r;

    /* renamed from: s */
    @NonNull
    private final C5376l4 f49758s;

    /* renamed from: t */
    @NonNull
    private final C6142zv f49759t;

    public AbstractC4992dx(@NonNull Context context, @NonNull AdResponse<String> adResponse, @NonNull C5101g2 c5101g2, @NonNull InterfaceC5607pw interfaceC5607pw, @NonNull C6142zv c6142zv, @NonNull InterfaceC5148gw<T> interfaceC5148gw) {
        super(context, c6142zv, adResponse, c5101g2);
        this.f49752m = adResponse;
        C5724s3 c5724s3 = new C5724s3();
        this.f49754o = c5724s3;
        this.f49759t = c6142zv;
        this.f49755p = interfaceC5148gw;
        this.f49753n = interfaceC5607pw;
        this.f49756q = new C5659qw();
        this.f49757r = t41.m28460a();
        C5467n0.m26780a().m26782a("window_type_fullscreen", new C5775t0());
        C5097fz c5097fz = new C5097fz();
        c5097fz.m24758a(adResponse);
        this.f49758s = new C5376l4(context, adResponse, c5101g2, c5724s3, c5097fz);
    }

    @Override // com.yandex.mobile.ads.impl.m20.InterfaceC5423a
    /* renamed from: a */
    public final void mo21751a(@Nullable AdImpressionData adImpressionData) {
        this.f49753n.onImpression(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: a */
    public final boolean mo21752a(int i2) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: j */
    public final boolean mo21753j() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.f71
    /* renamed from: k */
    public final boolean mo21754k() {
        return true;
    }

    /* renamed from: m */
    public final void m23950m() {
        if (C5427m6.m26579a((InterfaceC5538oh) this)) {
            return;
        }
        this.f49757r.m28461a(h70.f50865b, this);
        this.f49755p.mo24989a(m27310c());
        mo24327g();
        n60.m26811d("onDestroy(), clazz = " + getClass(), new Object[0]);
    }

    @NonNull
    /* renamed from: n */
    public abstract T mo22410n();

    /* renamed from: o */
    public final void m23951o() {
        m27313f();
        this.f49757r.m28461a(h70.f50865b, this);
        this.f49753n.onAdDismissed();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onLeftApplication() {
        this.f49753n.onAdClicked();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if ((r5.m21832v() == com.yandex.mobile.ads.impl.EnumC5870uk.f55549b) == false) goto L33;
     */
    @Override // com.yandex.mobile.ads.impl.f71, com.yandex.mobile.ads.impl.InterfaceC5315k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceiveResult(int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "onReceiveResult(), resultCode = "
            java.lang.String r1 = ", clazz = "
            java.lang.StringBuilder r0 = p000a.C0000a.m25v(r0, r4, r1)
            java.lang.Class r1 = r3.getClass()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.n60.m26811d(r0, r2)
            r0 = 0
            if (r4 == 0) goto L6a
            r2 = 2
            if (r4 == r2) goto L61
            r1 = 3
            if (r4 == r1) goto L56
            r1 = 4
            if (r4 == r1) goto L52
            r1 = 5
            if (r4 == r1) goto La2
            switch(r4) {
                case 16: goto L3d;
                case 17: goto L37;
                case 18: goto L30;
                default: goto L2b;
            }
        L2b:
            super.onReceiveResult(r4, r5)
            goto La2
        L30:
            com.yandex.mobile.ads.impl.pw r4 = r3.f49753n
            r4.mo24263a()
            goto La2
        L37:
            com.yandex.mobile.ads.impl.pw r4 = r3.f49753n
            r4.onAdClicked()
            goto La2
        L3d:
            if (r5 == 0) goto L4c
            java.lang.String r4 = "impression_data_key"
            android.os.Parcelable r4 = r5.getParcelable(r4)
            boolean r5 = r4 instanceof com.yandex.mobile.ads.common.AdImpressionData
            if (r5 == 0) goto L4c
            r0 = r4
            com.yandex.mobile.ads.common.AdImpressionData r0 = (com.yandex.mobile.ads.common.AdImpressionData) r0
        L4c:
            com.yandex.mobile.ads.impl.pw r4 = r3.f49753n
            r4.onImpression(r0)
            goto La2
        L52:
            r3.m23951o()
            goto La2
        L56:
            com.yandex.mobile.ads.impl.zv r4 = r3.f49759t
            r5 = 8
            r4.m30305a(r5)
            r3.m24326b(r5)
            goto La2
        L61:
            com.yandex.mobile.ads.impl.zv r4 = r3.f49759t
            r4.m30305a(r1)
            r3.m24326b(r1)
            goto La2
        L6a:
            if (r5 == 0) goto L75
            java.lang.String r4 = "extra_tracking_parameters"
            java.io.Serializable r4 = r5.getSerializable(r4)
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
        L75:
            com.yandex.mobile.ads.impl.s3 r4 = r3.f49754o
            com.yandex.mobile.ads.impl.r3 r5 = com.yandex.mobile.ads.impl.EnumC5668r3.f54171d
            r4.m28050a(r5)
            com.yandex.mobile.ads.impl.l4 r4 = r3.f49758s
            r4.m26349a()
            com.yandex.mobile.ads.impl.pw r4 = r3.f49753n
            r4.onAdShown()
            com.yandex.mobile.ads.impl.qw r4 = r3.f49756q
            com.yandex.mobile.ads.base.AdResponse<java.lang.String> r5 = r3.f49752m
            java.util.Objects.requireNonNull(r4)
            if (r5 == 0) goto L9c
            com.yandex.mobile.ads.impl.uk r4 = r5.m21832v()
            com.yandex.mobile.ads.impl.uk r5 = com.yandex.mobile.ads.impl.EnumC5870uk.f55549b
            if (r4 != r5) goto L99
            r4 = 1
            goto L9a
        L99:
            r4 = 0
        L9a:
            if (r4 != 0) goto L9d
        L9c:
            r1 = 1
        L9d:
            if (r1 == 0) goto La2
            r3.m24325a(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC4992dx.onReceiveResult(int, android.os.Bundle):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onReturnedToApplication() {
        this.f49753n.mo24263a();
    }

    /* renamed from: p */
    public final void m23952p() {
        this.f49753n.onAdShown();
    }

    /* renamed from: q */
    public final void m23953q() {
        m27312e();
        synchronized (this) {
        }
        this.f49754o.m28055b(EnumC5668r3.f54171d);
        this.f49757r.m28462b(h70.f50865b, this);
        this.f49755p.mo24991a((InterfaceC5148gw<T>) mo22410n());
    }
}
