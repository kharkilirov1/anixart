package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public class zf0 extends C6117zd {

    /* renamed from: b */
    public final mf0 f57137b;

    public zf0(@NonNull yo0 yo0Var, @NonNull InterfaceC5719rz interfaceC5719rz) {
        super(yo0Var);
        mf0 mf0Var = new mf0(yo0Var);
        this.f57137b = mf0Var;
        mf0Var.m26649a(new C6121a(interfaceC5719rz));
    }

    @Override // com.yandex.mobile.ads.impl.C6117zd, com.yandex.mobile.ads.impl.InterfaceC5418lz
    /* renamed from: a */
    public final void mo26546a(@NonNull String str) {
        this.f57137b.m26651a(str);
    }

    @Override // com.yandex.mobile.ads.impl.C6117zd, com.yandex.mobile.ads.impl.InterfaceC5418lz
    public final void invalidate() {
        super.invalidate();
        this.f57137b.m26644a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.zf0$a */
    public static class C6121a implements wf0 {

        /* renamed from: a */
        @NonNull
        private final WeakReference<InterfaceC5719rz> f57138a;

        public C6121a(@NonNull InterfaceC5719rz interfaceC5719rz) {
            this.f57138a = new WeakReference<>(interfaceC5719rz);
        }

        @Override // com.yandex.mobile.ads.impl.wf0
        /* renamed from: a */
        public final void mo29478a(@NonNull yo0 yo0Var, @Nullable Map map) {
            InterfaceC5719rz interfaceC5719rz = this.f57138a.get();
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23255a(yo0Var, map);
            }
        }

        @Override // com.yandex.mobile.ads.impl.wf0
        /* renamed from: a */
        public final void mo29479a(@NonNull String str) {
            InterfaceC5719rz interfaceC5719rz = this.f57138a.get();
            if (interfaceC5719rz != null) {
                interfaceC5719rz.mo23256a(str);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.C6117zd
    /* renamed from: a */
    public final void mo30150a(@NonNull InterfaceC5719rz interfaceC5719rz) {
        super.mo30150a(new rf0(this.f57137b, interfaceC5719rz));
    }
}
