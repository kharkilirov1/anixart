package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.g0 */
/* loaded from: classes3.dex */
final class ViewOnClickListenerC5099g0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C5207i0 f50466a;

    public ViewOnClickListenerC5099g0(C5207i0 c5207i0) {
        this.f50466a = c5207i0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k91 k91Var;
        Context context;
        C4900c2 c4900c2;
        k91Var = this.f50466a.f51174j;
        context = this.f50466a.f51168d;
        c4900c2 = this.f50466a.f51169e;
        k91Var.m26091a(context, c4900c2.getUrl());
    }
}
