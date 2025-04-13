package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class ij0 implements InterfaceC4942cw {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5748si f51309a;

    /* renamed from: d */
    private final long f51312d;

    /* renamed from: c */
    @NonNull
    private final C5233a f51311c = new C5233a(this, 0);

    /* renamed from: b */
    @NonNull
    private final lp0 f51310b = new lp0(false);

    /* renamed from: com.yandex.mobile.ads.impl.ij0$a */
    public class C5233a implements mp0 {
        private C5233a() {
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            ij0.m25549a(ij0.this);
        }

        public /* synthetic */ C5233a(ij0 ij0Var, int i2) {
            this();
        }
    }

    public ij0(@NonNull AdResponse adResponse, @NonNull InterfaceC5748si interfaceC5748si) {
        this.f51309a = interfaceC5748si;
        this.f51312d = jj0.m25897a(adResponse);
    }

    /* renamed from: a */
    public static void m25549a(ij0 ij0Var) {
        ij0Var.f51309a.mo28252a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f51310b.m26513a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
        this.f51310b.m26516b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
        this.f51310b.m26517d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f51310b.m26514a(this.f51312d, this.f51311c);
    }
}
