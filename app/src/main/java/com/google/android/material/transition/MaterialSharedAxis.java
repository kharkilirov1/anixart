package com.google.android.material.transition;

import androidx.annotation.AttrRes;
import androidx.annotation.RestrictTo;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Axis {
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: Y */
    public int mo10594Y(boolean z) {
        return C2507R.attr.motionDurationLong1;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: Z */
    public int mo10595Z(boolean z) {
        return C2507R.attr.motionEasingEmphasizedInterpolator;
    }
}
