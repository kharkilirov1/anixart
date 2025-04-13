package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.ObjectValue;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class SetMutation extends Mutation {

    /* renamed from: d */
    public final ObjectValue f22906d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SetMutation.class != obj.getClass()) {
            return false;
        }
        SetMutation setMutation = (SetMutation) obj;
        return m12467a(setMutation) && this.f22906d.equals(setMutation.f22906d) && this.f22895c.equals(setMutation.f22895c);
    }

    public int hashCode() {
        return this.f22906d.hashCode() + (m12468b() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SetMutation{");
        m24u.append(m12469c());
        m24u.append(", value=");
        m24u.append(this.f22906d);
        m24u.append("}");
        return m24u.toString();
    }
}
