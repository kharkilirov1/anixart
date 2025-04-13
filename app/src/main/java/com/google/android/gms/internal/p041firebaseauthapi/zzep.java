package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzep implements zzes {

    /* renamed from: a */
    public final int f16461a;

    public zzep(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(C0000a.m7d("Unsupported key length: ", i2));
        }
        this.f16461a = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: a */
    public final byte[] mo8932a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f16461a) {
            return new zzdk(bArr, false).m8911a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(C0000a.m7d("Unexpected key length: ", length));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: u */
    public final int mo8933u() {
        return this.f16461a;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: w */
    public final byte[] mo8934w() throws GeneralSecurityException {
        int i2 = this.f16461a;
        if (i2 == 16) {
            return zzfc.f16479d;
        }
        if (i2 == 32) {
            return zzfc.f16480e;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
