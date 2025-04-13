package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.protobuf.ByteString;

/* loaded from: classes2.dex */
public final class TargetChange {

    /* renamed from: a */
    public final ByteString f22970a;

    /* renamed from: b */
    public final boolean f22971b;

    /* renamed from: c */
    public final ImmutableSortedSet<DocumentKey> f22972c;

    /* renamed from: d */
    public final ImmutableSortedSet<DocumentKey> f22973d;

    /* renamed from: e */
    public final ImmutableSortedSet<DocumentKey> f22974e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetChange.class != obj.getClass()) {
            return false;
        }
        TargetChange targetChange = (TargetChange) obj;
        if (this.f22971b == targetChange.f22971b && this.f22970a.equals(targetChange.f22970a) && this.f22972c.equals(targetChange.f22972c) && this.f22973d.equals(targetChange.f22973d)) {
            return this.f22974e.equals(targetChange.f22974e);
        }
        return false;
    }

    public int hashCode() {
        return this.f22974e.hashCode() + ((this.f22973d.hashCode() + ((this.f22972c.hashCode() + (((this.f22970a.hashCode() * 31) + (this.f22971b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
