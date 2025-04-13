package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfr {
    /* renamed from: a */
    public static int m8957a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i2 = 0;
        while (i2 == 0) {
            secureRandom.nextBytes(bArr);
            i2 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i2;
    }
}
