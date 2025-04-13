package com.yandex.metrica.impl.p023ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.C1 */
/* loaded from: classes2.dex */
class C3208C1 implements InterfaceC3310G3<C3410K3> {

    /* renamed from: a */
    public final /* synthetic */ C3183B1 f42651a;

    public C3208C1(C3183B1 c3183b1) {
        this.f42651a = c3183b1;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3310G3
    /* renamed from: a */
    public boolean mo17915a(C3410K3 c3410k3) {
        Context context;
        context = this.f42651a.f42583c;
        return !context.getPackageName().equals(c3410k3.f43265a);
    }
}
