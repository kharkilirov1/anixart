package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.mv */
/* loaded from: classes3.dex */
public final class C5461mv implements InterfaceC5512nv {

    /* renamed from: a */
    @Nullable
    private WeakReference<InterfaceC5512nv> f52816a;

    @Override // com.yandex.mobile.ads.impl.InterfaceC5512nv
    /* renamed from: a */
    public final void mo26321a() {
        InterfaceC5512nv interfaceC5512nv;
        WeakReference<InterfaceC5512nv> weakReference = this.f52816a;
        if (weakReference == null || (interfaceC5512nv = weakReference.get()) == null) {
            return;
        }
        interfaceC5512nv.mo26321a();
    }

    /* renamed from: a */
    public final void m26770a(@NonNull InterfaceC5512nv interfaceC5512nv) {
        this.f52816a = new WeakReference<>(interfaceC5512nv);
    }
}
