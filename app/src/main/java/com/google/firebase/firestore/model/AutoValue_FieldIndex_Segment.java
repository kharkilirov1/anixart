package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;

/* loaded from: classes2.dex */
final class AutoValue_FieldIndex_Segment extends FieldIndex.Segment {
    @Override // com.google.firebase.firestore.model.FieldIndex.Segment
    /* renamed from: b */
    public FieldPath mo12425b() {
        return null;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.Segment
    /* renamed from: c */
    public FieldIndex.Segment.Kind mo12426c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.Segment)) {
            return false;
        }
        ((FieldIndex.Segment) obj).mo12425b();
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Segment{fieldPath=null, kind=null}";
    }
}
