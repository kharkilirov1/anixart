package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f17351a = new float[9];

    /* renamed from: b */
    public final float[] f17352b = new float[9];

    /* renamed from: c */
    public final Matrix f17353c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f2, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f17351a);
        matrix2.getValues(this.f17352b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f17352b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f17351a;
            fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
        }
        this.f17353c.setValues(this.f17352b);
        return this.f17353c;
    }
}
