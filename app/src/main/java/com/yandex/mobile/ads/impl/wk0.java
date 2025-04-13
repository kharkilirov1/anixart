package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class wk0 {

    /* renamed from: a */
    @NonNull
    private final C5198hs f56156a;

    public wk0(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f56156a = new C5198hs(context, adResponse, c5101g2);
    }

    @NonNull
    /* renamed from: a */
    public final C5987ws m29493a(@NonNull hc1 hc1Var) {
        C5987ws m28735a = C5815ts.m28734a().m28735a(hc1Var);
        if (m28735a != null && !m28735a.m29553g()) {
            return m28735a;
        }
        C5987ws m25359a = this.f56156a.m25359a();
        C5815ts.m28734a().m28736a(hc1Var, m25359a);
        return m25359a;
    }
}
