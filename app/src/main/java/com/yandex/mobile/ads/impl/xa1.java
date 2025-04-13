package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;
import java.util.List;

/* loaded from: classes3.dex */
public final class xa1 extends g71<pb1, List<pb1>> {

    /* renamed from: u */
    @NonNull
    private final ka1 f56416u;

    public xa1(@NonNull Context context, @NonNull String str, @NonNull vh1.C5921b c5921b, @NonNull pb1 pb1Var, @NonNull pj1 pj1Var) {
        super(context, 0, str, c5921b, pb1Var, pj1Var);
        this.f56416u = new ka1(context);
    }

    @Override // com.yandex.mobile.ads.impl.g71
    /* renamed from: a */
    public final tw0<List<pb1>> mo24051a(@NonNull km0 km0Var, int i2) {
        ha1 m26094a = this.f56416u.m26094a(km0Var);
        if (m26094a == null) {
            return tw0.m28763a(new cp0("Can't parse VAST response."));
        }
        List<pb1> m23087b = m26094a.m25101b().m23087b();
        return m23087b.isEmpty() ? tw0.m28763a(new C5143gr()) : tw0.m28764a(m23087b, null);
    }
}
