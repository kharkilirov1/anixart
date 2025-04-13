package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class s01 {

    /* renamed from: a */
    @Nullable
    private String f54475a;

    /* renamed from: b */
    @Nullable
    private Long f54476b;

    /* renamed from: c */
    private boolean f54477c;

    /* renamed from: a */
    public final void m28036a(@Nullable String str) {
        this.f54475a = str;
    }

    @Nullable
    /* renamed from: b */
    public final String m28038b() {
        return this.f54475a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s01.class != obj.getClass()) {
            return false;
        }
        s01 s01Var = (s01) obj;
        if (this.f54477c != s01Var.f54477c) {
            return false;
        }
        String str = this.f54475a;
        if (str == null ? s01Var.f54475a != null : !str.equals(s01Var.f54475a)) {
            return false;
        }
        Long l2 = this.f54476b;
        return l2 != null ? l2.equals(s01Var.f54476b) : s01Var.f54476b == null;
    }

    public final int hashCode() {
        String str = this.f54475a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.f54476b;
        return ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f54477c ? 1 : 0);
    }

    /* renamed from: a */
    public final void m28037a(boolean z) {
        this.f54477c = z;
    }

    @Nullable
    /* renamed from: a */
    public final Long m28034a() {
        return this.f54476b;
    }

    /* renamed from: a */
    public final void m28035a(@Nullable Long l2) {
        this.f54476b = l2;
    }
}
