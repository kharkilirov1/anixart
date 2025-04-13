package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

/* loaded from: classes.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: j */
    public static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> f18555j = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.f18561i);
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f2) {
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate2 = linearIndeterminateContiguousAnimatorDelegate;
            float floatValue = f2.floatValue();
            linearIndeterminateContiguousAnimatorDelegate2.f18561i = floatValue;
            linearIndeterminateContiguousAnimatorDelegate2.f18548b[0] = 0.0f;
            float m10233b = linearIndeterminateContiguousAnimatorDelegate2.m10233b((int) (floatValue * 333.0f), 0, 667);
            float[] fArr = linearIndeterminateContiguousAnimatorDelegate2.f18548b;
            float interpolation = linearIndeterminateContiguousAnimatorDelegate2.f18557e.getInterpolation(m10233b);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = linearIndeterminateContiguousAnimatorDelegate2.f18548b;
            float interpolation2 = linearIndeterminateContiguousAnimatorDelegate2.f18557e.getInterpolation(m10233b + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = linearIndeterminateContiguousAnimatorDelegate2.f18548b;
            fArr3[5] = 1.0f;
            if (linearIndeterminateContiguousAnimatorDelegate2.f18560h && fArr3[3] < 1.0f) {
                int[] iArr = linearIndeterminateContiguousAnimatorDelegate2.f18549c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = MaterialColors.m9968a(linearIndeterminateContiguousAnimatorDelegate2.f18558f.f18503c[linearIndeterminateContiguousAnimatorDelegate2.f18559g], linearIndeterminateContiguousAnimatorDelegate2.f18547a.f18542k);
                linearIndeterminateContiguousAnimatorDelegate2.f18560h = false;
            }
            linearIndeterminateContiguousAnimatorDelegate2.f18547a.invalidateSelf();
        }
    };

    /* renamed from: d */
    public ObjectAnimator f18556d;

    /* renamed from: e */
    public FastOutSlowInInterpolator f18557e;

    /* renamed from: f */
    public final BaseProgressIndicatorSpec f18558f;

    /* renamed from: g */
    public int f18559g;

    /* renamed from: h */
    public boolean f18560h;

    /* renamed from: i */
    public float f18561i;

    public LinearIndeterminateContiguousAnimatorDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f18559g = 1;
        this.f18558f = linearProgressIndicatorSpec;
        this.f18557e = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: a */
    public void mo10217a() {
        ObjectAnimator objectAnimator = this.f18556d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: c */
    public void mo10218c() {
        m10234h();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: d */
    public void mo10219d(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: e */
    public void mo10220e() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: f */
    public void mo10221f() {
        if (this.f18556d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18555j, 0.0f, 1.0f);
            this.f18556d = ofFloat;
            ofFloat.setDuration(333L);
            this.f18556d.setInterpolator(null);
            this.f18556d.setRepeatCount(-1);
            this.f18556d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.f18559g = (linearIndeterminateContiguousAnimatorDelegate.f18559g + 1) % linearIndeterminateContiguousAnimatorDelegate.f18558f.f18503c.length;
                    linearIndeterminateContiguousAnimatorDelegate.f18560h = true;
                }
            });
        }
        m10234h();
        this.f18556d.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: g */
    public void mo10222g() {
    }

    @VisibleForTesting
    /* renamed from: h */
    public void m10234h() {
        this.f18560h = true;
        this.f18559g = 1;
        Arrays.fill(this.f18549c, MaterialColors.m9968a(this.f18558f.f18503c[0], this.f18547a.f18542k));
    }
}
