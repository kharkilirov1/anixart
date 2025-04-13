package androidx.vectordrawable.graphics.drawable;

import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class PathInterpolatorCompat implements Interpolator {

    /* renamed from: a */
    public float[] f6406a;

    /* renamed from: b */
    public float[] f6407b;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f6406a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f6406a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f6406a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f6407b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f6407b;
        float f5 = fArr2[i2];
        return C0000a.m4a(fArr2[length], f5, f4, f5);
    }
}
