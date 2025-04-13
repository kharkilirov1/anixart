package com.google.firebase.firestore.auth;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;

/* loaded from: classes2.dex */
public final class FirebaseAuthCredentialsProvider extends CredentialsProvider<User> {
    /* renamed from: a */
    public synchronized Task<String> m12390a() {
        return Tasks.m9722d(new FirebaseApiNotAvailableException("auth is not available"));
    }
}
