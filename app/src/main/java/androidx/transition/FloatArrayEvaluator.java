package androidx.transition;

import android.animation.TypeEvaluator;
import p000a.C0000a;

/* loaded from: classes.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f6206a;

    public FloatArrayEvaluator(float[] fArr) {
        this.f6206a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f6206a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i2 = 0; i2 < fArr5.length; i2++) {
            float f3 = fArr3[i2];
            fArr5[i2] = C0000a.m4a(fArr4[i2], f3, f2, f3);
        }
        return fArr5;
    }
}
