package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final float f18631a;

    public MarkerEdgeTreatment(float f2) {
        this.f18631a = f2 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public void mo9836b(float f2, float f3, float f4, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.f18631a) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f18631a, 2.0d) - Math.pow(sqrt, 2.0d));
        shapePath.m10335f(f3 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.f18631a) - this.f18631a))) + sqrt2);
        shapePath.m10333d(f3, (float) (-((Math.sqrt(2.0d) * this.f18631a) - this.f18631a)));
        shapePath.m10333d(f3 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.f18631a) - this.f18631a))) + sqrt2);
    }
}
