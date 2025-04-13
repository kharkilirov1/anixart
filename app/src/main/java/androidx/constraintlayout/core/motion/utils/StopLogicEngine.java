package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {

    /* renamed from: a */
    public float f2064a;

    /* renamed from: b */
    public float f2065b;

    /* renamed from: c */
    public float f2066c;

    /* renamed from: d */
    public float f2067d;

    /* renamed from: e */
    public float f2068e;

    /* renamed from: f */
    public float f2069f;

    /* renamed from: g */
    public float f2070g;

    /* renamed from: h */
    public float f2071h;

    /* renamed from: i */
    public float f2072i;

    /* renamed from: j */
    public int f2073j;

    /* renamed from: k */
    public boolean f2074k = false;

    /* renamed from: l */
    public float f2075l;

    /* renamed from: m */
    public float f2076m;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f2) {
        float f3;
        float f4 = this.f2067d;
        if (f2 <= f4) {
            float f5 = this.f2064a;
            f3 = ((((this.f2065b - f5) * f2) * f2) / (f4 * 2.0f)) + (f5 * f2);
        } else {
            int i2 = this.f2073j;
            if (i2 == 1) {
                f3 = this.f2070g;
            } else {
                float f6 = f2 - f4;
                float f7 = this.f2068e;
                if (f6 < f7) {
                    float f8 = this.f2070g;
                    float f9 = this.f2065b;
                    f3 = ((((this.f2066c - f9) * f6) * f6) / (f7 * 2.0f)) + (f9 * f6) + f8;
                } else if (i2 == 2) {
                    f3 = this.f2071h;
                } else {
                    float f10 = f6 - f7;
                    float f11 = this.f2069f;
                    if (f10 <= f11) {
                        float f12 = this.f2071h;
                        float f13 = this.f2066c * f10;
                        f3 = (f12 + f13) - ((f13 * f10) / (f11 * 2.0f));
                    } else {
                        f3 = this.f2072i;
                    }
                }
            }
        }
        this.f2076m = f2;
        return this.f2074k ? this.f2075l - f3 : this.f2075l + f3;
    }
}
