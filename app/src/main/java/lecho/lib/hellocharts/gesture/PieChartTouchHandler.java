package lecho.lib.hellocharts.gesture;

import android.content.Context;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.widget.ScrollerCompat;
import lecho.lib.hellocharts.view.PieChartView;

/* loaded from: classes3.dex */
public class PieChartTouchHandler extends ChartTouchHandler {

    /* renamed from: q */
    public ScrollerCompat f68558q;

    /* renamed from: r */
    public PieChartView f68559r;

    /* renamed from: s */
    public boolean f68560s;

    public class ChartGestureListener extends GestureDetector.SimpleOnGestureListener {
        public ChartGestureListener(C68591 c68591) {
        }

        /* renamed from: a */
        public final float m34436a(float f2, float f3, float f4, float f5) {
            return Math.signum((f4 * f3) + ((-f5) * f2)) * ((float) Math.sqrt((f3 * f3) + (f2 * f2)));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            PieChartTouchHandler pieChartTouchHandler = PieChartTouchHandler.this;
            if (!pieChartTouchHandler.f68560s) {
                return false;
            }
            pieChartTouchHandler.f68558q.f3852a.abortAnimation();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            PieChartTouchHandler pieChartTouchHandler = PieChartTouchHandler.this;
            if (!pieChartTouchHandler.f68560s) {
                return false;
            }
            RectF circleOval = pieChartTouchHandler.f68559r.getCircleOval();
            float m34436a = m34436a(f2, f3, motionEvent2.getX() - circleOval.centerX(), motionEvent2.getY() - circleOval.centerY());
            PieChartTouchHandler.this.f68558q.f3852a.abortAnimation();
            PieChartTouchHandler pieChartTouchHandler2 = PieChartTouchHandler.this;
            pieChartTouchHandler2.f68558q.m2638a(0, pieChartTouchHandler2.f68559r.getChartRotation(), 0, ((int) m34436a) / 4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            PieChartTouchHandler pieChartTouchHandler = PieChartTouchHandler.this;
            if (!pieChartTouchHandler.f68560s) {
                return false;
            }
            RectF circleOval = pieChartTouchHandler.f68559r.getCircleOval();
            float m34436a = m34436a(f2, f3, motionEvent2.getX() - circleOval.centerX(), motionEvent2.getY() - circleOval.centerY());
            PieChartView pieChartView = PieChartTouchHandler.this.f68559r;
            pieChartView.m34501e(pieChartView.getChartRotation() - (((int) m34436a) / 4), false);
            return true;
        }
    }

    public class ChartScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ChartScaleGestureListener(PieChartTouchHandler pieChartTouchHandler, C68591 c68591) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }
    }

    public PieChartTouchHandler(Context context, PieChartView pieChartView) {
        super(context, pieChartView);
        this.f68560s = true;
        this.f68559r = pieChartView;
        this.f68558q = new ScrollerCompat(context, null);
        this.f68531a = new GestureDetector(context, new ChartGestureListener(null));
        this.f68532b = new ScaleGestureDetector(context, new ChartScaleGestureListener(this, null));
        this.f68538h = false;
    }

    @Override // lecho.lib.hellocharts.gesture.ChartTouchHandler
    /* renamed from: b */
    public boolean mo34432b() {
        if (this.f68560s && this.f68558q.f3852a.computeScrollOffset()) {
            this.f68559r.m34501e(this.f68558q.f3852a.getCurrY(), false);
        }
        return false;
    }

    @Override // lecho.lib.hellocharts.gesture.ChartTouchHandler
    /* renamed from: c */
    public boolean mo34433c(MotionEvent motionEvent) {
        boolean mo34433c = super.mo34433c(motionEvent);
        return this.f68560s ? this.f68531a.onTouchEvent(motionEvent) || mo34433c : mo34433c;
    }
}
