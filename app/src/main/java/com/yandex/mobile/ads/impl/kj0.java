package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class kj0 implements InterfaceC4942cw {

    /* renamed from: a */
    @NonNull
    private final nx0 f51988a;

    /* renamed from: b */
    @NonNull
    private final lp0 f51989b = new lp0(false);

    /* renamed from: c */
    private final long f51990c;

    /* renamed from: com.yandex.mobile.ads.impl.kj0$a */
    public class C5340a implements mp0 {
        private C5340a() {
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            kj0.m26132a(kj0.this);
        }

        public /* synthetic */ C5340a(kj0 kj0Var, int i2) {
            this();
        }
    }

    public kj0(@NonNull AdResponse adResponse, @NonNull nx0 nx0Var) {
        this.f51988a = nx0Var;
        this.f51990c = m26131a(adResponse);
    }

    /* renamed from: a */
    private static long m26131a(@NonNull AdResponse adResponse) {
        Long m21803D = adResponse.m21803D();
        if (m21803D == null) {
            m21803D = 5000L;
        }
        return m21803D.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f51989b.m26513a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
        this.f51989b.m26516b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
        this.f51989b.m26517d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f51989b.m26514a(this.f51990c, new C5340a(this, 0));
    }

    /* renamed from: a */
    public static void m26132a(kj0 kj0Var) {
        kj0Var.f51988a.mo25995a();
    }
}
