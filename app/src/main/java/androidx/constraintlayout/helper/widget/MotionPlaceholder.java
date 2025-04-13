package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        this.f2759e = new Placeholder();
        m1429p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint
    public void onMeasure(int i2, int i3) {
        mo1380q(null, i2, i3);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: q */
    public void mo1380q(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.mo1303c0(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.f2327N0, virtualLayout.f2328O0);
        }
    }
}
