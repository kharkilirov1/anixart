package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.HashSet;

@RestrictTo
/* loaded from: classes.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {

    /* renamed from: E */
    public static final int[] f18430E = {R.attr.state_checked};

    /* renamed from: F */
    public static final int[] f18431F = {-16842910};

    /* renamed from: A */
    public boolean f18432A;

    /* renamed from: B */
    public ColorStateList f18433B;

    /* renamed from: C */
    public NavigationBarPresenter f18434C;

    /* renamed from: D */
    public MenuBuilder f18435D;

    /* renamed from: b */
    @Nullable
    public final TransitionSet f18436b;

    /* renamed from: c */
    @NonNull
    public final View.OnClickListener f18437c;

    /* renamed from: d */
    public final Pools.Pool<NavigationBarItemView> f18438d;

    /* renamed from: e */
    @NonNull
    public final SparseArray<View.OnTouchListener> f18439e;

    /* renamed from: f */
    public int f18440f;

    /* renamed from: g */
    @Nullable
    public NavigationBarItemView[] f18441g;

    /* renamed from: h */
    public int f18442h;

    /* renamed from: i */
    public int f18443i;

    /* renamed from: j */
    @Nullable
    public ColorStateList f18444j;

    /* renamed from: k */
    @Dimension
    public int f18445k;

    /* renamed from: l */
    public ColorStateList f18446l;

    /* renamed from: m */
    @Nullable
    public final ColorStateList f18447m;

    /* renamed from: n */
    @StyleRes
    public int f18448n;

    /* renamed from: o */
    @StyleRes
    public int f18449o;

    /* renamed from: p */
    public Drawable f18450p;

    /* renamed from: q */
    @Nullable
    public ColorStateList f18451q;

    /* renamed from: r */
    public int f18452r;

    /* renamed from: s */
    @NonNull
    public final SparseArray<BadgeDrawable> f18453s;

    /* renamed from: t */
    public int f18454t;

    /* renamed from: u */
    public int f18455u;

    /* renamed from: v */
    public boolean f18456v;

    /* renamed from: w */
    public int f18457w;

    /* renamed from: x */
    public int f18458x;

    /* renamed from: y */
    public int f18459y;

    /* renamed from: z */
    public ShapeAppearanceModel f18460z;

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f18438d = new Pools.SynchronizedPool(5);
        this.f18439e = new SparseArray<>(5);
        this.f18442h = 0;
        this.f18443i = 0;
        this.f18453s = new SparseArray<>(5);
        this.f18454t = -1;
        this.f18455u = -1;
        this.f18432A = false;
        this.f18447m = m10199c(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f18436b = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f18436b = autoTransition;
            autoTransition.m4268T(0);
            autoTransition.m4266R(MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationLong1, getResources().getInteger(C2507R.integer.material_motion_duration_long_1)));
            autoTransition.m4267S(MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingStandard, AnimationUtils.f17343b));
            autoTransition.m4263O(new TextScale());
        }
        this.f18437c = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
                if (navigationBarMenuView.f18435D.m616r(itemData, navigationBarMenuView.f18434C, 0)) {
                    return;
                }
                itemData.setChecked(true);
            }
        };
        ViewCompat.m2216o0(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView mo2027b = this.f18438d.mo2027b();
        return mo2027b == null ? mo9837e(getContext()) : mo2027b;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if ((id2 != -1) && (badgeDrawable = this.f18453s.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    @SuppressLint
    /* renamed from: a */
    public void m10198a() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f18438d.mo2026a(navigationBarItemView);
                    navigationBarItemView.m10195j(navigationBarItemView.f18410n);
                    navigationBarItemView.f18415s = null;
                    navigationBarItemView.f18421y = 0.0f;
                    navigationBarItemView.f18398b = false;
                }
            }
        }
        if (this.f18435D.size() == 0) {
            this.f18442h = 0;
            this.f18443i = 0;
            this.f18441g = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f18435D.size(); i2++) {
            hashSet.add(Integer.valueOf(this.f18435D.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.f18453s.size(); i3++) {
            int keyAt = this.f18453s.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f18453s.delete(keyAt);
            }
        }
        this.f18441g = new NavigationBarItemView[this.f18435D.size()];
        boolean m10201f = m10201f(this.f18440f, this.f18435D.m610l().size());
        for (int i4 = 0; i4 < this.f18435D.size(); i4++) {
            this.f18434C.f18463c = true;
            this.f18435D.getItem(i4).setCheckable(true);
            this.f18434C.f18463c = false;
            NavigationBarItemView newItem = getNewItem();
            this.f18441g[i4] = newItem;
            newItem.setIconTintList(this.f18444j);
            newItem.setIconSize(this.f18445k);
            newItem.setTextColor(this.f18447m);
            newItem.setTextAppearanceInactive(this.f18448n);
            newItem.setTextAppearanceActive(this.f18449o);
            newItem.setTextColor(this.f18446l);
            int i5 = this.f18454t;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f18455u;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            newItem.setActiveIndicatorWidth(this.f18457w);
            newItem.setActiveIndicatorHeight(this.f18458x);
            newItem.setActiveIndicatorMarginHorizontal(this.f18459y);
            newItem.setActiveIndicatorDrawable(m10200d());
            newItem.setActiveIndicatorResizeable(this.f18432A);
            newItem.setActiveIndicatorEnabled(this.f18456v);
            Drawable drawable = this.f18450p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f18452r);
            }
            newItem.setItemRippleColor(this.f18451q);
            newItem.setShifting(m10201f);
            newItem.setLabelVisibilityMode(this.f18440f);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f18435D.getItem(i4);
            newItem.mo550f(menuItemImpl, 0);
            newItem.setItemPosition(i4);
            int i7 = menuItemImpl.f895a;
            newItem.setOnTouchListener(this.f18439e.get(i7));
            newItem.setOnClickListener(this.f18437c);
            int i8 = this.f18442h;
            if (i8 != 0 && i7 == i8) {
                this.f18443i = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f18435D.size() - 1, this.f18443i);
        this.f18443i = min;
        this.f18435D.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    /* renamed from: b */
    public void mo588b(@NonNull MenuBuilder menuBuilder) {
        this.f18435D = menuBuilder;
    }

    @Nullable
    /* renamed from: c */
    public ColorStateList m10199c(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList m496a = AppCompatResources.m496a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C2507R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = m496a.getDefaultColor();
        int[] iArr = f18431F;
        return new ColorStateList(new int[][]{iArr, f18430E, ViewGroup.EMPTY_STATE_SET}, new int[]{m496a.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    @Nullable
    /* renamed from: d */
    public final Drawable m10200d() {
        if (this.f18460z == null || this.f18433B == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f18460z);
        materialShapeDrawable.m10301x(this.f18433B);
        return materialShapeDrawable;
    }

    @NonNull
    /* renamed from: e */
    public abstract NavigationBarItemView mo9837e(@NonNull Context context);

    /* renamed from: f */
    public boolean m10201f(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f18453s;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f18444j;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f18433B;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f18456v;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f18458x;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f18459y;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f18460z;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f18457w;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f18450p : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f18452r;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f18445k;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f18455u;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f18454t;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f18451q;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f18449o;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f18448n;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f18446l;
    }

    public int getLabelVisibilityMode() {
        return this.f18440f;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.f18435D;
    }

    public int getSelectedItemId() {
        return this.f18442h;
    }

    public int getSelectedItemPosition() {
        return this.f18443i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(1, this.f18435D.m610l().size(), false, 1));
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f18444j = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f18433B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m10200d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f18456v = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i2) {
        this.f18458x = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i2);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i2) {
        this.f18459y = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i2);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f18432A = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f18460z = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m10200d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i2) {
        this.f18457w = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i2);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f18450p = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.f18452r = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i2);
            }
        }
    }

    public void setItemIconSize(@Dimension int i2) {
        this.f18445k = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i2);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i2) {
        this.f18455u = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i2);
            }
        }
    }

    public void setItemPaddingTop(@Px int i2) {
        this.f18454t = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i2);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f18451q = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i2) {
        this.f18449o = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.f18446l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i2) {
        this.f18448n = i2;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.f18446l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f18446l = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f18441g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.f18440f = i2;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f18434C = navigationBarPresenter;
    }
}
