package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.C4716c;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.C5606pv;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.mobile.ads.exo.drm.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4733t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f48043b;

    /* renamed from: c */
    public final /* synthetic */ Object f48044c;

    /* renamed from: d */
    public final /* synthetic */ Object f48045d;

    public /* synthetic */ RunnableC4733t(Object obj, Object obj2, int i2) {
        this.f48043b = i2;
        this.f48044c = obj;
        this.f48045d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48043b) {
            case 0:
                ((InterfaceC4719f.a) this.f48044c).m22174d((InterfaceC4719f) this.f48045d);
                break;
            case 1:
                ((InterfaceC4719f.a) this.f48044c).m22170b((InterfaceC4719f) this.f48045d);
                break;
            case 2:
                ((InterfaceC4719f.a) this.f48044c).m22172c((InterfaceC4719f) this.f48045d);
                break;
            case 3:
                ((InterfaceC4719f.a) this.f48044c).m22166a((InterfaceC4719f) this.f48045d);
                break;
            default:
                ((C4716c.e) this.f48044c).m22148b((C5606pv) this.f48045d);
                break;
        }
    }
}
