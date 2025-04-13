package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ci */
/* loaded from: classes2.dex */
public class C3225Ci {

    /* renamed from: a */
    public final int f42677a;

    /* renamed from: b */
    public final int f42678b;

    public C3225Ci(int i2, int i3) {
        this.f42677a = i2;
        this.f42678b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3225Ci.class != obj.getClass()) {
            return false;
        }
        C3225Ci c3225Ci = (C3225Ci) obj;
        return this.f42677a == c3225Ci.f42677a && this.f42678b == c3225Ci.f42678b;
    }

    public int hashCode() {
        return (this.f42677a * 31) + this.f42678b;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("RetryPolicyConfig{maxIntervalSeconds=");
        m24u.append(this.f42677a);
        m24u.append(", exponentialMultiplier=");
        return C0000a.m17n(m24u, this.f42678b, '}');
    }
}
