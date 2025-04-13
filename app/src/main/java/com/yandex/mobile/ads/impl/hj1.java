package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public final class hj1 implements hw0<List<pb1>> {

    /* renamed from: a */
    @NonNull
    private final ij1 f50944a;

    /* renamed from: b */
    @NonNull
    private final hw0<List<pb1>> f50945b;

    public hj1(@NonNull Context context, @NonNull pb1 pb1Var, @NonNull hw0<List<pb1>> hw0Var) {
        this.f50945b = hw0Var;
        this.f50944a = new ij1(context, pb1Var);
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22374a(@NonNull List<pb1> list) {
        this.f50945b.mo22374a((hw0<List<pb1>>) this.f50944a.m25550a(list));
    }

    @Override // com.yandex.mobile.ads.impl.hw0
    /* renamed from: a */
    public final void mo22373a(@NonNull ac1 ac1Var) {
        this.f50945b.mo22373a(ac1Var);
    }
}
