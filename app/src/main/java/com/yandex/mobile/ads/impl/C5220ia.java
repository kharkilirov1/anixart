package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.yandex.mobile.ads.impl.ia */
/* loaded from: classes3.dex */
public final class C5220ia {
    @Pure
    /* renamed from: a */
    public static void m25473a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m25476b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: a */
    public static void m25472a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* renamed from: b */
    public static void m25475b(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @Pure
    /* renamed from: a */
    public static void m25471a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: b */
    public static <T> T m25474b(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: a */
    public static <T> T m25469a(@Nullable T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: a */
    public static String m25470a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
