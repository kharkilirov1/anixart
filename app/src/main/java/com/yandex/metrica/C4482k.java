package com.yandex.metrica;

import java.util.Map;

/* renamed from: com.yandex.metrica.k */
/* loaded from: classes2.dex */
public class C4482k {

    /* renamed from: a */
    public String f47164a;

    /* renamed from: b */
    public String f47165b;

    /* renamed from: c */
    public Map<String, String> f47166c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4482k.class != obj.getClass()) {
            return false;
        }
        C4482k c4482k = (C4482k) obj;
        String str = this.f47164a;
        if (str == null ? c4482k.f47164a != null : !str.equals(c4482k.f47164a)) {
            return false;
        }
        String str2 = this.f47165b;
        if (str2 == null ? c4482k.f47165b != null : !str2.equals(c4482k.f47165b)) {
            return false;
        }
        Map<String, String> map = this.f47166c;
        Map<String, String> map2 = c4482k.f47166c;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        String str = this.f47164a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47165b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f47166c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }
}
