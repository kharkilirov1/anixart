package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzr implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public final Object mo7340e(Task task) throws Exception {
        return (!task.mo9712q() && (task.mo9707l() instanceof FirebaseAuthException) && ((FirebaseAuthException) task.mo9707l()).f22321b.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.m9723e(null) : task;
    }
}
