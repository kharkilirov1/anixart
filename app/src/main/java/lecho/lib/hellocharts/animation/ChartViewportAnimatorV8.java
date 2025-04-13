package lecho.lib.hellocharts.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.Chart;

/* loaded from: classes3.dex */
public class ChartViewportAnimatorV8 implements ChartViewportAnimator {

    /* renamed from: a */
    public final Chart f68481a;

    /* renamed from: b */
    public final Handler f68482b;

    /* renamed from: c */
    public final Interpolator f68483c;

    /* renamed from: d */
    public long f68484d;

    /* renamed from: e */
    public Viewport f68485e;

    /* renamed from: f */
    public Viewport f68486f;

    /* renamed from: g */
    public Viewport f68487g;

    /* renamed from: h */
    public long f68488h;

    /* renamed from: i */
    public ChartAnimationListener f68489i;

    /* renamed from: j */
    public final Runnable f68490j;

    /* renamed from: lecho.lib.hellocharts.animation.ChartViewportAnimatorV8$1 */
    public class RunnableC68571 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ChartViewportAnimatorV8 f68491b;

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            ChartViewportAnimatorV8 chartViewportAnimatorV8 = this.f68491b;
            long j2 = uptimeMillis - chartViewportAnimatorV8.f68484d;
            long j3 = chartViewportAnimatorV8.f68488h;
            if (j2 > j3) {
                chartViewportAnimatorV8.f68482b.removeCallbacks(chartViewportAnimatorV8.f68490j);
                ChartViewportAnimatorV8 chartViewportAnimatorV82 = this.f68491b;
                chartViewportAnimatorV82.f68481a.setCurrentViewport(chartViewportAnimatorV82.f68486f);
                this.f68491b.f68489i.mo34407a();
                return;
            }
            float min = Math.min(chartViewportAnimatorV8.f68483c.getInterpolation(j2 / j3), 1.0f);
            ChartViewportAnimatorV8 chartViewportAnimatorV83 = this.f68491b;
            Viewport viewport = chartViewportAnimatorV83.f68486f;
            float f2 = viewport.f68643b;
            Viewport viewport2 = chartViewportAnimatorV83.f68485e;
            float f3 = viewport2.f68643b;
            float f4 = viewport.f68644c;
            float f5 = viewport2.f68644c;
            float f6 = viewport.f68645d;
            float f7 = viewport2.f68645d;
            float f8 = viewport.f68646e;
            float f9 = viewport2.f68646e;
            chartViewportAnimatorV83.f68487g.m34467d(f3 + ((f2 - f3) * min), f5 + ((f4 - f5) * min), f7 + ((f6 - f7) * min), f9 + ((f8 - f9) * min));
            ChartViewportAnimatorV8 chartViewportAnimatorV84 = this.f68491b;
            chartViewportAnimatorV84.f68481a.setCurrentViewport(chartViewportAnimatorV84.f68487g);
            this.f68491b.f68482b.postDelayed(this, 16L);
        }
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: a */
    public void mo34410a() {
        this.f68482b.removeCallbacks(this.f68490j);
        this.f68481a.setCurrentViewport(this.f68486f);
        this.f68489i.mo34407a();
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: b */
    public void mo34411b(ChartAnimationListener chartAnimationListener) {
        if (chartAnimationListener == null) {
            this.f68489i = new DummyChartAnimationListener();
        } else {
            this.f68489i = chartAnimationListener;
        }
    }

    @Override // lecho.lib.hellocharts.animation.ChartViewportAnimator
    /* renamed from: c */
    public void mo34412c(Viewport viewport, Viewport viewport2) {
        this.f68485e.m34468f(viewport);
        this.f68486f.m34468f(viewport2);
        this.f68488h = 300L;
        this.f68489i.mo34408b();
        this.f68484d = SystemClock.uptimeMillis();
        this.f68482b.post(this.f68490j);
    }
}
