package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Db */
/* loaded from: classes2.dex */
public class C3243Db {

    /* renamed from: a */
    @NonNull
    public final C4441yb f42708a;

    /* renamed from: b */
    @Nullable
    public final List<C4441yb> f42709b;

    public C3243Db(@NonNull ECommercePrice eCommercePrice) {
        this(new C4441yb(eCommercePrice.getFiat()), m17961a(eCommercePrice.getInternalComponents()));
    }

    @Nullable
    /* renamed from: a */
    public static List<C4441yb> m17961a(@Nullable List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount eCommerceAmount : list) {
            linkedList.add(new C4441yb(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PriceWrapper{fiat=");
        m24u.append(this.f42708a);
        m24u.append(", internalComponents=");
        return C0576a.m4119r(m24u, this.f42709b, '}');
    }

    @VisibleForTesting
    public C3243Db(@NonNull C4441yb c4441yb, @Nullable List<C4441yb> list) {
        this.f42708a = c4441yb;
        this.f42709b = list;
    }
}
