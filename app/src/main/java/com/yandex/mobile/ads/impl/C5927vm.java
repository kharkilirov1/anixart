package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.vm */
/* loaded from: classes3.dex */
public final class C5927vm extends AbstractC5419m {

    /* renamed from: b */
    @NonNull
    private final String f55834b;

    /* renamed from: c */
    @NonNull
    private final List<xr0> f55835c;

    public C5927vm(@NonNull String str, @NonNull String str2, @NonNull ArrayList arrayList) {
        super(str);
        this.f55834b = str2;
        this.f55835c = arrayList;
    }

    @NonNull
    /* renamed from: b */
    public final String m29235b() {
        return this.f55834b;
    }

    @NonNull
    /* renamed from: c */
    public final List<xr0> m29236c() {
        return this.f55835c;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5419m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5927vm.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C5927vm c5927vm = (C5927vm) obj;
        if (this.f55834b.equals(c5927vm.f55834b)) {
            return this.f55835c.equals(c5927vm.f55835c);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5419m
    public final int hashCode() {
        return this.f55835c.hashCode() + o11.m26984a(this.f55834b, super.hashCode() * 31, 31);
    }
}
