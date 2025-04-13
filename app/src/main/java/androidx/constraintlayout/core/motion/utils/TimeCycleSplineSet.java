package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class TimeCycleSplineSet {

    /* renamed from: d */
    public int f2080d;

    /* renamed from: e */
    public String f2081e;

    /* renamed from: a */
    public int f2077a = 0;

    /* renamed from: b */
    public int[] f2078b = new int[10];

    /* renamed from: c */
    public float[][] f2079c = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);

    /* renamed from: f */
    public float[] f2082f = new float[3];

    /* renamed from: g */
    public boolean f2083g = false;

    /* renamed from: h */
    public float f2084h = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
    }

    public static class Sort {
    }

    public String toString() {
        String str = this.f2081e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f2080d; i2++) {
            StringBuilder m27x = C0000a.m27x(str, "[");
            m27x.append(this.f2078b[i2]);
            m27x.append(" , ");
            m27x.append(decimalFormat.format(this.f2079c[i2]));
            m27x.append("] ");
            str = m27x.toString();
        }
        return str;
    }
}
