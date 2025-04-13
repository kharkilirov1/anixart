package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
final class o10 implements InterfaceC6019xa<z10> {

    /* renamed from: a */
    private final l41 f53133a = new l41();

    @Override // com.yandex.mobile.ads.impl.InterfaceC6019xa
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final boolean mo26351a(@NonNull z10 z10Var) {
        String m30042d = z10Var.m30042d();
        if (m30042d != null) {
            Objects.requireNonNull(this.f53133a);
            if (l41.a2(m30042d)) {
                return true;
            }
        }
        return false;
    }
}
