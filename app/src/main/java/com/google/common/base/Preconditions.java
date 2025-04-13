package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Preconditions {
    /* renamed from: a */
    public static String m11177a(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return Strings.m11218b("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return Strings.m11218b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(C0576a.m4111j(26, "negative size: ", i3));
    }

    /* renamed from: b */
    public static void m11178b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m11179c(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: d */
    public static void m11180d(boolean z, @NullableDecl String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, Character.valueOf(c2)));
        }
    }

    /* renamed from: e */
    public static void m11181e(boolean z, @NullableDecl String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, Integer.valueOf(i2)));
        }
    }

    /* renamed from: f */
    public static void m11182f(boolean z, @NullableDecl String str, int i2, int i3) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* renamed from: g */
    public static void m11183g(boolean z, @NullableDecl String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, Long.valueOf(j2)));
        }
    }

    /* renamed from: h */
    public static void m11184h(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, obj));
        }
    }

    /* renamed from: i */
    public static void m11185i(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(Strings.m11218b(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static int m11186j(int i2, int i3) {
        String m11218b;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            m11218b = Strings.m11218b("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(C0576a.m4111j(26, "negative size: ", i3));
            }
            m11218b = Strings.m11218b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(m11218b);
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* renamed from: k */
    public static <T> T m11187k(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    /* renamed from: l */
    public static <T> T m11188l(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.m11218b(str, obj));
    }

    @CanIgnoreReturnValue
    /* renamed from: m */
    public static int m11189m(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(m11177a(i2, i3, "index"));
        }
        return i2;
    }

    /* renamed from: n */
    public static void m11190n(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? m11177a(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? m11177a(i3, i4, "end index") : Strings.m11218b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    /* renamed from: o */
    public static void m11191o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m11192p(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m11193q(boolean z, @NullableDecl String str, int i2) {
        if (!z) {
            throw new IllegalStateException(Strings.m11218b(str, Integer.valueOf(i2)));
        }
    }

    /* renamed from: r */
    public static void m11194r(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(Strings.m11218b(str, obj));
        }
    }

    /* renamed from: s */
    public static void m11195s(boolean z, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z) {
            throw new IllegalStateException(Strings.m11218b(str, obj, obj2));
        }
    }
}
