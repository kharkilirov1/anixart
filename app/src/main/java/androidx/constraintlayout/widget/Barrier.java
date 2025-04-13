package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: j */
    public int f2735j;

    /* renamed from: k */
    public int f2736k;

    /* renamed from: l */
    public androidx.constraintlayout.core.widgets.Barrier f2737l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f2737l.f2114H0;
    }

    public int getMargin() {
        return this.f2737l.f2115I0;
    }

    public int getType() {
        return this.f2735j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        this.f2737l = new androidx.constraintlayout.core.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f2737l.f2114H0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f2737l.f2115I0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2759e = this.f2737l;
        m1429p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    public void mo1379m(ConstraintWidget constraintWidget, boolean z) {
        m1417q(constraintWidget, this.f2735j, z);
    }

    /* renamed from: q */
    public final void m1417q(ConstraintWidget constraintWidget, int i2, boolean z) {
        this.f2736k = i2;
        if (z) {
            int i3 = this.f2735j;
            if (i3 == 5) {
                this.f2736k = 1;
            } else if (i3 == 6) {
                this.f2736k = 0;
            }
        } else {
            int i4 = this.f2735j;
            if (i4 == 5) {
                this.f2736k = 0;
            } else if (i4 == 6) {
                this.f2736k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).f2113G0 = this.f2736k;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2737l.f2114H0 = z;
    }

    public void setDpMargin(int i2) {
        this.f2737l.f2115I0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f2737l.f2115I0 = i2;
    }

    public void setType(int i2) {
        this.f2735j = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
