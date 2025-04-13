package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.pb1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class dj1 {

    /* renamed from: a */
    @NonNull
    private final Context f49660a;

    /* renamed from: b */
    @NonNull
    private final pb1 f49661b;

    /* renamed from: c */
    @NonNull
    private final bj1 f49662c;

    /* renamed from: e */
    @NonNull
    private final cj1 f49664e = new cj1();

    /* renamed from: f */
    @NonNull
    private final ej1 f49665f = new ej1();

    /* renamed from: d */
    @NonNull
    private final yb1 f49663d = new yb1();

    public dj1(@NonNull Context context, @NonNull pb1 pb1Var) {
        this.f49660a = context.getApplicationContext();
        this.f49661b = pb1Var;
        this.f49662c = new bj1(pb1Var);
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m23896a(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pb1 pb1Var = (pb1) it.next();
            ArrayList m22848a = this.f49662c.m22848a(pb1Var);
            cj1 cj1Var = this.f49664e;
            pb1 pb1Var2 = this.f49661b;
            Objects.requireNonNull(cj1Var);
            cc1 m23294a = cj1.m23294a(pb1Var, pb1Var2);
            ej1 ej1Var = this.f49665f;
            pb1 pb1Var3 = this.f49661b;
            Objects.requireNonNull(ej1Var);
            wg1 m24183a = ej1.m24183a(pb1Var, pb1Var3);
            Objects.requireNonNull(this.f49663d);
            Map<String, List<String>> m27269h = pb1Var.m27269h();
            yb1 yb1Var = this.f49663d;
            pb1 pb1Var4 = this.f49661b;
            Objects.requireNonNull(yb1Var);
            Map<String, List<String>> m27269h2 = pb1Var4.m27269h();
            ArrayList m27265d = pb1Var.m27265d();
            ArrayList m27265d2 = this.f49661b.m27265d();
            ArrayList arrayList2 = new ArrayList(m27265d);
            arrayList2.addAll(m27265d2);
            pb1.C5585a m27301b = new pb1.C5585a(this.f49660a, pb1Var.m27276o()).m27301b(m22848a);
            for (Map.Entry<String, List<String>> entry : m27269h.entrySet()) {
                Iterator<String> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    m27301b.m27299a(entry.getKey(), it2.next());
                }
            }
            pb1.C5585a m27293a = m27301b.m27295a(pb1Var.m27263b()).m27300b(pb1Var.m27264c()).m27302c(pb1Var.m27267f()).m27304e(pb1Var.m27271j()).m27305f(pb1Var.m27272k()).m27292a(m23294a).m27294a(m24183a).m27293a(pb1Var.m27275n());
            for (Map.Entry<String, List<String>> entry2 : m27269h2.entrySet()) {
                Iterator<String> it3 = entry2.getValue().iterator();
                while (it3.hasNext()) {
                    m27293a.m27299a(entry2.getKey(), it3.next());
                }
            }
            arrayList.add(m27293a.m27296a(arrayList2).m27297a());
        }
        return arrayList;
    }
}
