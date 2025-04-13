package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class kh0 {

    /* renamed from: a */
    private final AdResponse f51978a;

    /* renamed from: b */
    private final C5101g2 f51979b;

    /* renamed from: c */
    private final qi0 f51980c;

    public kh0(@NonNull qi0 qi0Var, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        this.f51978a = adResponse;
        this.f51979b = c5101g2;
        this.f51980c = qi0Var;
    }

    @NonNull
    /* renamed from: a */
    public final C5101g2 m26126a() {
        return this.f51979b;
    }

    @NonNull
    /* renamed from: b */
    public final AdResponse m26127b() {
        return this.f51978a;
    }

    @NonNull
    /* renamed from: c */
    public final qi0 m26128c() {
        return this.f51980c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kh0.class != obj.getClass()) {
            return false;
        }
        kh0 kh0Var = (kh0) obj;
        AdResponse adResponse = this.f51978a;
        if (adResponse == null ? kh0Var.f51978a != null : !adResponse.equals(kh0Var.f51978a)) {
            return false;
        }
        C5101g2 c5101g2 = this.f51979b;
        if (c5101g2 == null ? kh0Var.f51979b != null : !c5101g2.equals(kh0Var.f51979b)) {
            return false;
        }
        qi0 qi0Var = this.f51980c;
        return qi0Var != null ? qi0Var.equals(kh0Var.f51980c) : kh0Var.f51980c == null;
    }

    public final int hashCode() {
        AdResponse adResponse = this.f51978a;
        int hashCode = (adResponse != null ? adResponse.hashCode() : 0) * 31;
        C5101g2 c5101g2 = this.f51979b;
        int hashCode2 = (hashCode + (c5101g2 != null ? c5101g2.hashCode() : 0)) * 31;
        qi0 qi0Var = this.f51980c;
        return hashCode2 + (qi0Var != null ? qi0Var.hashCode() : 0);
    }
}
