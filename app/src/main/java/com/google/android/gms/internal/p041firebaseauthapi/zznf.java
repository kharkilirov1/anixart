package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zznf implements zzgf {

    /* renamed from: a */
    public final SecretKey f16606a;

    /* renamed from: b */
    public final byte[] f16607b;

    /* renamed from: c */
    public final byte[] f16608c;

    public zznf(byte[] bArr) throws GeneralSecurityException {
        zznm.m9340b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16606a = secretKeySpec;
        Cipher m9336b = m9336b();
        m9336b.init(1, secretKeySpec);
        byte[] m9312b = zzmi.m9312b(m9336b.doFinal(new byte[16]));
        this.f16607b = m9312b;
        this.f16608c = zzmi.m9312b(m9312b);
    }

    /* renamed from: b */
    public static Cipher m9336b() throws GeneralSecurityException {
        if (zzdu.m8920a(1)) {
            return (Cipher) zzmt.f16596e.m9325a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzgf
    /* renamed from: a */
    public final byte[] mo8963a(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher m9336b = m9336b();
        m9336b.init(1, this.f16606a);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] m9317e = max * 16 == length ? zzmj.m9317e(bArr, (max - 1) * 16, this.f16607b, 0, 16) : zzmj.m9316d(zzmi.m9311a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f16608c);
        byte[] bArr2 = new byte[16];
        for (int i3 = 0; i3 < max - 1; i3++) {
            bArr2 = m9336b.doFinal(zzmj.m9317e(bArr2, 0, bArr, i3 * 16, 16));
        }
        return Arrays.copyOf(m9336b.doFinal(zzmj.m9316d(m9317e, bArr2)), i2);
    }
}
