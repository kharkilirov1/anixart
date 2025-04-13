package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hf */
/* loaded from: classes3.dex */
public final class C5182hf {
    @NotNull
    /* renamed from: a */
    public static ArrayList m25148a(@NotNull C6264w viewAdapter) {
        Intrinsics.m32179h(viewAdapter, "viewAdapter");
        Map<String, InterfaceC5330ka<?>> m30752c = viewAdapter.m30752c();
        Intrinsics.m32178g(m30752c, "viewAdapter.assetAdapters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) m30752c).entrySet()) {
            InterfaceC5330ka interfaceC5330ka = (InterfaceC5330ka) entry.getValue();
            if (interfaceC5330ka != null ? interfaceC5330ka.mo23912b() : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }
}
