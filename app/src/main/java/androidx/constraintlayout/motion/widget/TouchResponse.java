package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
class TouchResponse {

    /* renamed from: c */
    public static final float[][] f2661c = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: d */
    public static final float[][] f2662d = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a */
    public float f2663a;

    /* renamed from: b */
    public float f2664b;

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$1 */
    class ViewOnTouchListenerC02031 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$2 */
    class C02042 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        /* renamed from: a */
        public void mo363a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        }
    }

    public String toString() {
        if (Float.isNaN(this.f2663a)) {
            return "rotation";
        }
        return this.f2663a + " , " + this.f2664b;
    }
}
