package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Zh */
/* loaded from: classes2.dex */
class C3798Zh {

    /* renamed from: a */
    private final String f44686a;

    /* renamed from: b */
    @NonNull
    private final C3583R2 f44687b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3529Om f44688c;

    /* renamed from: d */
    @NonNull
    private final C3748Xh f44689d;

    public C3798Zh(String str, @NonNull C3723Wh c3723Wh) {
        this(str, new C3583R2(), new C3504Nm(), new C3748Xh(c3723Wh));
    }

    /* renamed from: a */
    public void m19524a(@NonNull InterfaceC3980gi interfaceC3980gi, int i2, @NonNull C3275Ei c3275Ei) {
        this.f44689d.m19395a(c3275Ei.f42821g);
        C3583R2 c3583r2 = this.f44687b;
        long m19393a = this.f44689d.m19393a(i2);
        long j2 = c3275Ei.f42821g;
        StringBuilder m24u = C0000a.m24u("report ");
        m24u.append(this.f44686a);
        if (c3583r2.m18938b(m19393a, j2, m24u.toString())) {
            ((RunnableC4058ji) interfaceC3980gi).m20150a(this.f44686a, Integer.valueOf(i2));
            this.f44689d.m19394a(i2, this.f44688c.mo18644b());
        }
    }

    @VisibleForTesting
    public C3798Zh(@NonNull String str, @NonNull C3583R2 c3583r2, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3748Xh c3748Xh) {
        this.f44686a = str;
        this.f44687b = c3583r2;
        this.f44688c = interfaceC3529Om;
        this.f44689d = c3748Xh;
    }
}
