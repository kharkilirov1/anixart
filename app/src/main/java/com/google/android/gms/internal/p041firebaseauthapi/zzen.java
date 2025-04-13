package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzen {
    /* renamed from: a */
    public static void m8926a(zziv zzivVar) throws GeneralSecurityException {
        zzmr.m9322d(m8928c(zzivVar.m9112u().m9142v()));
        m8927b(zzivVar.m9112u().m9143w());
        if (zzivVar.m9113x() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzbz.m8874a(zzivVar.m9111q().m9099t());
    }

    /* renamed from: b */
    public static String m8927b(int i2) throws NoSuchAlgorithmException {
        int i3 = i2 - 2;
        if (i3 == 1) {
            return "HmacSha1";
        }
        if (i3 == 2) {
            return "HmacSha384";
        }
        if (i3 == 3) {
            return "HmacSha256";
        }
        if (i3 == 4) {
            return "HmacSha512";
        }
        if (i3 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzjl.m9150a(i2))));
    }

    /* renamed from: c */
    public static int m8928c(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 2;
        }
        if (i3 == 4) {
            return 3;
        }
        if (i2 != 1) {
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(i3)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: d */
    public static int m8929d(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 == 1) {
            return 1;
        }
        int i4 = 2;
        if (i3 != 2) {
            i4 = 3;
            if (i3 != 3) {
                if (i2 != 1) {
                    throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(i3)));
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        return i4;
    }
}
