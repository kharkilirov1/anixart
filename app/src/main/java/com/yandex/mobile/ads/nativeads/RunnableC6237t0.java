package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.mk0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.mobile.ads.nativeads.t0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6237t0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f57804b;

    /* renamed from: c */
    public final /* synthetic */ C6228p f57805c;

    /* renamed from: d */
    public final /* synthetic */ NativeAdRequestConfiguration f57806d;

    /* renamed from: e */
    public final /* synthetic */ kk0 f57807e;

    /* renamed from: f */
    public final /* synthetic */ mk0 f57808f;

    /* renamed from: g */
    public final /* synthetic */ jw0 f57809g;

    public /* synthetic */ RunnableC6237t0(C6228p c6228p, NativeAdRequestConfiguration nativeAdRequestConfiguration, kk0 kk0Var, mk0 mk0Var, jw0 jw0Var, int i2) {
        this.f57804b = i2;
        this.f57805c = c6228p;
        this.f57806d = nativeAdRequestConfiguration;
        this.f57807e = kk0Var;
        this.f57808f = mk0Var;
        this.f57809g = jw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57804b) {
            case 0:
                this.f57805c.m30602a(this.f57806d, this.f57807e, this.f57808f, this.f57809g);
                break;
            default:
                this.f57805c.m30605b(this.f57806d, this.f57807e, this.f57808f, this.f57809g);
                break;
        }
    }
}
