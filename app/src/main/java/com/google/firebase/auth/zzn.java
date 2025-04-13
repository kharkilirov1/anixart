package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzbk;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
final class zzn implements zzbk {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f22461a;

    public zzn(FirebaseAuth firebaseAuth) {
        this.f22461a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzg
    /* renamed from: a */
    public final void mo12317a(zzwq zzwqVar, FirebaseUser firebaseUser) {
        FirebaseAuth.m12233f(this.f22461a, firebaseUser, zzwqVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzao
    /* renamed from: o */
    public final void mo12301o(Status status) {
        int i2 = status.f15380c;
        if (i2 == 17011 || i2 == 17021 || i2 == 17005) {
            this.f22461a.m12235b();
        }
    }
}
