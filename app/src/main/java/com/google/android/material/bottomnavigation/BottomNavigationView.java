package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C1195R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.bottomNavigationStyle, C2507R.style.Widget_Design_BottomNavigationView);
        TintTypedArray m10160e = ThemeEnforcement.m10160e(getContext(), attributeSet, C1195R.styleable.f17320e, C2507R.attr.bottomNavigationStyle, C2507R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(m10160e.m952a(1, true));
        if (m10160e.m967p(0)) {
            setMinimumHeight(m10160e.m957f(0, 0));
        }
        m10160e.f1582b.recycle();
        ViewUtils.m10164a(this, new ViewUtils.OnApplyWindowInsetsListener(this) { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            /* renamed from: a */
            public WindowInsetsCompat mo9833a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.f18375d = windowInsetsCompat.m2425f() + relativePadding.f18375d;
                boolean z = ViewCompat.m2231w(view) == 1;
                int m2426g = windowInsetsCompat.m2426g();
                int m2427h = windowInsetsCompat.m2427h();
                int i2 = relativePadding.f18372a + (z ? m2427h : m2426g);
                relativePadding.f18372a = i2;
                int i3 = relativePadding.f18374c;
                if (!z) {
                    m2426g = m2427h;
                }
                int i4 = i3 + m2426g;
                relativePadding.f18374c = i4;
                ViewCompat.m2226t0(view, i2, relativePadding.f18373b, i4, relativePadding.f18375d);
                return windowInsetsCompat;
            }
        });
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i3) != 1073741824 && suggestedMinimumHeight > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.f17583K != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo559d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }
}
