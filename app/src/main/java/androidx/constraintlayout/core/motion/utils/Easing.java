package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Easing {

    /* renamed from: b */
    public static Easing f2022b = new Easing();

    /* renamed from: c */
    public static String[] f2023c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public String f2024a = "identity";

    public static class CubicEasing extends Easing {

        /* renamed from: d */
        public double f2025d;

        /* renamed from: e */
        public double f2026e;

        /* renamed from: f */
        public double f2027f;

        /* renamed from: g */
        public double f2028g;

        public CubicEasing(String str) {
            this.f2024a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f2025d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i2);
            this.f2026e = Double.parseDouble(str.substring(i2, indexOf3).trim());
            int i3 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i3);
            this.f2027f = Double.parseDouble(str.substring(i3, indexOf4).trim());
            int i4 = indexOf4 + 1;
            this.f2028g = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        /* renamed from: a */
        public double mo1218a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = m1219c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double m1219c = m1219c(d4);
            double d5 = d3 + d2;
            double m1219c2 = m1219c(d5);
            double m1220d = m1220d(d4);
            return (((d - m1219c) * (m1220d(d5) - m1220d)) / (m1219c2 - m1219c)) + m1220d;
        }

        /* renamed from: c */
        public final double m1219c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f2027f * d5) + (this.f2025d * d4) + (d * d * d);
        }

        /* renamed from: d */
        public final double m1220d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f2028g * d5) + (this.f2026e * d4) + (d * d * d);
        }
    }

    /* renamed from: b */
    public static Easing m1217b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        str.hashCode();
        switch (str) {
            case "accelerate":
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                StringBuilder m24u = C0000a.m24u("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                m24u.append(Arrays.toString(f2023c));
                printStream.println(m24u.toString());
                return f2022b;
        }
    }

    /* renamed from: a */
    public double mo1218a(double d) {
        return d;
    }

    public String toString() {
        return this.f2024a;
    }
}
