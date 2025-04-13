package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ag0 extends dg1<yf0, ka0> {
    public ag0(@NonNull yf0 yf0Var) {
        super(yf0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull yf0 yf0Var) {
        super.mo22387a(yf0Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull yf0 yf0Var, @NonNull ka0 ka0Var) {
        yf0 yf0Var2 = yf0Var;
        ka0 ka0Var2 = ka0Var;
        String m26093b = ka0Var2.m26093b();
        if (TextUtils.isEmpty(m26093b)) {
            return;
        }
        yf0Var2.setAspectRatio(ka0Var2.m26092a());
        yf0Var2.m29936b(m26093b);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22499a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable ka0 ka0Var) {
        yf0 m23881b = m23881b();
        if (m23881b != null) {
            gg1Var.mo24889a(m23881b, c5276ja);
            gg1Var.mo24890a(c5276ja, new if0(m23881b));
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo22388a(@NonNull yf0 yf0Var, @NonNull ka0 ka0Var) {
        return true;
    }
}
