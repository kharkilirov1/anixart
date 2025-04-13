package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.ObjectValue;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class PatchMutation extends Mutation {

    /* renamed from: d */
    public final ObjectValue f22900d;

    /* renamed from: e */
    public final FieldMask f22901e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PatchMutation.class != obj.getClass()) {
            return false;
        }
        PatchMutation patchMutation = (PatchMutation) obj;
        return m12467a(patchMutation) && this.f22900d.equals(patchMutation.f22900d) && this.f22895c.equals(patchMutation.f22895c);
    }

    public int hashCode() {
        return this.f22900d.hashCode() + (m12468b() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PatchMutation{");
        m24u.append(m12469c());
        m24u.append(", mask=");
        m24u.append(this.f22901e);
        m24u.append(", value=");
        m24u.append(this.f22900d);
        m24u.append("}");
        return m24u.toString();
    }
}
