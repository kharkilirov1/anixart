package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ec1 {
    @NotNull
    /* renamed from: a */
    public static qf1 m24111a(@NotNull pb1 videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        return new en1(videoAd, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final Map m24112b(pb1 videoAd) {
        Intrinsics.m32179h(videoAd, "$videoAd");
        List<j71> m23220b = videoAd.m27273l().m23220b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m23220b) {
            String m25813a = ((j71) obj).m25813a();
            Object obj2 = linkedHashMap.get(m25813a);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m25813a, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.m32062g(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((j71) it.next()).m25815c());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
