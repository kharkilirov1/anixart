package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;

/* loaded from: classes3.dex */
public final class c41 implements InterfaceC5509nt {

    /* renamed from: b */
    private final long f49083b;

    /* renamed from: c */
    private final InterfaceC5509nt f49084c;

    /* renamed from: com.yandex.mobile.ads.impl.c41$a */
    public class C4903a implements e01 {

        /* renamed from: a */
        public final /* synthetic */ e01 f49085a;

        public C4903a(e01 e01Var) {
            this.f49085a = e01Var;
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final boolean mo22566b() {
            return this.f49085a.mo22566b();
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: c */
        public final long mo22567c() {
            return this.f49085a.mo22567c();
        }

        @Override // com.yandex.mobile.ads.impl.e01
        /* renamed from: b */
        public final e01.C4997a mo22565b(long j2) {
            e01.C4997a mo22565b = this.f49085a.mo22565b(j2);
            g01 g01Var = mo22565b.f49774a;
            g01 g01Var2 = new g01(g01Var.f50468a, c41.this.f49083b + g01Var.f50469b);
            g01 g01Var3 = mo22565b.f49775b;
            return new e01.C4997a(g01Var2, new g01(g01Var3.f50468a, c41.this.f49083b + g01Var3.f50469b));
        }
    }

    public c41(long j2, InterfaceC5509nt interfaceC5509nt) {
        this.f49083b = j2;
        this.f49084c = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final y61 mo23022a(int i2, int i3) {
        return this.f49084c.mo23022a(i2, i3);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final void mo23023a() {
        this.f49084c.mo23023a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final void mo23024a(e01 e01Var) {
        this.f49084c.mo23024a(new C4903a(e01Var));
    }
}
