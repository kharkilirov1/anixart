package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class z10 {

    /* renamed from: a */
    private int f57011a;

    /* renamed from: b */
    private int f57012b;

    /* renamed from: c */
    @Nullable
    private String f57013c;

    /* renamed from: d */
    @Nullable
    private String f57014d;

    /* renamed from: e */
    @Nullable
    private n21 f57015e;

    /* renamed from: a */
    public final int m30034a() {
        return this.f57012b;
    }

    @Nullable
    /* renamed from: b */
    public final String m30038b() {
        return this.f57014d;
    }

    @Nullable
    /* renamed from: c */
    public final n21 m30041c() {
        return this.f57015e;
    }

    @Nullable
    /* renamed from: d */
    public final String m30042d() {
        return this.f57013c;
    }

    /* renamed from: e */
    public final int m30043e() {
        return this.f57011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z10.class != obj.getClass()) {
            return false;
        }
        z10 z10Var = (z10) obj;
        if (this.f57011a != z10Var.f57011a || this.f57012b != z10Var.f57012b) {
            return false;
        }
        String str = this.f57013c;
        if (str == null ? z10Var.f57013c != null : !str.equals(z10Var.f57013c)) {
            return false;
        }
        String str2 = this.f57014d;
        if (str2 == null ? z10Var.f57014d != null : !str2.equals(z10Var.f57014d)) {
            return false;
        }
        n21 n21Var = this.f57015e;
        return n21Var != null ? n21Var.equals(z10Var.f57015e) : z10Var.f57015e == null;
    }

    public final int hashCode() {
        int i2 = ((this.f57011a * 31) + this.f57012b) * 31;
        String str = this.f57013c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f57014d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        n21 n21Var = this.f57015e;
        return hashCode2 + (n21Var != null ? n21Var.hashCode() : 0);
    }

    /* renamed from: a */
    public final void m30035a(int i2) {
        this.f57012b = i2;
    }

    /* renamed from: b */
    public final void m30039b(int i2) {
        this.f57011a = i2;
    }

    /* renamed from: a */
    public final void m30037a(@Nullable String str) {
        this.f57014d = str;
    }

    /* renamed from: b */
    public final void m30040b(@Nullable String str) {
        this.f57013c = str;
    }

    /* renamed from: a */
    public final void m30036a(@Nullable n21 n21Var) {
        this.f57015e = n21Var;
    }
}
