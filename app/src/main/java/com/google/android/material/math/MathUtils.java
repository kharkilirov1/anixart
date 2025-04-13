package com.google.android.material.math;

/* loaded from: classes.dex */
public final class MathUtils {
    /* renamed from: a */
    public static float m10179a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    /* renamed from: b */
    public static float m10180b(float f2, float f3, float f4, float f5, float f6, float f7) {
        float m10179a = m10179a(f2, f3, f4, f5);
        float m10179a2 = m10179a(f2, f3, f6, f5);
        float m10179a3 = m10179a(f2, f3, f6, f7);
        float m10179a4 = m10179a(f2, f3, f4, f7);
        return (m10179a <= m10179a2 || m10179a <= m10179a3 || m10179a <= m10179a4) ? (m10179a2 <= m10179a3 || m10179a2 <= m10179a4) ? m10179a3 > m10179a4 ? m10179a3 : m10179a4 : m10179a2 : m10179a;
    }

    /* renamed from: c */
    public static float m10181c(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }
}
