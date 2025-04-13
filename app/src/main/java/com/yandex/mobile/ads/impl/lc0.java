package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class lc0 {
    @NonNull
    /* renamed from: a */
    public static HashSet m26426a(@NonNull eh0 eh0Var) {
        HashSet hashSet = new HashSet();
        Iterator<C5276ja<?>> it = eh0Var.m24163b().iterator();
        while (it.hasNext()) {
            Object m25826d = it.next().m25826d();
            if (m25826d instanceof jc0) {
                hashSet.add((jc0) m25826d);
            }
        }
        return hashSet;
    }
}
