package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjl {
    /* renamed from: a */
    public static int m9150a(int i2) {
        if (i2 != 1) {
            return i2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m9151b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 5;
        }
        if (i2 != 4) {
            return i2 != 5 ? 0 : 7;
        }
        return 6;
    }
}
