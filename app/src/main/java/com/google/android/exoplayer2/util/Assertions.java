package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class Assertions {
    @Pure
    /* renamed from: a */
    public static void m7513a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m7514b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    /* renamed from: c */
    public static int m7515c(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }

    @Pure
    /* renamed from: d */
    public static void m7516d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: e */
    public static void m7517e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: f */
    public static <T> T m7518f(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: g */
    public static <T> T m7519g(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
