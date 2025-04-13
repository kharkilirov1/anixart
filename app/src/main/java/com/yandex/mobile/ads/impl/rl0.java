package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class rl0 {
    @NonNull
    /* renamed from: a */
    public static HashSet m27947a(@NonNull qi0 qi0Var) {
        HashSet hashSet = new HashSet();
        for (eh0 eh0Var : qi0Var.m27736d()) {
            HashSet hashSet2 = new HashSet();
            Iterator<C5276ja<?>> it = eh0Var.m24163b().iterator();
            while (it.hasNext()) {
                Object m25826d = it.next().m25826d();
                if (m25826d instanceof jc0) {
                    hashSet2.add((jc0) m25826d);
                }
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ob1 m25865c = ((jc0) it2.next()).m25865c();
                il0 m25118c = m25865c != null ? m25865c.m27065a().m25118c() : null;
                if (m25118c != null) {
                    hashSet.add(m25118c.getUrl());
                }
            }
        }
        return hashSet;
    }
}
