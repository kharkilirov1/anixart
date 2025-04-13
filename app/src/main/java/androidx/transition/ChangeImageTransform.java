package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: C */
    public static final String[] f6165C = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: D */
    public static final TypeEvaluator<Matrix> f6166D = new TypeEvaluator<Matrix>() { // from class: androidx.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };

    /* renamed from: E */
    public static final Property<ImageView, Matrix> f6167E = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: androidx.transition.ChangeImageTransform.2
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                    return;
                }
                return;
            }
            if (ImageViewUtils.f6238a) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    ImageViewUtils.f6238a = false;
                }
            }
        }
    };

    /* renamed from: androidx.transition.ChangeImageTransform$3 */
    public static /* synthetic */ class C06183 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6168a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f6168a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6168a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: O */
    public final void m4196O(TransitionValues transitionValues) {
        Matrix matrix;
        View view = transitionValues.f6318b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = transitionValues.f6317a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i2 = C06183.f6168a[imageView.getScaleType().ordinal()];
                if (i2 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i2 != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f2 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f3 = intrinsicHeight;
                    float max = Math.max(width / f2, height / f3);
                    int round = Math.round((width - (f2 * max)) / 2.0f);
                    int round2 = Math.round((height - (f3 * max)) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(max, max);
                    matrix3.postTranslate(round, round2);
                    matrix = matrix3;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4196O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4196O(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f6317a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) transitionValues2.f6317a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) transitionValues.f6317a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.f6317a.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.f6318b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Property<ImageView, Matrix> property = f6167E;
            TypeEvaluator<Matrix> typeEvaluator = f6166D;
            Matrix matrix3 = MatrixUtils.f6239a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix3, matrix3});
        }
        if (matrix == null) {
            matrix = MatrixUtils.f6239a;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f6239a;
        }
        Property<ImageView, Matrix> property2 = f6167E;
        property2.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property2, (TypeEvaluator) new TransitionUtils.MatrixEvaluator(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: t */
    public String[] mo4190t() {
        return f6165C;
    }
}
