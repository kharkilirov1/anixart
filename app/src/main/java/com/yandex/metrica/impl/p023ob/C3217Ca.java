package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4056jg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ca */
/* loaded from: classes2.dex */
public class C3217Ca implements InterfaceC3920ea<C3274Eh, C4056jg> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3274Eh mo17817a(@NonNull C4056jg c4056jg) {
        C4056jg c4056jg2 = c4056jg;
        ArrayList arrayList = new ArrayList(c4056jg2.f45417b.length);
        int i2 = 0;
        while (true) {
            C4056jg.a[] aVarArr = c4056jg2.f45417b;
            if (i2 >= aVarArr.length) {
                return new C3274Eh(arrayList, c4056jg2.f45418c, c4056jg2.f45419d, c4056jg2.f45420e, c4056jg2.f45421f);
            }
            C4056jg.a aVar = aVarArr[i2];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f45424c;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f45424c.length);
                int i3 = 0;
                while (true) {
                    String[] strArr2 = aVar.f45424c;
                    if (i3 < strArr2.length) {
                        arrayList2.add(strArr2[i3]);
                        i3++;
                    }
                }
            }
            arrayList.add(new C3349Hh(C3509O2.m18657b(aVar.f45423b), arrayList2));
            i2++;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C4056jg mo17818b(@NonNull C3274Eh c3274Eh) {
        C3274Eh c3274Eh2 = c3274Eh;
        C4056jg c4056jg = new C4056jg();
        c4056jg.f45417b = new C4056jg.a[c3274Eh2.f42810a.size()];
        for (int i2 = 0; i2 < c3274Eh2.f42810a.size(); i2++) {
            C4056jg.a[] aVarArr = c4056jg.f45417b;
            C3349Hh c3349Hh = c3274Eh2.f42810a.get(i2);
            C4056jg.a aVar = new C4056jg.a();
            aVar.f45423b = c3349Hh.f43057a;
            List<String> list = c3349Hh.f43058b;
            aVar.f45424c = new String[list.size()];
            Iterator<String> it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                aVar.f45424c[i3] = it.next();
                i3++;
            }
            aVarArr[i2] = aVar;
        }
        c4056jg.f45418c = c3274Eh2.f42811b;
        c4056jg.f45419d = c3274Eh2.f42812c;
        c4056jg.f45420e = c3274Eh2.f42813d;
        c4056jg.f45421f = c3274Eh2.f42814e;
        return c4056jg;
    }
}
