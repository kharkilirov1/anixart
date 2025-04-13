package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class StepCurve extends Easing {

    /* renamed from: d */
    public MonotonicCurveFit f2063d;

    public StepCurve(String str) {
        this.f2024a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i2 = 0;
        while (indexOf2 != -1) {
            dArr[i2] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i2++;
        }
        dArr[i2] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i2 + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i3 = 0; i3 < copyOf.length; i3++) {
            double d2 = copyOf[i3];
            int i4 = i3 + length2;
            dArr2[i4][0] = d2;
            double d3 = i3 * d;
            dArr3[i4] = d3;
            if (i3 > 0) {
                int i5 = (length2 * 2) + i3;
                dArr2[i5][0] = d2 + 1.0d;
                dArr3[i5] = d3 + 1.0d;
                int i6 = i3 - 1;
                dArr2[i6][0] = (d2 - 1.0d) - d;
                dArr3[i6] = (d3 - 1.0d) - d;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder m24u = C0000a.m24u(" 0 ");
        m24u.append(monotonicCurveFit.m1223b(0.0d, 0));
        printStream.println(m24u.toString());
        PrintStream printStream2 = System.out;
        StringBuilder m24u2 = C0000a.m24u(" 1 ");
        m24u2.append(monotonicCurveFit.m1223b(1.0d, 0));
        printStream2.println(m24u2.toString());
        this.f2063d = monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    /* renamed from: a */
    public double mo1218a(double d) {
        return this.f2063d.m1223b(d, 0);
    }
}
