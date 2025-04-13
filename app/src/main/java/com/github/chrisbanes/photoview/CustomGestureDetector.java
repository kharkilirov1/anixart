package com.github.chrisbanes.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
class CustomGestureDetector {

    /* renamed from: a */
    public int f8888a = -1;

    /* renamed from: b */
    public int f8889b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f8890c;

    /* renamed from: d */
    public VelocityTracker f8891d;

    /* renamed from: e */
    public boolean f8892e;

    /* renamed from: f */
    public float f8893f;

    /* renamed from: g */
    public float f8894g;

    /* renamed from: h */
    public final float f8895h;

    /* renamed from: i */
    public final float f8896i;

    /* renamed from: j */
    public OnGestureListener f8897j;

    public CustomGestureDetector(Context context, OnGestureListener onGestureListener) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8896i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8895h = viewConfiguration.getScaledTouchSlop();
        this.f8897j = onGestureListener;
        this.f8890c = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.github.chrisbanes.photoview.CustomGestureDetector.1
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                CustomGestureDetector.this.f8897j.mo5373b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        });
    }

    /* renamed from: a */
    public final float m5368a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f8889b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: b */
    public final float m5369b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f8889b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: c */
    public boolean m5370c() {
        return this.f8890c.isInProgress();
    }

    /* renamed from: d */
    public final boolean m5371d(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f8888a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f8891d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f8893f = m5368a(motionEvent);
            this.f8894g = m5369b(motionEvent);
            this.f8892e = false;
        } else if (action == 1) {
            this.f8888a = -1;
            if (this.f8892e && this.f8891d != null) {
                this.f8893f = m5368a(motionEvent);
                this.f8894g = m5369b(motionEvent);
                this.f8891d.addMovement(motionEvent);
                this.f8891d.computeCurrentVelocity(1000);
                float xVelocity = this.f8891d.getXVelocity();
                float yVelocity = this.f8891d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f8896i) {
                    this.f8897j.mo5374c(this.f8893f, this.f8894g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f8891d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8891d = null;
            }
        } else if (action == 2) {
            float m5368a = m5368a(motionEvent);
            float m5369b = m5369b(motionEvent);
            float f2 = m5368a - this.f8893f;
            float f3 = m5369b - this.f8894g;
            if (!this.f8892e) {
                this.f8892e = Math.sqrt((double) ((f3 * f3) + (f2 * f2))) >= ((double) this.f8895h);
            }
            if (this.f8892e) {
                this.f8897j.mo5372a(f2, f3);
                this.f8893f = m5368a;
                this.f8894g = m5369b;
                VelocityTracker velocityTracker2 = this.f8891d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f8888a = -1;
            VelocityTracker velocityTracker3 = this.f8891d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f8891d = null;
            }
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.f8888a) {
                int i2 = action2 == 0 ? 1 : 0;
                this.f8888a = motionEvent.getPointerId(i2);
                this.f8893f = motionEvent.getX(i2);
                this.f8894g = motionEvent.getY(i2);
            }
        }
        int i3 = this.f8888a;
        this.f8889b = motionEvent.findPointerIndex(i3 != -1 ? i3 : 0);
        return true;
    }
}
