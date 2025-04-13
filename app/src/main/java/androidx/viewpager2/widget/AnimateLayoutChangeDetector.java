package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
final class AnimateLayoutChangeDetector {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f6617b;

    /* renamed from: a */
    public LinearLayoutManager f6618a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f6617b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public AnimateLayoutChangeDetector(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f6618a = linearLayoutManager;
    }

    /* renamed from: a */
    public static boolean m4379a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (m4379a(viewGroup.getChildAt(i2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
