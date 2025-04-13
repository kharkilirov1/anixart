package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;

/* renamed from: com.yandex.mobile.ads.impl.rd */
/* loaded from: classes3.dex */
final class RunnableC5684rd implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AdRequest f54279b;

    /* renamed from: c */
    public final /* synthetic */ d91 f54280c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC5794td f54281d;

    public RunnableC5684rd(AbstractC5794td abstractC5794td, AdRequest adRequest, d91 d91Var) {
        this.f54281d = abstractC5794td;
        this.f54279b = adRequest;
        this.f54280c = d91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5794td abstractC5794td = this.f54281d;
        AdRequest adRequest = this.f54279b;
        synchronized (abstractC5794td) {
            abstractC5794td.f55057f.m24768a(adRequest);
        }
        C5563p2 mo28629t = this.f54281d.mo28629t();
        if (mo28629t != null) {
            this.f54281d.mo21797b(mo28629t);
            return;
        }
        AbstractC5794td abstractC5794td2 = this.f54281d;
        abstractC5794td2.f55063l.m29611a(new C5740sd(abstractC5794td2, this.f54280c));
    }
}
