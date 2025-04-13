package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class px0 {
    @Nullable
    /* renamed from: a */
    public static InterfaceC4942cw m27579a(@NonNull AdResponse adResponse, @NonNull qs0 qs0Var, @NonNull zj0 zj0Var) {
        cl0 m30196a = zj0Var.m30196a();
        bm0 m30197b = zj0Var.m30197b();
        if (m30196a != null) {
            return new pl0(adResponse, m30196a, qs0Var);
        }
        if (m30197b == null) {
            return new uj0(adResponse, qs0Var);
        }
        return null;
    }
}
