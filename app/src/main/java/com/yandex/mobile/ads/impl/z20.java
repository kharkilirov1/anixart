package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.InitializationListener;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z20 {

    /* renamed from: a */
    @NonNull
    private final le0 f57016a;

    /* renamed from: b */
    @NonNull
    private final InitializationListener f57017b;

    public z20(@NonNull le0 le0Var, @NonNull InitializationListener initializationListener) {
        this.f57016a = le0Var;
        this.f57017b = initializationListener;
    }

    /* renamed from: a */
    public final void m30044a() {
        le0 le0Var = this.f57016a;
        InitializationListener initializationListener = this.f57017b;
        Objects.requireNonNull(initializationListener);
        le0Var.m26440b(new rp1(initializationListener, 1));
    }
}
