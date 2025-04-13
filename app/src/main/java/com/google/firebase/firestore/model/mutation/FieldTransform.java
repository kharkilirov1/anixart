package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.FieldPath;

/* loaded from: classes2.dex */
public final class FieldTransform {

    /* renamed from: a */
    public final FieldPath f22891a;

    /* renamed from: b */
    public final TransformOperation f22892b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldTransform.class != obj.getClass()) {
            return false;
        }
        FieldTransform fieldTransform = (FieldTransform) obj;
        if (this.f22891a.equals(fieldTransform.f22891a)) {
            return this.f22892b.equals(fieldTransform.f22892b);
        }
        return false;
    }

    public int hashCode() {
        return this.f22892b.hashCode() + (this.f22891a.hashCode() * 31);
    }
}
