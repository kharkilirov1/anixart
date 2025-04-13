package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, m31885k = 4, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class SystemPropsKt {
    /* renamed from: a */
    public static final int m34329a() {
        return SystemPropsKt__SystemPropsKt.f68305a;
    }

    /* renamed from: b */
    public static final int m34330b(@NotNull String str, int i2, int i3, int i4) {
        return (int) m34331c(str, i2, i3, i4);
    }

    /* renamed from: c */
    public static final long m34331c(@NotNull String str, long j2, long j3, long j4) {
        String m34332d = m34332d(str);
        if (m34332d == null) {
            return j2;
        }
        Long m33912l0 = StringsKt.m33912l0(m34332d);
        if (m33912l0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m34332d + '\'').toString());
        }
        long longValue = m33912l0.longValue();
        boolean z = false;
        if (j3 <= longValue && longValue <= j4) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
    }

    @Nullable
    /* renamed from: d */
    public static final String m34332d(@NotNull String str) {
        int i2 = SystemPropsKt__SystemPropsKt.f68305a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static final boolean m34333e(@NotNull String str, boolean z) {
        String m34332d = m34332d(str);
        return m34332d == null ? z : Boolean.parseBoolean(m34332d);
    }

    /* renamed from: f */
    public static /* synthetic */ int m34334f(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m34330b(str, i2, i3, i4);
    }

    /* renamed from: g */
    public static /* synthetic */ long m34335g(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return m34331c(str, j2, j5, j4);
    }
}
