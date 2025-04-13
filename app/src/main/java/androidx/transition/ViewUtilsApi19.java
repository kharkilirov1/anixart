package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsApi19 extends ViewUtilsBase {

    /* renamed from: f */
    public static boolean f6344f = true;

    @Override // androidx.transition.ViewUtilsBase
    /* renamed from: a */
    public void mo4274a(@NonNull View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: b */
    public float mo4275b(@NonNull View view) {
        if (f6344f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6344f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.ViewUtilsBase
    /* renamed from: c */
    public void mo4276c(@NonNull View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint
    /* renamed from: f */
    public void mo4277f(@NonNull View view, float f2) {
        if (f6344f) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f6344f = false;
            }
        }
        view.setAlpha(f2);
    }
}
