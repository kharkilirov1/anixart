package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Xk */
/* loaded from: classes2.dex */
public class C3751Xk {

    /* renamed from: a */
    public final int f44518a;

    /* renamed from: b */
    @NonNull
    public final String f44519b;

    /* renamed from: c */
    private final int f44520c = m19402a();

    public C3751Xk(int i2, @NonNull String str) {
        this.f44518a = i2;
        this.f44519b = str;
    }

    /* renamed from: a */
    private int m19402a() {
        return this.f44519b.length() + (this.f44518a * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3751Xk.class != obj.getClass()) {
            return false;
        }
        C3751Xk c3751Xk = (C3751Xk) obj;
        if (this.f44518a != c3751Xk.f44518a) {
            return false;
        }
        return this.f44519b.equals(c3751Xk.f44519b);
    }

    public int hashCode() {
        return this.f44520c;
    }
}
