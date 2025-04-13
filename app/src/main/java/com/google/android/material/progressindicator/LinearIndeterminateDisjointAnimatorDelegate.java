package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import com.swiftsoft.anixartd.C2507R;
import java.util.Arrays;

/* loaded from: classes.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f18563l = {533, 567, 850, 750};

    /* renamed from: m */
    public static final int[] f18564m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final Property<LinearIndeterminateDisjointAnimatorDelegate, Float> f18565n = new Property<LinearIndeterminateDisjointAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.f18572j);
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f2) {
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate2 = linearIndeterminateDisjointAnimatorDelegate;
            float floatValue = f2.floatValue();
            linearIndeterminateDisjointAnimatorDelegate2.f18572j = floatValue;
            int i2 = (int) (floatValue * 1800.0f);
            for (int i3 = 0; i3 < 4; i3++) {
                linearIndeterminateDisjointAnimatorDelegate2.f18548b[i3] = Math.max(0.0f, Math.min(1.0f, linearIndeterminateDisjointAnimatorDelegate2.f18568f[i3].getInterpolation(linearIndeterminateDisjointAnimatorDelegate2.m10233b(i2, LinearIndeterminateDisjointAnimatorDelegate.f18564m[i3], LinearIndeterminateDisjointAnimatorDelegate.f18563l[i3]))));
            }
            if (linearIndeterminateDisjointAnimatorDelegate2.f18571i) {
                Arrays.fill(linearIndeterminateDisjointAnimatorDelegate2.f18549c, MaterialColors.m9968a(linearIndeterminateDisjointAnimatorDelegate2.f18569g.f18503c[linearIndeterminateDisjointAnimatorDelegate2.f18570h], linearIndeterminateDisjointAnimatorDelegate2.f18547a.f18542k));
                linearIndeterminateDisjointAnimatorDelegate2.f18571i = false;
            }
            linearIndeterminateDisjointAnimatorDelegate2.f18547a.invalidateSelf();
        }
    };

    /* renamed from: d */
    public ObjectAnimator f18566d;

    /* renamed from: e */
    public ObjectAnimator f18567e;

    /* renamed from: f */
    public final Interpolator[] f18568f;

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f18569g;

    /* renamed from: h */
    public int f18570h;

    /* renamed from: i */
    public boolean f18571i;

    /* renamed from: j */
    public float f18572j;

    /* renamed from: k */
    public Animatable2Compat.AnimationCallback f18573k;

    public LinearIndeterminateDisjointAnimatorDelegate(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f18570h = 0;
        this.f18573k = null;
        this.f18569g = linearProgressIndicatorSpec;
        this.f18568f = new Interpolator[]{AnimationUtils.loadInterpolator(context, C2507R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, C2507R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, C2507R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, C2507R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: a */
    public void mo10217a() {
        ObjectAnimator objectAnimator = this.f18566d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: c */
    public void mo10218c() {
        m10235h();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: d */
    public void mo10219d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f18573k = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: e */
    public void mo10220e() {
        ObjectAnimator objectAnimator = this.f18567e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo10217a();
        if (this.f18547a.isVisible()) {
            this.f18567e.setFloatValues(this.f18572j, 1.0f);
            this.f18567e.setDuration((long) ((1.0f - this.f18572j) * 1800.0f));
            this.f18567e.start();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: f */
    public void mo10221f() {
        if (this.f18566d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18565n, 0.0f, 1.0f);
            this.f18566d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f18566d.setInterpolator(null);
            this.f18566d.setRepeatCount(-1);
            this.f18566d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.f18570h = (linearIndeterminateDisjointAnimatorDelegate.f18570h + 1) % linearIndeterminateDisjointAnimatorDelegate.f18569g.f18503c.length;
                    linearIndeterminateDisjointAnimatorDelegate.f18571i = true;
                }
            });
        }
        if (this.f18567e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f18565n, 1.0f);
            this.f18567e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f18567e.setInterpolator(null);
            this.f18567e.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.mo10217a();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.f18573k;
                    if (animationCallback != null) {
                        animationCallback.mo4292a(linearIndeterminateDisjointAnimatorDelegate.f18547a);
                    }
                }
            });
        }
        m10235h();
        this.f18566d.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    /* renamed from: g */
    public void mo10222g() {
        this.f18573k = null;
    }

    @VisibleForTesting
    /* renamed from: h */
    public void m10235h() {
        this.f18570h = 0;
        int m9968a = MaterialColors.m9968a(this.f18569g.f18503c[0], this.f18547a.f18542k);
        int[] iArr = this.f18549c;
        iArr[0] = m9968a;
        iArr[1] = m9968a;
    }
}
