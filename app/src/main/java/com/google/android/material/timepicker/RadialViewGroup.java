package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1195R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: t */
    public final Runnable f19237t;

    /* renamed from: u */
    public int f19238u;

    /* renamed from: v */
    public MaterialShapeDrawable f19239v;

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.m2203i());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f19237t);
            handler.post(this.f19237t);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo10539t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f19237t);
            handler.post(this.f19237t);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        this.f19239v.m10301x(ColorStateList.valueOf(i2));
    }

    /* renamed from: t */
    public void mo10539t() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.m1451c(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != C2507R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(C2507R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f19238u * 0.66f) : this.f19238u;
            Iterator it = list.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                ConstraintSet.Layout layout = constraintSet.m1454f(((View) it.next()).getId()).f2887e;
                layout.f2904A = C2507R.id.circle_center;
                layout.f2905B = round;
                layout.f2906C = f2;
                f2 += 360.0f / list.size();
            }
        }
        constraintSet.m1450b(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(C2507R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f19239v = materialShapeDrawable;
        materialShapeDrawable.m10299v(new RelativeCornerSize(0.5f));
        this.f19239v.m10301x(ColorStateList.valueOf(-1));
        ViewCompat.m2204i0(this, this.f19239v);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17306G, i2, 0);
        this.f19238u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f19237t = new Runnable() { // from class: com.google.android.material.timepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.mo10539t();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
