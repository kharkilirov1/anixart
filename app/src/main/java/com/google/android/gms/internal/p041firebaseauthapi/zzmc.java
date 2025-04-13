package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmc implements zzne {

    /* renamed from: d */
    public static final ThreadLocal f16564d = new zzmb();

    /* renamed from: a */
    public final SecretKeySpec f16565a;

    /* renamed from: b */
    public final int f16566b;

    /* renamed from: c */
    public final int f16567c;

    public zzmc(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzdu.m8920a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zznm.m9340b(bArr.length);
        this.f16565a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f16564d.get()).getBlockSize();
        this.f16567c = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f16566b = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzne
    /* renamed from: a */
    public final byte[] mo9307a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f16566b;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        int i3 = this.f16566b;
        int i4 = length - i3;
        byte[] bArr3 = new byte[i4];
        Cipher cipher = (Cipher) f16564d.get();
        byte[] bArr4 = new byte[this.f16567c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f16566b);
        cipher.init(2, this.f16565a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i3, i4, bArr3, 0) == i4) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
