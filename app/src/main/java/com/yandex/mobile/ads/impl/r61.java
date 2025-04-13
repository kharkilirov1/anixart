package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.yandex.mobile.ads.impl.l31;
import com.yandex.mobile.ads.impl.ro0;

/* loaded from: classes3.dex */
final class r61 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ro0.InterfaceC5702a {

    /* renamed from: c */
    private final InterfaceC5675a f54214c;

    /* renamed from: e */
    private final GestureDetector f54216e;

    /* renamed from: a */
    private final PointF f54212a = new PointF();

    /* renamed from: b */
    private final PointF f54213b = new PointF();

    /* renamed from: d */
    private final float f54215d = 25.0f;

    /* renamed from: f */
    private volatile float f54217f = 3.1415927f;

    /* renamed from: com.yandex.mobile.ads.impl.r61$a */
    public interface InterfaceC5675a {
    }

    public r61(Context context, InterfaceC5675a interfaceC5675a) {
        this.f54214c = interfaceC5675a;
        this.f54216e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.ro0.InterfaceC5702a
    @BinderThread
    /* renamed from: a */
    public final void mo26348a(float[] fArr, float f2) {
        this.f54217f = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f54212a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f54212a.x) / this.f54215d;
        float y = motionEvent2.getY();
        PointF pointF = this.f54212a;
        float f4 = (y - pointF.y) / this.f54215d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f54217f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f54213b;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = (cos * f4) + (sin * x) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        ((l31.C5374a) this.f54214c).m26347a(this.f54213b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return l31.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f54216e.onTouchEvent(motionEvent);
    }
}
