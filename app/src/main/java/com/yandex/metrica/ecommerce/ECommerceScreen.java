package com.yandex.metrica.ecommerce;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceScreen {

    /* renamed from: a */
    @Nullable
    public String f42460a;

    /* renamed from: b */
    @Nullable
    public List<String> f42461b;

    /* renamed from: c */
    @Nullable
    public String f42462c;

    /* renamed from: d */
    @Nullable
    public Map<String, String> f42463d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f42461b;
    }

    @Nullable
    public String getName() {
        return this.f42460a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f42463d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f42462c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f42461b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f42460a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f42463d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f42462c = str;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceScreen{name='");
        C0576a.m4100A(m24u, this.f42460a, '\'', ", categoriesPath=");
        m24u.append(this.f42461b);
        m24u.append(", searchQuery='");
        C0576a.m4100A(m24u, this.f42462c, '\'', ", payload=");
        m24u.append(this.f42463d);
        m24u.append('}');
        return m24u.toString();
    }
}
