package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3200Bi;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.za */
/* loaded from: classes2.dex */
public class C4466za implements InterfaceC3920ea {

    /* renamed from: a */
    private static final Map<Integer, C3200Bi.a> f47103a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C3200Bi.a, Integer> f47104b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.za$a */
    public class a extends HashMap<Integer, C3200Bi.a> {
        public a() {
            put(1, C3200Bi.a.WIFI);
            put(2, C3200Bi.a.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.za$b */
    public class b extends HashMap<C3200Bi.a, Integer> {
        public b() {
            put(C3200Bi.a.WIFI, 1);
            put(C3200Bi.a.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.n mo17818b(@NonNull C3200Bi c3200Bi) {
        C4082kg.n nVar = new C4082kg.n();
        nVar.f45756b = c3200Bi.f42629a;
        nVar.f45757c = c3200Bi.f42630b;
        nVar.f45758d = c3200Bi.f42631c;
        List<Pair<String, String>> list = c3200Bi.f42632d;
        C4082kg.n.a[] aVarArr = new C4082kg.n.a[list.size()];
        int i2 = 0;
        for (Pair<String, String> pair : list) {
            C4082kg.n.a aVar = new C4082kg.n.a();
            aVar.f45763b = (String) pair.first;
            aVar.f45764c = (String) pair.second;
            aVarArr[i2] = aVar;
            i2++;
        }
        nVar.f45759e = aVarArr;
        Long l2 = c3200Bi.f42633e;
        nVar.f45760f = l2 == null ? 0L : l2.longValue();
        List<C3200Bi.a> list2 = c3200Bi.f42634f;
        int[] iArr = new int[list2.size()];
        for (int i3 = 0; i3 < list2.size(); i3++) {
            iArr[i3] = f47104b.get(list2.get(i3)).intValue();
        }
        nVar.f45761g = iArr;
        return nVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3200Bi mo17817a(@NonNull C4082kg.n nVar) {
        String str = nVar.f45756b;
        String str2 = nVar.f45757c;
        String str3 = nVar.f45758d;
        C4082kg.n.a[] aVarArr = nVar.f45759e;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C4082kg.n.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f45763b, aVar.f45764c));
        }
        Long valueOf = Long.valueOf(nVar.f45760f);
        int[] iArr = nVar.f45761g;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList2.add(f47103a.get(Integer.valueOf(i2)));
        }
        return new C3200Bi(str, str2, str3, arrayList, valueOf, arrayList2);
    }
}
