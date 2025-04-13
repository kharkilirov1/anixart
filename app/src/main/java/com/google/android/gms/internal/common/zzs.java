package com.google.android.gms.internal.common;

import androidx.room.util.C0576a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzs {
    /* renamed from: a */
    public static int m8562a(int i2, int i3, String str) {
        String m8568a;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            m8568a = zzy.m8568a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(C0576a.m4111j(26, "negative size: ", i3));
            }
            m8568a = zzy.m8568a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(m8568a);
    }

    /* renamed from: b */
    public static int m8563b(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m8565d(i2, i3, "index"));
        }
        return i2;
    }

    /* renamed from: c */
    public static void m8564c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? m8565d(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? m8565d(i3, i4, "end index") : zzy.m8568a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    /* renamed from: d */
    public static String m8565d(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzy.m8568a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzy.m8568a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(C0576a.m4111j(26, "negative size: ", i3));
    }
}
