package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.c4 */
/* loaded from: classes2.dex */
public class C3862c4 {

    /* renamed from: a */
    @NonNull
    private final String f44865a;

    /* renamed from: b */
    @Nullable
    private final String f44866b;

    public C3862c4(@NonNull String str, @Nullable String str2) {
        this.f44865a = str;
        this.f44866b = str2;
    }

    /* renamed from: a */
    public String m19668a() {
        return this.f44866b;
    }

    /* renamed from: b */
    public String m19669b() {
        return this.f44865a;
    }

    /* renamed from: c */
    public String mo19670c() {
        return this.f44865a + "_" + C3658U2.m19199a(this.f44866b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3862c4 c3862c4 = (C3862c4) obj;
        String str = this.f44865a;
        if (str == null ? c3862c4.f44865a != null : !str.equals(c3862c4.f44865a)) {
            return false;
        }
        String str2 = this.f44866b;
        String str3 = c3862c4.f44866b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f44865a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44866b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f44865a + "_" + this.f44866b;
    }
}
