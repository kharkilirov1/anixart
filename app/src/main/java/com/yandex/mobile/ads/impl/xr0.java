package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xr0 {

    /* renamed from: a */
    @NonNull
    private final String f56545a;

    /* renamed from: b */
    @NonNull
    private final String f56546b;

    /* renamed from: c */
    @Nullable
    private final Map<String, Object> f56547c;

    public xr0(@NonNull String str, @NonNull String str2, @Nullable HashMap hashMap) {
        this.f56545a = str;
        this.f56546b = str2;
        this.f56547c = hashMap;
    }

    @Nullable
    /* renamed from: a */
    public final Map<String, Object> m29803a() {
        return this.f56547c;
    }

    @NonNull
    /* renamed from: b */
    public final String m29804b() {
        return this.f56545a;
    }

    @NonNull
    /* renamed from: c */
    public final String m29805c() {
        return this.f56546b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xr0.class != obj.getClass()) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        if (!this.f56545a.equals(xr0Var.f56545a) || !this.f56546b.equals(xr0Var.f56546b)) {
            return false;
        }
        Map<String, Object> map = this.f56547c;
        Map<String, Object> map2 = xr0Var.f56547c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f56546b, this.f56545a.hashCode() * 31, 31);
        Map<String, Object> map = this.f56547c;
        return m26984a + (map != null ? map.hashCode() : 0);
    }
}
