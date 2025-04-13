package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1195R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes.dex */
final class CalendarItemStyle {

    /* renamed from: a */
    @NonNull
    public final Rect f17907a;

    /* renamed from: b */
    public final ColorStateList f17908b;

    /* renamed from: c */
    public final ColorStateList f17909c;

    /* renamed from: d */
    public final ColorStateList f17910d;

    /* renamed from: e */
    public final int f17911e;

    /* renamed from: f */
    public final ShapeAppearanceModel f17912f;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, ShapeAppearanceModel shapeAppearanceModel, @NonNull Rect rect) {
        Preconditions.m2030c(rect.left);
        Preconditions.m2030c(rect.top);
        Preconditions.m2030c(rect.right);
        Preconditions.m2030c(rect.bottom);
        this.f17907a = rect;
        this.f17908b = colorStateList2;
        this.f17909c = colorStateList;
        this.f17910d = colorStateList3;
        this.f17911e = i2;
        this.f17912f = shapeAppearanceModel;
    }

    @NonNull
    /* renamed from: a */
    public static CalendarItemStyle m9975a(@NonNull Context context, @StyleRes int i2) {
        Preconditions.m2028a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C1195R.styleable.f17338w);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList m10240a = MaterialResources.m10240a(context, obtainStyledAttributes, 4);
        ColorStateList m10240a2 = MaterialResources.m10240a(context, obtainStyledAttributes, 9);
        ColorStateList m10240a3 = MaterialResources.m10240a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        ShapeAppearanceModel m10320a = ShapeAppearanceModel.m10311a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).m10320a();
        obtainStyledAttributes.recycle();
        return new CalendarItemStyle(m10240a, m10240a2, m10240a3, dimensionPixelSize, m10320a, rect);
    }

    /* renamed from: b */
    public void m9976b(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f17912f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f17912f);
        materialShapeDrawable.m10301x(this.f17909c);
        materialShapeDrawable.m10274F(this.f17911e, this.f17910d);
        textView.setTextColor(this.f17908b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f17908b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f17907a;
        ViewCompat.m2204i0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
