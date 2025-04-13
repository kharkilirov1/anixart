package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class rv0 implements qc1 {

    /* renamed from: a */
    @NonNull
    private final tk0 f54423a;

    /* renamed from: b */
    @NonNull
    private final hc1<il0> f54424b;

    /* renamed from: c */
    @NonNull
    private final md1 f54425c;

    /* renamed from: d */
    @NonNull
    private final C5714a f54426d = new C5714a(this, 0);

    /* renamed from: e */
    @Nullable
    private wc1 f54427e;

    /* renamed from: com.yandex.mobile.ads.impl.rv0$a */
    public class C5714a implements fd1 {
        private C5714a() {
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: a */
        public final void mo24549a() {
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: a */
        public final void mo24550a(@NonNull ed1 ed1Var) {
            rv0.this.f54425c.m26628b();
            ((C5987ws) rv0.this.f54423a).m29546a((fd1) null);
            ((C5987ws) rv0.this.f54423a).m29552f();
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: b */
        public final void mo24551b() {
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: c */
        public final void mo24552c() {
            rv0.this.f54425c.m26627a();
            if (rv0.this.f54427e != null) {
                rv0.this.f54427e.mo25597c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: d */
        public final void mo24553d() {
            rv0.this.f54425c.m26628b();
            ((C5987ws) rv0.this.f54423a).m29546a((fd1) null);
            if (rv0.this.f54427e != null) {
                rv0.this.f54427e.mo25596b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: e */
        public final void mo24554e() {
            rv0.this.f54425c.m26628b();
            ((C5987ws) rv0.this.f54423a).m29546a((fd1) null);
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: f */
        public final void mo24555f() {
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: g */
        public final void mo24556g() {
            rv0.this.f54425c.m26628b();
            ((C5987ws) rv0.this.f54423a).m29546a((fd1) null);
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: h */
        public final void mo24557h() {
            ((C5987ws) rv0.this.f54423a).m29556j();
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        /* renamed from: i */
        public final void mo24558i() {
        }

        @Override // com.yandex.mobile.ads.impl.fd1
        public final void onVolumeChanged(float f2) {
        }

        public /* synthetic */ C5714a(rv0 rv0Var, int i2) {
            this();
        }
    }

    public rv0(@NonNull C5987ws c5987ws, @NonNull hc1 hc1Var, @NonNull jd1 jd1Var) {
        this.f54423a = c5987ws;
        this.f54424b = hc1Var;
        this.f54425c = new md1(new vk0(c5987ws), jd1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    public final void play() {
        ((C5987ws) this.f54423a).m29546a(this.f54426d);
        ((C5987ws) this.f54423a).m29547a(this.f54424b.m25118c());
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    public final void stop() {
        this.f54425c.m26628b();
        ((C5987ws) this.f54423a).m29555i();
        ((C5987ws) this.f54423a).m29558l();
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    /* renamed from: a */
    public final void mo24925a(@Nullable wc1 wc1Var) {
        this.f54427e = wc1Var;
    }
}
