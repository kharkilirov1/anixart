package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Cb */
/* loaded from: classes2.dex */
public class C3218Cb {

    /* renamed from: a */
    @NonNull
    public final String f42669a;

    /* renamed from: b */
    @NonNull
    public final String f42670b;

    /* renamed from: c */
    @NonNull
    public final List<C3168Ab> f42671c;

    /* renamed from: d */
    @Nullable
    public final Map<String, String> f42672d;

    public C3218Cb(@NonNull ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m17930a(eCommerceOrder.getCartItems()), C3658U2.m19219c(eCommerceOrder.getPayload()));
    }

    @NonNull
    /* renamed from: a */
    private static List<C3168Ab> m17930a(@NonNull List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ECommerceCartItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3168Ab(it.next()));
        }
        return arrayList;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("OrderWrapper{uuid='");
        C0576a.m4100A(m24u, this.f42669a, '\'', ", identifier='");
        C0576a.m4100A(m24u, this.f42670b, '\'', ", cartItems=");
        m24u.append(this.f42671c);
        m24u.append(", payload=");
        m24u.append(this.f42672d);
        m24u.append('}');
        return m24u.toString();
    }

    @VisibleForTesting
    public C3218Cb(@NonNull String str, @NonNull String str2, @NonNull List<C3168Ab> list, @Nullable Map<String, String> map) {
        this.f42669a = str;
        this.f42670b = str2;
        this.f42671c = list;
        this.f42672d = map;
    }
}
