package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5083fl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class bj1 {

    /* renamed from: b */
    @NonNull
    private final pb1 f48905b;

    /* renamed from: a */
    @NonNull
    private final fj1 f48904a = new fj1();

    /* renamed from: c */
    @NonNull
    private final n71 f48906c = new n71();

    public bj1(@NonNull pb1 pb1Var) {
        this.f48905b = pb1Var;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m22848a(@NonNull pb1 pb1Var) {
        ArrayList m27266e = this.f48905b.m27266e();
        ArrayList arrayList = new ArrayList();
        Iterator it = m27266e.iterator();
        while (it.hasNext()) {
            C5083fl c5083fl = (C5083fl) it.next();
            Objects.requireNonNull(this.f48906c);
            arrayList.addAll(n71.m26814a(c5083fl));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = pb1Var.m27266e().iterator();
        while (it2.hasNext()) {
            C5083fl c5083fl2 = (C5083fl) it2.next();
            Objects.requireNonNull(this.f48904a);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = m27266e.iterator();
            while (it3.hasNext()) {
                arrayList3.addAll(((C5083fl) it3.next()).m24615e());
            }
            HashSet hashSet = new HashSet();
            Iterator<z00> it4 = c5083fl2.m24615e().iterator();
            while (it4.hasNext()) {
                hashSet.add(it4.next().m30009a());
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                z00 z00Var = (z00) it5.next();
                String m30009a = z00Var.m30009a();
                if (!hashSet.contains(m30009a)) {
                    arrayList4.add(z00Var);
                    hashSet.add(m30009a);
                }
            }
            Objects.requireNonNull(this.f48906c);
            arrayList2.add(new C5083fl.a().m24635b(c5083fl2.m24616f()).m24631a(c5083fl2.m24615e()).m24630a(arrayList).m24629a(c5083fl2.m24612b()).m24628a(c5083fl2.m24617g()).m24627a(c5083fl2.m24614d()).m24631a((List) arrayList4).m24630a(n71.m26814a(c5083fl2)).m24632a());
        }
        return arrayList2;
    }
}
