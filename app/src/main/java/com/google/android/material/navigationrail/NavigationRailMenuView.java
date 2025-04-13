package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: G */
    @Px
    public int f18481G;

    /* renamed from: H */
    public final FrameLayout.LayoutParams f18482H;

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    /* renamed from: e */
    public NavigationBarItemView mo9837e(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    /* renamed from: g */
    public final int m10204g(int i2, int i3, int i4) {
        int max = i3 / Math.max(1, i4);
        int i5 = this.f18481G;
        if (i5 == -1) {
            i5 = View.MeasureSpec.getSize(i2);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i5, max), 0);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.f18481G;
    }

    public int getMenuGravity() {
        return this.f18482H.gravity;
    }

    /* renamed from: h */
    public final int m10205h(int i2, int i3, int i4, View view) {
        int i5;
        int m10204g = view == null ? m10204g(i2, i3, i4) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i2, m10204g);
                    i5 = childAt.getMeasuredHeight();
                } else {
                    i5 = 0;
                }
                i6 += i5;
            }
        }
        return i6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                childAt.layout(0, i7, i6, measuredHeight);
                i7 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int m10205h;
        int i4;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = getMenu().m610l().size();
        if (size2 <= 1 || !m10201f(getLabelVisibilityMode(), size2)) {
            m10205h = m10205h(i2, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int m10204g = m10204g(i2, size, size2);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i2, m10204g);
                    i4 = childAt.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                size -= i4;
                size2--;
            } else {
                i4 = 0;
            }
            m10205h = m10205h(i2, size, size2, childAt) + i4;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.resolveSizeAndState(m10205h, i3, 0));
    }

    public void setItemMinimumHeight(@Px int i2) {
        if (this.f18481G != i2) {
            this.f18481G = i2;
            requestLayout();
        }
    }

    public void setMenuGravity(int i2) {
        FrameLayout.LayoutParams layoutParams = this.f18482H;
        if (layoutParams.gravity != i2) {
            layoutParams.gravity = i2;
            setLayoutParams(layoutParams);
        }
    }
}
