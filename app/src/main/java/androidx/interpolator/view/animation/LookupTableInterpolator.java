package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import p000a.C0000a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a */
    public final float[] f4539a;

    /* renamed from: b */
    public final float f4540b;

    public LookupTableInterpolator(float[] fArr) {
        this.f4539a = fArr;
        this.f4540b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4539a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f4540b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.f4539a;
        return C0000a.m4a(fArr2[min + 1], fArr2[min], f4, fArr2[min]);
    }
}
