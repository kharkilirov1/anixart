package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ja */
/* loaded from: classes3.dex */
public final class C5276ja<T> {

    /* renamed from: a */
    @NonNull
    private final T f51534a;

    /* renamed from: b */
    @NonNull
    private final String f51535b;

    /* renamed from: c */
    @NonNull
    private final String f51536c;

    /* renamed from: d */
    @Nullable
    private final a80 f51537d;

    /* renamed from: e */
    private final boolean f51538e;

    /* renamed from: f */
    private final boolean f51539f;

    public C5276ja(@NonNull String str, @NonNull String str2, @NonNull T t, @Nullable a80 a80Var, boolean z, boolean z2) {
        this.f51535b = str;
        this.f51536c = str2;
        this.f51534a = t;
        this.f51537d = a80Var;
        this.f51539f = z;
        this.f51538e = z2;
    }

    @Nullable
    /* renamed from: a */
    public final a80 m25823a() {
        return this.f51537d;
    }

    @NonNull
    /* renamed from: b */
    public final String m25824b() {
        return this.f51535b;
    }

    @NonNull
    /* renamed from: c */
    public final String m25825c() {
        return this.f51536c;
    }

    @NonNull
    /* renamed from: d */
    public final T m25826d() {
        return this.f51534a;
    }

    /* renamed from: e */
    public final boolean m25827e() {
        return this.f51539f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5276ja.class != obj.getClass()) {
            return false;
        }
        C5276ja c5276ja = (C5276ja) obj;
        if (this.f51538e != c5276ja.f51538e || this.f51539f != c5276ja.f51539f || !this.f51534a.equals(c5276ja.f51534a) || !this.f51535b.equals(c5276ja.f51535b) || !this.f51536c.equals(c5276ja.f51536c)) {
            return false;
        }
        a80 a80Var = this.f51537d;
        a80 a80Var2 = c5276ja.f51537d;
        return a80Var != null ? a80Var.equals(a80Var2) : a80Var2 == null;
    }

    /* renamed from: f */
    public final boolean m25828f() {
        return this.f51538e;
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f51536c, o11.m26984a(this.f51535b, this.f51534a.hashCode() * 31, 31), 31);
        a80 a80Var = this.f51537d;
        return ((((m26984a + (a80Var != null ? a80Var.hashCode() : 0)) * 31) + (this.f51538e ? 1 : 0)) * 31) + (this.f51539f ? 1 : 0);
    }
}
