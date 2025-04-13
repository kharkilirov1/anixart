package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zznd {
    /* renamed from: a */
    public static String m9335a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i2 = b & 255;
            sb.append("0123456789abcdef".charAt(i2 >> 4));
            sb.append("0123456789abcdef".charAt(i2 & 15));
        }
        return sb.toString();
    }
}
