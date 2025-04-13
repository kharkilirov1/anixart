package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class od1 {

    /* renamed from: b */
    @Deprecated
    @NotNull
    private static final Map<EnumC5668r3, String> f53259b = MapsKt.m32064i(new Pair(EnumC5668r3.f54179l, "video_ad_rendering_duration"), new Pair(EnumC5668r3.f54180m, "video_ad_prepare_duration"));

    /* renamed from: a */
    @NotNull
    private final C5724s3 f53260a;

    public od1(@NotNull C5724s3 adLoadingPhasesManager) {
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f53260a = adLoadingPhasesManager;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m27079a() {
        List<C5617q3> m28054b = this.f53260a.m28054b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m28054b) {
            EnumC5668r3 m27608a = ((C5617q3) obj).m27608a();
            Object obj2 = linkedHashMap.get(m27608a);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m27608a, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.m32062g(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = f53259b.get(entry.getKey());
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put(str, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getKey()).length() > 0) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.m32062g(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Iterable iterable = (Iterable) entry3.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5617q3) it.next()).m27609b());
            }
            linkedHashMap4.put(key, arrayList);
        }
        return MapsKt.m32063h(new Pair("durations", linkedHashMap4));
    }
}
