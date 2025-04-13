package com.google.firebase.firestore.model.mutation;

import p000a.C0000a;

/* loaded from: classes2.dex */
public final class VerifyMutation extends Mutation {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VerifyMutation.class != obj.getClass()) {
            return false;
        }
        return m12467a((VerifyMutation) obj);
    }

    public int hashCode() {
        return m12468b();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("VerifyMutation{");
        m24u.append(m12469c());
        m24u.append("}");
        return m24u.toString();
    }
}
