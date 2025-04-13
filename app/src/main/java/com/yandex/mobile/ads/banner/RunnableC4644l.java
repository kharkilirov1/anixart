package com.yandex.mobile.ads.banner;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.mobile.ads.banner.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4644l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f47655b;

    /* renamed from: c */
    public final /* synthetic */ Object f47656c;

    public /* synthetic */ RunnableC4644l(Object obj, int i2) {
        this.f47655b = i2;
        this.f47656c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47655b) {
            case 0:
                ((C4636d) this.f47656c).m21756a();
                break;
            case 1:
                ((C4636d) this.f47656c).m21762c();
                break;
            case 2:
                ((C4636d) this.f47656c).m21760b();
                break;
            default:
                ((AbstractC4642j) this.f47656c).m21792u();
                break;
        }
    }
}
