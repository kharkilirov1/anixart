package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.H */
/* loaded from: classes2.dex */
public class C3331H {

    /* renamed from: a */
    @Nullable
    public final a f43019a;

    /* renamed from: b */
    @Nullable
    public final Boolean f43020b;

    /* renamed from: com.yandex.metrica.impl.ob.H$a */
    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C3331H(@Nullable a aVar, @Nullable Boolean bool) {
        this.f43019a = aVar;
        this.f43020b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3331H.class != obj.getClass()) {
            return false;
        }
        C3331H c3331h = (C3331H) obj;
        if (this.f43019a != c3331h.f43019a) {
            return false;
        }
        Boolean bool = this.f43020b;
        return bool != null ? bool.equals(c3331h.f43020b) : c3331h.f43020b == null;
    }

    public int hashCode() {
        a aVar = this.f43019a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f43020b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
