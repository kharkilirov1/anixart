package com.google.android.gms.internal.p041firebaseauthapi;

import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzy {
    /* renamed from: a */
    public static int m9479a(int i2, int i3, String str) {
        String m8815a;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            m8815a = zzag.m8815a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(C0000a.m7d("negative size: ", i3));
            }
            m8815a = zzag.m8815a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(m8815a);
    }

    /* renamed from: b */
    public static int m9480b(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m9482d(i2, i3, "index"));
        }
        return i2;
    }

    /* renamed from: c */
    public static void m9481c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? m9482d(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? m9482d(i3, i4, "end index") : zzag.m8815a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    /* renamed from: d */
    public static String m9482d(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzag.m8815a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzag.m8815a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(C0000a.m7d("negative size: ", i3));
    }
}
