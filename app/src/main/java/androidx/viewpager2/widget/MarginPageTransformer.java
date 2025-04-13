package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {
    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    /* renamed from: a */
    public void mo4381a(@NonNull View view, float f2) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f3 = 0 * f2;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f3);
            return;
        }
        if (viewPager2.m4388b()) {
            f3 = -f3;
        }
        view.setTranslationX(f3);
    }
}
