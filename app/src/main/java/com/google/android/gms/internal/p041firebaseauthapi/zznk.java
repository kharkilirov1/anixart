package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zznk {

    /* renamed from: a */
    public static final ThreadLocal f16616a = new zznj();

    /* renamed from: a */
    public static byte[] m9337a(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) f16616a.get()).nextBytes(bArr);
        return bArr;
    }
}
