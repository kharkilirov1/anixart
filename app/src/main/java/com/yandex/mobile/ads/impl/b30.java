package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class b30 {

    /* renamed from: a */
    @NonNull
    private final String f48749a;

    /* renamed from: b */
    private final int f48750b;

    /* renamed from: c */
    private final int f48751c;

    public b30(int i2, int i3, @NonNull String str) {
        this.f48749a = str;
        this.f48750b = i2;
        this.f48751c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b30.class != obj.getClass()) {
            return false;
        }
        b30 b30Var = (b30) obj;
        if (this.f48750b == b30Var.f48750b && this.f48751c == b30Var.f48751c) {
            return this.f48749a.equals(b30Var.f48749a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f48749a.hashCode() * 31) + this.f48750b) * 31) + this.f48751c;
    }
}
