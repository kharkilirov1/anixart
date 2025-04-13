package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class bd1 {

    /* renamed from: a */
    @NonNull
    private final tf1 f48834a;

    /* renamed from: b */
    private boolean f48835b;

    public bd1(@NonNull cd1 cd1Var, @NonNull tf1 tf1Var) {
        this.f48834a = tf1Var;
        this.f48835b = cd1Var.getVolume() == 0.0f;
    }

    /* renamed from: a */
    public final void m22803a(float f2) {
        if (f2 == 0.0f) {
            if (this.f48835b) {
                return;
            }
            this.f48835b = true;
            this.f48834a.mo25519l();
            return;
        }
        if (this.f48835b) {
            this.f48835b = false;
            this.f48834a.mo25502a();
        }
    }
}
