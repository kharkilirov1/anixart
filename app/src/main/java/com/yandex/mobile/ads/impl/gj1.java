package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
final class gj1 {

    /* renamed from: a */
    @NonNull
    private final lc1 f50630a;

    /* renamed from: b */
    @NonNull
    private final fa1 f50631b;

    public gj1(@NonNull Context context, @NonNull fa1 fa1Var) {
        this.f50631b = fa1Var;
        this.f50630a = lc1.m26427a(context);
    }

    /* renamed from: a */
    public final void m24907a(@NonNull Context context, @NonNull pb1 pb1Var, @NonNull hw0<List<pb1>> hw0Var) {
        this.f50630a.m26430a(context, pb1Var, this.f50631b, new hj1(context, pb1Var, hw0Var));
    }
}
