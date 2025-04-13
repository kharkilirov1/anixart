package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.mi */
/* loaded from: classes3.dex */
public final class C5445mi {

    /* renamed from: a */
    private final String f52687a;

    /* renamed from: b */
    private final int f52688b;

    public C5445mi(int i2, String str) {
        this.f52688b = i2;
        this.f52687a = str;
    }

    /* renamed from: a */
    public final String m26676a() {
        return this.f52687a;
    }

    /* renamed from: b */
    public final int m26677b() {
        return this.f52688b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5445mi.class != obj.getClass()) {
            return false;
        }
        C5445mi c5445mi = (C5445mi) obj;
        String str = this.f52687a;
        if (str == null ? c5445mi.f52687a == null : str.equals(c5445mi.f52687a)) {
            return this.f52688b == c5445mi.f52688b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f52687a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.f52688b;
        return hashCode + (i2 != 0 ? C5782t5.m28463a(i2) : 0);
    }
}
