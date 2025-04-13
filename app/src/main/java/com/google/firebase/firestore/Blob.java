package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Util;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Blob implements Comparable<Blob> {
    @Override // java.lang.Comparable
    public int compareTo(@NonNull Blob blob) {
        Objects.requireNonNull(blob);
        Util.m12498b(null, null);
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Blob)) {
            return false;
        }
        Objects.requireNonNull((Blob) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    @NonNull
    public String toString() {
        new StringBuilder().append("Blob { bytes=");
        Util.m12502f(null);
        throw null;
    }
}
