package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: c */
    public final Rect f17450c;

    /* renamed from: d */
    public final Rect f17451d;

    /* renamed from: e */
    public int f17452e;

    /* renamed from: f */
    public int f17453f;

    public HeaderScrollingViewBehavior() {
        this.f17450c = new Rect();
        this.f17451d = new Rect();
        this.f17452e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public boolean mo1500i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2, int i3, int i4, int i5) {
        View mo9777v;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (mo9777v = mo9777v(coordinatorLayout.m1478h(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.m2225t(mo9777v) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m2425f() + lastWindowInsets.m2428i();
        }
        int mo9779y = size + mo9779y(mo9777v);
        int measuredHeight = mo9777v.getMeasuredHeight();
        view.setTranslationY(0.0f);
        coordinatorLayout.m1487v(view, i2, i3, View.MeasureSpec.makeMeasureSpec(mo9779y - measuredHeight, i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    /* renamed from: t */
    public void mo9792t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
        View mo9777v = mo9777v(coordinatorLayout.m1478h(view));
        if (mo9777v == null) {
            coordinatorLayout.m1486u(view, i2);
            this.f17452e = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        Rect rect = this.f17450c;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, mo9777v.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((mo9777v.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && ViewCompat.m2225t(coordinatorLayout) && !ViewCompat.m2225t(view)) {
            rect.left = lastWindowInsets.m2426g() + rect.left;
            rect.right -= lastWindowInsets.m2427h();
        }
        Rect rect2 = this.f17451d;
        int i3 = layoutParams.f3072c;
        GravityCompat.m2084a(i3 == 0 ? 8388659 : i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int m9793w = m9793w(mo9777v);
        view.layout(rect2.left, rect2.top - m9793w, rect2.right, rect2.bottom - m9793w);
        this.f17452e = rect2.top - mo9777v.getBottom();
    }

    @Nullable
    /* renamed from: v */
    public abstract View mo9777v(List<View> list);

    /* renamed from: w */
    public final int m9793w(View view) {
        if (this.f17453f == 0) {
            return 0;
        }
        float mo9778x = mo9778x(view);
        int i2 = this.f17453f;
        return MathUtils.m1934b((int) (mo9778x * i2), 0, i2);
    }

    /* renamed from: x */
    public float mo9778x(View view) {
        return 1.0f;
    }

    /* renamed from: y */
    public int mo9779y(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17450c = new Rect();
        this.f17451d = new Rect();
        this.f17452e = 0;
    }
}
