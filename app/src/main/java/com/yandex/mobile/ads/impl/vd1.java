package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vd1 {

    /* renamed from: com.yandex.mobile.ads.impl.vd1$a */
    public static class C5913a implements Comparator<pb1> {
        private C5913a() {
        }

        @Override // java.util.Comparator
        public final int compare(@NonNull pb1 pb1Var, @NonNull pb1 pb1Var2) {
            return pb1Var.m27270i().compareTo(pb1Var2.m27270i());
        }

        public /* synthetic */ C5913a(int i2) {
            this();
        }
    }

    @NonNull
    /* renamed from: a */
    public static ArrayList m29217a(@NonNull List list) {
        int i2;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((pb1) it.next()).m27270i() != null) {
                z = true;
                break;
            }
        }
        if (!z) {
            return new ArrayList(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            pb1 pb1Var = (pb1) it2.next();
            if (pb1Var.m27270i() != null) {
                arrayList.add(pb1Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            pb1 pb1Var2 = (pb1) it3.next();
            if (pb1Var2.m27270i() != null) {
                arrayList2.add(pb1Var2);
            }
        }
        Collections.sort(arrayList2, new C5913a(i2));
        return arrayList2;
    }
}
