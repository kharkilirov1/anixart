package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {

    /* renamed from: b */
    public double f2056b;

    /* renamed from: c */
    public double f2057c;

    /* renamed from: d */
    public float f2058d;

    /* renamed from: e */
    public float f2059e;

    /* renamed from: f */
    public float f2060f;

    /* renamed from: g */
    public float f2061g;

    /* renamed from: a */
    public double f2055a = 0.5d;

    /* renamed from: h */
    public int f2062h = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f2) {
        SpringStopEngine springStopEngine = this;
        double d = f2 - springStopEngine.f2058d;
        double d2 = springStopEngine.f2056b;
        double d3 = springStopEngine.f2055a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / springStopEngine.f2061g) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i2 = 0;
        while (i2 < sqrt) {
            double d5 = springStopEngine.f2059e;
            double d6 = springStopEngine.f2057c;
            int i3 = sqrt;
            int i4 = i2;
            double d7 = springStopEngine.f2060f;
            double d8 = springStopEngine.f2061g;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d10 = ((((-((((d4 * d9) / 2.0d) + d5) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            float f3 = (float) (d7 + d10);
            this.f2060f = f3;
            float f4 = (float) ((((d10 / 2.0d) + d7) * d4) + d5);
            this.f2059e = f4;
            int i5 = this.f2062h;
            if (i5 > 0) {
                if (f4 < 0.0f && (i5 & 1) == 1) {
                    this.f2059e = -f4;
                    this.f2060f = -f3;
                }
                float f5 = this.f2059e;
                if (f5 > 1.0f && (i5 & 2) == 2) {
                    this.f2059e = 2.0f - f5;
                    this.f2060f = -this.f2060f;
                }
            }
            sqrt = i3;
            i2 = i4 + 1;
            springStopEngine = this;
        }
        SpringStopEngine springStopEngine2 = springStopEngine;
        springStopEngine2.f2058d = f2;
        return springStopEngine2.f2059e;
    }
}
