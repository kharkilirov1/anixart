package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzer {
    /* renamed from: a */
    public final byte[] m8935a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return m8937c(zzfc.m8944c(str, bArr2, bArr3), bArr);
    }

    /* renamed from: b */
    public final byte[] m8936b(byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        Mac mac = (Mac) zzmt.f16597f.m9325a("HmacSha256");
        if (i2 > mac.getMacLength() * KotlinVersion.MAX_COMPONENT_VALUE) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i2];
        mac.init(new SecretKeySpec(bArr, "HmacSha256"));
        byte[] bArr4 = new byte[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i3);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i5 = i4 + length;
            if (i5 >= i2) {
                System.arraycopy(bArr4, 0, bArr3, i4, i2 - i4);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i4, length);
            i3++;
            i4 = i5;
        }
    }

    /* renamed from: c */
    public final byte[] m8937c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) zzmt.f16597f.m9325a("HmacSha256");
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], "HmacSha256"));
        } else {
            mac.init(new SecretKeySpec(bArr2, "HmacSha256"));
        }
        return mac.doFinal(bArr);
    }
}
