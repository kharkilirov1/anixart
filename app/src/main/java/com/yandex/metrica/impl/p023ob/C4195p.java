package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.p */
/* loaded from: classes2.dex */
public class C4195p {

    /* renamed from: a */
    public final int f46090a;

    /* renamed from: b */
    public final int f46091b;

    public C4195p(int i2, int i3) {
        this.f46090a = i2;
        this.f46091b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4195p.class != obj.getClass()) {
            return false;
        }
        C4195p c4195p = (C4195p) obj;
        return this.f46090a == c4195p.f46090a && this.f46091b == c4195p.f46091b;
    }

    public int hashCode() {
        return (this.f46090a * 31) + this.f46091b;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("BillingConfig{sendFrequencySeconds=");
        m24u.append(this.f46090a);
        m24u.append(", firstCollectingInappMaxAgeSeconds=");
        return C0000a.m18o(m24u, this.f46091b, "}");
    }
}
