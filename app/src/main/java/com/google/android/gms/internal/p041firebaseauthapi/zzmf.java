package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmf implements zzap {

    /* renamed from: e */
    public static final ThreadLocal f16568e = new zzmd();

    /* renamed from: f */
    public static final ThreadLocal f16569f = new zzme();

    /* renamed from: a */
    public final byte[] f16570a;

    /* renamed from: b */
    public final byte[] f16571b;

    /* renamed from: c */
    public final SecretKeySpec f16572c;

    /* renamed from: d */
    public final int f16573d;

    public zzmf(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzdu.m8920a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f16573d = i2;
        zznm.m9340b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f16572c = secretKeySpec;
        Cipher cipher = (Cipher) f16568e.get();
        cipher.init(1, secretKeySpec);
        byte[] m9308c = m9308c(cipher.doFinal(new byte[16]));
        this.f16570a = m9308c;
        this.f16571b = m9308c(m9308c);
    }

    /* renamed from: c */
    public static byte[] m9308c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            byte b = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b + b) ^ ((bArr[i3] & 255) >>> 7)) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2 = i3;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m9309e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = (length - this.f16573d) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f16568e.get();
        cipher.init(1, this.f16572c);
        byte[] m9310d = m9310d(cipher, 0, bArr, 0, this.f16573d);
        byte[] m9310d2 = m9310d(cipher, 1, bArr2, 0, 0);
        byte[] m9310d3 = m9310d(cipher, 2, bArr, this.f16573d, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ m9310d2[i4]) ^ m9310d[i4]) ^ m9310d3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f16569f.get();
        cipher2.init(1, this.f16572c, new IvParameterSpec(m9310d));
        return cipher2.doFinal(bArr, this.f16573d, i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    /* renamed from: d */
    public final byte[] m9310d(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(m9309e(bArr3, this.f16570a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i5 = 0;
        int i6 = 0;
        while (i4 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                doFinal[i7] = (byte) (doFinal[i7] ^ bArr[(i3 + i6) + i7]);
            }
            doFinal = cipher.doFinal(doFinal);
            i6 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            bArr2 = m9309e(copyOfRange, this.f16570a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f16571b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i5 >= length) {
                    break;
                }
                copyOf[i5] = (byte) (copyOf[i5] ^ copyOfRange[i5]);
                i5++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m9309e(doFinal, bArr2));
    }
}
