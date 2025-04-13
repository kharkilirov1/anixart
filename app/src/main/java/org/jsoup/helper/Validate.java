package org.jsoup.helper;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class Validate {
    /* renamed from: a */
    public static void m34688a(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* renamed from: b */
    public static void m34689b(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static void m34690c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: d */
    public static void m34691d(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: e */
    public static void m34692e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: f */
    public static void m34693f(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: g */
    public static void m34694g(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: h */
    public static void m34695h(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
