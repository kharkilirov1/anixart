package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: b */
    public MotionLayout f2734b;

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.f2734b == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2734b = (MotionLayout) parent;
                return;
            }
            return;
        }
        getWidth();
        getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        float f2 = fArr[0];
        float f3 = fArr[0];
        float f4 = this.f2734b.f2572E;
        throw null;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
