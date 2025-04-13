package com.google.android.material.transition.platform;

import androidx.annotation.AttrRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi
/* loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Axis {
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: d */
    public int mo10628d(boolean z) {
        return C2507R.attr.motionDurationLong1;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: e */
    public int mo10629e(boolean z) {
        return C2507R.attr.motionEasingEmphasizedInterpolator;
    }
}
