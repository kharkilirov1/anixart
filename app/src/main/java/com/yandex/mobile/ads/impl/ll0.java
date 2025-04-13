package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class ll0 {

    /* renamed from: a */
    @NonNull
    private final zf1 f52444a;

    /* renamed from: b */
    @NonNull
    private final qe1 f52445b;

    /* renamed from: c */
    @NonNull
    private final C5101g2 f52446c;

    /* renamed from: d */
    @NonNull
    private final AdResponse<?> f52447d;

    /* renamed from: e */
    @NonNull
    private final oe1 f52448e;

    /* renamed from: f */
    @NonNull
    private final hl0 f52449f;

    public ll0(@NonNull zf1 zf1Var, @NonNull qe1 qe1Var, @NonNull C5101g2 c5101g2, @NonNull AdResponse adResponse, @NonNull oe1 oe1Var, @NonNull cl0 cl0Var) {
        this.f52444a = zf1Var;
        this.f52445b = qe1Var;
        this.f52446c = c5101g2;
        this.f52447d = adResponse;
        this.f52448e = oe1Var;
        this.f52449f = cl0Var;
    }

    @NonNull
    /* renamed from: a */
    public final kl0 m26496a(@NonNull Context context, @NonNull C5987ws c5987ws, @NonNull hc1 hc1Var, @NonNull tf1 tf1Var) {
        return new kl0(context, c5987ws, hc1Var, this.f52445b, this.f52444a, new yc1(this.f52446c, this.f52447d), tf1Var, this.f52448e, this.f52449f);
    }
}
