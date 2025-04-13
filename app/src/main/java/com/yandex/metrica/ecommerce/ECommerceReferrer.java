package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    @Nullable
    public String f42457a;

    /* renamed from: b */
    @Nullable
    public String f42458b;

    /* renamed from: c */
    @Nullable
    public ECommerceScreen f42459c;

    @Nullable
    public String getIdentifier() {
        return this.f42458b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f42459c;
    }

    @Nullable
    public String getType() {
        return this.f42457a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f42458b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f42459c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f42457a = str;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ECommerceReferrer{type='");
        C0576a.m4100A(m24u, this.f42457a, '\'', ", identifier='");
        C0576a.m4100A(m24u, this.f42458b, '\'', ", screen=");
        m24u.append(this.f42459c);
        m24u.append('}');
        return m24u.toString();
    }
}
