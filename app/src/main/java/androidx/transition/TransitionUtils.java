package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* loaded from: classes.dex */
class TransitionUtils {

    /* renamed from: a */
    public static final boolean f6311a;

    /* renamed from: b */
    public static final boolean f6312b;

    /* renamed from: c */
    public static final boolean f6313c;

    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final float[] f6314a = new float[9];

        /* renamed from: b */
        public final float[] f6315b = new float[9];

        /* renamed from: c */
        public final Matrix f6316c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f6314a);
            matrix2.getValues(this.f6315b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f6315b;
                float f3 = fArr[i2];
                float[] fArr2 = this.f6314a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.f6316c.setValues(this.f6315b);
            return this.f6316c;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f6311a = true;
        f6312b = true;
        f6313c = i2 >= 28;
    }

    /* renamed from: a */
    public static Animator m4269a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
