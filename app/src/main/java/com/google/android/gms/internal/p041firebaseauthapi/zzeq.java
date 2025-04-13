package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzeq implements zzes {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: a */
    public final byte[] mo8932a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzdn(bArr).m8916b(ByteBuffer.wrap(bArr3), bArr2, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: u */
    public final int mo8933u() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzes
    /* renamed from: w */
    public final byte[] mo8934w() {
        return zzfc.f16481f;
    }
}
