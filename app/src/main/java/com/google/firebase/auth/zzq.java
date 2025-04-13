package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzq extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

    /* renamed from: b */
    public final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f22462b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f22463c;

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: a */
    public final void mo9446a(String str) {
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: b */
    public final void mo9447b(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        Objects.requireNonNull(this.f22463c.f22312g);
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: c */
    public final void mo9448c(PhoneAuthCredential phoneAuthCredential) {
        this.f22462b.mo9448c(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: d */
    public final void mo9449d(FirebaseException firebaseException) {
        this.f22462b.mo9449d(firebaseException);
    }
}
