package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* renamed from: k */
    public static boolean f6349k = true;

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: g */
    public void mo4282g(@NonNull View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo4282g(view, i2);
        } else if (f6349k) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f6349k = false;
            }
        }
    }
}
