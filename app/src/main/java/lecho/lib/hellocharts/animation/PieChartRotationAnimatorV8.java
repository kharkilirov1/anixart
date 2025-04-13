package lecho.lib.hellocharts.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import lecho.lib.hellocharts.view.PieChartView;

/* loaded from: classes3.dex */
public class PieChartRotationAnimatorV8 implements PieChartRotationAnimator {

    /* renamed from: a */
    public final PieChartView f68497a;

    /* renamed from: b */
    public final long f68498b;

    /* renamed from: c */
    public final Handler f68499c;

    /* renamed from: d */
    public final Interpolator f68500d;

    /* renamed from: e */
    public long f68501e;

    /* renamed from: f */
    public float f68502f;

    /* renamed from: g */
    public float f68503g;

    /* renamed from: h */
    public ChartAnimationListener f68504h;

    /* renamed from: i */
    public final Runnable f68505i;

    /* renamed from: lecho.lib.hellocharts.animation.PieChartRotationAnimatorV8$1 */
    public class RunnableC68581 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ PieChartRotationAnimatorV8 f68506b;

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            PieChartRotationAnimatorV8 pieChartRotationAnimatorV8 = this.f68506b;
            long j2 = uptimeMillis - pieChartRotationAnimatorV8.f68501e;
            long j3 = pieChartRotationAnimatorV8.f68498b;
            if (j2 > j3) {
                pieChartRotationAnimatorV8.f68499c.removeCallbacks(pieChartRotationAnimatorV8.f68505i);
                PieChartRotationAnimatorV8 pieChartRotationAnimatorV82 = this.f68506b;
                pieChartRotationAnimatorV82.f68497a.m34501e((int) pieChartRotationAnimatorV82.f68503g, false);
                this.f68506b.f68504h.mo34407a();
                return;
            }
            float min = Math.min(pieChartRotationAnimatorV8.f68500d.getInterpolation(j2 / j3), 1.0f);
            PieChartRotationAnimatorV8 pieChartRotationAnimatorV83 = this.f68506b;
            float f2 = pieChartRotationAnimatorV83.f68502f;
            pieChartRotationAnimatorV83.f68497a.m34501e((int) ((((((pieChartRotationAnimatorV83.f68503g - f2) * min) + f2) % 360.0f) + 360.0f) % 360.0f), false);
            this.f68506b.f68499c.postDelayed(this, 16L);
        }
    }

    @Override // lecho.lib.hellocharts.animation.PieChartRotationAnimator
    /* renamed from: a */
    public void mo34413a() {
        this.f68499c.removeCallbacks(this.f68505i);
        this.f68497a.m34501e((int) this.f68503g, false);
        this.f68504h.mo34407a();
    }

    @Override // lecho.lib.hellocharts.animation.PieChartRotationAnimator
    /* renamed from: b */
    public void mo34414b(float f2, float f3) {
        this.f68502f = ((f2 % 360.0f) + 360.0f) % 360.0f;
        this.f68503g = ((f3 % 360.0f) + 360.0f) % 360.0f;
        this.f68504h.mo34408b();
        this.f68501e = SystemClock.uptimeMillis();
        this.f68499c.post(this.f68505i);
    }
}
