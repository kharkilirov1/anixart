package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzal implements Runnable {

    /* renamed from: b */
    public final String f22366b;

    /* renamed from: c */
    public final /* synthetic */ zzam f22367c;

    public zzal(zzam zzamVar, String str) {
        this.f22367c = zzamVar;
        Preconditions.m8129d(str);
        this.f22366b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.m12213d(this.f22366b));
        FirebaseUser firebaseUser = firebaseAuth.f22311f;
        if (firebaseUser != null) {
            Task m12238h = firebaseAuth.m12238h(firebaseUser, true);
            zzam.f22368f.m8207d("Token refreshing started", new Object[0]);
            m12238h.mo9700e(new zzak(this));
        }
    }
}
