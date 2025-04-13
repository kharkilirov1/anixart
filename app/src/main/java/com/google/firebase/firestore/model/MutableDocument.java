package com.google.firebase.firestore.model;

import com.google.firestore.p012v1.Value;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class MutableDocument implements Document {

    /* renamed from: b */
    public final DocumentKey f22860b;

    /* renamed from: c */
    public DocumentType f22861c;

    /* renamed from: d */
    public SnapshotVersion f22862d;

    /* renamed from: e */
    public SnapshotVersion f22863e;

    /* renamed from: f */
    public ObjectValue f22864f;

    /* renamed from: g */
    public DocumentState f22865g;

    public enum DocumentState {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    public enum DocumentType {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    @Override // com.google.firebase.firestore.model.Document
    /* renamed from: a */
    public ObjectValue mo12437a() {
        return this.f22864f;
    }

    @Override // com.google.firebase.firestore.model.Document
    /* renamed from: b */
    public SnapshotVersion mo12438b() {
        return this.f22863e;
    }

    @Override // com.google.firebase.firestore.model.Document
    /* renamed from: c */
    public Value mo12439c(FieldPath fieldPath) {
        ObjectValue objectValue = this.f22864f;
        return objectValue.m12451d(objectValue.m12449b(), fieldPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutableDocument.class != obj.getClass()) {
            return false;
        }
        MutableDocument mutableDocument = (MutableDocument) obj;
        if (this.f22860b.equals(mutableDocument.f22860b) && this.f22862d.equals(mutableDocument.f22862d) && this.f22861c.equals(mutableDocument.f22861c) && this.f22865g.equals(mutableDocument.f22865g)) {
            return this.f22864f.equals(mutableDocument.f22864f);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.model.Document
    public DocumentKey getKey() {
        return this.f22860b;
    }

    public int hashCode() {
        return this.f22860b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Document{key=");
        m24u.append(this.f22860b);
        m24u.append(", version=");
        m24u.append(this.f22862d);
        m24u.append(", readTime=");
        m24u.append(this.f22863e);
        m24u.append(", type=");
        m24u.append(this.f22861c);
        m24u.append(", documentState=");
        m24u.append(this.f22865g);
        m24u.append(", value=");
        m24u.append(this.f22864f);
        m24u.append('}');
        return m24u.toString();
    }
}
