package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.flatbuffer.C0321a;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MotionTiming {

    /* renamed from: a */
    public long f17356a;

    /* renamed from: b */
    public long f17357b;

    /* renamed from: c */
    @Nullable
    public TimeInterpolator f17358c;

    /* renamed from: d */
    public int f17359d;

    /* renamed from: e */
    public int f17360e;

    public MotionTiming(long j2, long j3) {
        this.f17356a = 0L;
        this.f17357b = 300L;
        this.f17358c = null;
        this.f17359d = 0;
        this.f17360e = 1;
        this.f17356a = j2;
        this.f17357b = j3;
    }

    /* renamed from: a */
    public void m9747a(@NonNull Animator animator) {
        animator.setStartDelay(this.f17356a);
        animator.setDuration(this.f17357b);
        animator.setInterpolator(m9748b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f17359d);
            valueAnimator.setRepeatMode(this.f17360e);
        }
    }

    @Nullable
    /* renamed from: b */
    public TimeInterpolator m9748b() {
        TimeInterpolator timeInterpolator = this.f17358c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f17343b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (this.f17356a == motionTiming.f17356a && this.f17357b == motionTiming.f17357b && this.f17359d == motionTiming.f17359d && this.f17360e == motionTiming.f17360e) {
            return m9748b().getClass().equals(motionTiming.m9748b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f17356a;
        long j3 = this.f17357b;
        return ((((m9748b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f17359d) * 31) + this.f17360e;
    }

    @NonNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('\n');
        m2872a.append(getClass().getName());
        m2872a.append('{');
        m2872a.append(Integer.toHexString(System.identityHashCode(this)));
        m2872a.append(" delay: ");
        m2872a.append(this.f17356a);
        m2872a.append(" duration: ");
        m2872a.append(this.f17357b);
        m2872a.append(" interpolator: ");
        m2872a.append(m9748b().getClass());
        m2872a.append(" repeatCount: ");
        m2872a.append(this.f17359d);
        m2872a.append(" repeatMode: ");
        return C0000a.m18o(m2872a, this.f17360e, "}\n");
    }

    public MotionTiming(long j2, long j3, @NonNull TimeInterpolator timeInterpolator) {
        this.f17356a = 0L;
        this.f17357b = 300L;
        this.f17358c = null;
        this.f17359d = 0;
        this.f17360e = 1;
        this.f17356a = j2;
        this.f17357b = j3;
        this.f17358c = timeInterpolator;
    }
}
