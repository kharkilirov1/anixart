package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.fl */
/* loaded from: classes3.dex */
public final class C5083fl implements qf1 {

    /* renamed from: a */
    @NonNull
    private final ArrayList f50283a;

    /* renamed from: b */
    @NonNull
    private final ArrayList f50284b;

    /* renamed from: c */
    @NonNull
    private final ArrayList f50285c;

    /* renamed from: d */
    @Nullable
    private final C5238il f50286d;

    /* renamed from: e */
    @NonNull
    private final k71 f50287e = new k71();

    /* renamed from: f */
    private final String f50288f;

    /* renamed from: g */
    private final String f50289g;

    /* renamed from: h */
    @Nullable
    private y11 f50290h;

    /* renamed from: i */
    private int f50291i;

    /* renamed from: com.yandex.mobile.ads.impl.fl$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        private final ArrayList f50292a = new ArrayList();

        /* renamed from: b */
        @NonNull
        private final ArrayList f50293b = new ArrayList();

        /* renamed from: c */
        @NonNull
        private final ArrayList f50294c = new ArrayList();

        /* renamed from: d */
        @Nullable
        private C5238il f50295d;

        /* renamed from: e */
        @Nullable
        private String f50296e;

        /* renamed from: f */
        @Nullable
        private y11 f50297f;

        /* renamed from: g */
        @Nullable
        private String f50298g;

        /* renamed from: h */
        private int f50299h;

        @NonNull
        /* renamed from: a */
        public final a m24627a(int i2) {
            this.f50299h = i2;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final void m24636b(@Nullable String str) {
            this.f50298g = str;
        }

        @NonNull
        /* renamed from: a */
        public final a m24631a(@Nullable List list) {
            ArrayList arrayList = this.f50293b;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a m24635b(@Nullable List list) {
            ArrayList arrayList = this.f50292a;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m24630a(@Nullable ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f50294c.add((j71) it.next());
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m24633a(@NonNull C5238il c5238il) {
            this.f50295d = c5238il;
        }

        @NonNull
        /* renamed from: a */
        public final void m24634a(@NonNull j71 j71Var) {
            this.f50294c.add(j71Var);
        }

        @NonNull
        /* renamed from: a */
        public final a m24629a(@Nullable String str) {
            this.f50296e = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a m24628a(@Nullable y11 y11Var) {
            this.f50297f = y11Var;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C5083fl m24632a() {
            return new C5083fl(this);
        }
    }

    public C5083fl(@NonNull a aVar) {
        this.f50289g = aVar.f50298g;
        this.f50291i = aVar.f50299h;
        this.f50283a = aVar.f50292a;
        this.f50284b = aVar.f50293b;
        this.f50285c = aVar.f50294c;
        this.f50286d = aVar.f50295d;
        this.f50288f = aVar.f50296e;
        this.f50290h = aVar.f50297f;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    @NonNull
    /* renamed from: a */
    public final Map<String, List<String>> mo22451a() {
        List list;
        k71 k71Var = this.f50287e;
        ArrayList arrayList = this.f50285c;
        Objects.requireNonNull(k71Var);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j71 j71Var = (j71) it.next();
            String m25813a = j71Var.m25813a();
            if (hashMap.containsKey(m25813a)) {
                list = (List) hashMap.get(m25813a);
            } else {
                list = new ArrayList();
                hashMap.put(m25813a, list);
            }
            list.add(j71Var.m25815c());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: b */
    public final String m24612b() {
        return this.f50288f;
    }

    @Nullable
    /* renamed from: c */
    public final C5238il m24613c() {
        return this.f50286d;
    }

    /* renamed from: d */
    public final int m24614d() {
        return this.f50291i;
    }

    @NonNull
    /* renamed from: e */
    public final List<z00> m24615e() {
        return Collections.unmodifiableList(this.f50284b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5083fl.class != obj.getClass()) {
            return false;
        }
        C5083fl c5083fl = (C5083fl) obj;
        if (this.f50291i != c5083fl.f50291i || !this.f50283a.equals(c5083fl.f50283a) || !this.f50284b.equals(c5083fl.f50284b) || !this.f50285c.equals(c5083fl.f50285c)) {
            return false;
        }
        C5238il c5238il = this.f50286d;
        if (c5238il == null ? c5083fl.f50286d != null : !c5238il.equals(c5083fl.f50286d)) {
            return false;
        }
        String str = this.f50288f;
        if (str == null ? c5083fl.f50288f != null : !str.equals(c5083fl.f50288f)) {
            return false;
        }
        y11 y11Var = this.f50290h;
        if (y11Var == null ? c5083fl.f50290h != null : !y11Var.equals(c5083fl.f50290h)) {
            return false;
        }
        String str2 = this.f50289g;
        String str3 = c5083fl.f50289g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    @NonNull
    /* renamed from: f */
    public final List<jb0> m24616f() {
        return Collections.unmodifiableList(this.f50283a);
    }

    @Nullable
    /* renamed from: g */
    public final y11 m24617g() {
        return this.f50290h;
    }

    @NonNull
    /* renamed from: h */
    public final ArrayList m24618h() {
        return this.f50285c;
    }

    public final int hashCode() {
        int hashCode = (this.f50285c.hashCode() + ((this.f50284b.hashCode() + (this.f50283a.hashCode() * 31)) * 31)) * 31;
        C5238il c5238il = this.f50286d;
        int hashCode2 = (hashCode + (c5238il != null ? c5238il.hashCode() : 0)) * 31;
        String str = this.f50288f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        y11 y11Var = this.f50290h;
        int hashCode4 = (hashCode3 + (y11Var != null ? y11Var.hashCode() : 0)) * 31;
        String str2 = this.f50289g;
        return ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f50291i;
    }
}
