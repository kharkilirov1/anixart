package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ak0 {

    /* renamed from: a */
    @NonNull
    private final C5965wa f48598a;

    public ak0(@NonNull C5965wa c5965wa) {
        this.f48598a = c5965wa;
    }

    @NonNull
    /* renamed from: a */
    public final zj0 m22537a() {
        bm0 bm0Var;
        jc0 m29417a = this.f48598a.m29417a();
        cl0 cl0Var = null;
        if (m29417a != null) {
            cl0 cl0Var2 = m29417a.m25865c() != null ? new cl0() : null;
            bm0Var = m29417a.m25864b() != null ? new bm0() : null;
            cl0Var = cl0Var2;
        } else {
            bm0Var = null;
        }
        return new zj0(cl0Var, bm0Var);
    }
}
