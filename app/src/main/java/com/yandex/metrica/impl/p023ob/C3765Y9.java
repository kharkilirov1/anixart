package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4188oi;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.Y9 */
/* loaded from: classes2.dex */
public class C3765Y9 implements InterfaceC3920ea<C4188oi, C4082kg.a> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.a mo17818b(@NonNull C4188oi c4188oi) {
        C4082kg.a.C7003a c7003a;
        C4082kg.a aVar = new C4082kg.a();
        aVar.f45666b = new C4082kg.a.b[c4188oi.f46086a.size()];
        for (int i2 = 0; i2 < c4188oi.f46086a.size(); i2++) {
            C4082kg.a.b bVar = new C4082kg.a.b();
            Pair<String, C4188oi.a> pair = c4188oi.f46086a.get(i2);
            bVar.f45669b = (String) pair.first;
            if (pair.second != null) {
                bVar.f45670c = new C4082kg.a.C7003a();
                C4188oi.a aVar2 = (C4188oi.a) pair.second;
                if (aVar2 == null) {
                    c7003a = null;
                } else {
                    C4082kg.a.C7003a c7003a2 = new C4082kg.a.C7003a();
                    c7003a2.f45667b = aVar2.f46087a;
                    c7003a = c7003a2;
                }
                bVar.f45670c = c7003a;
            }
            aVar.f45666b[i2] = bVar;
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C4188oi mo17817a(@NonNull C4082kg.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C4082kg.a.b bVar : aVar.f45666b) {
            String str = bVar.f45669b;
            C4082kg.a.C7003a c7003a = bVar.f45670c;
            arrayList.add(new Pair(str, c7003a == null ? null : new C4188oi.a(c7003a.f45667b)));
        }
        return new C4188oi(arrayList);
    }
}
