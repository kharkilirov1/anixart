package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class eh0 {

    /* renamed from: a */
    private a80 f49964a;

    /* renamed from: b */
    @Nullable
    private int f49965b;

    /* renamed from: c */
    private List<C5276ja<?>> f49966c;

    /* renamed from: d */
    @Nullable
    private String f49967d;

    /* renamed from: e */
    @Nullable
    private AdImpressionData f49968e;

    /* renamed from: f */
    private String f49969f;

    /* renamed from: g */
    private C5818tu f49970g;

    /* renamed from: h */
    private C5818tu f49971h;

    /* renamed from: i */
    @NonNull
    private final HashSet f49972i = new HashSet();

    /* renamed from: j */
    @NonNull
    private final HashSet f49973j = new HashSet();

    /* renamed from: a */
    public final void m24158a(@Nullable a80 a80Var) {
        this.f49964a = a80Var;
    }

    /* renamed from: b */
    public final List<C5276ja<?>> m24163b() {
        return this.f49966c;
    }

    /* renamed from: c */
    public final void m24168c(String str) {
        int[] m28465b = C5782t5.m28465b(3);
        int length = m28465b.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            int i4 = m28465b[i3];
            if (cx0.m23548a(i4).equals(str)) {
                i2 = i4;
                break;
            }
            i3++;
        }
        this.f49965b = i2;
    }

    /* renamed from: d */
    public final void m24171d(String str) {
        this.f49969f = str;
    }

    /* renamed from: e */
    public final a80 m24172e() {
        return this.f49964a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eh0.class != obj.getClass()) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        a80 a80Var = this.f49964a;
        if (a80Var == null ? eh0Var.f49964a != null : !a80Var.equals(eh0Var.f49964a)) {
            return false;
        }
        if (this.f49965b != eh0Var.f49965b) {
            return false;
        }
        List<C5276ja<?>> list = this.f49966c;
        if (list == null ? eh0Var.f49966c != null : !list.equals(eh0Var.f49966c)) {
            return false;
        }
        String str = this.f49967d;
        if (str == null ? eh0Var.f49967d != null : !str.equals(eh0Var.f49967d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f49968e;
        if (adImpressionData == null ? eh0Var.f49968e != null : !adImpressionData.equals(eh0Var.f49968e)) {
            return false;
        }
        String str2 = this.f49969f;
        if (str2 == null ? eh0Var.f49969f != null : !str2.equals(eh0Var.f49969f)) {
            return false;
        }
        C5818tu c5818tu = this.f49970g;
        if (c5818tu == null ? eh0Var.f49970g != null : !c5818tu.equals(eh0Var.f49970g)) {
            return false;
        }
        C5818tu c5818tu2 = this.f49971h;
        if (c5818tu2 == null ? eh0Var.f49971h != null : !c5818tu2.equals(eh0Var.f49971h)) {
            return false;
        }
        if (this.f49972i.equals(eh0Var.f49972i)) {
            return this.f49973j.equals(eh0Var.f49973j);
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public final ArrayList m24173f() {
        return new ArrayList(this.f49972i);
    }

    @Nullable
    /* renamed from: g */
    public final int m24174g() {
        return this.f49965b;
    }

    @NonNull
    /* renamed from: h */
    public final ArrayList m24175h() {
        return new ArrayList(this.f49973j);
    }

    public final int hashCode() {
        a80 a80Var = this.f49964a;
        int hashCode = (a80Var != null ? a80Var.hashCode() : 0) * 31;
        int i2 = this.f49965b;
        int m28463a = (hashCode + (i2 != 0 ? C5782t5.m28463a(i2) : 0)) * 31;
        List<C5276ja<?>> list = this.f49966c;
        int hashCode2 = (m28463a + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f49967d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f49968e;
        int hashCode4 = (hashCode3 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        String str2 = this.f49969f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C5818tu c5818tu = this.f49970g;
        int hashCode6 = (hashCode5 + (c5818tu != null ? c5818tu.hashCode() : 0)) * 31;
        C5818tu c5818tu2 = this.f49971h;
        return this.f49973j.hashCode() + ((this.f49972i.hashCode() + ((hashCode6 + (c5818tu2 != null ? c5818tu2.hashCode() : 0)) * 31)) * 31);
    }

    /* renamed from: a */
    public final void m24160a(@NonNull v01 v01Var) {
        this.f49973j.add(v01Var);
    }

    /* renamed from: b */
    public final void m24166b(@NonNull ArrayList arrayList) {
        this.f49973j.addAll(arrayList);
    }

    @Nullable
    /* renamed from: d */
    public final String m24170d() {
        return this.f49969f;
    }

    /* renamed from: a */
    public final void m24161a(@NonNull String str) {
        this.f49972i.add(str);
    }

    /* renamed from: b */
    public final void m24165b(@Nullable String str) {
        this.f49967d = str;
    }

    /* renamed from: a */
    public final void m24162a(@NonNull ArrayList arrayList) {
        this.f49972i.addAll(arrayList);
    }

    /* renamed from: b */
    public final void m24164b(C5818tu c5818tu) {
        this.f49971h = c5818tu;
    }

    /* renamed from: a */
    public final void m24157a(@Nullable AdImpressionData adImpressionData) {
        this.f49968e = adImpressionData;
    }

    @Nullable
    /* renamed from: a */
    public final String m24156a() {
        return this.f49967d;
    }

    /* renamed from: c */
    public final void m24169c(ArrayList arrayList) {
        this.f49966c = arrayList;
    }

    /* renamed from: a */
    public final void m24159a(C5818tu c5818tu) {
        this.f49970g = c5818tu;
    }

    @Nullable
    /* renamed from: c */
    public final AdImpressionData m24167c() {
        return this.f49968e;
    }
}
