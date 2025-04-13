package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceOrder {

    /* renamed from: a */
    @NonNull
    public final String f42445a;

    /* renamed from: b */
    @NonNull
    public final List<ECommerceCartItem> f42446b;

    /* renamed from: c */
    @Nullable
    public Map<String, String> f42447c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f42445a = str;
        this.f42446b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f42446b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f42445a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f42447c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f42447c = map;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceOrder{identifier='");
        C0576a.m4100A(m24u, this.f42445a, '\'', ", cartItems=");
        m24u.append(this.f42446b);
        m24u.append(", payload=");
        m24u.append(this.f42447c);
        m24u.append('}');
        return m24u.toString();
    }
}
