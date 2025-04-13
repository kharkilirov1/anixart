package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import p000a.C0000a;

/* loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* renamed from: b */
    public float f17573b;

    /* renamed from: c */
    public float f17574c;

    /* renamed from: d */
    public float f17575d;

    /* renamed from: e */
    public float f17576e;

    /* renamed from: f */
    public float f17577f;

    /* renamed from: g */
    public float f17578g;

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: b */
    public void mo9836b(float f2, float f3, float f4, @NonNull ShapePath shapePath) {
        float f5;
        float f6;
        float f7 = this.f17575d;
        if (f7 == 0.0f) {
            shapePath.m10333d(f2, 0.0f);
            return;
        }
        float f8 = ((this.f17574c * 2.0f) + f7) / 2.0f;
        float f9 = f4 * this.f17573b;
        float f10 = f3 + this.f17577f;
        float m4a = C0000a.m4a(1.0f, f4, f8, this.f17576e * f4);
        if (m4a / f8 >= 1.0f) {
            shapePath.m10333d(f2, 0.0f);
            return;
        }
        float f11 = this.f17578g;
        float f12 = f11 * f4;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f7) < 0.1f;
        if (z) {
            f5 = 0.0f;
            f6 = m4a;
        } else {
            f5 = 1.75f;
            f6 = 0.0f;
        }
        float f13 = f8 + f9;
        float f14 = f6 + f9;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f10 - sqrt;
        float f16 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        shapePath.m10333d(f15, 0.0f);
        float f18 = f9 * 2.0f;
        shapePath.m10330a(f15 - f9, 0.0f, f15 + f9, f18, 270.0f, degrees);
        if (z) {
            shapePath.m10330a(f10 - f8, (-f8) - f6, f10 + f8, f8 - f6, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f17574c;
            float f20 = f12 * 2.0f;
            float f21 = f10 - f8;
            shapePath.m10330a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f10 + f8;
            float f23 = this.f17574c;
            shapePath.m10333d(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f17574c;
            shapePath.m10330a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        shapePath.m10330a(f16 - f9, 0.0f, f16 + f9, f18, 270.0f - degrees, degrees);
        shapePath.m10333d(f2, 0.0f);
    }
}
