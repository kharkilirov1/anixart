package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzup implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzur f16856b;

    /* renamed from: c */
    public final /* synthetic */ zzuq f16857c;

    public zzup(zzuq zzuqVar, zzur zzurVar) {
        this.f16857c = zzuqVar;
        this.f16856b = zzurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16857c.f16858a.f16867g) {
            if (!this.f16857c.f16858a.f16867g.isEmpty()) {
                this.f16856b.mo9433a((PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.f16857c.f16858a.f16867g.get(0), new Object[0]);
            }
        }
    }
}
