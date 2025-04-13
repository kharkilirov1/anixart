package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3834b2;
import com.yandex.metrica.impl.p023ob.C4004hg;
import com.yandex.metrica.impl.p023ob.C4108lg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ya */
/* loaded from: classes2.dex */
public class C4440ya implements InterfaceC3920ea {

    /* renamed from: a */
    private static final Map<Integer, C3834b2.d> f46992a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C3834b2.d, Integer> f46993b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.ya$a */
    public class a extends HashMap<Integer, C3834b2.d> {
        public a() {
            put(1, C3834b2.d.WIFI);
            put(2, C3834b2.d.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ya$b */
    public class b extends HashMap<C3834b2.d, Integer> {
        public b() {
            put(C3834b2.d.WIFI, 1);
            put(C3834b2.d.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public Object mo17817a(@NonNull Object obj) {
        C4004hg c4004hg = (C4004hg) obj;
        ArrayList arrayList = new ArrayList();
        C4004hg.a[] aVarArr = c4004hg.f45269b;
        int length = aVarArr.length;
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            C4004hg.a aVar = aVarArr[i2];
            String str = aVar.f45272b;
            String str2 = aVar.f45273c;
            String str3 = aVar.f45274d;
            C4004hg.a.C7001a[] c7001aArr = aVar.f45275e;
            C3803Zm c3803Zm = new C3803Zm(z);
            int length2 = c7001aArr.length;
            int i3 = 0;
            while (i3 < length2) {
                C4004hg.a.C7001a c7001a = c7001aArr[i3];
                c3803Zm.m19535a(c7001a.f45279b, c7001a.f45280c);
                i3++;
                aVarArr = aVarArr;
            }
            C4004hg.a[] aVarArr2 = aVarArr;
            long j2 = aVar.f45276f;
            int[] iArr = aVar.f45277g;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i4 = 0;
            while (i4 < length3) {
                arrayList2.add(f46992a.get(Integer.valueOf(iArr[i4])));
                i4++;
                iArr = iArr;
                length = length;
            }
            arrayList.add(new C4108lg.e.a(str, str2, str3, c3803Zm, j2, arrayList2));
            i2++;
            aVarArr = aVarArr2;
            z = false;
        }
        return new C4108lg.e(arrayList, Arrays.asList(c4004hg.f45270c));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public Object mo17818b(@NonNull Object obj) {
        C4108lg.e eVar = (C4108lg.e) obj;
        C4004hg c4004hg = new C4004hg();
        Set<String> m20370a = eVar.m20370a();
        c4004hg.f45270c = (String[]) m20370a.toArray(new String[((HashSet) m20370a).size()]);
        List<C4108lg.e.a> m20372b = eVar.m20372b();
        C4004hg.a[] aVarArr = new C4004hg.a[m20372b.size()];
        for (int i2 = 0; i2 < m20372b.size(); i2++) {
            C4108lg.e.a aVar = m20372b.get(i2);
            C4004hg.a aVar2 = new C4004hg.a();
            aVar2.f45272b = aVar.f45902a;
            aVar2.f45273c = aVar.f45903b;
            C4004hg.a.C7001a[] c7001aArr = new C4004hg.a.C7001a[aVar.f45905d.m19540c()];
            int i3 = 0;
            for (Map.Entry<String, ? extends Collection<String>> entry : aVar.f45905d.m19536a()) {
                for (String str : entry.getValue()) {
                    C4004hg.a.C7001a c7001a = new C4004hg.a.C7001a();
                    c7001a.f45279b = entry.getKey();
                    c7001a.f45280c = str;
                    c7001aArr[i3] = c7001a;
                    i3++;
                }
            }
            aVar2.f45275e = c7001aArr;
            aVar2.f45274d = aVar.f45904c;
            aVar2.f45276f = aVar.f45906e;
            List<C3834b2.d> list = aVar.f45907f;
            int[] iArr = new int[list.size()];
            for (int i4 = 0; i4 < list.size(); i4++) {
                iArr[i4] = f46993b.get(list.get(i4)).intValue();
            }
            aVar2.f45277g = iArr;
            aVarArr[i2] = aVar2;
        }
        c4004hg.f45269b = aVarArr;
        return c4004hg;
    }
}
