package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: l */
    public androidx.constraintlayout.core.widgets.Flow f2424l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        this.f2424l = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2424l.f2284j1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.core.widgets.Flow flow = this.f2424l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow.f2320G0 = dimensionPixelSize;
                    flow.f2321H0 = dimensionPixelSize;
                    flow.f2322I0 = dimensionPixelSize;
                    flow.f2323J0 = dimensionPixelSize;
                } else if (index == 18) {
                    androidx.constraintlayout.core.widgets.Flow flow2 = this.f2424l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    flow2.f2322I0 = dimensionPixelSize2;
                    flow2.f2324K0 = dimensionPixelSize2;
                    flow2.f2325L0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2424l.f2323J0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2424l.f2324K0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2424l.f2320G0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2424l.f2325L0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2424l.f2321H0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2424l.f2282h1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2424l.f2266R0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2424l.f2267S0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2424l.f2268T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2424l.f2270V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2424l.f2269U0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2424l.f2271W0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2424l.f2272X0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2424l.f2274Z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2424l.f2276b1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2424l.f2275a1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2424l.f2277c1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2424l.f2273Y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2424l.f2280f1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2424l.f2281g1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2424l.f2278d1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2424l.f2279e1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2424l.f2283i1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2759e = this.f2424l;
        m1429p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    public void mo1379m(ConstraintWidget constraintWidget, boolean z) {
        androidx.constraintlayout.core.widgets.Flow flow = this.f2424l;
        int i2 = flow.f2322I0;
        if (i2 > 0 || flow.f2323J0 > 0) {
            if (z) {
                flow.f2324K0 = flow.f2323J0;
                flow.f2325L0 = i2;
            } else {
                flow.f2324K0 = i2;
                flow.f2325L0 = flow.f2323J0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint
    public void onMeasure(int i2, int i3) {
        mo1380q(this.f2424l, i2, i3);
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

    public void setFirstHorizontalBias(float f2) {
        this.f2424l.f2274Z0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f2424l.f2268T0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f2424l.f2275a1 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f2424l.f2269U0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f2424l.f2280f1 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f2424l.f2272X0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f2424l.f2278d1 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f2424l.f2266R0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f2424l.f2276b1 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f2424l.f2270V0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f2424l.f2277c1 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f2424l.f2271W0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f2424l.f2283i1 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f2424l.f2284j1 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        androidx.constraintlayout.core.widgets.Flow flow = this.f2424l;
        flow.f2320G0 = i2;
        flow.f2321H0 = i2;
        flow.f2322I0 = i2;
        flow.f2323J0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f2424l.f2321H0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f2424l.f2324K0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f2424l.f2325L0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f2424l.f2320G0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f2424l.f2281g1 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f2424l.f2273Y0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f2424l.f2279e1 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f2424l.f2267S0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f2424l.f2282h1 = i2;
        requestLayout();
    }
}
