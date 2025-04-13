package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.yd */
/* loaded from: classes2.dex */
public class C4443yd {

    /* renamed from: a */
    public final boolean f46999a;

    /* renamed from: b */
    public final boolean f47000b;

    public C4443yd(boolean z, boolean z2) {
        this.f46999a = z;
        this.f47000b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4443yd.class != obj.getClass()) {
            return false;
        }
        C4443yd c4443yd = (C4443yd) obj;
        return this.f46999a == c4443yd.f46999a && this.f47000b == c4443yd.f47000b;
    }

    public int hashCode() {
        return ((this.f46999a ? 1 : 0) * 31) + (this.f47000b ? 1 : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProviderAccessFlags{lastKnownEnabled=");
        m24u.append(this.f46999a);
        m24u.append(", scanningEnabled=");
        m24u.append(this.f47000b);
        m24u.append('}');
        return m24u.toString();
    }
}
