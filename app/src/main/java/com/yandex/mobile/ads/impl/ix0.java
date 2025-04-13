package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ix0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f51452a;

    /* renamed from: b */
    @NonNull
    private final zj0 f51453b;

    /* renamed from: c */
    @NonNull
    private final C5612q0 f51454c;

    /* renamed from: d */
    @NonNull
    private final nx0 f51455d;

    /* renamed from: e */
    @NonNull
    private final kx0 f51456e = new kx0();

    /* renamed from: f */
    @Nullable
    private InterfaceC4942cw f51457f;

    /* renamed from: g */
    @Nullable
    private InterfaceC5665r0 f51458g;

    /* renamed from: com.yandex.mobile.ads.impl.ix0$a */
    public class C5255a implements InterfaceC5665r0 {
        private C5255a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: a */
        public final void mo22944a() {
            if (ix0.this.f51457f != null) {
                ix0.this.f51457f.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: b */
        public final void mo22945b() {
            if (ix0.this.f51457f != null) {
                ix0.this.f51457f.pause();
            }
        }

        public /* synthetic */ C5255a(ix0 ix0Var, int i2) {
            this();
        }
    }

    public ix0(@NonNull AdResponse adResponse, @NonNull C5612q0 c5612q0, @NonNull C5923vj c5923vj, @NonNull zj0 zj0Var) {
        this.f51452a = adResponse;
        this.f51453b = zj0Var;
        this.f51454c = c5612q0;
        this.f51455d = c5923vj;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        InterfaceC5665r0 interfaceC5665r0 = this.f51458g;
        if (interfaceC5665r0 != null) {
            this.f51454c.m27589b(interfaceC5665r0);
        }
        InterfaceC4942cw interfaceC4942cw = this.f51457f;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        C5255a c5255a = new C5255a(this, 0);
        this.f51458g = c5255a;
        this.f51454c.m27587a(c5255a);
        kx0 kx0Var = this.f51456e;
        AdResponse<?> adResponse = this.f51452a;
        nx0 nx0Var = this.f51455d;
        zj0 zj0Var = this.f51453b;
        Objects.requireNonNull(kx0Var);
        InterfaceC4942cw m26297a = kx0.m26297a(adResponse, nx0Var, zj0Var);
        this.f51457f = m26297a;
        m26297a.start();
    }
}
