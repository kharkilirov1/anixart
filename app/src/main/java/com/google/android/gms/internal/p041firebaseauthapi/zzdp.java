package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdp extends zzdm {
    public zzdp(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzdm
    /* renamed from: a */
    public final int mo8912a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzdm
    /* renamed from: b */
    public final int[] mo8913b(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        zzdi.m8908b(iArr3, this.f16440a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        zzdi.m8909c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        zzdi.m8908b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
