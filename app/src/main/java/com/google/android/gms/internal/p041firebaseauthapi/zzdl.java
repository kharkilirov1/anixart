package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdl extends zzdm {
    public zzdl(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzdm
    /* renamed from: a */
    public final int mo8912a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzdm
    /* renamed from: b */
    public final int[] mo8913b(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzdi.m8908b(iArr2, this.f16440a);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
