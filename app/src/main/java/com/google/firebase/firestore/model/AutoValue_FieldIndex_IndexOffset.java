package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_FieldIndex_IndexOffset extends FieldIndex.IndexOffset {

    /* renamed from: c */
    public final SnapshotVersion f22838c;

    /* renamed from: d */
    public final DocumentKey f22839d;

    /* renamed from: e */
    public final int f22840e;

    public AutoValue_FieldIndex_IndexOffset(SnapshotVersion snapshotVersion, DocumentKey documentKey, int i2) {
        Objects.requireNonNull(snapshotVersion, "Null readTime");
        this.f22838c = snapshotVersion;
        Objects.requireNonNull(documentKey, "Null documentKey");
        this.f22839d = documentKey;
        this.f22840e = i2;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    /* renamed from: c */
    public DocumentKey mo12420c() {
        return this.f22839d;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    /* renamed from: d */
    public int mo12421d() {
        return this.f22840e;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexOffset
    /* renamed from: e */
    public SnapshotVersion mo12422e() {
        return this.f22838c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.IndexOffset)) {
            return false;
        }
        FieldIndex.IndexOffset indexOffset = (FieldIndex.IndexOffset) obj;
        return this.f22838c.equals(indexOffset.mo12422e()) && this.f22839d.equals(indexOffset.mo12420c()) && this.f22840e == indexOffset.mo12421d();
    }

    public int hashCode() {
        return ((((this.f22838c.hashCode() ^ 1000003) * 1000003) ^ this.f22839d.hashCode()) * 1000003) ^ this.f22840e;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("IndexOffset{readTime=");
        m24u.append(this.f22838c);
        m24u.append(", documentKey=");
        m24u.append(this.f22839d);
        m24u.append(", largestBatchId=");
        return C0000a.m18o(m24u, this.f22840e, "}");
    }
}
