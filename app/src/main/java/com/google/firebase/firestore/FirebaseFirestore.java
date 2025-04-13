package com.google.firebase.firestore;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.firestore.remote.FirestoreChannel;

/* loaded from: classes2.dex */
public class FirebaseFirestore {

    public interface InstanceRegistry {
    }

    @Keep
    public static void setClientLanguage(@NonNull String str) {
        FirestoreChannel.f22941d = str;
    }
}
