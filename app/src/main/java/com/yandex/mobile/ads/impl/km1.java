package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class km1 {

    /* renamed from: a */
    private boolean f52037a;

    /* renamed from: a */
    public final void m26167a(Context context) {
        xm1.m29769a(context, "Application Context cannot be null");
        if (this.f52037a) {
            return;
        }
        this.f52037a = true;
        cn1.m23491a().m23493a(context);
        em1.m24209a().m24210a(context);
        gm1.m24944a(context);
        qm1.m27750a().m27751a(context);
    }

    /* renamed from: a */
    public final boolean m26168a() {
        return this.f52037a;
    }
}
