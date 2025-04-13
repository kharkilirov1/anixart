package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.fa */
/* loaded from: classes2.dex */
public final class C3946fa implements InterfaceC3920ea<Map<String, ? extends List<? extends String>>, C4082kg.d[]> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C4082kg.d[] mo17818b(Map<String, ? extends List<? extends String>> map) {
        return m19896a((Map<String, ? extends List<String>>) map);
    }

    @NotNull
    /* renamed from: a */
    public C4082kg.d[] m19896a(@NotNull Map<String, ? extends List<String>> map) {
        int size = map.size();
        C4082kg.d[] dVarArr = new C4082kg.d[size];
        for (int i2 = 0; i2 < size; i2++) {
            dVarArr[i2] = new C4082kg.d();
        }
        int i3 = 0;
        for (Object obj : map.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            dVarArr[i3].f45678b = (String) entry.getKey();
            C4082kg.d dVar = dVarArr[i3];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            dVar.f45679c = (String[]) array;
            i3 = i4;
        }
        return dVarArr;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NotNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, List<String>> mo17817a(@NotNull C4082kg.d[] dVarArr) {
        int m32062g = MapsKt.m32062g(dVarArr.length);
        if (m32062g < 16) {
            m32062g = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
        for (C4082kg.d dVar : dVarArr) {
            String str = dVar.f45678b;
            String[] strArr = dVar.f45679c;
            Intrinsics.m32178g(strArr, "it.hosts");
            linkedHashMap.put(str, ArraysKt.m31952b0(strArr));
        }
        return linkedHashMap;
    }
}
