package lecho.lib.hellocharts.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.Chart;

@SuppressLint
/* loaded from: classes3.dex */
public class ChartViewportAnimatorV14 implements ChartViewportAnimator, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final Chart f68475a;

    /* renamed from: b */
    public ValueAnimator f68476b;

    /* renamed from: c */
    public Viewport f68477c = new Viewport();

    /* renamed from: d */
    public Viewport f68478d = new Viewport();

    /* renamed from: e */
    public Viewport f68479e = new Viewport();

    /* renamed from: f */
    public ChartAnimationListener f68480f = new DummyChartAnimationListener();

    public ChartViewportAnimatorV14(Chart chart) {
        this.f68475a = chart;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f68476b = ofFloat;
        ofFloat.addListener(this);
        this.f68476b.addUpdateListener(this);
        this.f68476b.setDuration(300L);
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: a */
    public void mo34410a() {
        this.f68476b.cancel();
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: b */
    public void mo34411b(ChartAnimationListener chartAnimationListener) {
        if (chartAnimationListener == null) {
            this.f68480f = new DummyChartAnimationListener();
        } else {
            this.f68480f = chartAnimationListener;
        }
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: c */
    public void mo34412c(Viewport viewport, Viewport viewport2) {
        this.f68477c.m34468f(viewport);
        this.f68478d.m34468f(viewport2);
        this.f68476b.setDuration(300L);
        this.f68476b.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f68475a.setCurrentViewport(this.f68478d);
        this.f68480f.mo34407a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f68480f.mo34408b();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Viewport viewport = this.f68478d;
        float f2 = viewport.f68643b;
        Viewport viewport2 = this.f68477c;
        float f3 = viewport2.f68643b;
        float f4 = viewport.f68644c;
        float f5 = viewport2.f68644c;
        float f6 = viewport.f68645d;
        float f7 = viewport2.f68645d;
        float f8 = viewport.f68646e;
        float f9 = viewport2.f68646e;
        this.f68479e.m34467d(f3 + ((f2 - f3) * animatedFraction), f5 + ((f4 - f5) * animatedFraction), f7 + ((f6 - f7) * animatedFraction), f9 + ((f8 - f9) * animatedFraction));
        this.f68475a.setCurrentViewport(this.f68479e);
    }
}
