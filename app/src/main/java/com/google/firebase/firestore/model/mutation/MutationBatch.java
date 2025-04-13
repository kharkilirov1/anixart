package com.google.firebase.firestore.model.mutation;

import androidx.room.util.C0576a;
import com.google.firebase.Timestamp;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class MutationBatch {

    /* renamed from: a */
    public final int f22896a;

    /* renamed from: b */
    public final Timestamp f22897b;

    /* renamed from: c */
    public final List<Mutation> f22898c;

    /* renamed from: d */
    public final List<Mutation> f22899d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutationBatch.class != obj.getClass()) {
            return false;
        }
        MutationBatch mutationBatch = (MutationBatch) obj;
        return this.f22896a == mutationBatch.f22896a && this.f22897b.equals(mutationBatch.f22897b) && this.f22898c.equals(mutationBatch.f22898c) && this.f22899d.equals(mutationBatch.f22899d);
    }

    public int hashCode() {
        return this.f22899d.hashCode() + ((this.f22898c.hashCode() + ((this.f22897b.hashCode() + (this.f22896a * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("MutationBatch(batchId=");
        m24u.append(this.f22896a);
        m24u.append(", localWriteTime=");
        m24u.append(this.f22897b);
        m24u.append(", baseMutations=");
        m24u.append(this.f22898c);
        m24u.append(", mutations=");
        return C0576a.m4119r(m24u, this.f22899d, ')');
    }
}
