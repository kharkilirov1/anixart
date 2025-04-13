package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.FieldPath;
import java.util.HashSet;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class FieldMask {

    /* renamed from: a */
    public final Set<FieldPath> f22890a;

    static {
        new HashSet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldMask.class != obj.getClass()) {
            return false;
        }
        return this.f22890a.equals(((FieldMask) obj).f22890a);
    }

    public int hashCode() {
        return this.f22890a.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("FieldMask{mask=");
        m24u.append(this.f22890a.toString());
        m24u.append("}");
        return m24u.toString();
    }
}
