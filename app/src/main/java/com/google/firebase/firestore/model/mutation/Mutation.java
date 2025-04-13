package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class Mutation {

    /* renamed from: a */
    public final DocumentKey f22893a;

    /* renamed from: b */
    public final Precondition f22894b;

    /* renamed from: c */
    public final List<FieldTransform> f22895c;

    /* renamed from: a */
    public boolean m12467a(Mutation mutation) {
        return this.f22893a.equals(mutation.f22893a) && this.f22894b.equals(mutation.f22894b);
    }

    /* renamed from: b */
    public int m12468b() {
        return this.f22894b.hashCode() + (this.f22893a.hashCode() * 31);
    }

    /* renamed from: c */
    public String m12469c() {
        StringBuilder m24u = C0000a.m24u("key=");
        m24u.append(this.f22893a);
        m24u.append(", precondition=");
        m24u.append(this.f22894b);
        return m24u.toString();
    }
}
