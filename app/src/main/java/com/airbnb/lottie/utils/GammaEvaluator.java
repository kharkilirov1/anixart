package com.airbnb.lottie.utils;

import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class GammaEvaluator {
    /* renamed from: a */
    public static float m4829a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m4830b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m4831c(float f2, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f3 = ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f8 = ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float m4829a = m4829a(f4);
        float m4829a2 = m4829a(f5);
        float m4829a3 = m4829a((i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m4829a4 = m4829a(f7);
        float m4829a5 = m4829a(f8);
        float m4829a6 = m4829a((i3 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float m4a = C0000a.m4a(f6, f3, f2, f3);
        float m4a2 = C0000a.m4a(m4829a4, m4829a, f2, m4829a);
        float m4a3 = C0000a.m4a(m4829a5, m4829a2, f2, m4829a2);
        float m4a4 = C0000a.m4a(m4829a6, m4829a3, f2, m4829a3);
        float m4830b = m4830b(m4a2) * 255.0f;
        float m4830b2 = m4830b(m4a3) * 255.0f;
        return Math.round(m4830b(m4a4) * 255.0f) | (Math.round(m4830b) << 16) | (Math.round(m4a * 255.0f) << 24) | (Math.round(m4830b2) << 8);
    }
}
