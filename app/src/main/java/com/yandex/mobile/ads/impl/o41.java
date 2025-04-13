package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class o41 implements dx0<String> {
    @Override // com.yandex.mobile.ads.impl.dx0
    @Nullable
    /* renamed from: a */
    public final String mo23954a(@NonNull sw0 sw0Var) {
        byte[] m29582a = sw0Var.m28364a().m29582a();
        if (m29582a == null) {
            return null;
        }
        try {
            return new String(m29582a, C5150gy.m24995a(sw0Var.m28365b()));
        } catch (Exception unused) {
            return new String(m29582a);
        }
    }
}
