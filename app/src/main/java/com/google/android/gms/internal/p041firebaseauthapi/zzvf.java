package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzvf extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

    /* renamed from: b */
    public final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f16885b;

    /* renamed from: c */
    public final /* synthetic */ String f16886c;

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: a */
    public final void mo9446a(@NonNull String str) {
        ((SimpleArrayMap) zzvh.f16887a).remove(this.f16886c);
        this.f16885b.mo9446a(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: b */
    public final void mo9447b(@NonNull String str, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f16885b.mo9447b(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: c */
    public final void mo9448c(@NonNull PhoneAuthCredential phoneAuthCredential) {
        ((SimpleArrayMap) zzvh.f16887a).remove(this.f16886c);
        this.f16885b.mo9448c(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    /* renamed from: d */
    public final void mo9449d(@NonNull FirebaseException firebaseException) {
        ((SimpleArrayMap) zzvh.f16887a).remove(this.f16886c);
        this.f16885b.mo9449d(firebaseException);
    }
}
