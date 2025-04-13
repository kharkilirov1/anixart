package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class t21 {
    @NonNull
    /* renamed from: a */
    public static ArrayList m28438a(@Nullable List list, @Nullable a80 a80Var) {
        List<AbstractC5419m> m22400a;
        List<AbstractC5419m> m22400a2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (a80Var != null && (m22400a2 = a80Var.m22400a()) != null) {
            for (AbstractC5419m abstractC5419m : m22400a2) {
                if (abstractC5419m instanceof r21) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<u21> it = ((r21) abstractC5419m).m27825b().iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().m28842c().m29368a());
                    }
                    arrayList2.addAll(arrayList3);
                }
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                a80 m25823a = ((C5276ja) it2.next()).m25823a();
                ArrayList arrayList5 = new ArrayList();
                if (m25823a != null && (m22400a = m25823a.m22400a()) != null) {
                    for (AbstractC5419m abstractC5419m2 : m22400a) {
                        if (abstractC5419m2 instanceof r21) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<u21> it3 = ((r21) abstractC5419m2).m27825b().iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(it3.next().m28842c().m29368a());
                            }
                            arrayList5.addAll(arrayList6);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }
}
