package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Values;
import com.google.firestore.p012v1.Value;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Bound {

    /* renamed from: a */
    public final boolean f22677a;

    /* renamed from: b */
    public final List<Value> f22678b;

    public Bound(List<Value> list, boolean z) {
        this.f22678b = list;
        this.f22677a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bound.class != obj.getClass()) {
            return false;
        }
        Bound bound = (Bound) obj;
        return this.f22677a == bound.f22677a && this.f22678b.equals(bound.f22678b);
    }

    public int hashCode() {
        return this.f22678b.hashCode() + ((this.f22677a ? 1 : 0) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Bound(inclusive=");
        m24u.append(this.f22677a);
        m24u.append(", position=");
        for (int i2 = 0; i2 < this.f22678b.size(); i2++) {
            if (i2 > 0) {
                m24u.append(" and ");
            }
            m24u.append(Values.m12457a(this.f22678b.get(i2)));
        }
        m24u.append(")");
        return m24u.toString();
    }
}
