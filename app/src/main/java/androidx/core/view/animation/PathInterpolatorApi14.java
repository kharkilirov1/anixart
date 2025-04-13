package androidx.core.view.animation;

import android.view.animation.Interpolator;
import p000a.C0000a;

/* loaded from: classes.dex */
class PathInterpolatorApi14 implements Interpolator {

    /* renamed from: a */
    public final float[] f3766a;

    /* renamed from: b */
    public final float[] f3767b;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f3766a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f3766a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f3766a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f3767b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f3767b;
        float f5 = fArr2[i2];
        return C0000a.m4a(fArr2[length], f5, f4, f5);
    }
}
