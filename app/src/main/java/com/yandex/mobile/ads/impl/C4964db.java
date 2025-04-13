package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.db */
/* loaded from: classes3.dex */
public final class C4964db {
    @NonNull
    /* renamed from: a */
    public static HashSet m23862a(@NonNull List list) {
        List<z10> m25863a;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object m25826d = ((C5276ja) it.next()).m25826d();
            if (m25826d instanceof z10) {
                hashSet.add((z10) m25826d);
            }
            if ((m25826d instanceof jc0) && (m25863a = ((jc0) m25826d).m25863a()) != null) {
                hashSet.addAll(m25863a);
            }
        }
        return hashSet;
    }
}
