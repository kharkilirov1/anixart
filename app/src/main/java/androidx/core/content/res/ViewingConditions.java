package androidx.core.content.res;

/* loaded from: classes.dex */
final class ViewingConditions {

    /* renamed from: k */
    public static final ViewingConditions f3350k;

    /* renamed from: a */
    public final float f3351a;

    /* renamed from: b */
    public final float f3352b;

    /* renamed from: c */
    public final float f3353c;

    /* renamed from: d */
    public final float f3354d;

    /* renamed from: e */
    public final float f3355e;

    /* renamed from: f */
    public final float f3356f;

    /* renamed from: g */
    public final float[] f3357g;

    /* renamed from: h */
    public final float f3358h;

    /* renamed from: i */
    public final float f3359i;

    /* renamed from: j */
    public final float f3360j;

    static {
        float[] fArr = CamUtils.f3320c;
        float m1719c = (float) ((CamUtils.m1719c(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = CamUtils.f3318a;
        float f2 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f3 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f4 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f5 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m1719c) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp, (((100.0f / f4) * exp) + 1.0f) - exp};
        float f6 = 1.0f / ((5.0f * m1719c) + 1.0f);
        float f7 = f6 * f6 * f6 * f6;
        float f8 = 1.0f - f7;
        float cbrt = (0.1f * f8 * f8 * ((float) Math.cbrt(m1719c * 5.0d))) + (f7 * m1719c);
        float m1719c2 = CamUtils.m1719c(50.0f) / fArr[1];
        double d2 = m1719c2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f2) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f3) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f4) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f3350k = new ViewingConditions(m1719c2, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f5, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f3356f = f2;
        this.f3351a = f3;
        this.f3352b = f4;
        this.f3353c = f5;
        this.f3354d = f6;
        this.f3355e = f7;
        this.f3357g = fArr;
        this.f3358h = f8;
        this.f3359i = f9;
        this.f3360j = f10;
    }
}
