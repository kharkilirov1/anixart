package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* loaded from: classes3.dex */
public final class a80 {

    /* renamed from: a */
    @Nullable
    private final List<AbstractC5419m> f48328a;

    /* renamed from: b */
    @Nullable
    private final FalseClick f48329b;

    /* renamed from: c */
    @Nullable
    private final String f48330c;

    /* renamed from: d */
    @Nullable
    private final String f48331d;

    /* renamed from: e */
    private final long f48332e;

    public a80(@Nullable List<AbstractC5419m> list, @Nullable FalseClick falseClick, @Nullable String str, @Nullable String str2, long j2) {
        this.f48328a = list;
        this.f48329b = falseClick;
        this.f48330c = str;
        this.f48331d = str2;
        this.f48332e = j2;
    }

    @Nullable
    /* renamed from: a */
    public final List<AbstractC5419m> m22400a() {
        return this.f48328a;
    }

    /* renamed from: b */
    public final long m22401b() {
        return this.f48332e;
    }

    @Nullable
    /* renamed from: c */
    public final FalseClick m22402c() {
        return this.f48329b;
    }

    @Nullable
    /* renamed from: d */
    public final String m22403d() {
        return this.f48330c;
    }

    @Nullable
    /* renamed from: e */
    public final String m22404e() {
        return this.f48331d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a80.class != obj.getClass()) {
            return false;
        }
        a80 a80Var = (a80) obj;
        if (this.f48332e != a80Var.f48332e) {
            return false;
        }
        List<AbstractC5419m> list = this.f48328a;
        if (list == null ? a80Var.f48328a != null : !list.equals(a80Var.f48328a)) {
            return false;
        }
        FalseClick falseClick = this.f48329b;
        if (falseClick == null ? a80Var.f48329b != null : !falseClick.equals(a80Var.f48329b)) {
            return false;
        }
        String str = this.f48330c;
        if (str == null ? a80Var.f48330c != null : !str.equals(a80Var.f48330c)) {
            return false;
        }
        String str2 = this.f48331d;
        String str3 = a80Var.f48331d;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        List<AbstractC5419m> list = this.f48328a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FalseClick falseClick = this.f48329b;
        int hashCode2 = (hashCode + (falseClick != null ? falseClick.hashCode() : 0)) * 31;
        String str = this.f48330c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48331d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.f48332e;
        return hashCode4 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
