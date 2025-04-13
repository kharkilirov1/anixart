package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.pi */
/* loaded from: classes3.dex */
public final class C5592pi {
    @NonNull
    /* renamed from: a */
    public static InterfaceC4942cw m27331a(@NonNull AdResponse adResponse, @NonNull InterfaceC5748si interfaceC5748si, @NonNull zj0 zj0Var) {
        cl0 m30196a = zj0Var.m30196a();
        bm0 m30197b = zj0Var.m30197b();
        return m30196a != null ? new bl0(adResponse, m30196a, interfaceC5748si) : m30197b != null ? new am0(m30197b, interfaceC5748si) : new ij0(adResponse, interfaceC5748si);
    }
}
