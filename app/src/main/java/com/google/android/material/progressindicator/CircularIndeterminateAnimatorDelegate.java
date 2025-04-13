package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.Objects;

/* loaded from: classes.dex */
final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: j */
    public static final int[] f18511j = {0, 1350, 2700, 4050};

    /* renamed from: k */
    public static final int[] f18512k = {1000, 2350, 3700, 5050};

    /* renamed from: l */
    public static final Property<CircularIndeterminateAnimatorDelegate, Float> f18513l;

    /* renamed from: m */
    public static final Property<CircularIndeterminateAnimatorDelegate, Float> f18514m;

    /* renamed from: d */
    public ObjectAnimator f18515d;

    /* renamed from: e */
    public ObjectAnimator f18516e;

    /* renamed from: f */
    public int f18517f;

    /* renamed from: g */
    public float f18518g;

    /* renamed from: h */
    public float f18519h;

    /* renamed from: i */
    public Animatable2Compat.AnimationCallback f18520i;

    static {
        Class<Float> cls = Float.class;
        f18513l = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.f18518g);
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
                CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate2 = circularIndeterminateAnimatorDelegate;
                float floatValue = f2.floatValue();
                circularIndeterminateAnimatorDelegate2.f18518g = floatValue;
                float[] fArr = circularIndeterminateAnimatorDelegate2.f18548b;
                float f3 = floatValue * 1520.0f;
                fArr[0] = (-20.0f) + f3;
                fArr[1] = f3;
                int i2 = CircularIndeterminateAnimatorDelegate.f18511j[0];
                float f4 = fArr[1];
                throw null;
            }
        };
        f18514m = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.f18519h);
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f2) {
                circularIndeterminateAnimatorDelegate.f18519h = f2.floatValue();
            }
        };
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: a */
    public void mo10217a() {
        ObjectAnimator objectAnimator = this.f18515d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: c */
    public void mo10218c() {
        this.f18517f = 0;
        throw null;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: d */
    public void mo10219d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f18520i = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: e */
    public void mo10220e() {
        ObjectAnimator objectAnimator = this.f18516e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f18547a.isVisible()) {
            this.f18516e.start();
        } else {
            mo10217a();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: f */
    public void mo10221f() {
        if (this.f18515d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18513l, 0.0f, 1.0f);
            this.f18515d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f18515d.setInterpolator(null);
            this.f18515d.setRepeatCount(-1);
            this.f18515d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    int i2 = circularIndeterminateAnimatorDelegate.f18517f;
                    Objects.requireNonNull(circularIndeterminateAnimatorDelegate);
                    throw null;
                }
            });
        }
        if (this.f18516e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f18514m, 0.0f, 1.0f);
            this.f18516e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f18516e.setInterpolator(null);
            this.f18516e.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate.this.mo10217a();
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.f18520i;
                    if (animationCallback != null) {
                        animationCallback.mo4292a(circularIndeterminateAnimatorDelegate.f18547a);
                    }
                }
            });
        }
        this.f18517f = 0;
        throw null;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: g */
    public void mo10222g() {
        this.f18520i = null;
    }
}
