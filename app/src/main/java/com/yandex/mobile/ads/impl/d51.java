package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes3.dex */
public final class d51 implements e70 {

    /* renamed from: a */
    private final boolean f49573a;

    public d51(@NonNull yo0 yo0Var) {
        this.f49573a = m23813a(yo0Var);
    }

    @VisibleForTesting
    /* renamed from: a */
    public static boolean m23813a(@NonNull yo0 yo0Var) {
        return yo0Var.isHardwareAccelerated();
    }

    @Override // com.yandex.mobile.ads.impl.e70
    @NonNull
    /* renamed from: a */
    public final String mo23814a() {
        return String.format("supports: {inlineVideo: %s}", Boolean.valueOf(this.f49573a));
    }
}
