package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class qi0 {

    /* renamed from: a */
    private String f54056a;

    /* renamed from: b */
    private List<C5276ja<?>> f54057b;

    /* renamed from: c */
    private List<eh0> f54058c;

    /* renamed from: d */
    private s01 f54059d;

    /* renamed from: e */
    private List<v01> f54060e;

    /* renamed from: f */
    @Nullable
    private List<String> f54061f;

    /* renamed from: g */
    @Nullable
    private List<C5600pp> f54062g;

    /* renamed from: h */
    private HashMap f54063h = new HashMap();

    /* renamed from: a */
    public final void m27727a() {
        this.f54063h.put("status", sv0.EnumC5765c.f54860b);
    }

    /* renamed from: b */
    public final void m27733b(@NonNull ArrayList arrayList) {
        this.f54062g = arrayList;
    }

    /* renamed from: c */
    public final void m27735c(@NonNull ArrayList arrayList) {
        this.f54061f = arrayList;
    }

    /* renamed from: d */
    public final void m27737d(ArrayList arrayList) {
        this.f54060e = arrayList;
    }

    @NonNull
    /* renamed from: e */
    public final HashMap m27738e() {
        return this.f54063h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qi0.class != obj.getClass()) {
            return false;
        }
        qi0 qi0Var = (qi0) obj;
        String str = this.f54056a;
        if (str == null ? qi0Var.f54056a != null : !str.equals(qi0Var.f54056a)) {
            return false;
        }
        List<C5276ja<?>> list = this.f54057b;
        if (list == null ? qi0Var.f54057b != null : !list.equals(qi0Var.f54057b)) {
            return false;
        }
        List<eh0> list2 = this.f54058c;
        if (list2 == null ? qi0Var.f54058c != null : !list2.equals(qi0Var.f54058c)) {
            return false;
        }
        s01 s01Var = this.f54059d;
        if (s01Var == null ? qi0Var.f54059d != null : !s01Var.equals(qi0Var.f54059d)) {
            return false;
        }
        List<v01> list3 = this.f54060e;
        if (list3 == null ? qi0Var.f54060e != null : !list3.equals(qi0Var.f54060e)) {
            return false;
        }
        List<String> list4 = this.f54061f;
        if (list4 == null ? qi0Var.f54061f != null : !list4.equals(qi0Var.f54061f)) {
            return false;
        }
        List<C5600pp> list5 = this.f54062g;
        if (list5 == null ? qi0Var.f54062g != null : !list5.equals(qi0Var.f54062g)) {
            return false;
        }
        HashMap hashMap = this.f54063h;
        HashMap hashMap2 = qi0Var.f54063h;
        return hashMap != null ? hashMap.equals(hashMap2) : hashMap2 == null;
    }

    @Nullable
    /* renamed from: f */
    public final List<String> m27739f() {
        return this.f54061f;
    }

    @Nullable
    /* renamed from: g */
    public final s01 m27740g() {
        return this.f54059d;
    }

    @Nullable
    /* renamed from: h */
    public final List<v01> m27741h() {
        return this.f54060e;
    }

    public final int hashCode() {
        String str = this.f54056a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C5276ja<?>> list = this.f54057b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<eh0> list2 = this.f54058c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        s01 s01Var = this.f54059d;
        int hashCode4 = (hashCode3 + (s01Var != null ? s01Var.hashCode() : 0)) * 31;
        List<v01> list3 = this.f54060e;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.f54061f;
        int hashCode6 = (hashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<C5600pp> list5 = this.f54062g;
        int hashCode7 = (hashCode6 + (list5 != null ? list5.hashCode() : 0)) * 31;
        HashMap hashMap = this.f54063h;
        return hashCode7 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    /* renamed from: b */
    public final List<C5276ja<?>> m27732b() {
        return this.f54057b;
    }

    @Nullable
    /* renamed from: c */
    public final List<C5600pp> m27734c() {
        return this.f54062g;
    }

    /* renamed from: d */
    public final List<eh0> m27736d() {
        return this.f54058c;
    }

    /* renamed from: a */
    public final void m27730a(ArrayList arrayList) {
        this.f54057b = arrayList;
    }

    /* renamed from: a */
    public final void m27731a(List<eh0> list) {
        this.f54058c = list;
    }

    /* renamed from: a */
    public final void m27728a(s01 s01Var) {
        this.f54059d = s01Var;
    }

    /* renamed from: a */
    public final void m27729a(String str) {
        this.f54056a = str;
    }
}
