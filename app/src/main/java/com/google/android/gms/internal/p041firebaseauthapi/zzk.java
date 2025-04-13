package com.google.android.gms.internal.p041firebaseauthapi;

import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzk extends zzj {
    public final String toString() {
        StringBuilder m24u = C0000a.m24u("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i2 = 46;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        m24u.append(String.copyValueOf(cArr));
        m24u.append("')");
        return m24u.toString();
    }
}
