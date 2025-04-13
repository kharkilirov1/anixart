package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Sn */
/* loaded from: classes2.dex */
public class C3629Sn extends AbstractC3604Rn {

    /* renamed from: b */
    @Nullable
    private final AbstractC3604Rn f44029b;

    public C3629Sn(int i2) {
        this(i2, null);
    }

    /* renamed from: b */
    public int mo18493b(@Nullable Object obj) {
        throw null;
    }

    public C3629Sn(int i2, @Nullable AbstractC3604Rn abstractC3604Rn) {
        super(i2);
        this.f44029b = abstractC3604Rn;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3604Rn
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3580Qn<List<Object>, C3355Hn> mo19058a(@Nullable List<Object> list) {
        int i2;
        int i3 = 0;
        if (list == null || (list.size() <= m19057a() && this.f44029b == null)) {
            i2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i2 = 0;
            int i4 = 0;
            for (Object obj : list) {
                if (i4 < m19057a()) {
                    AbstractC3604Rn abstractC3604Rn = this.f44029b;
                    if (abstractC3604Rn != null) {
                        C3580Qn<Object, InterfaceC3305Fn> mo19058a = abstractC3604Rn.mo19058a(obj);
                        Object obj2 = mo19058a.f43777a;
                        i2 += mo19058a.f43778b.mo18020a();
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i3++;
                    i2 += mo18493b(obj);
                }
                i4++;
            }
            list = arrayList;
        }
        return new C3580Qn<>(list, new C3355Hn(i3, i2));
    }
}
