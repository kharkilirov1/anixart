package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.cb */
/* loaded from: classes3.dex */
public final class C4912cb {

    /* renamed from: a */
    private final b20 f49196a = new b20();

    @NonNull
    /* renamed from: a */
    public final ArrayList m23088a(@NonNull List list, @NonNull Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5276ja c5276ja = (C5276ja) it.next();
            Object m25826d = c5276ja.m25826d();
            String m25825c = c5276ja.m25825c();
            if ("image".equals(m25825c) && (m25826d instanceof z10)) {
                Objects.requireNonNull(this.f49196a);
                if (b20.m22711a((z10) m25826d, map)) {
                    arrayList.add(c5276ja);
                }
            } else {
                if ("media".equals(m25825c) && (m25826d instanceof jc0) && ((jc0) m25826d).m25863a() != null) {
                    jc0 jc0Var = (jc0) m25826d;
                    List<z10> m25863a = jc0Var.m25863a();
                    z10 z10Var = null;
                    if (m25863a != null && !m25863a.isEmpty()) {
                        z10Var = m25863a.get(0);
                    }
                    ob1 m25865c = jc0Var.m25865c();
                    ka0 m25864b = jc0Var.m25864b();
                    if (m25865c == null && m25864b == null) {
                        if (z10Var != null) {
                            Objects.requireNonNull(this.f49196a);
                            if (b20.m22711a(z10Var, map)) {
                            }
                        }
                    }
                    arrayList.add(c5276ja);
                } else {
                    arrayList.add(c5276ja);
                }
            }
        }
        return arrayList;
    }
}
