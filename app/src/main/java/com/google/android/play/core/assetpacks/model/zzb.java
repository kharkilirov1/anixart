package com.google.android.play.core.assetpacks.model;

import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzb {
    /* renamed from: a */
    public static String m10688a(String str, String str2) {
        return C0000a.m21r(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* renamed from: b */
    public static String m10689b(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        C0000a.m2C(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }
}
