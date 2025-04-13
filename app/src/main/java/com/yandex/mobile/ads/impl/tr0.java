package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class tr0 {
    /* renamed from: a */
    public static void m28732a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m28733b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m28728a(i2, i3, "index"));
        }
    }

    /* renamed from: a */
    public static void m28731a(@CheckForNull String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> T m28727a(@CheckForNull T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static void m28729a(int i2, int i3) {
        String m28070a;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                m28070a = s41.m28070a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(k60.m26036a("negative size: ", i3));
                }
                m28070a = s41.m28070a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(m28070a);
        }
    }

    /* renamed from: a */
    private static String m28728a(int i2, int i3, String str) {
        if (i2 < 0) {
            return s41.m28070a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return s41.m28070a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(k60.m26036a("negative size: ", i3));
    }

    /* renamed from: a */
    public static void m28730a(int i2, int i3, int i4) {
        String m28728a;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 >= 0 && i2 <= i4) {
                m28728a = (i3 < 0 || i3 > i4) ? m28728a(i3, i4, "end index") : s41.m28070a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                m28728a = m28728a(i2, i4, "start index");
            }
            throw new IndexOutOfBoundsException(m28728a);
        }
    }
}
