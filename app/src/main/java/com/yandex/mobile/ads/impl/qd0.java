package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qd0 {

    /* renamed from: a */
    @NonNull
    private final String f54009a;

    /* renamed from: b */
    @NonNull
    private final Map<String, String> f54010b;

    /* renamed from: c */
    @Nullable
    private final List<String> f54011c;

    /* renamed from: d */
    @Nullable
    private final List<String> f54012d;

    /* renamed from: e */
    @Nullable
    private final List<String> f54013e;

    /* renamed from: f */
    @Nullable
    private final AdImpressionData f54014f;

    /* renamed from: g */
    @Nullable
    private final Map<String, String> f54015g;

    /* renamed from: com.yandex.mobile.ads.impl.qd0$a */
    public static class C5631a {

        /* renamed from: a */
        @NonNull
        private final String f54016a;

        /* renamed from: b */
        @NonNull
        private final Map<String, String> f54017b;

        /* renamed from: c */
        @Nullable
        private List<String> f54018c;

        /* renamed from: d */
        @Nullable
        private List<String> f54019d;

        /* renamed from: e */
        @Nullable
        private List<String> f54020e;

        /* renamed from: f */
        @Nullable
        private AdImpressionData f54021f;

        /* renamed from: g */
        @Nullable
        private Map<String, String> f54022g;

        public C5631a(@NonNull String str, @NonNull HashMap hashMap) {
            this.f54016a = str;
            this.f54017b = hashMap;
        }

        @NonNull
        /* renamed from: a */
        public final qd0 m27689a() {
            return new qd0(this, 0);
        }

        @NonNull
        /* renamed from: b */
        public final C5631a m27692b(@Nullable ArrayList arrayList) {
            this.f54019d = arrayList;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final C5631a m27693c(@Nullable ArrayList arrayList) {
            this.f54018c = arrayList;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C5631a m27688a(@Nullable ArrayList arrayList) {
            this.f54020e = arrayList;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m27690a(@Nullable AdImpressionData adImpressionData) {
            this.f54021f = adImpressionData;
        }

        @NonNull
        /* renamed from: a */
        public final void m27691a(@Nullable HashMap hashMap) {
            this.f54022g = hashMap;
        }
    }

    public /* synthetic */ qd0(C5631a c5631a, int i2) {
        this(c5631a);
    }

    @Nullable
    /* renamed from: a */
    public final AdImpressionData m27674a() {
        return this.f54014f;
    }

    @Nullable
    /* renamed from: b */
    public final List<String> m27675b() {
        return this.f54013e;
    }

    @NonNull
    /* renamed from: c */
    public final String m27676c() {
        return this.f54009a;
    }

    @Nullable
    /* renamed from: d */
    public final Map<String, String> m27677d() {
        return this.f54015g;
    }

    @Nullable
    /* renamed from: e */
    public final List<String> m27678e() {
        return this.f54012d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qd0.class != obj.getClass()) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        if (!this.f54009a.equals(qd0Var.f54009a) || !this.f54010b.equals(qd0Var.f54010b)) {
            return false;
        }
        List<String> list = this.f54011c;
        if (list == null ? qd0Var.f54011c != null : !list.equals(qd0Var.f54011c)) {
            return false;
        }
        List<String> list2 = this.f54012d;
        if (list2 == null ? qd0Var.f54012d != null : !list2.equals(qd0Var.f54012d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f54014f;
        if (adImpressionData == null ? qd0Var.f54014f != null : !adImpressionData.equals(qd0Var.f54014f)) {
            return false;
        }
        Map<String, String> map = this.f54015g;
        if (map == null ? qd0Var.f54015g != null : !map.equals(qd0Var.f54015g)) {
            return false;
        }
        List<String> list3 = this.f54013e;
        return list3 != null ? list3.equals(qd0Var.f54013e) : qd0Var.f54013e == null;
    }

    @Nullable
    /* renamed from: f */
    public final List<String> m27679f() {
        return this.f54011c;
    }

    @NonNull
    /* renamed from: g */
    public final Map<String, String> m27680g() {
        return this.f54010b;
    }

    public final int hashCode() {
        int hashCode = (this.f54010b.hashCode() + (this.f54009a.hashCode() * 31)) * 31;
        List<String> list = this.f54011c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f54012d;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f54013e;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f54014f;
        int hashCode5 = (hashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        Map<String, String> map = this.f54015g;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    private qd0(@NonNull C5631a c5631a) {
        this.f54009a = c5631a.f54016a;
        this.f54010b = c5631a.f54017b;
        this.f54011c = c5631a.f54018c;
        this.f54012d = c5631a.f54019d;
        this.f54013e = c5631a.f54020e;
        this.f54014f = c5631a.f54021f;
        this.f54015g = c5631a.f54022g;
    }
}
