package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class nf1 {

    /* renamed from: a */
    @NonNull
    private final Object f52965a = new Object();

    /* renamed from: b */
    @NonNull
    private int f52966b = 1;

    @NonNull
    /* renamed from: a */
    public final int m26883a() {
        int i2;
        synchronized (this.f52965a) {
            i2 = this.f52966b;
        }
        return i2;
    }

    /* renamed from: a */
    public final void m26884a(@NonNull int i2) {
        synchronized (this.f52965a) {
            this.f52966b = i2;
        }
    }
}
