package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ka0 {

    /* renamed from: a */
    @Nullable
    private final String f51924a;

    /* renamed from: b */
    private final float f51925b;

    public ka0(@Nullable String str, float f2) {
        this.f51924a = str;
        this.f51925b = f2;
    }

    /* renamed from: a */
    public final float m26092a() {
        return this.f51925b;
    }

    @Nullable
    /* renamed from: b */
    public final String m26093b() {
        return this.f51924a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ka0.class != obj.getClass()) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        if (Float.compare(ka0Var.f51925b, this.f51925b) != 0) {
            return false;
        }
        String str = this.f51924a;
        return str != null ? str.equals(ka0Var.f51924a) : ka0Var.f51924a == null;
    }

    public final int hashCode() {
        String str = this.f51924a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        float f2 = this.f51925b;
        return hashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
