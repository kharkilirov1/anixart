package androidx.constraintlayout.widget;

import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: h */
    public void mo1381h(ConstraintLayout constraintLayout) {
        m1425g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo1382n(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2842q0.m1267X(0);
        layoutParams.f2842q0.m1262S(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1424f();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m1424f();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        m1424f();
    }
}
