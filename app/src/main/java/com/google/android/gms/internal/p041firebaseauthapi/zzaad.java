package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzaad {

    /* renamed from: a */
    public static final Charset f16259a;

    /* renamed from: b */
    public static final byte[] f16260b;

    static {
        Charset.forName("US-ASCII");
        f16259a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16260b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzyw(bArr, 0).mo9527b(0);
        } catch (zzaaf e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static int m8575a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m8576b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: c */
    public static Object m8577c(Object obj, Object obj2) {
        return ((zzabc) obj).mo8623c().mo8618L0((zzabc) obj2).mo8617C();
    }
}
