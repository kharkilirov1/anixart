package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {

    /* renamed from: G */
    public static final int[] f18309G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f18310A;

    /* renamed from: B */
    public MenuItemImpl f18311B;

    /* renamed from: C */
    public ColorStateList f18312C;

    /* renamed from: D */
    public boolean f18313D;

    /* renamed from: E */
    public Drawable f18314E;

    /* renamed from: F */
    public final AccessibilityDelegateCompat f18315F;

    /* renamed from: w */
    public int f18316w;

    /* renamed from: x */
    public boolean f18317x;

    /* renamed from: y */
    public boolean f18318y;

    /* renamed from: z */
    public final CheckedTextView f18319z;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AccessibilityDelegateCompat accessibilityDelegateCompat = new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.f3743a.setCheckable(NavigationMenuItemView.this.f18318y);
            }
        };
        this.f18315F = accessibilityDelegateCompat;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C2507R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C2507R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C2507R.id.design_menu_item_text);
        this.f18319z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m2196e0(checkedTextView, accessibilityDelegateCompat);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f18310A == null) {
                this.f18310A = (FrameLayout) ((ViewStub) findViewById(C2507R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f18310A.removeAllViews();
            this.f18310A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /* renamed from: f */
    public void mo550f(@NonNull MenuItemImpl menuItemImpl, int i2) {
        StateListDrawable stateListDrawable;
        this.f18311B = menuItemImpl;
        int i3 = menuItemImpl.f895a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C2507R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f18309G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.m2204i0(this, stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.f899e);
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.f911q);
        TooltipCompat.m998a(this, menuItemImpl.f912r);
        MenuItemImpl menuItemImpl2 = this.f18311B;
        if (menuItemImpl2.f899e == null && menuItemImpl2.getIcon() == null && this.f18311B.getActionView() != null) {
            this.f18319z.setVisibility(8);
            FrameLayout frameLayout = this.f18310A;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f18310A.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f18319z.setVisibility(0);
        FrameLayout frameLayout2 = this.f18310A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f18310A.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f18311B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemImpl menuItemImpl = this.f18311B;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f18311B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f18309G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f18318y != z) {
            this.f18318y = z;
            this.f18315F.mo2048h(this.f18319z, RecyclerView.ViewHolder.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f18319z.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f18313D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.m1845q(drawable).mutate();
                DrawableCompat.m1842n(drawable, this.f18312C);
            }
            int i2 = this.f18316w;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f18317x) {
            if (this.f18314E == null) {
                Drawable m1733c = ResourcesCompat.m1733c(getResources(), C2507R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f18314E = m1733c;
                if (m1733c != null) {
                    int i3 = this.f18316w;
                    m1733c.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f18314E;
        }
        TextViewCompat.m2644f(this.f18319z, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f18319z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(@Dimension int i2) {
        this.f18316w = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f18312C = colorStateList;
        this.f18313D = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f18311B;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f18319z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f18317x = z;
    }

    public void setTextAppearance(int i2) {
        TextViewCompat.m2649k(this.f18319z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f18319z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18319z.setText(charSequence);
    }
}
