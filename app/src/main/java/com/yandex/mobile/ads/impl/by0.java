package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class by0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final C5612q0 f49026a;

    /* renamed from: b */
    @NonNull
    private final o61 f49027b;

    /* renamed from: c */
    @NonNull
    private final lk0 f49028c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5665r0 f49029d;

    /* renamed from: com.yandex.mobile.ads.impl.by0$a */
    public static class C4892a implements InterfaceC5665r0 {

        /* renamed from: a */
        @NonNull
        private final lk0 f49030a;

        public C4892a(@NonNull lk0 lk0Var) {
            this.f49030a = lk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: a */
        public final void mo22944a() {
            this.f49030a.m26484c();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: b */
        public final void mo22945b() {
            this.f49030a.m26483b();
        }
    }

    public by0(@NonNull AdResponse<?> adResponse, @NonNull C5612q0 c5612q0, @NonNull o61 o61Var, @NonNull zj0 zj0Var) {
        this.f49026a = c5612q0;
        this.f49027b = o61Var;
        lk0 lk0Var = new lk0(adResponse, o61Var, zj0Var);
        this.f49028c = lk0Var;
        this.f49029d = new C4892a(lk0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        this.f49026a.m27587a(this.f49029d);
        this.f49028c.m26482a(this.f49027b.m27009a(v));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        this.f49026a.m27589b(this.f49029d);
        this.f49028c.m26481a();
    }
}
