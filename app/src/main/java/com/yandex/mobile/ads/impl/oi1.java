package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class oi1 implements Runnable {

    /* renamed from: b */
    private final int f53274b;

    /* renamed from: c */
    @Nullable
    private final String f53275c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5773sz f53276d;

    public oi1(int i2, @Nullable String str, @NonNull InterfaceC5773sz interfaceC5773sz) {
        this.f53274b = i2;
        this.f53275c = str;
        this.f53276d = interfaceC5773sz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((AbstractC5368kz) this.f53276d).m26302a(this.f53274b, this.f53275c);
    }
}
