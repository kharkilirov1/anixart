package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzum implements zzur {

    /* renamed from: a */
    public final /* synthetic */ PhoneAuthCredential f16853a;

    public zzum(PhoneAuthCredential phoneAuthCredential) {
        this.f16853a = phoneAuthCredential;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzur
    /* renamed from: a */
    public final void mo9433a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.mo9448c(this.f16853a);
    }
}
