package androidx.constraintlayout.core.motion.utils;

import java.text.DecimalFormat;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class SplineSet {

    /* renamed from: a */
    public int[] f2051a = new int[10];

    /* renamed from: b */
    public float[] f2052b = new float[10];

    /* renamed from: c */
    public int f2053c;

    /* renamed from: d */
    public String f2054d;

    public static class CoreSpline extends SplineSet {
    }

    public static class CustomSet extends SplineSet {
    }

    public static class CustomSpline extends SplineSet {
    }

    public static class Sort {
    }

    public String toString() {
        String str = this.f2054d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f2053c; i2++) {
            StringBuilder m27x = C0000a.m27x(str, "[");
            m27x.append(this.f2051a[i2]);
            m27x.append(" , ");
            m27x.append(decimalFormat.format(this.f2052b[i2]));
            m27x.append("] ");
            str = m27x.toString();
        }
        return str;
    }
}
