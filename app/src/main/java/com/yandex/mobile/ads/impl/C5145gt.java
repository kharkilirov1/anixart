package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.gt */
/* loaded from: classes3.dex */
public final class C5145gt {

    /* renamed from: a */
    @NonNull
    private final List<C5091ft> f50729a;

    public C5145gt(@NonNull cc1 cc1Var) {
        this.f50729a = cc1Var.m23219a();
    }

    /* renamed from: a */
    public final boolean m24969a() {
        for (C5091ft c5091ft : this.f50729a) {
            if (c5091ft.m24739a().equals("ad_system") && c5091ft.m24740b().equals("adfox")) {
                return true;
            }
        }
        return false;
    }
}
