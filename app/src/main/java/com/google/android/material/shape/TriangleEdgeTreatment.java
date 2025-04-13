package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public void mo9836b(float f2, float f3, float f4, @NonNull ShapePath shapePath) {
        float f5 = 0.0f * f4;
        shapePath.m10334e(f3 - f5, 0.0f, f3, (-0.0f) * f4);
        shapePath.m10334e(f3 + f5, 0.0f, f2, 0.0f);
    }
}
