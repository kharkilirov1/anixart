package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: c */
    @Nullable
    public Runnable f17440c;

    /* renamed from: d */
    public OverScroller f17441d;

    /* renamed from: e */
    public boolean f17442e;

    /* renamed from: f */
    public int f17443f;

    /* renamed from: g */
    public int f17444g;

    /* renamed from: h */
    public int f17445h;

    /* renamed from: i */
    @Nullable
    public VelocityTracker f17446i;

    public class FlingRunnable implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f17447b;

        /* renamed from: c */
        public final V f17448c;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, V v) {
            this.f17447b = coordinatorLayout;
            this.f17448c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f17448c == null || (overScroller = HeaderBehavior.this.f17441d) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.mo9773z(this.f17447b, this.f17448c);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.m9791B(this.f17447b, this.f17448c, headerBehavior.f17441d.getCurrY());
            ViewCompat.m2184X(this.f17448c, this);
        }
    }

    public HeaderBehavior() {
        this.f17443f = -1;
        this.f17445h = -1;
    }

    /* renamed from: A */
    public final int m9790A(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return mo9761C(coordinatorLayout, v, mo9772y() - i2, i3, i4);
    }

    /* renamed from: B */
    public int m9791B(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return mo9761C(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: C */
    public int mo9761C(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        int m1934b;
        int m9795s = m9795s();
        if (i3 == 0 || m9795s < i3 || m9795s > i4 || m9795s == (m1934b = MathUtils.m1934b(i2, i3, i4))) {
            return 0;
        }
        m9796u(m1934b);
        return m9795s - m1934b;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g */
    public boolean mo1498g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f17445h < 0) {
            this.f17445h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f17442e) {
            int i2 = this.f17443f;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f17444g) > this.f17445h) {
                this.f17444g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f17443f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo9769v(v) && coordinatorLayout.m1484s(v, x, y2);
            this.f17442e = z;
            if (z) {
                this.f17444g = y2;
                this.f17443f = motionEvent.getPointerId(0);
                if (this.f17446i == null) {
                    this.f17446i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f17441d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f17441d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f17446i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1509r(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r20, @androidx.annotation.NonNull V r21, @androidx.annotation.NonNull android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo1509r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public boolean mo9769v(V v) {
        return false;
    }

    /* renamed from: w */
    public int mo9770w(@NonNull V v) {
        return -v.getHeight();
    }

    /* renamed from: x */
    public int mo9771x(@NonNull V v) {
        return v.getHeight();
    }

    /* renamed from: y */
    public int mo9772y() {
        return m9795s();
    }

    /* renamed from: z */
    public void mo9773z(CoordinatorLayout coordinatorLayout, V v) {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17443f = -1;
        this.f17445h = -1;
    }
}
