package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzbb implements zzbc {

    /* renamed from: a */
    public final /* synthetic */ zzfq f16398a;

    /* renamed from: b */
    public final /* synthetic */ zzfo f16399b;

    public zzbb(zzfq zzfqVar, zzfo zzfoVar) {
        this.f16398a = zzfqVar;
        this.f16399b = zzfoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: a */
    public final zzax mo8839a(Class cls) throws GeneralSecurityException {
        try {
            return new zzbx(this.f16398a, this.f16399b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: j */
    public final Set mo8840j() {
        return this.f16398a.m8956h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: v */
    public final Class mo8841v() {
        return this.f16398a.getClass();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: w */
    public final zzax mo8842w() {
        zzfq zzfqVar = this.f16398a;
        return new zzbx(zzfqVar, this.f16399b, zzfqVar.f16507c);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbc
    /* renamed from: x */
    public final Class mo8843x() {
        return this.f16399b.getClass();
    }
}
