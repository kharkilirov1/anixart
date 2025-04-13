package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: G */
    public final int f17579G;

    /* renamed from: H */
    public final int f17580H;

    /* renamed from: I */
    public final int f17581I;

    /* renamed from: J */
    public final int f17582J;

    /* renamed from: K */
    public boolean f17583K;

    /* renamed from: L */
    public int[] f17584L;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f17579G = resources.getDimensionPixelSize(C2507R.dimen.design_bottom_navigation_item_max_width);
        this.f17580H = resources.getDimensionPixelSize(C2507R.dimen.design_bottom_navigation_item_min_width);
        this.f17581I = resources.getDimensionPixelSize(C2507R.dimen.design_bottom_navigation_active_item_max_width);
        this.f17582J = resources.getDimensionPixelSize(C2507R.dimen.design_bottom_navigation_active_item_min_width);
        this.f17584L = new int[5];
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    /* renamed from: e */
    public NavigationBarItemView mo9837e(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.m2231w(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = menu.m610l().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (m10201f(getLabelVisibilityMode(), size2) && this.f17583K) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i4 = this.f17582J;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f17581I, Integer.MIN_VALUE), makeMeasureSpec);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
            }
            int i5 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f17580H * i5), Math.min(i4, this.f17581I));
            int i6 = size - min;
            int min2 = Math.min(i6 / (i5 == 0 ? 1 : i5), this.f17579G);
            int i7 = i6 - (i5 * min2);
            int i8 = 0;
            while (i8 < childCount) {
                if (getChildAt(i8).getVisibility() != 8) {
                    this.f17584L[i8] = i8 == getSelectedItemPosition() ? min : min2;
                    if (i7 > 0) {
                        int[] iArr = this.f17584L;
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f17584L[i8] = 0;
                }
                i8++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f17581I);
            int i9 = size - (size2 * min3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr2 = this.f17584L;
                    iArr2[i10] = min3;
                    if (i9 > 0) {
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.f17584L[i10] = 0;
                }
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f17584L[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 = childAt2.getMeasuredWidth() + i11;
            }
        }
        setMeasuredDimension(i11, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f17583K = z;
    }
}
