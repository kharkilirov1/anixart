package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.C0720L;
import com.airbnb.lottie.LottieComposition;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* renamed from: k */
    @Nullable
    public LottieComposition f7842k;

    /* renamed from: d */
    public float f7835d = 1.0f;

    /* renamed from: e */
    public boolean f7836e = false;

    /* renamed from: f */
    public long f7837f = 0;

    /* renamed from: g */
    public float f7838g = 0.0f;

    /* renamed from: h */
    public int f7839h = 0;

    /* renamed from: i */
    public float f7840i = -2.1474836E9f;

    /* renamed from: j */
    public float f7841j = 2.1474836E9f;

    /* renamed from: l */
    @VisibleForTesting
    public boolean f7843l = false;

    @MainThread
    /* renamed from: c */
    public void m4835c() {
        m4841i();
        m4827a(m4839g());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        Iterator<Animator.AnimatorListener> it = this.f7832c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
        m4841i();
    }

    @FloatRange
    /* renamed from: d */
    public float m4836d() {
        LottieComposition lottieComposition = this.f7842k;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f2 = this.f7838g;
        float f3 = lottieComposition.f7149k;
        return (f2 - f3) / (lottieComposition.f7150l - f3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        m4840h();
        if (this.f7842k == null || !isRunning()) {
            return;
        }
        long j3 = this.f7837f;
        long j4 = j3 != 0 ? j2 - j3 : 0L;
        LottieComposition lottieComposition = this.f7842k;
        float abs = j4 / (lottieComposition == null ? Float.MAX_VALUE : (1.0E9f / lottieComposition.f7151m) / Math.abs(this.f7835d));
        float f2 = this.f7838g;
        if (m4839g()) {
            abs = -abs;
        }
        float f3 = f2 + abs;
        this.f7838g = f3;
        float m4838f = m4838f();
        float m4837e = m4837e();
        PointF pointF = MiscUtils.f7846a;
        boolean z = !(f3 >= m4838f && f3 <= m4837e);
        this.f7838g = MiscUtils.m4845b(this.f7838g, m4838f(), m4837e());
        this.f7837f = j2;
        m4828b();
        if (z) {
            if (getRepeatCount() == -1 || this.f7839h < getRepeatCount()) {
                Iterator<Animator.AnimatorListener> it = this.f7832c.iterator();
                while (it.hasNext()) {
                    it.next().onAnimationRepeat(this);
                }
                this.f7839h++;
                if (getRepeatMode() == 2) {
                    this.f7836e = !this.f7836e;
                    this.f7835d = -this.f7835d;
                } else {
                    this.f7838g = m4839g() ? m4837e() : m4838f();
                }
                this.f7837f = j2;
            } else {
                this.f7838g = this.f7835d < 0.0f ? m4838f() : m4837e();
                m4841i();
                m4827a(m4839g());
            }
        }
        if (this.f7842k != null) {
            float f4 = this.f7838g;
            if (f4 < this.f7840i || f4 > this.f7841j) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f7840i), Float.valueOf(this.f7841j), Float.valueOf(this.f7838g)));
            }
        }
        C0720L.m4640a("LottieValueAnimator#doFrame");
    }

    /* renamed from: e */
    public float m4837e() {
        LottieComposition lottieComposition = this.f7842k;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f2 = this.f7841j;
        return f2 == 2.1474836E9f ? lottieComposition.f7150l : f2;
    }

    /* renamed from: f */
    public float m4838f() {
        LottieComposition lottieComposition = this.f7842k;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f2 = this.f7840i;
        return f2 == -2.1474836E9f ? lottieComposition.f7149k : f2;
    }

    /* renamed from: g */
    public final boolean m4839g() {
        return this.f7835d < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    @FloatRange
    public float getAnimatedFraction() {
        float m4838f;
        float m4837e;
        float m4838f2;
        if (this.f7842k == null) {
            return 0.0f;
        }
        if (m4839g()) {
            m4838f = m4837e() - this.f7838g;
            m4837e = m4837e();
            m4838f2 = m4838f();
        } else {
            m4838f = this.f7838g - m4838f();
            m4837e = m4837e();
            m4838f2 = m4838f();
        }
        return m4838f / (m4837e - m4838f2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m4836d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.f7842k;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.m4647b();
    }

    /* renamed from: h */
    public void m4840h() {
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    /* renamed from: i */
    public void m4841i() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.f7843l = false;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f7843l;
    }

    /* renamed from: j */
    public void m4842j(float f2) {
        if (this.f7838g == f2) {
            return;
        }
        this.f7838g = MiscUtils.m4845b(f2, m4838f(), m4837e());
        this.f7837f = 0L;
        m4828b();
    }

    /* renamed from: k */
    public void m4843k(float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
        }
        LottieComposition lottieComposition = this.f7842k;
        float f4 = lottieComposition == null ? -3.4028235E38f : lottieComposition.f7149k;
        float f5 = lottieComposition == null ? Float.MAX_VALUE : lottieComposition.f7150l;
        this.f7840i = MiscUtils.m4845b(f2, f4, f5);
        this.f7841j = MiscUtils.m4845b(f3, f4, f5);
        m4842j((int) MiscUtils.m4845b(this.f7838g, f2, f3));
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.f7836e) {
            return;
        }
        this.f7836e = false;
        this.f7835d = -this.f7835d;
    }
}
