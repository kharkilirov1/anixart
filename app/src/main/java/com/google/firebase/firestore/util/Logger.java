package com.google.firebase.firestore.util;

import android.util.Log;

/* loaded from: classes2.dex */
public class Logger {

    /* renamed from: com.google.firebase.firestore.util.Logger$1 */
    public static /* synthetic */ class C21311 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23021a;

        static {
            int[] iArr = new int[Level.values().length];
            f23021a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23021a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23021a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Level {
        DEBUG,
        WARN,
        /* JADX INFO: Fake field, exist only in values array */
        NONE
    }

    /* renamed from: a */
    public static void m12494a(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= 1) {
            String str3 = String.format("(%s) [%s]: ", "24.2.1", str) + String.format(str2, objArr);
            int ordinal = level.ordinal();
            if (ordinal == 0) {
                Log.i("Firestore", str3);
            } else if (ordinal == 1) {
                Log.w("Firestore", str3);
            } else if (ordinal == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }
}
