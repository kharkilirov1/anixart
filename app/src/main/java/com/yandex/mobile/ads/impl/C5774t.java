package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.nativeads.C6218k;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.t */
/* loaded from: classes3.dex */
public final class C5774t {

    /* renamed from: a */
    @NonNull
    private final C5517o f54896a;

    public C5774t(@NonNull C5101g2 c5101g2, @NonNull AdResponse adResponse, @NonNull C6123zh c6123zh, @NonNull dk0 dk0Var, @NonNull C6264w c6264w, @NonNull C6218k c6218k, @Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f54896a = new C5517o(c5101g2, adResponse, c6123zh, dk0Var, c6264w, c6218k, interfaceC5763a);
    }

    /* renamed from: a */
    public final void m28383a(@NonNull View view, @Nullable List<AbstractC5419m> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (AbstractC5419m abstractC5419m : list) {
            InterfaceC5466n m26966a = this.f54896a.m26966a(view.getContext(), abstractC5419m);
            if (m26966a != null) {
                m26966a.mo22935a(view, abstractC5419m);
            }
        }
    }
}
