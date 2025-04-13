package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f3786r = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    public final ClampedScroller f3787b;

    /* renamed from: c */
    public final Interpolator f3788c;

    /* renamed from: d */
    public final View f3789d;

    /* renamed from: e */
    public Runnable f3790e;

    /* renamed from: f */
    public float[] f3791f;

    /* renamed from: g */
    public float[] f3792g;

    /* renamed from: h */
    public int f3793h;

    /* renamed from: i */
    public int f3794i;

    /* renamed from: j */
    public float[] f3795j;

    /* renamed from: k */
    public float[] f3796k;

    /* renamed from: l */
    public float[] f3797l;

    /* renamed from: m */
    public boolean f3798m;

    /* renamed from: n */
    public boolean f3799n;

    /* renamed from: o */
    public boolean f3800o;

    /* renamed from: p */
    public boolean f3801p;

    /* renamed from: q */
    public boolean f3802q;

    public static class ClampedScroller {

        /* renamed from: a */
        public int f3803a;

        /* renamed from: b */
        public int f3804b;

        /* renamed from: c */
        public float f3805c;

        /* renamed from: d */
        public float f3806d;

        /* renamed from: j */
        public float f3812j;

        /* renamed from: k */
        public int f3813k;

        /* renamed from: e */
        public long f3807e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f3811i = -1;

        /* renamed from: f */
        public long f3808f = 0;

        /* renamed from: g */
        public int f3809g = 0;

        /* renamed from: h */
        public int f3810h = 0;

        /* renamed from: a */
        public final float m2574a(long j2) {
            if (j2 < this.f3807e) {
                return 0.0f;
            }
            long j3 = this.f3811i;
            if (j3 < 0 || j2 < j3) {
                return AutoScrollHelper.m2566d((j2 - r0) / this.f3803a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f3812j;
            return (AutoScrollHelper.m2566d((j2 - j3) / this.f3813k, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.f3801p) {
                if (autoScrollHelper.f3799n) {
                    autoScrollHelper.f3799n = false;
                    ClampedScroller clampedScroller = autoScrollHelper.f3787b;
                    Objects.requireNonNull(clampedScroller);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.f3807e = currentAnimationTimeMillis;
                    clampedScroller.f3811i = -1L;
                    clampedScroller.f3808f = currentAnimationTimeMillis;
                    clampedScroller.f3812j = 0.5f;
                    clampedScroller.f3809g = 0;
                    clampedScroller.f3810h = 0;
                }
                ClampedScroller clampedScroller2 = AutoScrollHelper.this.f3787b;
                if ((clampedScroller2.f3811i > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller2.f3811i + ((long) clampedScroller2.f3813k)) || !AutoScrollHelper.this.m2573h()) {
                    AutoScrollHelper.this.f3801p = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.f3800o) {
                    autoScrollHelper2.f3800o = false;
                    Objects.requireNonNull(autoScrollHelper2);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    autoScrollHelper2.f3789d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (clampedScroller2.f3808f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float m2574a = clampedScroller2.m2574a(currentAnimationTimeMillis2);
                long j2 = currentAnimationTimeMillis2 - clampedScroller2.f3808f;
                clampedScroller2.f3808f = currentAnimationTimeMillis2;
                float f2 = j2 * ((m2574a * 4.0f) + ((-4.0f) * m2574a * m2574a));
                int i2 = (int) (clampedScroller2.f3805c * f2);
                clampedScroller2.f3809g = i2;
                int i3 = (int) (f2 * clampedScroller2.f3806d);
                clampedScroller2.f3810h = i3;
                AutoScrollHelper.this.mo2572g(i2, i3);
                ViewCompat.m2184X(AutoScrollHelper.this.f3789d, this);
            }
        }
    }

    public AutoScrollHelper(@NonNull View view) {
        ClampedScroller clampedScroller = new ClampedScroller();
        this.f3787b = clampedScroller;
        this.f3788c = new AccelerateInterpolator();
        this.f3791f = new float[]{0.0f, 0.0f};
        this.f3792g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3795j = new float[]{0.0f, 0.0f};
        this.f3796k = new float[]{0.0f, 0.0f};
        this.f3797l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3789d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3797l;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f3796k;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f3793h = 1;
        float[] fArr3 = this.f3792g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3791f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3795j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3794i = f3786r;
        clampedScroller.f3803a = 500;
        clampedScroller.f3804b = 500;
    }

    /* renamed from: d */
    public static float m2566d(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* renamed from: a */
    public abstract boolean mo2567a(int i2);

    /* renamed from: b */
    public abstract boolean mo2568b(int i2);

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m2569c(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3791f
            r0 = r0[r4]
            float[] r1 = r3.f3792g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m2566d(r0, r2, r1)
            float r1 = r3.m2570e(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m2570e(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f3788c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f3788c
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m2566d(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r0 = r3.f3795j
            r0 = r0[r4]
            float[] r1 = r3.f3796k
            r1 = r1[r4]
            float[] r2 = r3.f3797l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L56
            float r5 = r5 * r0
            float r4 = m2566d(r5, r1, r4)
            return r4
        L56:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m2566d(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.m2569c(int, float, float, float):float");
    }

    /* renamed from: e */
    public final float m2570e(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f3793h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f3801p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final void m2571f() {
        int i2 = 0;
        if (this.f3799n) {
            this.f3801p = false;
            return;
        }
        ClampedScroller clampedScroller = this.f3787b;
        Objects.requireNonNull(clampedScroller);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - clampedScroller.f3807e);
        int i4 = clampedScroller.f3804b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        clampedScroller.f3813k = i2;
        clampedScroller.f3812j = clampedScroller.m2574a(currentAnimationTimeMillis);
        clampedScroller.f3811i = currentAnimationTimeMillis;
    }

    /* renamed from: g */
    public abstract void mo2572g(int i2, int i3);

    /* renamed from: h */
    public boolean m2573h() {
        ClampedScroller clampedScroller = this.f3787b;
        float f2 = clampedScroller.f3806d;
        int abs = (int) (f2 / Math.abs(f2));
        float f3 = clampedScroller.f3805c;
        int abs2 = (int) (f3 / Math.abs(f3));
        return (abs != 0 && mo2568b(abs)) || (abs2 != 0 && mo2567a(abs2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3802q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7d
        L16:
            r5.m2571f()
            goto L7d
        L1a:
            r5.f3800o = r2
            r5.f3798m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3789d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2569c(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3789d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2569c(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r7 = r5.f3787b
            r7.f3805c = r0
            r7.f3806d = r6
            boolean r6 = r5.f3801p
            if (r6 != 0) goto L7d
            boolean r6 = r5.m2573h()
            if (r6 == 0) goto L7d
            java.lang.Runnable r6 = r5.f3790e
            if (r6 != 0) goto L61
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r6 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r6.<init>()
            r5.f3790e = r6
        L61:
            r5.f3801p = r2
            r5.f3799n = r2
            boolean r6 = r5.f3798m
            if (r6 != 0) goto L76
            int r6 = r5.f3794i
            if (r6 <= 0) goto L76
            android.view.View r7 = r5.f3789d
            java.lang.Runnable r0 = r5.f3790e
            long r3 = (long) r6
            androidx.core.view.ViewCompat.m2185Y(r7, r0, r3)
            goto L7b
        L76:
            java.lang.Runnable r6 = r5.f3790e
            r6.run()
        L7b:
            r5.f3798m = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
