package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Schlick extends Easing {

    /* renamed from: d */
    public double f2049d;

    /* renamed from: e */
    public double f2050e;

    public Schlick(String str) {
        this.f2024a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f2049d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i2 = indexOf2 + 1;
        this.f2050e = Double.parseDouble(str.substring(i2, str.indexOf(44, i2)).trim());
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    /* renamed from: a */
    public double mo1218a(double d) {
        double d2 = this.f2050e;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * this.f2049d) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * this.f2049d));
    }
}
