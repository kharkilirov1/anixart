package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfc {

    /* renamed from: a */
    public static final byte[] f16476a = m8943b(1, 0);

    /* renamed from: b */
    public static final byte[] f16477b = m8943b(2, 32);

    /* renamed from: c */
    public static final byte[] f16478c = m8943b(2, 1);

    /* renamed from: d */
    public static final byte[] f16479d = m8943b(2, 1);

    /* renamed from: e */
    public static final byte[] f16480e = m8943b(2, 2);

    /* renamed from: f */
    public static final byte[] f16481f = m8943b(2, 3);

    /* renamed from: g */
    public static final byte[] f16482g = new byte[0];

    /* renamed from: h */
    public static final byte[] f16483h = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: i */
    public static final byte[] f16484i = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: j */
    public static final byte[] f16485j = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    public static void m8942a(zzkc zzkcVar) throws GeneralSecurityException {
        String str = "UNRECOGNIZED";
        if (zzkcVar.m9194v() == 2 || zzkcVar.m9194v() == 1) {
            int m9194v = zzkcVar.m9194v();
            if (m9194v == 2) {
                str = "KEM_UNKNOWN";
            } else if (m9194v == 3) {
                str = "DHKEM_X25519_HKDF_SHA256";
            }
            throw new GeneralSecurityException("Invalid KEM param: ".concat(str));
        }
        if (zzkcVar.m9193u() == 2 || zzkcVar.m9193u() == 1) {
            int m9193u = zzkcVar.m9193u();
            if (m9193u == 2) {
                str = "KDF_UNKNOWN";
            } else if (m9193u == 3) {
                str = "HKDF_SHA256";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        if (zzkcVar.m9192t() == 2 || zzkcVar.m9192t() == 1) {
            int m9192t = zzkcVar.m9192t();
            if (m9192t == 2) {
                str = "AEAD_UNKNOWN";
            } else if (m9192t == 3) {
                str = "AES_128_GCM";
            } else if (m9192t == 4) {
                str = "AES_256_GCM";
            } else if (m9192t == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    public static byte[] m8943b(int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) * 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m8944c(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzmj.m9315c(f16485j, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: d */
    public static byte[] m8945d(String str, byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        return zzmj.m9315c(m8943b(2, i2), f16485j, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
