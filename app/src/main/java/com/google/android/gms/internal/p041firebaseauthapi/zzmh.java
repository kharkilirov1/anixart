package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmh implements zzat {

    /* renamed from: c */
    public static final Collection f16575c = Arrays.asList(64);

    /* renamed from: d */
    public static final byte[] f16576d = new byte[16];

    /* renamed from: a */
    public final zznf f16577a;

    /* renamed from: b */
    public final byte[] f16578b;

    public zzmh(byte[] bArr) throws GeneralSecurityException {
        if (!zzdu.m8920a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f16575c;
        int length = bArr.length;
        if (!collection.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(C0000a.m8e("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        int i2 = length >> 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i2);
        this.f16578b = Arrays.copyOfRange(bArr, i2, length);
        this.f16577a = new zznf(copyOfRange);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzat
    /* renamed from: a */
    public final byte[] mo8830a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] m9316d;
        int length = bArr.length;
        if (length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) zzmt.f16596e.m9325a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f16578b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && zznl.m9338a()) {
            doFinal = new byte[0];
        }
        byte[][] bArr4 = {bArr2, doFinal};
        byte[] mo8963a = this.f16577a.mo8963a(f16576d, 16);
        for (int i2 = 0; i2 <= 0; i2++) {
            byte[] bArr5 = bArr4[i2];
            if (bArr5 == null) {
                bArr5 = new byte[0];
            }
            mo8963a = zzmj.m9316d(zzmi.m9312b(mo8963a), this.f16577a.mo8963a(bArr5, 16));
        }
        byte[] bArr6 = bArr4[1];
        int length2 = bArr6.length;
        if (length2 >= 16) {
            int length3 = mo8963a.length;
            if (length2 < length3) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i3 = length2 - length3;
            m9316d = Arrays.copyOf(bArr6, length2);
            for (int i4 = 0; i4 < mo8963a.length; i4++) {
                int i5 = i3 + i4;
                m9316d[i5] = (byte) (m9316d[i5] ^ mo8963a[i4]);
            }
        } else {
            m9316d = zzmj.m9316d(zzmi.m9311a(bArr6), zzmi.m9312b(mo8963a));
        }
        if (zzmj.m9314b(copyOfRange, this.f16577a.mo8963a(m9316d, 16))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
