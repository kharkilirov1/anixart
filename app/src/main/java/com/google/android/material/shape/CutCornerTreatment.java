package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class CutCornerTreatment extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    /* renamed from: a */
    public void mo10266a(@NonNull ShapePath shapePath, float f2, float f3, float f4) {
        shapePath.m10336g(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d = f4;
        double d2 = f3;
        shapePath.m10333d((float) (Math.sin(Math.toRadians(f2)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d * d2));
    }
}
