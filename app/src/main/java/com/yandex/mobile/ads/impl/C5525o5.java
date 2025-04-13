package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.o5 */
/* loaded from: classes3.dex */
public final class C5525o5 {

    /* renamed from: a */
    @NonNull
    private final Object f53169a = new Object();

    /* renamed from: b */
    @NonNull
    private int f53170b = 1;

    @NonNull
    /* renamed from: a */
    public final int m26999a() {
        int i2;
        synchronized (this.f53169a) {
            i2 = this.f53170b;
        }
        return i2;
    }

    /* renamed from: a */
    public final void m27000a(@NonNull int i2) {
        synchronized (this.f53169a) {
            this.f53170b = i2;
        }
    }
}
