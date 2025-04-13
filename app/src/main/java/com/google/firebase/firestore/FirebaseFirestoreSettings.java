package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class FirebaseFirestoreSettings {

    public static final class Builder {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FirebaseFirestoreSettings.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    @NonNull
    public String toString() {
        return "FirebaseFirestoreSettings{host=null, sslEnabled=false, persistenceEnabled=false, cacheSizeBytes=0}";
    }
}
