package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Gc */
/* loaded from: classes2.dex */
public class C3319Gc extends AbstractC3220Cd<C3394Jc> {
    @VisibleForTesting
    public C3319Gc(@NonNull InterfaceC3519Oc interfaceC3519Oc, @NonNull C3583R2 c3583r2) {
        super(interfaceC3519Oc, c3583r2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3220Cd
    @NonNull
    /* renamed from: a */
    public String mo17935a() {
        return "fused";
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4286sc
    /* renamed from: a */
    public boolean mo18159a(@NonNull Object obj) {
        C3344Hc c3344Hc = ((C3394Jc) obj).f43243b;
        return c3344Hc != null && m17936a(c3344Hc.f43054c);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4286sc
    /* renamed from: b */
    public boolean mo18160b(@NonNull Object obj) {
        return ((C3394Jc) obj).f43242a.f46999a;
    }
}
