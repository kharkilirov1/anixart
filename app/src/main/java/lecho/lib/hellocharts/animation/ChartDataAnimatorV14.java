package lecho.lib.hellocharts.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import lecho.lib.hellocharts.view.Chart;

@SuppressLint
/* loaded from: classes3.dex */
public class ChartDataAnimatorV14 implements ChartDataAnimator, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final Chart f68466a;

    /* renamed from: b */
    public ValueAnimator f68467b;

    /* renamed from: c */
    public ChartAnimationListener f68468c = new DummyChartAnimationListener();

    public ChartDataAnimatorV14(Chart chart) {
        this.f68466a = chart;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f68467b = ofFloat;
        ofFloat.addListener(this);
        this.f68467b.addUpdateListener(this);
    }

    @Override // lecho.lib.hellocharts.animation.ChartDataAnimator
    /* renamed from: b */
    public void mo34409b(ChartAnimationListener chartAnimationListener) {
        if (chartAnimationListener == null) {
            this.f68468c = new DummyChartAnimationListener();
        } else {
            this.f68468c = chartAnimationListener;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f68466a.mo34498b();
        this.f68468c.mo34407a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f68468c.mo34408b();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f68466a.mo34497a(valueAnimator.getAnimatedFraction());
    }
}
