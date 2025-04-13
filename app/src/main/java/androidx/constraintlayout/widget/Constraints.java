package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: b */
    public ConstraintSet f3007b;

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f3007b == null) {
            this.f3007b = new ConstraintSet();
        }
        ConstraintSet constraintSet = this.f3007b;
        Objects.requireNonNull(constraintSet);
        int childCount = getChildCount();
        constraintSet.f2882c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (constraintSet.f2881b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!constraintSet.f2882c.containsKey(Integer.valueOf(id2))) {
                constraintSet.f2882c.put(Integer.valueOf(id2), new ConstraintSet.Constraint());
            }
            ConstraintSet.Constraint constraint = constraintSet.f2882c.get(Integer.valueOf(id2));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    constraint.m1459d(id2, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        ConstraintSet.Layout layout = constraint.f2887e;
                        layout.f2947i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        layout.f2943g0 = barrier.getType();
                        constraint.f2887e.f2949j0 = barrier.getReferencedIds();
                        constraint.f2887e.f2945h0 = barrier.getMargin();
                    }
                }
                constraint.m1459d(id2, layoutParams);
            }
        }
        return this.f3007b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f3008A0;

        /* renamed from: B0 */
        public float f3009B0;

        /* renamed from: C0 */
        public float f3010C0;

        /* renamed from: D0 */
        public float f3011D0;

        /* renamed from: r0 */
        public float f3012r0;

        /* renamed from: s0 */
        public boolean f3013s0;

        /* renamed from: t0 */
        public float f3014t0;

        /* renamed from: u0 */
        public float f3015u0;

        /* renamed from: v0 */
        public float f3016v0;

        /* renamed from: w0 */
        public float f3017w0;

        /* renamed from: x0 */
        public float f3018x0;

        /* renamed from: y0 */
        public float f3019y0;

        /* renamed from: z0 */
        public float f3020z0;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f3012r0 = 1.0f;
            this.f3013s0 = false;
            this.f3014t0 = 0.0f;
            this.f3015u0 = 0.0f;
            this.f3016v0 = 0.0f;
            this.f3017w0 = 0.0f;
            this.f3018x0 = 1.0f;
            this.f3019y0 = 1.0f;
            this.f3020z0 = 0.0f;
            this.f3008A0 = 0.0f;
            this.f3009B0 = 0.0f;
            this.f3010C0 = 0.0f;
            this.f3011D0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3012r0 = 1.0f;
            this.f3013s0 = false;
            this.f3014t0 = 0.0f;
            this.f3015u0 = 0.0f;
            this.f3016v0 = 0.0f;
            this.f3017w0 = 0.0f;
            this.f3018x0 = 1.0f;
            this.f3019y0 = 1.0f;
            this.f3020z0 = 0.0f;
            this.f3008A0 = 0.0f;
            this.f3009B0 = 0.0f;
            this.f3010C0 = 0.0f;
            this.f3011D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.f3028d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.f3012r0 = obtainStyledAttributes.getFloat(index, this.f3012r0);
                } else if (index == 28) {
                    this.f3014t0 = obtainStyledAttributes.getFloat(index, this.f3014t0);
                    this.f3013s0 = true;
                } else if (index == 23) {
                    this.f3016v0 = obtainStyledAttributes.getFloat(index, this.f3016v0);
                } else if (index == 24) {
                    this.f3017w0 = obtainStyledAttributes.getFloat(index, this.f3017w0);
                } else if (index == 22) {
                    this.f3015u0 = obtainStyledAttributes.getFloat(index, this.f3015u0);
                } else if (index == 20) {
                    this.f3018x0 = obtainStyledAttributes.getFloat(index, this.f3018x0);
                } else if (index == 21) {
                    this.f3019y0 = obtainStyledAttributes.getFloat(index, this.f3019y0);
                } else if (index == 16) {
                    this.f3020z0 = obtainStyledAttributes.getFloat(index, this.f3020z0);
                } else if (index == 17) {
                    this.f3008A0 = obtainStyledAttributes.getFloat(index, this.f3008A0);
                } else if (index == 18) {
                    this.f3009B0 = obtainStyledAttributes.getFloat(index, this.f3009B0);
                } else if (index == 19) {
                    this.f3010C0 = obtainStyledAttributes.getFloat(index, this.f3010C0);
                } else if (index == 27) {
                    this.f3011D0 = obtainStyledAttributes.getFloat(index, this.f3011D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
