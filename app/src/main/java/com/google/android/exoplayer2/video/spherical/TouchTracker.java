package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.google.android.exoplayer2.video.spherical.OrientationListener;

/* loaded from: classes.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {

    /* renamed from: d */
    public final Listener f14998d;

    /* renamed from: e */
    public final float f14999e;

    /* renamed from: f */
    public final GestureDetector f15000f;

    /* renamed from: b */
    public final PointF f14996b = new PointF();

    /* renamed from: c */
    public final PointF f14997c = new PointF();

    /* renamed from: g */
    public volatile float f15001g = 3.1415927f;

    public interface Listener {
        /* renamed from: b */
        void mo7827b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public TouchTracker(Context context, Listener listener, float f2) {
        this.f14998d = listener;
        this.f14999e = f2;
        this.f15000f = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    @BinderThread
    /* renamed from: a */
    public void mo7822a(float[] fArr, float f2) {
        this.f15001g = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f14996b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f14996b.x) / this.f14999e;
        float y = motionEvent2.getY();
        PointF pointF = this.f14996b;
        float f4 = (y - pointF.y) / this.f14999e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f15001g;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f14997c;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = (cos * f4) + (sin * x) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        this.f14998d.mo7827b(this.f14997c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f14998d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f15000f.onTouchEvent(motionEvent);
    }
}
