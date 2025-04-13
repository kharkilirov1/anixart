package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.bw */
/* loaded from: classes3.dex */
public final class C4889bw implements ko0 {

    /* renamed from: a */
    @Nullable
    private WeakReference<InterfaceC5541ok> f49004a;

    /* renamed from: b */
    @Nullable
    private m91 f49005b;

    /* renamed from: a */
    public final void m22941a(@Nullable InterfaceC5541ok interfaceC5541ok) {
        this.f49004a = new WeakReference<>(interfaceC5541ok);
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: c */
    public final void mo22867c() {
        WeakReference<InterfaceC5541ok> weakReference = this.f49004a;
        InterfaceC5541ok interfaceC5541ok = weakReference != null ? weakReference.get() : null;
        if (interfaceC5541ok != null) {
            interfaceC5541ok.mo27088c();
        }
    }

    /* renamed from: a */
    public final void m22940a(@NonNull m91 m91Var) {
        this.f49005b = m91Var;
    }

    @Override // com.yandex.mobile.ads.impl.ko0
    /* renamed from: a */
    public final void mo22865a(boolean z) {
        m91 m91Var = this.f49005b;
        if (m91Var != null) {
            m91Var.mo24274a(z);
        }
    }
}
