package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzm implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f22460b;

    public zzm(FirebaseAuth firebaseAuth) {
        this.f22460b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f22460b.f22309d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.AuthStateListener) it.next()).m12241a(this.f22460b);
        }
    }
}
