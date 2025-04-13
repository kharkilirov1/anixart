package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ie */
/* loaded from: classes2.dex */
public class C4028ie {

    /* renamed from: a */
    @NonNull
    public final String f45340a;

    /* renamed from: b */
    public final boolean f45341b;

    public C4028ie(@NonNull String str, boolean z) {
        this.f45340a = str;
        this.f45341b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4028ie.class != obj.getClass()) {
            return false;
        }
        C4028ie c4028ie = (C4028ie) obj;
        if (this.f45341b != c4028ie.f45341b) {
            return false;
        }
        return this.f45340a.equals(c4028ie.f45340a);
    }

    public int hashCode() {
        return (this.f45340a.hashCode() * 31) + (this.f45341b ? 1 : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PermissionState{name='");
        C0576a.m4100A(m24u, this.f45340a, '\'', ", granted=");
        m24u.append(this.f45341b);
        m24u.append('}');
        return m24u.toString();
    }
}
