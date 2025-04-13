package com.google.android.material.transition.platform;

import androidx.annotation.AttrRes;
import androidx.annotation.RequiresApi;
import com.swiftsoft.anixartd.C2507R;

@RequiresApi
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
            com.google.android.material.transition.platform.FadeThroughProvider r0 = new com.google.android.material.transition.platform.FadeThroughProvider
            r0.<init>()
            com.google.android.material.transition.platform.ScaleProvider r1 = new com.google.android.material.transition.platform.ScaleProvider
            r1.<init>()
            r2 = 0
            r1.f19576f = r2
            r2 = 1064011039(0x3f6b851f, float:0.92)
            r1.f19573c = r2
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialFadeThrough.<init>():void");
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
