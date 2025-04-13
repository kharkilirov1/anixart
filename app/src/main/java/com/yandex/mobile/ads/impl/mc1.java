package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class mc1 {

    /* renamed from: a */
    @NonNull
    private final Context f52644a;

    /* renamed from: b */
    @NonNull
    private final Object f52645b = new Object();

    /* renamed from: c */
    @NonNull
    private final oc1 f52646c;

    public mc1(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f52644a = context.getApplicationContext();
        this.f52646c = new oc1(context, c5724s3);
    }

    /* renamed from: a */
    public final void m26614a(@NonNull pa1 pa1Var, @NonNull ma1 ma1Var) {
        this.f52646c.m27076a(pa1Var, this.f52645b, new sa1(this.f52644a, ma1Var));
    }

    /* renamed from: a */
    public final void m26613a(@NonNull lh1 lh1Var, @NonNull a40 a40Var) {
        this.f52646c.m27075a(lh1Var, this.f52645b, a40Var);
    }
}
