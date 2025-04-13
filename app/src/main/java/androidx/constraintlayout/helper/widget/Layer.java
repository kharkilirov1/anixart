package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: j */
    public float f2425j;

    /* renamed from: k */
    public float f2426k;

    /* renamed from: l */
    public float f2427l;

    /* renamed from: m */
    public ConstraintLayout f2428m;

    /* renamed from: n */
    public float f2429n;

    /* renamed from: o */
    public float f2430o;

    /* renamed from: p */
    public float f2431p;

    /* renamed from: q */
    public float f2432q;

    /* renamed from: r */
    public float f2433r;

    /* renamed from: s */
    public float f2434s;

    /* renamed from: t */
    public float f2435t;

    /* renamed from: u */
    public float f2436u;

    /* renamed from: v */
    public View[] f2437v;

    /* renamed from: w */
    public float f2438w;

    /* renamed from: x */
    public float f2439x;

    /* renamed from: y */
    public boolean f2440y;

    /* renamed from: z */
    public boolean f2441z;

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
                    this.f2440y = true;
                } else if (index == 22) {
                    this.f2441z = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo1382n(ConstraintLayout constraintLayout) {
        m1385r();
        this.f2431p = Float.NaN;
        this.f2432q = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f2842q0;
        constraintWidget.m1267X(0);
        constraintWidget.m1262S(0);
        m1384q();
        layout(((int) this.f2435t) - getPaddingLeft(), ((int) this.f2436u) - getPaddingTop(), getPaddingRight() + ((int) this.f2433r), getPaddingBottom() + ((int) this.f2434s));
        m1386s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo1383o(ConstraintLayout constraintLayout) {
        this.f2428m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f2427l = rotation;
        } else {
            if (Float.isNaN(this.f2427l)) {
                return;
            }
            this.f2427l = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2428m = (ConstraintLayout) getParent();
        if (this.f2440y || this.f2441z) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f2757c; i2++) {
                View m1433e = this.f2428m.m1433e(this.f2756b[i2]);
                if (m1433e != null) {
                    if (this.f2440y) {
                        m1433e.setVisibility(visibility);
                    }
                    if (this.f2441z && elevation > 0.0f) {
                        m1433e.setTranslationZ(m1433e.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void m1384q() {
        if (this.f2428m == null) {
            return;
        }
        if (Float.isNaN(this.f2431p) || Float.isNaN(this.f2432q)) {
            if (!Float.isNaN(this.f2425j) && !Float.isNaN(this.f2426k)) {
                this.f2432q = this.f2426k;
                this.f2431p = this.f2425j;
                return;
            }
            View[] m1428k = m1428k(this.f2428m);
            int left = m1428k[0].getLeft();
            int top = m1428k[0].getTop();
            int right = m1428k[0].getRight();
            int bottom = m1428k[0].getBottom();
            for (int i2 = 0; i2 < this.f2757c; i2++) {
                View view = m1428k[i2];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f2433r = right;
            this.f2434s = bottom;
            this.f2435t = left;
            this.f2436u = top;
            if (Float.isNaN(this.f2425j)) {
                this.f2431p = (left + right) / 2;
            } else {
                this.f2431p = this.f2425j;
            }
            if (Float.isNaN(this.f2426k)) {
                this.f2432q = (top + bottom) / 2;
            } else {
                this.f2432q = this.f2426k;
            }
        }
    }

    /* renamed from: r */
    public final void m1385r() {
        int i2;
        if (this.f2428m == null || (i2 = this.f2757c) == 0) {
            return;
        }
        View[] viewArr = this.f2437v;
        if (viewArr == null || viewArr.length != i2) {
            this.f2437v = new View[i2];
        }
        for (int i3 = 0; i3 < this.f2757c; i3++) {
            this.f2437v[i3] = this.f2428m.m1433e(this.f2756b[i3]);
        }
    }

    /* renamed from: s */
    public final void m1386s() {
        if (this.f2428m == null) {
            return;
        }
        if (this.f2437v == null) {
            m1385r();
        }
        m1384q();
        double radians = Float.isNaN(this.f2427l) ? 0.0d : Math.toRadians(this.f2427l);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f2 = this.f2429n;
        float f3 = f2 * cos;
        float f4 = this.f2430o;
        float f5 = (-f4) * sin;
        float f6 = f2 * sin;
        float f7 = f4 * cos;
        for (int i2 = 0; i2 < this.f2757c; i2++) {
            View view = this.f2437v[i2];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f8 = right - this.f2431p;
            float f9 = bottom - this.f2432q;
            float f10 = (((f5 * f9) + (f3 * f8)) - f8) + this.f2438w;
            float f11 = (((f7 * f9) + (f8 * f6)) - f9) + this.f2439x;
            view.setTranslationX(f10);
            view.setTranslationY(f11);
            view.setScaleY(this.f2430o);
            view.setScaleX(this.f2429n);
            if (!Float.isNaN(this.f2427l)) {
                view.setRotation(this.f2427l);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m1424f();
    }

    @Override // android.view.View
    public void setPivotX(float f2) {
        this.f2425j = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setPivotY(float f2) {
        this.f2426k = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setRotation(float f2) {
        this.f2427l = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        this.f2429n = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        this.f2430o = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        this.f2438w = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        this.f2439x = f2;
        m1386s();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        m1424f();
    }
}
