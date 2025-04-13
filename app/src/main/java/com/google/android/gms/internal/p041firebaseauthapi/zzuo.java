package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzuo implements zzur {

    /* renamed from: a */
    public final /* synthetic */ Status f16855a;

    public zzuo(Status status) {
        this.f16855a = status;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzur
    /* renamed from: a */
    public final void mo9433a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.mo9449d(zztu.m9397a(this.f16855a));
    }
}
