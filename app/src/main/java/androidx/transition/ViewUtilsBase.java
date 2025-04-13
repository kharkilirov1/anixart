package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class ViewUtilsBase {

    /* renamed from: b */
    public static Method f6350b;

    /* renamed from: c */
    public static boolean f6351c;

    /* renamed from: d */
    public static Field f6352d;

    /* renamed from: e */
    public static boolean f6353e;

    /* renamed from: a */
    public float[] f6354a;

    /* renamed from: a */
    public void mo4274a(@NonNull View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C2507R.id.save_non_transition_alpha, null);
        }
    }

    /* renamed from: b */
    public float mo4275b(@NonNull View view) {
        Float f2 = (Float) view.getTag(C2507R.id.save_non_transition_alpha);
        return f2 != null ? view.getAlpha() / f2.floatValue() : view.getAlpha();
    }

    /* renamed from: c */
    public void mo4276c(@NonNull View view) {
        if (view.getTag(C2507R.id.save_non_transition_alpha) == null) {
            view.setTag(C2507R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: d */
    public void mo4278d(@NonNull View view, @Nullable Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f6354a;
        if (fArr == null) {
            fArr = new float[9];
            this.f6354a = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f2 * f2))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f2, sqrt));
        float f3 = fArr[0] / sqrt;
        float f4 = fArr[4] / sqrt;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    /* renamed from: e */
    public void mo4281e(@NonNull View view, int i2, int i3, int i4, int i5) {
        if (!f6351c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f6350b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            f6351c = true;
        }
        Method method = f6350b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo4277f(@NonNull View view, float f2) {
        Float f3 = (Float) view.getTag(C2507R.id.save_non_transition_alpha);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    /* renamed from: g */
    public void mo4282g(@NonNull View view, int i2) {
        if (!f6353e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6352d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6353e = true;
        }
        Field field = f6352d;
        if (field != null) {
            try {
                f6352d.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo4279h(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo4279h((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo4280i(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo4280i((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
