package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3535P3;
import com.yandex.metrica.impl.p023ob.C3900dg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.da */
/* loaded from: classes2.dex */
public final class C3894da implements InterfaceC3920ea<C3535P3, C3900dg> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: a */
    public C3535P3 mo17817a(C3900dg c3900dg) {
        C3900dg c3900dg2 = c3900dg;
        C3900dg.a aVar = c3900dg2.f44942b;
        if (aVar == null) {
            aVar = new C3900dg.a();
        }
        C3535P3.a m19712a = m19712a(aVar);
        C3900dg.a[] aVarArr = c3900dg2.f44943c;
        Intrinsics.m32178g(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3900dg.a it : aVarArr) {
            Intrinsics.m32178g(it, "it");
            arrayList.add(m19712a(it));
        }
        return new C3535P3(m19712a, arrayList);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: b */
    public C3900dg mo17818b(C3535P3 c3535p3) {
        C3535P3 c3535p32 = c3535p3;
        C3900dg c3900dg = new C3900dg();
        c3900dg.f44942b = m19713a(c3535p32.m18728c());
        int size = c3535p32.mo17902a().size();
        C3900dg.a[] aVarArr = new C3900dg.a[size];
        for (int i2 = 0; i2 < size; i2++) {
            aVarArr[i2] = m19713a(c3535p32.mo17902a().get(i2));
        }
        c3900dg.f44943c = aVarArr;
        return c3900dg;
    }

    /* renamed from: a */
    private final C3900dg.a m19713a(C3535P3.a aVar) {
        C3900dg.b bVar;
        C3900dg.a aVar2 = new C3900dg.a();
        Map<String, String> m18729b = aVar.m18729b();
        int i2 = 0;
        if (m18729b != null) {
            bVar = new C3900dg.b();
            int size = m18729b.size();
            C3900dg.b.a[] aVarArr = new C3900dg.b.a[size];
            for (int i3 = 0; i3 < size; i3++) {
                aVarArr[i3] = new C3900dg.b.a();
            }
            bVar.f44947b = aVarArr;
            int i4 = 0;
            for (Map.Entry<String, String> entry : m18729b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C3900dg.b.a[] aVarArr2 = bVar.f44947b;
                aVarArr2[i4].f44949b = key;
                aVarArr2[i4].f44950c = value;
                i4++;
            }
        } else {
            bVar = null;
        }
        aVar2.f44945b = bVar;
        int ordinal = aVar.mo18022a().ordinal();
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        }
        aVar2.f44946c = i2;
        return aVar2;
    }

    /* renamed from: a */
    private final C3535P3.a m19712a(C3900dg.a aVar) {
        EnumC3257E0 enumC3257E0;
        C3900dg.b bVar = aVar.f44945b;
        Map<String, String> m19714a = bVar != null ? m19714a(bVar) : null;
        int i2 = aVar.f44946c;
        if (i2 == 0) {
            enumC3257E0 = EnumC3257E0.UNDEFINED;
        } else if (i2 == 1) {
            enumC3257E0 = EnumC3257E0.APP;
        } else if (i2 == 2) {
            enumC3257E0 = EnumC3257E0.SATELLITE;
        } else if (i2 != 3) {
            enumC3257E0 = EnumC3257E0.UNDEFINED;
        } else {
            enumC3257E0 = EnumC3257E0.RETAIL;
        }
        return new C3535P3.a(m19714a, enumC3257E0);
    }

    /* renamed from: a */
    private final Map<String, String> m19714a(C3900dg.b bVar) {
        C3900dg.b.a[] aVarArr = bVar.f44947b;
        Intrinsics.m32178g(aVarArr, "proto.pairs");
        int m32062g = MapsKt.m32062g(aVarArr.length);
        if (m32062g < 16) {
            m32062g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
        for (C3900dg.b.a aVar : aVarArr) {
            linkedHashMap.put(aVar.f44949b, aVar.f44950c);
        }
        return linkedHashMap;
    }
}
