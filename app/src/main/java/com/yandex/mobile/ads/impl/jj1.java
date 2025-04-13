package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public final class jj1 {

    /* renamed from: a */
    @NonNull
    private final Context f51629a;

    /* renamed from: b */
    @NonNull
    private final fa1 f51630b;

    /* renamed from: c */
    private int f51631c;

    public jj1(@NonNull Context context, @NonNull fa1 fa1Var) {
        this.f51629a = context.getApplicationContext();
        this.f51630b = fa1Var;
    }

    /* renamed from: a */
    public final void m25898a(@NonNull Context context, @NonNull List<pb1> list, @NonNull hw0<List<pb1>> hw0Var) {
        int i2 = this.f51631c + 1;
        this.f51631c = i2;
        if (i2 <= 5) {
            new kj1(this.f51629a, this.f51630b).m26137a(context, list, hw0Var);
        } else {
            hw0Var.mo22373a(ac1.m22462b("Maximum count of VAST wrapper requests exceeded."));
        }
    }
}
