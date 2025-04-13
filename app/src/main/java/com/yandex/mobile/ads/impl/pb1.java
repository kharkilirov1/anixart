package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pb1 implements qf1 {

    /* renamed from: a */
    @NonNull
    private final ArrayList f53505a;

    /* renamed from: b */
    @NonNull
    private final cc1 f53506b;

    /* renamed from: c */
    @NonNull
    private final Map<String, List<String>> f53507c;

    /* renamed from: d */
    @NonNull
    private final HashMap f53508d;

    /* renamed from: e */
    private final String f53509e;

    /* renamed from: f */
    private final String f53510f;

    /* renamed from: g */
    private final String f53511g;

    /* renamed from: h */
    private final String f53512h;

    /* renamed from: i */
    private final String f53513i;

    /* renamed from: j */
    @Nullable
    private final wg1 f53514j;

    /* renamed from: k */
    @Nullable
    private final Integer f53515k;

    /* renamed from: l */
    @Nullable
    private final String f53516l;

    /* renamed from: m */
    @Nullable
    private lj1 f53517m;

    /* renamed from: n */
    @NonNull
    private final ArrayList f53518n;

    /* renamed from: o */
    private final boolean f53519o;

    /* renamed from: com.yandex.mobile.ads.impl.pb1$a */
    public static class C5585a {

        /* renamed from: a */
        @Nullable
        private lj1 f53520a;

        /* renamed from: b */
        @Nullable
        private String f53521b;

        /* renamed from: c */
        @Nullable
        private String f53522c;

        /* renamed from: d */
        @Nullable
        private String f53523d;

        /* renamed from: e */
        @Nullable
        private String f53524e;

        /* renamed from: f */
        @Nullable
        private String f53525f;

        /* renamed from: g */
        @Nullable
        private wg1 f53526g;

        /* renamed from: h */
        @Nullable
        private Integer f53527h;

        /* renamed from: i */
        @Nullable
        private String f53528i;

        /* renamed from: j */
        private final boolean f53529j;

        /* renamed from: k */
        @NonNull
        private final ArrayList f53530k = new ArrayList();

        /* renamed from: l */
        @NonNull
        private final ArrayList f53531l = new ArrayList();

        /* renamed from: m */
        @NonNull
        private Map<String, List<String>> f53532m = new HashMap();

        /* renamed from: n */
        @NonNull
        private final HashMap f53533n = new HashMap();

        /* renamed from: o */
        @NonNull
        private cc1 f53534o = new cc1.C4915a().m23222a();

        /* renamed from: p */
        @NonNull
        private final td1 f53535p;

        public C5585a(@NonNull Context context, boolean z) {
            this.f53529j = z;
            this.f53535p = new td1(context);
        }

        @NonNull
        /* renamed from: a */
        public final C5585a m27293a(@Nullable lj1 lj1Var) {
            this.f53520a = lj1Var;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final C5585a m27300b(@Nullable String str) {
            this.f53522c = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final C5585a m27302c(@Nullable String str) {
            this.f53523d = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final void m27303d(@Nullable String str) {
            this.f53528i = str;
        }

        @NonNull
        /* renamed from: e */
        public final C5585a m27304e(@Nullable String str) {
            this.f53524e = str;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public final C5585a m27305f(@Nullable String str) {
            this.f53525f = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C5585a m27295a(@Nullable String str) {
            this.f53521b = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final C5585a m27301b(@Nullable ArrayList arrayList) {
            this.f53530k.addAll(arrayList);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m27298a(@Nullable Integer num) {
            this.f53527h = num;
        }

        @NonNull
        /* renamed from: a */
        public final C5585a m27292a(@NonNull cc1 cc1Var) {
            this.f53534o = cc1Var;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C5585a m27296a(@NonNull ArrayList arrayList) {
            this.f53531l.addAll(arrayList);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m27299a(@Nullable String str, @Nullable String str2) {
            List list = (List) this.f53533n.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f53533n.put(str, list);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            list.add(str2);
        }

        @NonNull
        /* renamed from: a */
        public final C5585a m27294a(@NonNull wg1 wg1Var) {
            this.f53526g = wg1Var;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final pb1 m27297a() {
            this.f53532m = this.f53535p.m28634a(this.f53533n, this.f53526g);
            return new pb1(this);
        }
    }

    public pb1(@NonNull C5585a c5585a) {
        this.f53519o = c5585a.f53529j;
        this.f53509e = c5585a.f53521b;
        this.f53510f = c5585a.f53522c;
        this.f53511g = c5585a.f53523d;
        this.f53506b = c5585a.f53534o;
        this.f53512h = c5585a.f53524e;
        this.f53513i = c5585a.f53525f;
        this.f53515k = c5585a.f53527h;
        this.f53516l = c5585a.f53528i;
        this.f53505a = c5585a.f53530k;
        this.f53507c = c5585a.f53532m;
        this.f53508d = c5585a.f53533n;
        this.f53514j = c5585a.f53526g;
        this.f53517m = c5585a.f53520a;
        this.f53518n = c5585a.f53531l;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    @NonNull
    /* renamed from: a */
    public final Map<String, List<String>> mo22451a() {
        return Collections.unmodifiableMap(this.f53507c);
    }

    /* renamed from: b */
    public final String m27263b() {
        return this.f53509e;
    }

    /* renamed from: c */
    public final String m27264c() {
        return this.f53510f;
    }

    @NonNull
    /* renamed from: d */
    public final ArrayList m27265d() {
        return this.f53518n;
    }

    @NonNull
    /* renamed from: e */
    public final ArrayList m27266e() {
        return this.f53505a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pb1.class != obj.getClass()) {
            return false;
        }
        pb1 pb1Var = (pb1) obj;
        if (this.f53519o != pb1Var.f53519o) {
            return false;
        }
        String str = this.f53509e;
        if (str == null ? pb1Var.f53509e != null : !str.equals(pb1Var.f53509e)) {
            return false;
        }
        String str2 = this.f53510f;
        if (str2 == null ? pb1Var.f53510f != null : !str2.equals(pb1Var.f53510f)) {
            return false;
        }
        if (!this.f53505a.equals(pb1Var.f53505a)) {
            return false;
        }
        String str3 = this.f53511g;
        if (str3 == null ? pb1Var.f53511g != null : !str3.equals(pb1Var.f53511g)) {
            return false;
        }
        String str4 = this.f53512h;
        if (str4 == null ? pb1Var.f53512h != null : !str4.equals(pb1Var.f53512h)) {
            return false;
        }
        Integer num = this.f53515k;
        if (num == null ? pb1Var.f53515k != null : !num.equals(pb1Var.f53515k)) {
            return false;
        }
        if (!this.f53506b.equals(pb1Var.f53506b) || !this.f53507c.equals(pb1Var.f53507c) || !this.f53508d.equals(pb1Var.f53508d)) {
            return false;
        }
        String str5 = this.f53513i;
        if (str5 == null ? pb1Var.f53513i != null : !str5.equals(pb1Var.f53513i)) {
            return false;
        }
        wg1 wg1Var = this.f53514j;
        if (wg1Var == null ? pb1Var.f53514j != null : !wg1Var.equals(pb1Var.f53514j)) {
            return false;
        }
        if (!this.f53518n.equals(pb1Var.f53518n)) {
            return false;
        }
        lj1 lj1Var = this.f53517m;
        return lj1Var != null ? lj1Var.equals(pb1Var.f53517m) : pb1Var.f53517m == null;
    }

    /* renamed from: f */
    public final String m27267f() {
        return this.f53511g;
    }

    @Nullable
    /* renamed from: g */
    public final String m27268g() {
        return this.f53516l;
    }

    @NonNull
    /* renamed from: h */
    public final Map<String, List<String>> m27269h() {
        return Collections.unmodifiableMap(this.f53508d);
    }

    public final int hashCode() {
        int hashCode = (this.f53508d.hashCode() + ((this.f53507c.hashCode() + ((this.f53506b.hashCode() + (this.f53505a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f53509e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f53510f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f53511g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f53515k;
        int intValue = (hashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str4 = this.f53512h;
        int hashCode5 = (intValue + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f53513i;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        wg1 wg1Var = this.f53514j;
        int hashCode7 = (hashCode6 + (wg1Var != null ? wg1Var.hashCode() : 0)) * 31;
        lj1 lj1Var = this.f53517m;
        return this.f53518n.hashCode() + ((((hashCode7 + (lj1Var != null ? lj1Var.hashCode() : 0)) * 31) + (this.f53519o ? 1 : 0)) * 31);
    }

    @Nullable
    /* renamed from: i */
    public final Integer m27270i() {
        return this.f53515k;
    }

    /* renamed from: j */
    public final String m27271j() {
        return this.f53512h;
    }

    /* renamed from: k */
    public final String m27272k() {
        return this.f53513i;
    }

    @NonNull
    /* renamed from: l */
    public final cc1 m27273l() {
        return this.f53506b;
    }

    @Nullable
    /* renamed from: m */
    public final wg1 m27274m() {
        return this.f53514j;
    }

    @Nullable
    /* renamed from: n */
    public final lj1 m27275n() {
        return this.f53517m;
    }

    /* renamed from: o */
    public final boolean m27276o() {
        return this.f53519o;
    }
}
