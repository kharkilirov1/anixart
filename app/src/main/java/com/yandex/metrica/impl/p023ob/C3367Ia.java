package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3932em;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ia */
/* loaded from: classes2.dex */
class C3367Ia implements InterfaceC3920ea<List<C3932em>, C4082kg.x[]> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.x[] mo17818b(@NonNull List<C3932em> list) {
        C4082kg.x[] xVarArr = new C4082kg.x[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3932em c3932em = list.get(i2);
            C4082kg.x xVar = new C4082kg.x();
            xVar.f45812b = c3932em.f45067a.f45074a;
            xVar.f45813c = c3932em.f45068b;
            xVarArr[i2] = xVar;
        }
        return xVarArr;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public List<C3932em> mo17817a(@NonNull C4082kg.x[] xVarArr) {
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (C4082kg.x xVar : xVarArr) {
            arrayList.add(new C3932em(C3932em.b.m19829a(xVar.f45812b), xVar.f45813c));
        }
        return arrayList;
    }
}
