package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzhd {

    /* renamed from: a */
    public static final zzhb f16185a;

    static {
        if (zzgz.f16183e && zzgz.f16182d) {
            int i2 = zzdo.f16072a;
        }
        f16185a = new zzhc();
    }

    /* renamed from: a */
    public static /* synthetic */ int m8530a(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b2 = bArr[i2];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                byte b3 = bArr[i2];
                byte b4 = bArr[i2 + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m8531b(byte[] bArr, int i2, int i3) {
        return f16185a.mo8529a(0, bArr, i2, i3) == 0;
    }
}
