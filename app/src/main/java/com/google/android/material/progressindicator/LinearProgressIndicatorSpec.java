package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ThemeEnforcement;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {

    /* renamed from: g */
    public int f18577g;

    /* renamed from: h */
    public int f18578h;

    /* renamed from: i */
    public boolean f18579i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.linearProgressIndicatorStyle, C2507R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i2 = LinearProgressIndicator.f18576o;
        int[] iArr = C1195R.styleable.f17333r;
        ThemeEnforcement.m10156a(context, attributeSet, C2507R.attr.linearProgressIndicatorStyle, C2507R.style.Widget_MaterialComponents_LinearProgressIndicator);
        ThemeEnforcement.m10157b(context, attributeSet, iArr, C2507R.attr.linearProgressIndicatorStyle, C2507R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C2507R.attr.linearProgressIndicatorStyle, C2507R.style.Widget_MaterialComponents_LinearProgressIndicator);
        this.f18577g = obtainStyledAttributes.getInt(0, 1);
        this.f18578h = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        mo10210a();
        this.f18579i = this.f18578h == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    /* renamed from: a */
    public void mo10210a() {
        if (this.f18577g == 0) {
            if (this.f18502b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f18503c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
