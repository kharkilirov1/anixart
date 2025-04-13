package com.google.android.material.color;

import java.util.Arrays;

/* loaded from: classes.dex */
final class ViewingConditions {
    static {
        float[] copyOf = Arrays.copyOf(ColorUtils.f17883a, 3);
        float m9967a = (float) ((ColorUtils.m9967a(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr = Cam16.f17882a;
        float f2 = (copyOf[2] * fArr[0][2]) + (copyOf[1] * fArr[0][1]) + (copyOf[0] * fArr[0][0]);
        float f3 = (copyOf[2] * fArr[1][2]) + (copyOf[1] * fArr[1][1]) + (copyOf[0] * fArr[1][0]);
        float f4 = (copyOf[2] * fArr[2][2]) + (copyOf[1] * fArr[2][1]) + (copyOf[0] * fArr[2][0]);
        float exp = (1.0f - (((float) Math.exp(((-m9967a) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr2 = {(((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp, (((100.0f / f4) * exp) + 1.0f) - exp};
        float f5 = 1.0f / ((5.0f * m9967a) + 1.0f);
        float f6 = f5 * f5 * f5 * f5;
        float f7 = 1.0f - f6;
        float cbrt = (0.1f * f7 * f7 * ((float) Math.cbrt(m9967a * 5.0d))) + (f6 * m9967a);
        double m9967a2 = ColorUtils.m9967a(50.0f) / copyOf[1];
        Math.sqrt(m9967a2);
        Math.pow(m9967a2, 0.2d);
        float[] fArr3 = {(float) Math.pow(((fArr2[0] * cbrt) * f2) / 100.0d, 0.42d), (float) Math.pow(((fArr2[1] * cbrt) * f3) / 100.0d, 0.42d), (float) Math.pow(((fArr2[2] * cbrt) * f4) / 100.0d, 0.42d)};
        float[] fArr4 = {(fArr3[0] * 400.0f) / (fArr3[0] + 27.13f), (fArr3[1] * 400.0f) / (fArr3[1] + 27.13f), (fArr3[2] * 400.0f) / (fArr3[2] + 27.13f)};
        float f8 = fArr4[0];
        float f9 = fArr4[1];
        float f10 = fArr4[2];
        Math.pow(cbrt, 0.25d);
    }
}
