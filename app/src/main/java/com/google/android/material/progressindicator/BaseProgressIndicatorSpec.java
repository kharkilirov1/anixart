package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C1195R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {

    /* renamed from: a */
    @Px
    public int f18501a;

    /* renamed from: b */
    @Px
    public int f18502b;

    /* renamed from: c */
    @NonNull
    public int[] f18503c;

    /* renamed from: d */
    @ColorInt
    public int f18504d;

    /* renamed from: e */
    public int f18505e;

    /* renamed from: f */
    public int f18506f;

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        this.f18503c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_progress_track_thickness);
        int[] iArr = C1195R.styleable.f17319d;
        ThemeEnforcement.m10156a(context, attributeSet, i2, i3);
        ThemeEnforcement.m10157b(context, attributeSet, iArr, i2, i3, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        this.f18501a = MaterialResources.m10242c(context, obtainStyledAttributes, 8, dimensionPixelSize);
        this.f18502b = Math.min(MaterialResources.m10242c(context, obtainStyledAttributes, 7, 0), this.f18501a / 2);
        this.f18505e = obtainStyledAttributes.getInt(4, 0);
        this.f18506f = obtainStyledAttributes.getInt(1, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.f18503c = new int[]{MaterialColors.m9969b(context, C2507R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.f18503c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.f18503c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f18504d = obtainStyledAttributes.getColor(6, -1);
        } else {
            this.f18504d = this.f18503c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f2 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f18504d = MaterialColors.m9968a(this.f18504d, (int) (f2 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public abstract void mo10210a();
}
