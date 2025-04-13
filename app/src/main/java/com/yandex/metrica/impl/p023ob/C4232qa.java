package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qa */
/* loaded from: classes2.dex */
public class C4232qa implements InterfaceC3920ea {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.y.a[] mo17818b(@NonNull List<C3494Nc> list) {
        C4082kg.y.a[] aVarArr = new C4082kg.y.a[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3494Nc c3494Nc = list.get(i2);
            C4082kg.y.a aVar = new C4082kg.y.a();
            aVar.f45818b = c3494Nc.f43465a;
            aVar.f45819c = c3494Nc.f43466b;
            aVarArr[i2] = aVar;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C3494Nc> mo17817a(@NonNull C4082kg.y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C4082kg.y.a aVar : aVarArr) {
            arrayList.add(new C3494Nc(aVar.f45818b, aVar.f45819c));
        }
        return arrayList;
    }
}
