package com.google.android.gms.internal.common;

import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzl extends zzk {
    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(0);
        }
        String copyValueOf = String.copyValueOf(cArr);
        return C0000a.m21r(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
