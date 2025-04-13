package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Lc */
/* loaded from: classes2.dex */
public class C3444Lc {

    /* renamed from: a */
    @NonNull
    private final C3366I9 f43316a;

    /* renamed from: b */
    @NonNull
    private final C4079kd f43317b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3519Oc f43318c;

    /* renamed from: d */
    @NonNull
    private final C3369Ic f43319d;

    /* renamed from: e */
    @NonNull
    private final C3319Gc f43320e;

    /* renamed from: f */
    @NonNull
    private final C3419Kc f43321f;

    /* renamed from: com.yandex.metrica.impl.ob.Lc$a */
    public class a implements InterfaceC3519Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3519Oc
        /* renamed from: a */
        public long mo18500a() {
            return C3444Lc.this.f43316a.m18283b(0L);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3519Oc
        /* renamed from: a */
        public void mo18501a(long j2) {
            C3444Lc.this.f43316a.m18297g(j2);
        }
    }

    public C3444Lc(@NonNull C4079kd c4079kd, @NonNull C3366I9 c3366i9, @NonNull C4417xd c4417xd) {
        this.f43317b = c4079kd;
        this.f43316a = c3366i9;
        InterfaceC3519Oc m18498b = m18498b();
        this.f43318c = m18498b;
        this.f43320e = m18494a(m18498b);
        this.f43319d = m18496a();
        this.f43321f = m18497a(c4417xd);
    }

    @NonNull
    /* renamed from: b */
    private InterfaceC3519Oc m18498b() {
        return new a();
    }

    @NonNull
    /* renamed from: a */
    private C3369Ic m18496a() {
        return new C3369Ic(this.f43317b.f45611a.f47109b);
    }

    @NonNull
    /* renamed from: a */
    private C3319Gc m18494a(@NonNull InterfaceC3519Oc interfaceC3519Oc) {
        return new C3319Gc(interfaceC3519Oc, new C3583R2());
    }

    @NonNull
    /* renamed from: a */
    private C3419Kc m18497a(@NonNull C4417xd c4417xd) {
        C4468zc c4468zc = this.f43317b.f45611a;
        return new C3419Kc(c4468zc.f47108a, c4417xd, c4468zc.f47109b, c4468zc.f47110c);
    }

    @NonNull
    /* renamed from: a */
    public C4131md<C3394Jc> m18499a(@Nullable C3394Jc c3394Jc) {
        return new C4131md<>(this.f43321f, this.f43320e, new C4364vc(this.f43318c, new C3504Nm()), this.f43319d, c3394Jc);
    }
}
