package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class jc0 {

    /* renamed from: a */
    @Nullable
    private final ka0 f51577a;

    /* renamed from: b */
    @Nullable
    private final ob1 f51578b;

    /* renamed from: c */
    @Nullable
    private final List<z10> f51579c;

    public jc0(@Nullable ka0 ka0Var, @Nullable ob1 ob1Var, @Nullable ArrayList arrayList) {
        this.f51577a = ka0Var;
        this.f51578b = ob1Var;
        this.f51579c = arrayList;
    }

    @Nullable
    /* renamed from: a */
    public final List<z10> m25863a() {
        return this.f51579c;
    }

    @Nullable
    /* renamed from: b */
    public final ka0 m25864b() {
        return this.f51577a;
    }

    @Nullable
    /* renamed from: c */
    public final ob1 m25865c() {
        return this.f51578b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        ka0 ka0Var = this.f51577a;
        if (ka0Var == null ? jc0Var.f51577a != null : !ka0Var.equals(jc0Var.f51577a)) {
            return false;
        }
        ob1 ob1Var = this.f51578b;
        if (ob1Var == null ? jc0Var.f51578b != null : !ob1Var.equals(jc0Var.f51578b)) {
            return false;
        }
        List<z10> list = this.f51579c;
        List<z10> list2 = jc0Var.f51579c;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        ka0 ka0Var = this.f51577a;
        int hashCode = (ka0Var != null ? ka0Var.hashCode() : 0) * 31;
        ob1 ob1Var = this.f51578b;
        int hashCode2 = (hashCode + (ob1Var != null ? ob1Var.hashCode() : 0)) * 31;
        List<z10> list = this.f51579c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }
}
