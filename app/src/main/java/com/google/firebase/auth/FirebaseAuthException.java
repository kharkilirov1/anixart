package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* loaded from: classes2.dex */
public class FirebaseAuthException extends FirebaseException {

    /* renamed from: b */
    public final String f22321b;

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        Preconditions.m8129d(str);
        this.f22321b = str;
    }
}
