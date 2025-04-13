package lecho.lib.hellocharts.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import java.util.Objects;
import lecho.lib.hellocharts.view.Chart;

/* loaded from: classes3.dex */
public class ChartDataAnimatorV8 implements ChartDataAnimator {

    /* renamed from: a */
    public final Chart f68469a;

    /* renamed from: b */
    public final Handler f68470b;

    /* renamed from: c */
    public final Interpolator f68471c;

    /* renamed from: d */
    public final Runnable f68472d;

    /* renamed from: e */
    public ChartAnimationListener f68473e;

    /* renamed from: lecho.lib.hellocharts.animation.ChartDataAnimatorV8$1 */
    public class RunnableC68561 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ChartDataAnimatorV8 f68474b;

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            Objects.requireNonNull(this.f68474b);
            long j2 = uptimeMillis - 0;
            Objects.requireNonNull(this.f68474b);
            if (j2 > 0) {
                Objects.requireNonNull(this.f68474b);
                ChartDataAnimatorV8 chartDataAnimatorV8 = this.f68474b;
                chartDataAnimatorV8.f68470b.removeCallbacks(chartDataAnimatorV8.f68472d);
                this.f68474b.f68469a.mo34498b();
                return;
            }
            ChartDataAnimatorV8 chartDataAnimatorV82 = this.f68474b;
            Interpolator interpolator = chartDataAnimatorV82.f68471c;
            Objects.requireNonNull(chartDataAnimatorV82);
            this.f68474b.f68469a.mo34497a(Math.min(interpolator.getInterpolation(j2 / 0), 1.0f));
            this.f68474b.f68470b.postDelayed(this, 16L);
        }
    }

    @Override // lecho.lib.hellocharts.animation.ChartDataAnimator
    /* renamed from: b */
    public void mo34409b(ChartAnimationListener chartAnimationListener) {
        if (chartAnimationListener == null) {
            return;
        }
        this.f68473e = chartAnimationListener;
    }
}
