package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class jb0 {

    /* renamed from: a */
    private final String f51558a;

    /* renamed from: b */
    private final String f51559b;

    /* renamed from: c */
    private final int f51560c;

    /* renamed from: d */
    private final String f51561d;

    /* renamed from: e */
    @Nullable
    private final String f51562e;

    /* renamed from: f */
    @Nullable
    private final Float f51563f;

    /* renamed from: g */
    private final int f51564g;

    /* renamed from: h */
    private final int f51565h;

    /* renamed from: i */
    public int f51566i;

    /* renamed from: com.yandex.mobile.ads.impl.jb0$a */
    public static class C5278a {

        /* renamed from: a */
        @Nullable
        private String f51567a;

        /* renamed from: b */
        @Nullable
        private String f51568b;

        /* renamed from: c */
        @Nullable
        private int f51569c;

        /* renamed from: d */
        @Nullable
        private String f51570d;

        /* renamed from: e */
        @Nullable
        private String f51571e;

        /* renamed from: f */
        @Nullable
        private Float f51572f;

        /* renamed from: g */
        private int f51573g;

        /* renamed from: h */
        private int f51574h;

        /* renamed from: i */
        public int f51575i;

        @NonNull
        /* renamed from: a */
        public final C5278a m25852a(@Nullable String str) {
            this.f51571e = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final C5278a m25854b(@Nullable String str) {
            this.f51569c = kb0.m26099a(str);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final C5278a m25855c(@Nullable String str) {
            try {
                this.f51573g = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final C5278a m25856d(@Nullable String str) {
            this.f51567a = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final C5278a m25857e(@Nullable String str) {
            this.f51570d = str;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public final C5278a m25858f(@Nullable String str) {
            this.f51568b = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public final C5278a m25859g(@Nullable String str) {
            Float f2;
            int i2 = C5427m6.f52583b;
            try {
                f2 = Float.valueOf(Float.parseFloat(str));
            } catch (Exception unused) {
                f2 = null;
            }
            this.f51572f = f2;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public final C5278a m25860h(@Nullable String str) {
            try {
                this.f51574h = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final jb0 m25853a() {
            return new jb0(this);
        }
    }

    public jb0(@NonNull C5278a c5278a) {
        this.f51558a = c5278a.f51567a;
        this.f51559b = c5278a.f51568b;
        this.f51560c = c5278a.f51569c;
        this.f51564g = c5278a.f51573g;
        this.f51566i = c5278a.f51575i;
        this.f51565h = c5278a.f51574h;
        this.f51561d = c5278a.f51570d;
        this.f51562e = c5278a.f51571e;
        this.f51563f = c5278a.f51572f;
    }

    @Nullable
    /* renamed from: a */
    public final String m25838a() {
        return this.f51562e;
    }

    /* renamed from: b */
    public final int m25839b() {
        return this.f51564g;
    }

    /* renamed from: c */
    public final String m25840c() {
        return this.f51561d;
    }

    /* renamed from: d */
    public final String m25841d() {
        return this.f51559b;
    }

    @Nullable
    /* renamed from: e */
    public final Float m25842e() {
        return this.f51563f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jb0.class != obj.getClass()) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        if (this.f51564g != jb0Var.f51564g || this.f51565h != jb0Var.f51565h || this.f51566i != jb0Var.f51566i || this.f51560c != jb0Var.f51560c) {
            return false;
        }
        String str = this.f51558a;
        if (str == null ? jb0Var.f51558a != null : !str.equals(jb0Var.f51558a)) {
            return false;
        }
        String str2 = this.f51561d;
        if (str2 == null ? jb0Var.f51561d != null : !str2.equals(jb0Var.f51561d)) {
            return false;
        }
        String str3 = this.f51559b;
        if (str3 == null ? jb0Var.f51559b != null : !str3.equals(jb0Var.f51559b)) {
            return false;
        }
        String str4 = this.f51562e;
        if (str4 == null ? jb0Var.f51562e != null : !str4.equals(jb0Var.f51562e)) {
            return false;
        }
        Float f2 = this.f51563f;
        Float f3 = jb0Var.f51563f;
        return f2 == null ? f3 == null : f2.equals(f3);
    }

    /* renamed from: f */
    public final int m25843f() {
        return this.f51565h;
    }

    public final int hashCode() {
        String str = this.f51558a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f51559b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.f51560c;
        int m28463a = (((((((hashCode2 + (i2 != 0 ? C5782t5.m28463a(i2) : 0)) * 31) + this.f51564g) * 31) + this.f51565h) * 31) + this.f51566i) * 31;
        String str3 = this.f51561d;
        int hashCode3 = (m28463a + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f51562e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Float f2 = this.f51563f;
        return hashCode4 + (f2 != null ? f2.hashCode() : 0);
    }
}
