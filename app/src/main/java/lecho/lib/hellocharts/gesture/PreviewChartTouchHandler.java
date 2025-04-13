package lecho.lib.hellocharts.gesture;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import lecho.lib.hellocharts.gesture.ChartTouchHandler;

/* loaded from: classes3.dex */
public class PreviewChartTouchHandler extends ChartTouchHandler {

    public class ChartScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            throw null;
        }
    }

    public class PreviewChartGestureListener extends ChartTouchHandler.ChartGestureListener {
        @Override // lecho.lib.hellocharts.gesture.ChartTouchHandler.ChartGestureListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return super.onFling(motionEvent, motionEvent2, -f2, -f3);
        }

        @Override // lecho.lib.hellocharts.gesture.ChartTouchHandler.ChartGestureListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return super.onScroll(motionEvent, motionEvent2, -f2, -f3);
        }
    }
}
