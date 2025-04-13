package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes.dex */
public final class SpringForce implements Force {

    /* renamed from: a */
    public double f3990a;

    /* renamed from: b */
    public double f3991b;

    /* renamed from: c */
    public boolean f3992c;

    /* renamed from: d */
    public double f3993d;

    /* renamed from: e */
    public double f3994e;

    /* renamed from: f */
    public double f3995f;

    /* renamed from: g */
    public double f3996g;

    /* renamed from: h */
    public double f3997h;

    /* renamed from: i */
    public double f3998i;

    /* renamed from: j */
    public final DynamicAnimation.MassState f3999j;

    public SpringForce() {
        this.f3990a = Math.sqrt(1500.0d);
        this.f3991b = 0.5d;
        this.f3992c = false;
        this.f3998i = Double.MAX_VALUE;
        this.f3999j = new DynamicAnimation.MassState();
    }

    /* renamed from: a */
    public SpringForce m2786a(@FloatRange float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f3990a = Math.sqrt(f2);
        this.f3992c = false;
        return this;
    }

    /* renamed from: b */
    public DynamicAnimation.MassState m2787b(double d, double d2, long j2) {
        double cos;
        double d3;
        if (!this.f3992c) {
            if (this.f3998i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d4 = this.f3991b;
            if (d4 > 1.0d) {
                double d5 = this.f3990a;
                this.f3995f = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                double d6 = this.f3991b;
                double d7 = this.f3990a;
                this.f3996g = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
            } else if (d4 >= 0.0d && d4 < 1.0d) {
                this.f3997h = Math.sqrt(1.0d - (d4 * d4)) * this.f3990a;
            }
            this.f3992c = true;
        }
        double d8 = j2 / 1000.0d;
        double d9 = d - this.f3998i;
        double d10 = this.f3991b;
        if (d10 > 1.0d) {
            double d11 = this.f3996g;
            double d12 = this.f3995f;
            double d13 = d9 - (((d11 * d9) - d2) / (d11 - d12));
            double d14 = ((d9 * d11) - d2) / (d11 - d12);
            d3 = (Math.pow(2.718281828459045d, this.f3995f * d8) * d14) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d15 = this.f3996g;
            double pow = Math.pow(2.718281828459045d, d15 * d8) * d13 * d15;
            double d16 = this.f3995f;
            cos = (Math.pow(2.718281828459045d, d16 * d8) * d14 * d16) + pow;
        } else if (d10 == 1.0d) {
            double d17 = this.f3990a;
            double d18 = (d17 * d9) + d2;
            double d19 = (d18 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double pow3 = Math.pow(2.718281828459045d, (-this.f3990a) * d8) * d19;
            double d20 = this.f3990a;
            cos = (Math.pow(2.718281828459045d, (-d20) * d8) * d18) + (pow3 * (-d20));
            d3 = pow2;
        } else {
            double d21 = 1.0d / this.f3997h;
            double d22 = this.f3990a;
            double d23 = ((d10 * d22 * d9) + d2) * d21;
            double sin = ((Math.sin(this.f3997h * d8) * d23) + (Math.cos(this.f3997h * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d22 * d8);
            double d24 = this.f3990a;
            double d25 = this.f3991b;
            double d26 = (-d24) * sin * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d27 = this.f3997h;
            double sin2 = Math.sin(d27 * d8) * (-d27) * d9;
            double d28 = this.f3997h;
            cos = (((Math.cos(d28 * d8) * d23 * d28) + sin2) * pow4) + d26;
            d3 = sin;
        }
        DynamicAnimation.MassState massState = this.f3999j;
        massState.f3983a = (float) (d3 + this.f3998i);
        massState.f3984b = (float) cos;
        return massState;
    }

    public SpringForce(float f2) {
        this.f3990a = Math.sqrt(1500.0d);
        this.f3991b = 0.5d;
        this.f3992c = false;
        this.f3998i = Double.MAX_VALUE;
        this.f3999j = new DynamicAnimation.MassState();
        this.f3998i = f2;
    }
}
