package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes.dex */
class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    /* renamed from: b */
    public void mo10391b(TabLayout tabLayout, View view, View view2, float f2, @NonNull Drawable drawable) {
        if (f2 >= 0.5f) {
            view = view2;
        }
        RectF m10392a = TabIndicatorInterpolator.m10392a(tabLayout, view);
        float m9738b = f2 < 0.5f ? AnimationUtils.m9738b(1.0f, 0.0f, 0.0f, 0.5f, f2) : AnimationUtils.m9738b(0.0f, 1.0f, 0.5f, 1.0f, f2);
        drawable.setBounds((int) m10392a.left, drawable.getBounds().top, (int) m10392a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (m9738b * 255.0f));
    }
}
