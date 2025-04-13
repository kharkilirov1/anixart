package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class uj0 implements InterfaceC4942cw {

    /* renamed from: d */
    private static final long f55543d = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a */
    @NonNull
    private final qs0 f55544a;

    /* renamed from: b */
    @NonNull
    private final lp0 f55545b = new lp0(false);

    /* renamed from: c */
    private final long f55546c;

    /* renamed from: com.yandex.mobile.ads.impl.uj0$a */
    public class C5869a implements mp0, n61 {
        private C5869a() {
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            uj0.this.f55544a.mo26485a();
        }

        public /* synthetic */ C5869a(uj0 uj0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.n61
        /* renamed from: a */
        public final void mo26253a(long j2) {
            uj0.this.f55544a.mo26486a(uj0.this.f55546c, uj0.this.f55546c - j2);
        }
    }

    public uj0(@NonNull AdResponse<?> adResponse, @NonNull qs0 qs0Var) {
        this.f55544a = qs0Var;
        this.f55546c = m29030a(adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f55545b.m26513a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
        this.f55545b.m26516b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
        this.f55545b.m26517d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        C5869a c5869a = new C5869a(this, 0);
        this.f55545b.m26514a(this.f55546c, c5869a);
        this.f55545b.m26515a(c5869a);
    }

    /* renamed from: a */
    private static long m29030a(@NonNull AdResponse adResponse) {
        Long m21803D = adResponse.m21803D();
        if (m21803D == null) {
            m21803D = Long.valueOf(f55543d);
        }
        return m21803D.longValue();
    }
}
