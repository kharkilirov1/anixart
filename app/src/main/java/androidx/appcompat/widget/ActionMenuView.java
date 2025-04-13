package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {

    /* renamed from: A */
    public int f1063A;

    /* renamed from: B */
    public OnMenuItemClickListener f1064B;

    /* renamed from: q */
    public MenuBuilder f1065q;

    /* renamed from: r */
    public Context f1066r;

    /* renamed from: s */
    public int f1067s;

    /* renamed from: t */
    public boolean f1068t;

    /* renamed from: u */
    public ActionMenuPresenter f1069u;

    /* renamed from: v */
    public MenuPresenter.Callback f1070v;

    /* renamed from: w */
    public MenuBuilder.Callback f1071w;

    /* renamed from: x */
    public boolean f1072x;

    /* renamed from: y */
    public int f1073y;

    /* renamed from: z */
    public int f1074z;

    @RestrictTo
    public interface ActionMenuChildView {
        /* renamed from: b */
        boolean mo548b();

        /* renamed from: d */
        boolean mo549d();
    }

    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: b */
        public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: c */
        public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
            return false;
        }
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f1075a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f1076b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f1077c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f1078d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f1079e;

        /* renamed from: f */
        public boolean f1080f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1075a = layoutParams.f1075a;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f1075a = false;
        }
    }

    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: a */
        public boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.f1064B;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: b */
        public void mo431b(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.f1071w;
            if (callback != null) {
                callback.mo431b(menuBuilder);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1074z = (int) (56.0f * f2);
        this.f1063A = (int) (f2 * 4.0f);
        this.f1066r = context;
        this.f1067s = 0;
    }

    /* renamed from: o */
    public static int m694o(View view, int i2, int i3, int i4, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m551g();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!layoutParams.f1075a && z2) {
            z = true;
        }
        layoutParams.f1078d = z;
        layoutParams.f1076b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo
    /* renamed from: a */
    public boolean mo587a(MenuItemImpl menuItemImpl) {
        return this.f1065q.m616r(menuItemImpl, null, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo
    /* renamed from: b */
    public void mo588b(MenuBuilder menuBuilder) {
        this.f1065q = menuBuilder;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1065q == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.f1065q = menuBuilder;
            menuBuilder.f868e = new MenuBuilderCallback();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1069u = actionMenuPresenter;
            actionMenuPresenter.f1041n = true;
            actionMenuPresenter.f1042o = true;
            MenuPresenter.Callback callback = this.f1070v;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter.f784f = callback;
            this.f1065q.m600b(actionMenuPresenter, this.f1066r);
            ActionMenuPresenter actionMenuPresenter2 = this.f1069u;
            actionMenuPresenter2.f787i = this;
            this.f1065q = actionMenuPresenter2.f782d;
        }
        return this.f1065q;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1069u;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.f1038k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (actionMenuPresenter.f1040m) {
            return actionMenuPresenter.f1039l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1067s;
    }

    @RestrictTo
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @RestrictTo
    /* renamed from: n */
    public boolean m700n(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = false | ((ActionMenuChildView) childAt).mo548b();
        }
        return (i2 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z : z | ((ActionMenuChildView) childAt2).mo549d();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1069u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo559d(false);
            if (this.f1069u.m691r()) {
                this.f1069u.m690q();
                this.f1069u.m692s();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1069u;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m689p();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f1072x) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean m1007b = ViewUtils.m1007b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1075a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m700n(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1007b) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    m700n(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (m1007b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1075a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1075a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        ?? r3;
        MenuBuilder menuBuilder;
        boolean z3 = this.f1072x;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1072x = z4;
        if (z3 != z4) {
            this.f1073y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1072x && (menuBuilder = this.f1065q) != null && size != this.f1073y) {
            this.f1073y = size;
            menuBuilder.mo614p(true);
        }
        int childCount = getChildCount();
        if (!this.f1072x || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1074z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        long j2 = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z6) {
                    int i22 = this.f1063A;
                    i7 = i21;
                    r3 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i7 = i21;
                    r3 = 0;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f1080f = r3;
                layoutParams2.f1077c = r3;
                layoutParams2.f1076b = r3;
                layoutParams2.f1078d = r3;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = r3;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = r3;
                layoutParams2.f1079e = z6 && ((ActionMenuItemView) childAt).m551g();
                int m694o = m694o(childAt, i13, layoutParams2.f1075a ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, m694o);
                if (layoutParams2.f1078d) {
                    i17++;
                }
                if (layoutParams2.f1075a) {
                    z5 = true;
                }
                i11 -= m694o;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (m694o == 1) {
                    j2 |= 1 << i18;
                }
                i14 = i7;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (i17 > 0 && i11 > 0) {
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j3 = 0;
            while (i26 < childCount2) {
                int i28 = i15;
                LayoutParams layoutParams3 = (LayoutParams) getChildAt(i26).getLayoutParams();
                boolean z9 = z8;
                if (layoutParams3.f1078d) {
                    int i29 = layoutParams3.f1076b;
                    if (i29 < i25) {
                        j3 = 1 << i26;
                        i25 = i29;
                        i27 = 1;
                    } else if (i29 == i25) {
                        i27++;
                        j3 |= 1 << i26;
                    }
                }
                i26++;
                z8 = z9;
                i15 = i28;
            }
            i4 = i15;
            z = z8;
            j2 |= j3;
            if (i27 > i11) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                LayoutParams layoutParams4 = (LayoutParams) childAt2.getLayoutParams();
                int i32 = i17;
                long j4 = 1 << i31;
                if ((j3 & j4) == 0) {
                    if (layoutParams4.f1076b == i30) {
                        j2 |= j4;
                    }
                    z2 = z7;
                } else {
                    if (z7 && layoutParams4.f1079e && i11 == 1) {
                        int i33 = this.f1063A;
                        z2 = z7;
                        childAt2.setPadding(i33 + i13, 0, i33, 0);
                    } else {
                        z2 = z7;
                    }
                    layoutParams4.f1076b++;
                    layoutParams4.f1080f = true;
                    i11--;
                }
                i31++;
                i17 = i32;
                z7 = z2;
            }
            i15 = i4;
            z8 = true;
        }
        i4 = i15;
        z = z8;
        boolean z10 = !z5 && i14 == 1;
        if (i11 > 0 && j2 != 0 && (i11 < i14 - 1 || z10 || i16 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z10) {
                if ((j2 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f1079e) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j2 & (1 << i34)) != 0 && !((LayoutParams) getChildAt(i34).getLayoutParams()).f1079e) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i11 * i13) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j2 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    LayoutParams layoutParams5 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams5.f1077c = i35;
                        layoutParams5.f1080f = true;
                        if (i36 == 0 && !layoutParams5.f1079e) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = (-i35) / 2;
                        }
                    } else if (layoutParams5.f1075a) {
                        layoutParams5.f1077c = i35;
                        layoutParams5.f1080f = true;
                        ((LinearLayout.LayoutParams) layoutParams5).rightMargin = (-i35) / 2;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams5).rightMargin = i35 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                LayoutParams layoutParams6 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.f1080f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams6.f1076b * i13) + layoutParams6.f1077c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i23;
            i5 = i4;
        } else {
            i5 = i24;
            i6 = i23;
        }
        setMeasuredDimension(i6, i5);
    }

    @RestrictTo
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1069u.f1046s = z;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1064B = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f1069u;
        ActionMenuPresenter.OverflowMenuButton overflowMenuButton = actionMenuPresenter.f1038k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f1040m = true;
            actionMenuPresenter.f1039l = drawable;
        }
    }

    @RestrictTo
    public void setOverflowReserved(boolean z) {
        this.f1068t = z;
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.f1067s != i2) {
            this.f1067s = i2;
            if (i2 == 0) {
                this.f1066r = getContext();
            } else {
                this.f1066r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    @RestrictTo
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1069u = actionMenuPresenter;
        actionMenuPresenter.f787i = this;
        this.f1065q = actionMenuPresenter.f782d;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
