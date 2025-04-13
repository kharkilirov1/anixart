package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_FieldIndex_IndexState extends FieldIndex.IndexState {

    /* renamed from: a */
    public final long f22841a;

    /* renamed from: b */
    public final FieldIndex.IndexOffset f22842b;

    public AutoValue_FieldIndex_IndexState(long j2, FieldIndex.IndexOffset indexOffset) {
        this.f22841a = j2;
        Objects.requireNonNull(indexOffset, "Null offset");
        this.f22842b = indexOffset;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    /* renamed from: a */
    public FieldIndex.IndexOffset mo12423a() {
        return this.f22842b;
    }

    @Override // com.google.firebase.firestore.model.FieldIndex.IndexState
    /* renamed from: b */
    public long mo12424b() {
        return this.f22841a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldIndex.IndexState)) {
            return false;
        }
        FieldIndex.IndexState indexState = (FieldIndex.IndexState) obj;
        return this.f22841a == indexState.mo12424b() && this.f22842b.equals(indexState.mo12423a());
    }

    public int hashCode() {
        long j2 = this.f22841a;
        return this.f22842b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("IndexState{sequenceNumber=");
        m24u.append(this.f22841a);
        m24u.append(", offset=");
        m24u.append(this.f22842b);
        m24u.append("}");
        return m24u.toString();
    }
}
