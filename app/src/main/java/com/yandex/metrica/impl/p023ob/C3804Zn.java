package com.yandex.metrica.impl.p023ob;

import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.Zn */
/* loaded from: classes2.dex */
public class C3804Zn implements Comparator<C3700Vj> {
    @Override // java.util.Comparator
    public int compare(C3700Vj c3700Vj, C3700Vj c3700Vj2) {
        C3700Vj c3700Vj3 = c3700Vj;
        C3700Vj c3700Vj4 = c3700Vj2;
        if (c3700Vj3 == c3700Vj4) {
            return 0;
        }
        if (!((c3700Vj4 == null) ^ (c3700Vj3 == null)) && c3700Vj3.m19312q() == c3700Vj4.m19312q() && c3700Vj3.m19298c() == c3700Vj4.m19298c() && (c3700Vj3.m19306k() == null ? c3700Vj4.m19306k() == null : c3700Vj3.m19306k().equals(c3700Vj4.m19306k())) && (c3700Vj3.m19307l() == null ? c3700Vj4.m19307l() == null : c3700Vj3.m19307l().equals(c3700Vj4.m19307l())) && (c3700Vj3.m19300e() == null ? c3700Vj4.m19300e() == null : c3700Vj3.m19300e().equals(c3700Vj4.m19300e())) && (c3700Vj3.m19297b() == null ? c3700Vj4.m19297b() == null : c3700Vj3.m19297b().equals(c3700Vj4.m19297b())) && (c3700Vj3.m19309n() == null ? c3700Vj4.m19309n() == null : c3700Vj3.m19309n().equals(c3700Vj4.m19309n())) && (c3700Vj3.m19308m() == null ? c3700Vj4.m19308m() == null : c3700Vj3.m19308m().equals(c3700Vj4.m19308m()))) {
            if (c3700Vj3.m19310o() != null) {
                if (c3700Vj3.m19310o().equals(c3700Vj4.m19310o())) {
                    return 0;
                }
            } else if (c3700Vj4.m19310o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
