package com.google.firebase.firestore.model.mutation;

import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_Overlay extends Overlay {

    /* renamed from: a */
    public final int f22888a;

    /* renamed from: b */
    public final Mutation f22889b;

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    /* renamed from: a */
    public int mo12465a() {
        return this.f22888a;
    }

    @Override // com.google.firebase.firestore.model.mutation.Overlay
    /* renamed from: b */
    public Mutation mo12466b() {
        return this.f22889b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Overlay)) {
            return false;
        }
        Overlay overlay = (Overlay) obj;
        return this.f22888a == overlay.mo12465a() && this.f22889b.equals(overlay.mo12466b());
    }

    public int hashCode() {
        return ((this.f22888a ^ 1000003) * 1000003) ^ this.f22889b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Overlay{largestBatchId=");
        m24u.append(this.f22888a);
        m24u.append(", mutation=");
        m24u.append(this.f22889b);
        m24u.append("}");
        return m24u.toString();
    }
}
