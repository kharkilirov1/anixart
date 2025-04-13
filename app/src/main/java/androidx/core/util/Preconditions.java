package androidx.core.util;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class Preconditions {
    /* renamed from: a */
    public static void m2028a(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static float m2029b(float f2, @NonNull String str) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException(C0000a.m14k(str, " must not be NaN"));
        }
        if (Float.isInfinite(f2)) {
            throw new IllegalArgumentException(C0000a.m14k(str, " must not be infinite"));
        }
        return f2;
    }

    @IntRange
    /* renamed from: c */
    public static int m2030c(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    @IntRange
    /* renamed from: d */
    public static int m2031d(int i2, @Nullable String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    @NonNull
    /* renamed from: e */
    public static <T> T m2032e(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: f */
    public static void m2033f(boolean z, @Nullable String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
