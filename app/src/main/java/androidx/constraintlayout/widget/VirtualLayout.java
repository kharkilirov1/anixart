package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: j */
    public boolean f3040j;

    /* renamed from: k */
    public boolean f3041k;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: h */
    public void mo1381h(ConstraintLayout constraintLayout) {
        m1425g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f3040j = true;
                } else if (index == 22) {
                    this.f3041k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3040j || this.f3041k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f2757c; i2++) {
                    View m1433e = constraintLayout.m1433e(this.f2756b[i2]);
                    if (m1433e != null) {
                        if (this.f3040j) {
                            m1433e.setVisibility(visibility);
                        }
                        if (this.f3041k && elevation > 0.0f) {
                            m1433e.setTranslationZ(m1433e.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo1380q(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i2, int i3) {
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
