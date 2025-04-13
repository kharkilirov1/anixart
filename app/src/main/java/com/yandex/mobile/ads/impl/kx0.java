package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class kx0 {
    @NonNull
    /* renamed from: a */
    public static InterfaceC4942cw m26297a(@NonNull AdResponse adResponse, @NonNull nx0 nx0Var, @NonNull zj0 zj0Var) {
        cl0 m30196a = zj0Var.m30196a();
        bm0 m30197b = zj0Var.m30197b();
        return m30196a != null ? new ol0(adResponse, m30196a, nx0Var) : m30197b != null ? new em0(m30197b, nx0Var) : new kj0(adResponse, nx0Var);
    }
}
