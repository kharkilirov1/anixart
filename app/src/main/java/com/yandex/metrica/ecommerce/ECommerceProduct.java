package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceProduct {

    /* renamed from: a */
    @NonNull
    public final String f42450a;

    /* renamed from: b */
    @Nullable
    public String f42451b;

    /* renamed from: c */
    @Nullable
    public List<String> f42452c;

    /* renamed from: d */
    @Nullable
    public Map<String, String> f42453d;

    /* renamed from: e */
    @Nullable
    public ECommercePrice f42454e;

    /* renamed from: f */
    @Nullable
    public ECommercePrice f42455f;

    /* renamed from: g */
    @Nullable
    public List<String> f42456g;

    public ECommerceProduct(@NonNull String str) {
        this.f42450a = str;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f42454e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f42452c;
    }

    @Nullable
    public String getName() {
        return this.f42451b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f42455f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f42453d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f42456g;
    }

    @NonNull
    public String getSku() {
        return this.f42450a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f42454e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f42452c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f42451b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f42455f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f42453d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f42456g = list;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceProduct{sku='");
        C0576a.m4100A(m24u, this.f42450a, '\'', ", name='");
        C0576a.m4100A(m24u, this.f42451b, '\'', ", categoriesPath=");
        m24u.append(this.f42452c);
        m24u.append(", payload=");
        m24u.append(this.f42453d);
        m24u.append(", actualPrice=");
        m24u.append(this.f42454e);
        m24u.append(", originalPrice=");
        m24u.append(this.f42455f);
        m24u.append(", promocodes=");
        return C0576a.m4119r(m24u, this.f42456g, '}');
    }
}
