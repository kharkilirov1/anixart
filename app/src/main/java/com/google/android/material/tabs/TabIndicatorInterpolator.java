package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
class TabIndicatorInterpolator {
    /* renamed from: a */
    public static RectF m10392a(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f18885C || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int m10165b = (int) ViewUtils.m10165b(tabView.getContext(), 24);
        if (contentWidth < m10165b) {
            contentWidth = m10165b;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    /* renamed from: b */
    public void mo10391b(TabLayout tabLayout, View view, View view2, @FloatRange float f2, @NonNull Drawable drawable) {
        RectF m10392a = m10392a(tabLayout, view);
        RectF m10392a2 = m10392a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.m9739c((int) m10392a.left, (int) m10392a2.left, f2), drawable.getBounds().top, AnimationUtils.m9739c((int) m10392a.right, (int) m10392a2.right, f2), drawable.getBounds().bottom);
    }
}
