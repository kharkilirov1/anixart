package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzba implements zzbc {

    /* renamed from: a */
    public final /* synthetic */ zzfo f16397a;

    public zzba(zzfo zzfoVar) {
        this.f16397a = zzfoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: a */
    public final zzax mo8839a(Class cls) throws GeneralSecurityException {
        try {
            return new zzaz(this.f16397a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: j */
    public final Set mo8840j() {
        return this.f16397a.m8956h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: v */
    public final Class mo8841v() {
        return this.f16397a.getClass();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: w */
    public final zzax mo8842w() {
        zzfo zzfoVar = this.f16397a;
        return new zzaz(zzfoVar, zzfoVar.f16507c);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: x */
    public final Class mo8843x() {
        return null;
    }
}
