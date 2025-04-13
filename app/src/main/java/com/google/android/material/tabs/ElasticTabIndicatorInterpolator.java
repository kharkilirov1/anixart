package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes.dex */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    /* renamed from: c */
    public static float m10390c(@FloatRange float f2) {
        return (float) (1.0d - Math.cos((f2 * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    /* renamed from: b */
    public void mo10391b(TabLayout tabLayout, View view, View view2, float f2, @NonNull Drawable drawable) {
        float sin;
        float m10390c;
        RectF m10392a = TabIndicatorInterpolator.m10392a(tabLayout, view);
        RectF m10392a2 = TabIndicatorInterpolator.m10392a(tabLayout, view2);
        if (m10392a.left < m10392a2.left) {
            sin = m10390c(f2);
            m10390c = (float) Math.sin((f2 * 3.141592653589793d) / 2.0d);
        } else {
            sin = (float) Math.sin((f2 * 3.141592653589793d) / 2.0d);
            m10390c = m10390c(f2);
        }
        drawable.setBounds(AnimationUtils.m9739c((int) m10392a.left, (int) m10392a2.left, sin), drawable.getBounds().top, AnimationUtils.m9739c((int) m10392a.right, (int) m10392a2.right, m10390c), drawable.getBounds().bottom);
    }
}
