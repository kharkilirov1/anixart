package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzev {

    /* renamed from: a */
    public static final Charset f16107a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f16108b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16108b = bArr;
        ByteBuffer.wrap(bArr);
        zzed zzedVar = new zzed(bArr);
        try {
            zzedVar.f16087c = 0;
            int i2 = zzedVar.f16085a + zzedVar.f16086b;
            zzedVar.f16085a = i2;
            if (i2 <= 0) {
                zzedVar.f16086b = 0;
            } else {
                zzedVar.f16086b = i2;
                zzedVar.f16085a = 0;
            }
        } catch (zzew e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static int m8411a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m8412b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: c */
    public static Object m8413c(Object obj, Object obj2) {
        return ((zzfq) obj).mo8406j().mo8343N0((zzfq) obj2).mo8398B();
    }
}
