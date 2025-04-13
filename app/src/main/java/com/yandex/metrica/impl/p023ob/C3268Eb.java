package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Eb */
/* loaded from: classes2.dex */
public class C3268Eb {

    /* renamed from: a */
    @NonNull
    public final String f42797a;

    /* renamed from: b */
    @Nullable
    public final String f42798b;

    /* renamed from: c */
    @Nullable
    public final List<String> f42799c;

    /* renamed from: d */
    @Nullable
    public final Map<String, String> f42800d;

    /* renamed from: e */
    @Nullable
    public final C3243Db f42801e;

    /* renamed from: f */
    @Nullable
    public final C3243Db f42802f;

    /* renamed from: g */
    @Nullable
    public final List<String> f42803g;

    public C3268Eb(@NonNull ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), C3658U2.m19202a((Collection) eCommerceProduct.getCategoriesPath()), C3658U2.m19219c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C3243Db(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C3243Db(eCommerceProduct.getOriginalPrice()), C3658U2.m19202a((Collection) eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProductWrapper{sku='");
        C0576a.m4100A(m24u, this.f42797a, '\'', ", name='");
        C0576a.m4100A(m24u, this.f42798b, '\'', ", categoriesPath=");
        m24u.append(this.f42799c);
        m24u.append(", payload=");
        m24u.append(this.f42800d);
        m24u.append(", actualPrice=");
        m24u.append(this.f42801e);
        m24u.append(", originalPrice=");
        m24u.append(this.f42802f);
        m24u.append(", promocodes=");
        return C0576a.m4119r(m24u, this.f42803g, '}');
    }

    @VisibleForTesting
    public C3268Eb(@NonNull String str, @Nullable String str2, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable C3243Db c3243Db, @Nullable C3243Db c3243Db2, @Nullable List<String> list2) {
        this.f42797a = str;
        this.f42798b = str2;
        this.f42799c = list;
        this.f42800d = map;
        this.f42801e = c3243Db;
        this.f42802f = c3243Db2;
        this.f42803g = list2;
    }
}
