package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightCalculator {

    /* renamed from: d */
    public static TwilightCalculator f557d;

    /* renamed from: a */
    public long f558a;

    /* renamed from: b */
    public long f559b;

    /* renamed from: c */
    public int f560c;

    /* renamed from: a */
    public void m468a(long j2, double d, double d2) {
        double d3 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f560c = 1;
            this.f558a = -1L;
            this.f559b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f560c = 0;
                this.f558a = -1L;
                this.f559b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f558a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f559b = round;
            if (round >= j2 || this.f558a <= j2) {
                this.f560c = 1;
            } else {
                this.f560c = 0;
            }
        }
    }
}
