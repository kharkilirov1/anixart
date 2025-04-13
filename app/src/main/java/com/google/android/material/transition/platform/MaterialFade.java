package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.swiftsoft.anixartd.C2507R;

@RequiresApi
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
            com.google.android.material.transition.platform.FadeProvider r0 = new com.google.android.material.transition.platform.FadeProvider
            r0.<init>()
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0.f19466a = r1
            com.google.android.material.transition.platform.ScaleProvider r1 = new com.google.android.material.transition.platform.ScaleProvider
            r1.<init>()
            r2 = 0
            r1.f19576f = r2
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r1.f19573c = r2
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialFade.<init>():void");
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @NonNull
    /* renamed from: c */
    public TimeInterpolator mo10627c(boolean z) {
        return AnimationUtils.f17342a;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: d */
    public int mo10628d(boolean z) {
        return z ? C2507R.attr.motionDurationMedium4 : C2507R.attr.motionDurationShort3;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @AttrRes
    /* renamed from: e */
    public int mo10629e(boolean z) {
        return z ? C2507R.attr.motionEasingEmphasizedDecelerateInterpolator : C2507R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }
}
