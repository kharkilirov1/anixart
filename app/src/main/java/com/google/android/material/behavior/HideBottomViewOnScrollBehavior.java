package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    @NonNull
    public final LinkedHashSet<OnScrollStateChangedListener> f17508a;

    /* renamed from: b */
    public int f17509b;

    /* renamed from: c */
    public int f17510c;

    /* renamed from: d */
    public TimeInterpolator f17511d;

    /* renamed from: e */
    public TimeInterpolator f17512e;

    /* renamed from: f */
    public int f17513f;

    /* renamed from: g */
    @ScrollState
    public int f17514g;

    /* renamed from: h */
    public int f17515h;

    /* renamed from: i */
    @Nullable
    public ViewPropertyAnimator f17516i;

    public interface OnScrollStateChangedListener {
        /* renamed from: a */
        void m9813a(@NonNull View view, @ScrollState int i2);
    }

    @RestrictTo
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f17508a = new LinkedHashSet<>();
        this.f17513f = 0;
        this.f17514g = 2;
        this.f17515h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h */
    public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        this.f17513f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f17509b = MotionUtils.m10184c(v.getContext(), C2507R.attr.motionDurationLong2, 225);
        this.f17510c = MotionUtils.m10184c(v.getContext(), C2507R.attr.motionDurationMedium4, 175);
        this.f17511d = MotionUtils.m10185d(v.getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17345d);
        this.f17512e = MotionUtils.m10185d(v.getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17344c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public void mo1503l(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        if (i3 > 0) {
            if (this.f17514g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f17516i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            m9812t(v, 1);
            m9811s(v, this.f17513f + this.f17515h, this.f17510c, this.f17512e);
            return;
        }
        if (i3 < 0) {
            if (this.f17514g == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f17516i;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            m9812t(v, 2);
            m9811s(v, 0, this.f17509b, this.f17511d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo1507p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
        return i2 == 2;
    }

    /* renamed from: s */
    public final void m9811s(@NonNull V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f17516i = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f17516i = null;
            }
        });
    }

    /* renamed from: t */
    public final void m9812t(@NonNull V v, @ScrollState int i2) {
        this.f17514g = i2;
        Iterator<OnScrollStateChangedListener> it = this.f17508a.iterator();
        while (it.hasNext()) {
            it.next().m9813a(v, this.f17514g);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17508a = new LinkedHashSet<>();
        this.f17513f = 0;
        this.f17514g = 2;
        this.f17515h = 0;
    }
}
