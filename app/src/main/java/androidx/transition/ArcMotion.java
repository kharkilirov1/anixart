package androidx.transition;

import android.graphics.Path;
import androidx.annotation.NonNull;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: b */
    public static final float f6131b = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    public float f6132a = f6131b;

    @Override // androidx.transition.PathMotion
    @NonNull
    /* renamed from: a */
    public Path mo4184a(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f2 + f4) / 2.0f;
        float f12 = (f3 + f5) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f3 > f5;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f7 = f5 + abs;
                f6 = f4;
            } else {
                f7 = abs + f3;
                f6 = f2;
            }
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2 + f14;
                f7 = f3;
            } else {
                f6 = f4 - f14;
                f7 = f5;
            }
        }
        float f15 = f13 * 0.0f * 0.0f;
        float f16 = f11 - f6;
        float f17 = f12 - f7;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = this.f6132a;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f6 = C0000a.m4a(f6, f11, sqrt, f11);
            f7 = C0000a.m4a(f7, f12, sqrt, f12);
        }
        path.cubicTo((f2 + f6) / 2.0f, (f3 + f7) / 2.0f, (f6 + f4) / 2.0f, (f7 + f5) / 2.0f, f4, f5);
        return path;
    }
}
