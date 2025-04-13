package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k4 */
/* loaded from: classes3.dex */
public final class RunnableC5317k4 implements Runnable {

    /* renamed from: b */
    @Nullable
    private InterfaceC5719rz f51833b;

    /* renamed from: a */
    public final void m26023a(@Nullable InterfaceC5719rz interfaceC5719rz) {
        this.f51833b = interfaceC5719rz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5719rz interfaceC5719rz = this.f51833b;
        if (interfaceC5719rz != null) {
            interfaceC5719rz.mo23253a(AbstractC5524o4.f53158j);
        }
    }
}
