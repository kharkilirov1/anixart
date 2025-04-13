package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzbk;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@VisibleForTesting
/* loaded from: classes2.dex */
final class zzt implements zzbk {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f22465a;

    public zzt(FirebaseAuth firebaseAuth) {
        this.f22465a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzg
    /* renamed from: a */
    public final void mo12317a(zzwq zzwqVar, FirebaseUser firebaseUser) {
        Objects.requireNonNull(zzwqVar, "null reference");
        Objects.requireNonNull(firebaseUser, "null reference");
        firebaseUser.mo12251n1(zzwqVar);
        FirebaseAuth.m12233f(this.f22465a, firebaseUser, zzwqVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzao
    /* renamed from: o */
    public final void mo12301o(Status status) {
        int i2 = status.f15380c;
        if (i2 == 17011 || i2 == 17021 || i2 == 17005 || i2 == 17091) {
            this.f22465a.m12235b();
        }
    }
}
