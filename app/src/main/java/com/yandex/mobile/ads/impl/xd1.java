package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xd1 {
    @NonNull
    /* renamed from: a */
    public static wd1 m29744a(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pb1 pb1Var = (pb1) it.next();
            if (pb1Var.m27276o()) {
                arrayList2.add(pb1Var);
            } else {
                arrayList.add(pb1Var);
            }
        }
        return new wd1(arrayList, arrayList2);
    }
}
