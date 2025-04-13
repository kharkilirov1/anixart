package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3952fg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wa */
/* loaded from: classes2.dex */
public class C4388wa implements InterfaceC3920ea<List<C4028ie>, C3952fg> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public List<C4028ie> mo17817a(@NonNull C3952fg c3952fg) {
        C3952fg c3952fg2 = c3952fg;
        ArrayList arrayList = new ArrayList(c3952fg2.f45131b.length);
        int i2 = 0;
        while (true) {
            C3952fg.a[] aVarArr = c3952fg2.f45131b;
            if (i2 >= aVarArr.length) {
                return arrayList;
            }
            C3952fg.a aVar = aVarArr[i2];
            arrayList.add(new C4028ie(aVar.f45133b, aVar.f45134c));
            i2++;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C3952fg mo17818b(@NonNull List<C4028ie> list) {
        List<C4028ie> list2 = list;
        C3952fg c3952fg = new C3952fg();
        c3952fg.f45131b = new C3952fg.a[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            C3952fg.a[] aVarArr = c3952fg.f45131b;
            C4028ie c4028ie = list2.get(i2);
            C3952fg.a aVar = new C3952fg.a();
            aVar.f45133b = c4028ie.f45340a;
            aVar.f45134c = c4028ie.f45341b;
            aVarArr[i2] = aVar;
        }
        return c3952fg;
    }
}
