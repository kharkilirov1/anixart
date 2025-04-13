package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public final class MaterialFade extends MaterialVisibility<FadeProvider> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialFade() {
        /*
            r3 = this;
            com.google.android.material.transition.FadeProvider r0 = new com.google.android.material.transition.FadeProvider
            r0.<init>()
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.f19344a = r1
            com.google.android.material.transition.ScaleProvider r1 = new com.google.android.material.transition.ScaleProvider
            r1.<init>()
            r2 = 0
            r1.f19445f = r2
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r1.f19442c = r2
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.MaterialFade.<init>():void");
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    /* renamed from: X */
    public TimeInterpolator mo10593X(boolean z) {
        return AnimationUtils.f17342a;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: Y */
    public int mo10594Y(boolean z) {
        return z ? C2507R.attr.motionDurationMedium4 : C2507R.attr.motionDurationShort3;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    /* renamed from: Z */
    public int mo10595Z(boolean z) {
        return z ? C2507R.attr.motionEasingEmphasizedDecelerateInterpolator : C2507R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }
}
