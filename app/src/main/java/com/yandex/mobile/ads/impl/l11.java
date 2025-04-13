package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class l11 {

    /* renamed from: a */
    @NonNull
    private final Object f52210a = new Object();

    /* renamed from: b */
    private boolean f52211b;

    /* renamed from: a */
    public final void m26317a(@NonNull Runnable runnable) {
        synchronized (this.f52210a) {
            if (this.f52211b) {
                return;
            }
            this.f52211b = true;
            runnable.run();
        }
    }
}
