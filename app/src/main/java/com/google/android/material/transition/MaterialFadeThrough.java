package com.google.android.material.transition;

import androidx.annotation.AttrRes;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialFadeThrough() {
        /*
            r3 = this;
            com.google.android.material.transition.FadeThroughProvider r0 = new com.google.android.material.transition.FadeThroughProvider
            r0.<init>()
            com.google.android.material.transition.ScaleProvider r1 = new com.google.android.material.transition.ScaleProvider
            r1.<init>()
            r2 = 0
            r1.f19445f = r2
            r2 = 1064011039(0x3f6b851f, float:0.92)
            r1.f19442c = r2
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialFadeThrough.<init>():void");
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
