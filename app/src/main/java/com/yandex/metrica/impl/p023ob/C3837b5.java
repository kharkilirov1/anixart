package com.yandex.metrica.impl.p023ob;

import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.b5 */
/* loaded from: classes2.dex */
public class C3837b5 extends AbstractC3941f5<AbstractC3993h5> {

    /* renamed from: a */
    private final C3512O5 f44804a;

    public C3837b5(C3784Z3 c3784z3) {
        this.f44804a = new C3512O5(c3784z3);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3941f5
    /* renamed from: a */
    public C3863c5 mo19647a(int i2) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC4067k1.m20216a(i2).ordinal();
        if (ordinal == 16) {
            arrayList.add(this.f44804a.m18660a());
        } else if (ordinal == 24) {
            arrayList.add(this.f44804a.m18661b());
        } else if (ordinal == 46) {
            arrayList.add(this.f44804a.m18662c());
        }
        return new C3863c5(arrayList);
    }
}
