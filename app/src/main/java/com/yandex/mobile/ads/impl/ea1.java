package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;

/* loaded from: classes3.dex */
public final class ea1 extends g71<pa1, ha1> {

    /* renamed from: u */
    @NonNull
    private final ka1 f49854u;

    public ea1(@NonNull Context context, @NonNull String str, @NonNull vh1.C5921b c5921b, @NonNull pa1 pa1Var, @NonNull ta1 ta1Var) {
        super(context, 0, str, c5921b, pa1Var, ta1Var);
        this.f49854u = new ka1(context);
        n60.m26812e("Loading data ... url: %s", str);
    }

    @Override // com.yandex.mobile.ads.impl.g71
    /* renamed from: a */
    public final tw0<ha1> mo24051a(@NonNull km0 km0Var, int i2) {
        ha1 m26094a = this.f49854u.m26094a(km0Var);
        return m26094a != null ? !m26094a.m25101b().m23087b().isEmpty() ? tw0.m28764a(m26094a, null) : tw0.m28763a(new C5143gr()) : tw0.m28763a(new cp0("Can't parse VAST response."));
    }
}
