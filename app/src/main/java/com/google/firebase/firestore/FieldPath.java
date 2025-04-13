package com.google.firebase.firestore;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class FieldPath {

    /* renamed from: a */
    public final com.google.firebase.firestore.model.FieldPath f22626a;

    static {
        Pattern.compile("[~*/\\[\\]]");
        com.google.firebase.firestore.model.FieldPath fieldPath = com.google.firebase.firestore.model.FieldPath.f22858c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FieldPath.class != obj.getClass()) {
            return false;
        }
        return this.f22626a.equals(((FieldPath) obj).f22626a);
    }

    public int hashCode() {
        return this.f22626a.hashCode();
    }

    public String toString() {
        return this.f22626a.mo12428b();
    }
}
