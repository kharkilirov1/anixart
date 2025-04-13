package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class MonotonicCurveFit extends CurveFit {

    /* renamed from: a */
    public double[] f2043a;

    /* renamed from: b */
    public double[][] f2044b;

    /* renamed from: c */
    public double[][] f2045c;

    /* renamed from: d */
    public double[] f2046d;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f2046d = new double[length2];
        int i2 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) double.class, i2, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, length, length2);
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                dArr3[i4][i3] = (dArr2[i5][i3] - dArr2[i4][i3]) / (dArr[i5] - dArr[i4]);
                if (i4 == 0) {
                    dArr4[i4][i3] = dArr3[i4][i3];
                } else {
                    dArr4[i4][i3] = (dArr3[i4 - 1][i3] + dArr3[i4][i3]) * 0.5d;
                }
                i4 = i5;
            }
            dArr4[i2][i3] = dArr3[length - 2][i3];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                if (dArr3[i6][i7] == 0.0d) {
                    dArr4[i6][i7] = 0.0d;
                    dArr4[i6 + 1][i7] = 0.0d;
                } else {
                    double d = dArr4[i6][i7] / dArr3[i6][i7];
                    int i8 = i6 + 1;
                    double d2 = dArr4[i8][i7] / dArr3[i6][i7];
                    double hypot = Math.hypot(d, d2);
                    if (hypot > 9.0d) {
                        double d3 = 3.0d / hypot;
                        dArr4[i6][i7] = d * d3 * dArr3[i6][i7];
                        dArr4[i8][i7] = d3 * d2 * dArr3[i6][i7];
                    }
                }
            }
        }
        this.f2043a = dArr;
        this.f2044b = dArr2;
        this.f2045c = dArr4;
    }

    /* renamed from: a */
    public static double m1221a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d10 = 3.0d * d;
        return (d * d5) + (((((d10 * d5) * d7) + (((d10 * d6) * d7) + ((d9 + ((d8 * d4) + (((-6.0d) * d7) * d4))) - (d8 * d3)))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    /* renamed from: d */
    public static double m1222d(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d8 * 2.0d * d3;
        double d11 = ((d10 + ((d9 * d4) + (((-2.0d) * d8) * d4))) - (d9 * d3)) + d3;
        double d12 = d * d6;
        double d13 = (d12 * d8) + d11;
        double d14 = d * d5;
        return (d14 * d2) + ((((d8 * d14) + d13) - (d12 * d7)) - (((2.0d * d) * d5) * d7));
    }

    /* renamed from: b */
    public double m1223b(double d, int i2) {
        double[] dArr = this.f2043a;
        int length = dArr.length;
        int i3 = 0;
        if (d <= dArr[0]) {
            return (m1224c(dArr[0], i2) * (d - dArr[0])) + this.f2044b[0][i2];
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            return (m1224c(dArr[i4], i2) * (d - dArr[i4])) + this.f2044b[i4][i2];
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f2043a;
            if (d == dArr2[i3]) {
                return this.f2044b[i3][i2];
            }
            int i5 = i3 + 1;
            if (d < dArr2[i5]) {
                double d2 = dArr2[i5] - dArr2[i3];
                double d3 = (d - dArr2[i3]) / d2;
                double[][] dArr3 = this.f2044b;
                double d4 = dArr3[i3][i2];
                double d5 = dArr3[i5][i2];
                double[][] dArr4 = this.f2045c;
                return m1222d(d2, d3, d4, d5, dArr4[i3][i2], dArr4[i5][i2]);
            }
            i3 = i5;
        }
        return 0.0d;
    }

    /* renamed from: c */
    public double m1224c(double d, int i2) {
        double d2;
        double[] dArr = this.f2043a;
        int length = dArr.length;
        int i3 = 0;
        if (d < dArr[0]) {
            d2 = dArr[0];
        } else {
            int i4 = length - 1;
            d2 = d >= dArr[i4] ? dArr[i4] : d;
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f2043a;
            int i5 = i3 + 1;
            if (d2 <= dArr2[i5]) {
                double d3 = dArr2[i5] - dArr2[i3];
                double d4 = (d2 - dArr2[i3]) / d3;
                double[][] dArr3 = this.f2044b;
                double d5 = dArr3[i3][i2];
                double d6 = dArr3[i5][i2];
                double[][] dArr4 = this.f2045c;
                return m1221a(d3, d4, d5, d6, dArr4[i3][i2], dArr4[i5][i2]) / d3;
            }
            i3 = i5;
        }
        return 0.0d;
    }
}
