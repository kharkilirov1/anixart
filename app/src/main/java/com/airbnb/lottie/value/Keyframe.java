package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Keyframe<T> {

    /* renamed from: a */
    @Nullable
    public final LottieComposition f7853a;

    /* renamed from: b */
    @Nullable
    public final T f7854b;

    /* renamed from: c */
    @Nullable
    public T f7855c;

    /* renamed from: d */
    @Nullable
    public final Interpolator f7856d;

    /* renamed from: e */
    public final float f7857e;

    /* renamed from: f */
    @Nullable
    public Float f7858f;

    /* renamed from: g */
    public float f7859g;

    /* renamed from: h */
    public float f7860h;

    /* renamed from: i */
    public int f7861i;

    /* renamed from: j */
    public int f7862j;

    /* renamed from: k */
    public float f7863k;

    /* renamed from: l */
    public float f7864l;

    /* renamed from: m */
    public PointF f7865m;

    /* renamed from: n */
    public PointF f7866n;

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f2, @Nullable Float f3) {
        this.f7859g = -3987645.8f;
        this.f7860h = -3987645.8f;
        this.f7861i = 784923401;
        this.f7862j = 784923401;
        this.f7863k = Float.MIN_VALUE;
        this.f7864l = Float.MIN_VALUE;
        this.f7865m = null;
        this.f7866n = null;
        this.f7853a = lottieComposition;
        this.f7854b = t;
        this.f7855c = t2;
        this.f7856d = interpolator;
        this.f7857e = f2;
        this.f7858f = f3;
    }

    /* renamed from: a */
    public boolean m4857a(@FloatRange float f2) {
        return f2 >= m4859c() && f2 < m4858b();
    }

    /* renamed from: b */
    public float m4858b() {
        if (this.f7853a == null) {
            return 1.0f;
        }
        if (this.f7864l == Float.MIN_VALUE) {
            if (this.f7858f == null) {
                this.f7864l = 1.0f;
            } else {
                this.f7864l = ((this.f7858f.floatValue() - this.f7857e) / this.f7853a.m4648c()) + m4859c();
            }
        }
        return this.f7864l;
    }

    /* renamed from: c */
    public float m4859c() {
        LottieComposition lottieComposition = this.f7853a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f7863k == Float.MIN_VALUE) {
            this.f7863k = (this.f7857e - lottieComposition.f7149k) / lottieComposition.m4648c();
        }
        return this.f7863k;
    }

    /* renamed from: d */
    public boolean m4860d() {
        return this.f7856d == null;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Keyframe{startValue=");
        m24u.append(this.f7854b);
        m24u.append(", endValue=");
        m24u.append(this.f7855c);
        m24u.append(", startFrame=");
        m24u.append(this.f7857e);
        m24u.append(", endFrame=");
        m24u.append(this.f7858f);
        m24u.append(", interpolator=");
        m24u.append(this.f7856d);
        m24u.append('}');
        return m24u.toString();
    }

    public Keyframe(T t) {
        this.f7859g = -3987645.8f;
        this.f7860h = -3987645.8f;
        this.f7861i = 784923401;
        this.f7862j = 784923401;
        this.f7863k = Float.MIN_VALUE;
        this.f7864l = Float.MIN_VALUE;
        this.f7865m = null;
        this.f7866n = null;
        this.f7853a = null;
        this.f7854b = t;
        this.f7855c = t;
        this.f7856d = null;
        this.f7857e = Float.MIN_VALUE;
        this.f7858f = Float.valueOf(Float.MAX_VALUE);
    }
}
