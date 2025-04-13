package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommercePrice {

    /* renamed from: a */
    @NonNull
    public final ECommerceAmount f42448a;

    /* renamed from: b */
    @Nullable
    public List<ECommerceAmount> f42449b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f42448a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f42448a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f42449b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f42449b = list;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommercePrice{fiat=");
        m24u.append(this.f42448a);
        m24u.append(", internalComponents=");
        return C0576a.m4119r(m24u, this.f42449b, '}');
    }
}
