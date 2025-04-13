package com.google.firebase.auth;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes2.dex */
class zzs implements com.google.firebase.auth.internal.zzg {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f22464a;

    public zzs(FirebaseAuth firebaseAuth) {
        this.f22464a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzg
    /* renamed from: a */
    public final void mo12317a(zzwq zzwqVar, FirebaseUser firebaseUser) {
        Objects.requireNonNull(zzwqVar, "null reference");
        Objects.requireNonNull(firebaseUser, "null reference");
        firebaseUser.mo12251n1(zzwqVar);
        FirebaseAuth firebaseAuth = this.f22464a;
        Objects.requireNonNull(firebaseAuth);
        FirebaseAuth.m12233f(firebaseAuth, firebaseUser, zzwqVar, true, false);
    }
}
