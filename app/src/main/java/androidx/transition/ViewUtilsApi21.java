package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsApi21 extends ViewUtilsApi19 {

    /* renamed from: g */
    public static boolean f6345g = true;

    /* renamed from: h */
    public static boolean f6346h = true;

    /* renamed from: i */
    public static boolean f6347i = true;

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: d */
    public void mo4278d(@NonNull View view, @Nullable Matrix matrix) {
        if (f6345g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f6345g = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: h */
    public void mo4279h(@NonNull View view, @NonNull Matrix matrix) {
        if (f6346h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6346h = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: i */
    public void mo4280i(@NonNull View view, @NonNull Matrix matrix) {
        if (f6347i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6347i = false;
            }
        }
    }
}
