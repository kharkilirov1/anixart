package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.v1 */
/* loaded from: classes3.dex */
public final class C5898v1 {

    /* renamed from: a */
    @NonNull
    private final HashMap f55722a;

    public C5898v1(@NonNull List<m50> list) {
        this.f55722a = m29164a(list);
    }

    @NonNull
    /* renamed from: a */
    public final EnumC5832u1 m29165a(@NonNull m50 m50Var) {
        EnumC5832u1 enumC5832u1 = (EnumC5832u1) this.f55722a.get(m50Var);
        return enumC5832u1 != null ? enumC5832u1 : EnumC5832u1.f55321e;
    }

    /* renamed from: a */
    public final void m29166a(@NonNull m50 m50Var, @NonNull EnumC5832u1 enumC5832u1) {
        if (enumC5832u1 == EnumC5832u1.f55318b) {
            for (m50 m50Var2 : this.f55722a.keySet()) {
                EnumC5832u1 enumC5832u12 = (EnumC5832u1) this.f55722a.get(m50Var2);
                if (EnumC5832u1.f55318b.equals(enumC5832u12) || EnumC5832u1.f55319c.equals(enumC5832u12)) {
                    this.f55722a.put(m50Var2, EnumC5832u1.f55317a);
                }
            }
        }
        this.f55722a.put(m50Var, enumC5832u1);
    }

    /* renamed from: a */
    public final boolean m29167a() {
        for (EnumC5832u1 enumC5832u1 : this.f55722a.values()) {
            if (enumC5832u1 == EnumC5832u1.f55323g || enumC5832u1 == EnumC5832u1.f55324h) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: a */
    private static HashMap m29164a(@NonNull List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put((m50) it.next(), EnumC5832u1.f55317a);
        }
        return hashMap;
    }
}
