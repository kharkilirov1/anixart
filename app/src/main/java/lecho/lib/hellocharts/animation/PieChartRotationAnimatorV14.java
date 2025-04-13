package lecho.lib.hellocharts.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import lecho.lib.hellocharts.view.PieChartView;

@SuppressLint
/* loaded from: classes3.dex */
public class PieChartRotationAnimatorV14 implements PieChartRotationAnimator, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final PieChartView f68492a;

    /* renamed from: b */
    public ValueAnimator f68493b;

    /* renamed from: c */
    public float f68494c = 0.0f;

    /* renamed from: d */
    public float f68495d = 0.0f;

    /* renamed from: e */
    public ChartAnimationListener f68496e = new DummyChartAnimationListener();

    public PieChartRotationAnimatorV14(PieChartView pieChartView) {
        this.f68492a = pieChartView;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f68493b = ofFloat;
        ofFloat.setDuration(200L);
        this.f68493b.addListener(this);
        this.f68493b.addUpdateListener(this);
    }

    @Override // lecho.lib.hellocharts.animation.PieChartRotationAnimator
    /* renamed from: a */
    public void mo34413a() {
        this.f68493b.cancel();
    }

    @Override // lecho.lib.hellocharts.animation.PieChartRotationAnimator
    /* renamed from: b */
    public void mo34414b(float f2, float f3) {
        this.f68494c = ((f2 % 360.0f) + 360.0f) % 360.0f;
        this.f68495d = ((f3 % 360.0f) + 360.0f) % 360.0f;
        this.f68493b.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f68492a.m34501e((int) this.f68495d, false);
        this.f68496e.mo34407a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f68496e.mo34408b();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f2 = this.f68494c;
        this.f68492a.m34501e((int) ((((((this.f68495d - f2) * animatedFraction) + f2) % 360.0f) + 360.0f) % 360.0f), false);
    }
}
