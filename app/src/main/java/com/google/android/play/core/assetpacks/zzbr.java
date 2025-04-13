package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbr {
    /* renamed from: a */
    public static int m10763a(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    /* renamed from: b */
    public static long m10764b(byte[] bArr, int i2) {
        return ((m10763a(bArr, i2 + 2) << 16) | m10763a(bArr, i2)) & 4294967295L;
    }
}
