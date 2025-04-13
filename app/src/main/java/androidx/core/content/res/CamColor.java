package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;

/* loaded from: classes.dex */
class CamColor {

    /* renamed from: a */
    public final float f3312a;

    /* renamed from: b */
    public final float f3313b;

    /* renamed from: c */
    public final float f3314c;

    /* renamed from: d */
    public final float f3315d;

    /* renamed from: e */
    public final float f3316e;

    /* renamed from: f */
    public final float f3317f;

    public CamColor(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f3312a = f2;
        this.f3313b = f3;
        this.f3314c = f4;
        this.f3315d = f8;
        this.f3316e = f9;
        this.f3317f = f10;
    }

    @NonNull
    /* renamed from: a */
    public static CamColor m1714a(@ColorInt int i2) {
        ViewingConditions viewingConditions = ViewingConditions.f3350k;
        float m1718b = CamUtils.m1718b(Color.red(i2));
        float m1718b2 = CamUtils.m1718b(Color.green(i2));
        float m1718b3 = CamUtils.m1718b(Color.blue(i2));
        float[][] fArr = CamUtils.f3321d;
        float[] fArr2 = {(fArr[0][2] * m1718b3) + (fArr[0][1] * m1718b2) + (fArr[0][0] * m1718b), (fArr[1][2] * m1718b3) + (fArr[1][1] * m1718b2) + (fArr[1][0] * m1718b), (m1718b3 * fArr[2][2]) + (m1718b2 * fArr[2][1]) + (m1718b * fArr[2][0])};
        float[][] fArr3 = CamUtils.f3318a;
        float f2 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f3 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f4 = (fArr2[2] * fArr3[2][2]) + (fArr2[1] * fArr3[2][1]) + (fArr2[0] * fArr3[2][0]);
        float[] fArr4 = viewingConditions.f3357g;
        float f5 = fArr4[0] * f2;
        float f6 = fArr4[1] * f3;
        float f7 = fArr4[2] * f4;
        float pow = (float) Math.pow((Math.abs(f5) * viewingConditions.f3358h) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f6) * viewingConditions.f3358h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f7) * viewingConditions.f3358h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f8 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f9 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = ((21.0f * signum3) + ((signum * 20.0f) + f10)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f9, f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((f12 * viewingConditions.f3352b) / viewingConditions.f3351a, viewingConditions.f3354d * viewingConditions.f3360j)) * 100.0f;
        float sqrt = (viewingConditions.f3351a + 4.0f) * (4.0f / viewingConditions.f3354d) * ((float) Math.sqrt(pow4 / 100.0f)) * viewingConditions.f3359i;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f3356f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f13) < 20.14d ? 360.0f + f13 : f13) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.f3355e) * viewingConditions.f3353c) * ((float) Math.sqrt((f9 * f9) + (f8 * f8)))) / (f11 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f15 = pow5 * viewingConditions.f3359i;
        float sqrt2 = ((float) Math.sqrt((r2 * viewingConditions.f3354d) / (viewingConditions.f3351a + 4.0f))) * 50.0f;
        float f16 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * f15) + 1.0f)) * 43.85965f;
        double d2 = f14;
        return new CamColor(f13, pow5, pow4, sqrt, f15, sqrt2, f16, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    @NonNull
    /* renamed from: b */
    public static CamColor m1715b(@FloatRange float f2, @FloatRange float f3, @FloatRange float f4) {
        ViewingConditions viewingConditions = ViewingConditions.f3350k;
        float sqrt = (viewingConditions.f3351a + 4.0f) * (4.0f / viewingConditions.f3354d) * ((float) Math.sqrt(f2 / 100.0d));
        float f5 = viewingConditions.f3359i;
        float f6 = sqrt * f5;
        float f7 = f3 * f5;
        float sqrt2 = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * viewingConditions.f3354d) / (viewingConditions.f3351a + 4.0f))) * 50.0f;
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f4) / 180.0f;
        return new CamColor(f4, f3, f2, f6, f7, sqrt2, f8, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    @ColorInt
    /* renamed from: c */
    public int m1716c(@NonNull ViewingConditions viewingConditions) {
        float f2;
        float f3 = this.f3313b;
        if (f3 != 0.0d) {
            double d = this.f3314c;
            if (d != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f3356f), 0.73d), 1.1111111111111112d);
                double d2 = (this.f3312a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
                float pow2 = viewingConditions.f3351a * ((float) Math.pow(this.f3314c / 100.0d, (1.0d / viewingConditions.f3354d) / viewingConditions.f3360j));
                float f4 = cos * 3846.1538f * viewingConditions.f3355e * viewingConditions.f3353c;
                float f5 = pow2 / viewingConditions.f3352b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f6 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f4 * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f5 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / viewingConditions.f3358h) * Math.signum(f10) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
                float signum2 = (100.0f / viewingConditions.f3358h) * Math.signum(f11) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum3 = (100.0f / viewingConditions.f3358h) * Math.signum(f12) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float[] fArr = viewingConditions.f3357g;
                float f13 = signum / fArr[0];
                float f14 = signum2 / fArr[1];
                float f15 = signum3 / fArr[2];
                float[][] fArr2 = CamUtils.f3319b;
                return ColorUtils.m1772a((fArr2[0][2] * f15) + (fArr2[0][1] * f14) + (fArr2[0][0] * f13), (fArr2[1][2] * f15) + (fArr2[1][1] * f14) + (fArr2[1][0] * f13), (f15 * fArr2[2][2]) + (f14 * fArr2[2][1]) + (f13 * fArr2[2][0]));
            }
        }
        f2 = 0.0f;
        float pow3 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f3356f), 0.73d), 1.1111111111111112d);
        double d22 = (this.f3312a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f;
        float pow22 = viewingConditions.f3351a * ((float) Math.pow(this.f3314c / 100.0d, (1.0d / viewingConditions.f3354d) / viewingConditions.f3360j));
        float f42 = cos3 * 3846.1538f * viewingConditions.f3355e * viewingConditions.f3353c;
        float f52 = pow22 / viewingConditions.f3352b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f62 = (((0.305f + f52) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f42 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f52 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / viewingConditions.f3358h) * Math.signum(f102) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d));
        float signum22 = (100.0f / viewingConditions.f3358h) * Math.signum(f112) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum32 = (100.0f / viewingConditions.f3358h) * Math.signum(f122) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float[] fArr3 = viewingConditions.f3357g;
        float f132 = signum4 / fArr3[0];
        float f142 = signum22 / fArr3[1];
        float f152 = signum32 / fArr3[2];
        float[][] fArr22 = CamUtils.f3319b;
        return ColorUtils.m1772a((fArr22[0][2] * f152) + (fArr22[0][1] * f142) + (fArr22[0][0] * f132), (fArr22[1][2] * f152) + (fArr22[1][1] * f142) + (fArr22[1][0] * f132), (f152 * fArr22[2][2]) + (f142 * fArr22[2][1]) + (f132 * fArr22[2][0]));
    }
}
