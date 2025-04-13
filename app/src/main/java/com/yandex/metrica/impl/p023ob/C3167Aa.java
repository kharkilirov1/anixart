package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4030ig;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Aa */
/* loaded from: classes2.dex */
public class C3167Aa implements InterfaceC3920ea<C4302t2, C4030ig> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4302t2 mo17817a(@NonNull C4030ig c4030ig) {
        HashMap hashMap;
        C4030ig c4030ig2 = c4030ig;
        C4030ig.a aVar = c4030ig2.f45342b;
        if (aVar == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (C4030ig.a.C7002a c7002a : aVar.f45344b) {
                hashMap2.put(c7002a.f45346b, c7002a.f45347c);
            }
            hashMap = hashMap2;
        }
        return new C4302t2(hashMap, c4030ig2.f45343c);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C4030ig mo17818b(@NonNull C4302t2 c4302t2) {
        C4030ig.a aVar;
        C4302t2 c4302t22 = c4302t2;
        C4030ig c4030ig = new C4030ig();
        Map<String, String> map = c4302t22.f46485a;
        if (map == null) {
            aVar = null;
        } else {
            C4030ig.a aVar2 = new C4030ig.a();
            aVar2.f45344b = new C4030ig.a.C7002a[map.size()];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C4030ig.a.C7002a c7002a = new C4030ig.a.C7002a();
                c7002a.f45346b = entry.getKey();
                c7002a.f45347c = entry.getValue();
                aVar2.f45344b[i2] = c7002a;
                i2++;
            }
            aVar = aVar2;
        }
        c4030ig.f45342b = aVar;
        c4030ig.f45343c = c4302t22.f46486b;
        return c4030ig;
    }
}
