package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final EdgeTreatment f18680a;

    /* renamed from: b */
    public final float f18681b;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f2) {
        this.f18680a = edgeTreatment;
        this.f18681b = f2;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: a */
    public boolean mo10267a() {
        return this.f18680a.mo10267a();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public void mo9836b(float f2, float f3, float f4, @NonNull ShapePath shapePath) {
        this.f18680a.mo9836b(f2, f3 - this.f18681b, f4, shapePath);
    }
}
