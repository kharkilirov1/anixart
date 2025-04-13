package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    /* renamed from: a */
    public void mo10266a(@NonNull ShapePath shapePath, float f2, float f3, float f4) {
        shapePath.m10336g(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        float f5 = f4 * 2.0f * f3;
        shapePath.m10330a(0.0f, 0.0f, f5, f5, 180.0f, f2);
    }
}
