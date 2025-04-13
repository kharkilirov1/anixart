package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzni implements zzbl {

    /* renamed from: a */
    public final zzgf f16614a;

    /* renamed from: b */
    public final int f16615b;

    public zzni(zzgf zzgfVar, int i2) throws GeneralSecurityException {
        this.f16614a = zzgfVar;
        this.f16615b = i2;
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgfVar.mo8963a(new byte[0], i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbl
    /* renamed from: a */
    public final void mo8867a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzmj.m9314b(this.f16614a.mo8963a(bArr2, this.f16615b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
