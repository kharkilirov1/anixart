package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;

/* loaded from: classes2.dex */
public class LimboDocumentChange {

    /* renamed from: a */
    public final Type f22711a;

    /* renamed from: b */
    public final DocumentKey f22712b;

    public enum Type {
        ADDED,
        REMOVED
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LimboDocumentChange)) {
            return false;
        }
        LimboDocumentChange limboDocumentChange = (LimboDocumentChange) obj;
        return this.f22711a.equals(limboDocumentChange.f22711a) && this.f22712b.equals(limboDocumentChange.f22712b);
    }

    public int hashCode() {
        return this.f22712b.hashCode() + ((this.f22711a.hashCode() + 2077) * 31);
    }
}
