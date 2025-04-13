package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsApi22 extends ViewUtilsApi21 {

    /* renamed from: j */
    public static boolean f6348j = true;

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: e */
    public void mo4281e(@NonNull View view, int i2, int i3, int i4, int i5) {
        if (f6348j) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f6348j = false;
            }
        }
    }
}
