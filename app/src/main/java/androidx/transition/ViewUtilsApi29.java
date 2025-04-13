package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    /* renamed from: b */
    public float mo4275b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    /* renamed from: d */
    public void mo4278d(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsBase
    /* renamed from: e */
    public void mo4281e(@NonNull View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    /* renamed from: f */
    public void mo4277f(@NonNull View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsBase
    /* renamed from: g */
    public void mo4282g(@NonNull View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    /* renamed from: h */
    public void mo4279h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    /* renamed from: i */
    public void mo4280i(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
