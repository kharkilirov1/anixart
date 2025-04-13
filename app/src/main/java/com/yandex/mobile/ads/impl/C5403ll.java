package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ll */
/* loaded from: classes3.dex */
public final class C5403ll {

    /* renamed from: a */
    @NotNull
    private final C5343kl f52443a = new C5343kl();

    @NotNull
    /* renamed from: a */
    public final qf1 m26495a(@NotNull C5083fl creative) {
        Intrinsics.m32179h(creative, "creative");
        return new pn1(this, creative, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final Map m26493a(C5403ll this$0, C5083fl creative) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(creative, "$creative");
        Objects.requireNonNull(this$0.f52443a);
        C5238il m26148a = C5343kl.m26148a(creative);
        List<j71> m25559c = m26148a != null ? m26148a.m25559c() : null;
        if (m25559c == null) {
            m25559c = EmptyList.f63144b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m25559c) {
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
