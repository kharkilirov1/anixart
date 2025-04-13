package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class nm0 implements mm0 {

    /* renamed from: a */
    @NonNull
    private final C5435md f53040a = new C5435md();

    @Override // com.yandex.mobile.ads.impl.mm0
    @Nullable
    /* renamed from: a */
    public final String mo26691a(@NonNull sw0 sw0Var) {
        if (sw0Var.m28364a().m29582a() == null) {
            return null;
        }
        C5435md c5435md = this.f53040a;
        byte[] m29582a = sw0Var.m28364a().m29582a();
        Objects.requireNonNull(c5435md);
        return C5435md.m26616a(m29582a);
    }
}
