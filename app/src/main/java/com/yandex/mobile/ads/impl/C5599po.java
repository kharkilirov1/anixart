package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.po */
/* loaded from: classes3.dex */
public final class C5599po {

    /* renamed from: a */
    @NonNull
    private final String f53598a;

    /* renamed from: b */
    @NonNull
    private final String f53599b;

    /* renamed from: c */
    @NonNull
    private final String f53600c;

    /* renamed from: d */
    @Nullable
    private final List<z10> f53601d;

    public C5599po(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable ArrayList arrayList) {
        this.f53598a = str;
        this.f53599b = str2;
        this.f53600c = str3;
        this.f53601d = arrayList;
    }

    @Nullable
    /* renamed from: a */
    public final List<z10> m27354a() {
        return this.f53601d;
    }

    @NonNull
    /* renamed from: b */
    public final String m27355b() {
        return this.f53600c;
    }

    @NonNull
    /* renamed from: c */
    public final String m27356c() {
        return this.f53599b;
    }

    @NonNull
    /* renamed from: d */
    public final String m27357d() {
        return this.f53598a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5599po.class != obj.getClass()) {
            return false;
        }
        C5599po c5599po = (C5599po) obj;
        if (!this.f53598a.equals(c5599po.f53598a) || !this.f53599b.equals(c5599po.f53599b) || !this.f53600c.equals(c5599po.f53600c)) {
            return false;
        }
        List<z10> list = this.f53601d;
        List<z10> list2 = c5599po.f53601d;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f53600c, o11.m26984a(this.f53599b, this.f53598a.hashCode() * 31, 31), 31);
        List<z10> list = this.f53601d;
        return m26984a + (list != null ? list.hashCode() : 0);
    }
}
