package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.pp */
/* loaded from: classes3.dex */
public final class C5600pp {

    /* renamed from: a */
    @NonNull
    private final String f53607a;

    /* renamed from: b */
    @NonNull
    private final JSONObject f53608b;

    /* renamed from: c */
    @Nullable
    private final JSONObject f53609c;

    /* renamed from: d */
    @Nullable
    private final List<z10> f53610d;

    public C5600pp(@NonNull String str, @NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable List<z10> list) {
        this.f53607a = str;
        this.f53608b = jSONObject;
        this.f53609c = jSONObject2;
        this.f53610d = list;
    }

    @NonNull
    /* renamed from: a */
    public final JSONObject m27359a() {
        return this.f53608b;
    }

    @Nullable
    /* renamed from: b */
    public final List<z10> m27360b() {
        return this.f53610d;
    }

    @NonNull
    /* renamed from: c */
    public final String m27361c() {
        return this.f53607a;
    }

    @Nullable
    /* renamed from: d */
    public final JSONObject m27362d() {
        return this.f53609c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5600pp.class != obj.getClass()) {
            return false;
        }
        C5600pp c5600pp = (C5600pp) obj;
        if (!this.f53607a.equals(c5600pp.f53607a) || !this.f53608b.equals(c5600pp.f53608b)) {
            return false;
        }
        JSONObject jSONObject = this.f53609c;
        if (jSONObject == null ? c5600pp.f53609c != null : !jSONObject.equals(c5600pp.f53609c)) {
            return false;
        }
        List<z10> list = this.f53610d;
        List<z10> list2 = c5600pp.f53610d;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f53607a, this.f53608b.hashCode() * 31, 31);
        JSONObject jSONObject = this.f53609c;
        int hashCode = (m26984a + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        List<z10> list = this.f53610d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
