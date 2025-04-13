package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_FieldIndex extends FieldIndex {
    @Override // com.google.firebase.firestore.model.FieldIndex
    /* renamed from: a */
    public String mo12417a() {
        return null;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    /* renamed from: b */
    public int mo12418b() {
        return 0;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex
    /* renamed from: c */
    public List<FieldIndex.Segment> mo12419c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex)) {
            return false;
        }
        FieldIndex fieldIndex = (FieldIndex) obj;
        if (fieldIndex.mo12418b() != 0) {
            return false;
        }
        fieldIndex.mo12417a();
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "FieldIndex{indexId=0, collectionGroup=null, segments=null, indexState=null}";
    }
}
