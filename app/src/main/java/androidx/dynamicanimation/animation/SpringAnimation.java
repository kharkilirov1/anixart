package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: r */
    public SpringForce f3987r;

    /* renamed from: s */
    public float f3988s;

    /* renamed from: t */
    public boolean f3989t;

    public <K> SpringAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k2, floatPropertyCompat);
        this.f3987r = null;
        this.f3988s = Float.MAX_VALUE;
        this.f3989t = false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: d */
    public boolean mo2779d(long j2) {
        if (this.f3989t) {
            float f2 = this.f3988s;
            if (f2 != Float.MAX_VALUE) {
                this.f3987r.f3998i = f2;
                this.f3988s = Float.MAX_VALUE;
            }
            this.f3973b = (float) this.f3987r.f3998i;
            this.f3972a = 0.0f;
            this.f3989t = false;
            return true;
        }
        if (this.f3988s != Float.MAX_VALUE) {
            SpringForce springForce = this.f3987r;
            double d = springForce.f3998i;
            long j3 = j2 / 2;
            DynamicAnimation.MassState m2787b = springForce.m2787b(this.f3973b, this.f3972a, j3);
            SpringForce springForce2 = this.f3987r;
            springForce2.f3998i = this.f3988s;
            this.f3988s = Float.MAX_VALUE;
            DynamicAnimation.MassState m2787b2 = springForce2.m2787b(m2787b.f3983a, m2787b.f3984b, j3);
            this.f3973b = m2787b2.f3983a;
            this.f3972a = m2787b2.f3984b;
        } else {
            DynamicAnimation.MassState m2787b3 = this.f3987r.m2787b(this.f3973b, this.f3972a, j2);
            this.f3973b = m2787b3.f3983a;
            this.f3972a = m2787b3.f3984b;
        }
        float max = Math.max(this.f3973b, this.f3978g);
        this.f3973b = max;
        float min = Math.min(max, Float.MAX_VALUE);
        this.f3973b = min;
        float f3 = this.f3972a;
        SpringForce springForce3 = this.f3987r;
        Objects.requireNonNull(springForce3);
        if (!(((double) Math.abs(f3)) < springForce3.f3994e && ((double) Math.abs(min - ((float) springForce3.f3998i))) < springForce3.f3993d)) {
            return false;
        }
        this.f3973b = (float) this.f3987r.f3998i;
        this.f3972a = 0.0f;
        return true;
    }

    /* renamed from: e */
    public void m2784e(float f2) {
        if (this.f3977f) {
            this.f3988s = f2;
            return;
        }
        if (this.f3987r == null) {
            this.f3987r = new SpringForce(f2);
        }
        SpringForce springForce = this.f3987r;
        double d = f2;
        springForce.f3998i = d;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.f3978g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f3980i * 0.75f);
        springForce.f3993d = abs;
        springForce.f3994e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f3977f;
        if (z || z) {
            return;
        }
        this.f3977f = true;
        if (!this.f3974c) {
            this.f3973b = this.f3976e.mo2780a(this.f3975d);
        }
        float f3 = this.f3973b;
        if (f3 > Float.MAX_VALUE || f3 < this.f3978g) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        AnimationHandler m2773a = AnimationHandler.m2773a();
        if (m2773a.f3952b.size() == 0) {
            if (m2773a.f3954d == null) {
                m2773a.f3954d = new AnimationHandler.FrameCallbackProvider16(m2773a.f3953c);
            }
            m2773a.f3954d.mo2776a();
        }
        if (m2773a.f3952b.contains(this)) {
            return;
        }
        m2773a.f3952b.add(this);
    }

    /* renamed from: f */
    public void m2785f() {
        if (!(this.f3987r.f3991b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f3977f) {
            this.f3989t = true;
        }
    }
}
