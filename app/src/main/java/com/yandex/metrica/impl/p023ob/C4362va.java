package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.va */
/* loaded from: classes2.dex */
public class C4362va implements InterfaceC3920ea {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.l[] mo17818b(@NonNull List<C4028ie> list) {
        C4082kg.l[] lVarArr = new C4082kg.l[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4028ie c4028ie = list.get(i2);
            C4082kg.l lVar = new C4082kg.l();
            lVar.f45751b = c4028ie.f45340a;
            lVar.f45752c = c4028ie.f45341b;
            lVarArr[i2] = lVar;
        }
        return lVarArr;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C4028ie> mo17817a(@NonNull C4082kg.l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (C4082kg.l lVar : lVarArr) {
            arrayList.add(new C4028ie(lVar.f45751b, lVar.f45752c));
        }
        return arrayList;
    }
}
