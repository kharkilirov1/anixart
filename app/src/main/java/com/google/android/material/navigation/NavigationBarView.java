package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C1195R;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: b */
    @NonNull
    public final NavigationBarMenu f18467b;

    /* renamed from: c */
    @NonNull
    public final NavigationBarMenuView f18468c;

    /* renamed from: d */
    @NonNull
    public final NavigationBarPresenter f18469d;

    /* renamed from: e */
    public MenuInflater f18470e;

    /* renamed from: f */
    public OnItemSelectedListener f18471f;

    /* renamed from: g */
    public OnItemReselectedListener f18472g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        /* renamed from: b */
        void mo10202b(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        /* renamed from: a */
        boolean mo10203a(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        @Nullable
        public Bundle f18474d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeBundle(this.f18474d);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18474d = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, i2, i3), attributeSet, i2);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f18469d = navigationBarPresenter;
        Context context2 = getContext();
        TintTypedArray m10160e = ThemeEnforcement.m10160e(context2, attributeSet, C1195R.styleable.f17305F, i2, i3, 10, 9);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.f18467b = navigationBarMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.f18468c = bottomNavigationMenuView;
        navigationBarPresenter.f18462b = bottomNavigationMenuView;
        navigationBarPresenter.f18464d = 1;
        bottomNavigationMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.m600b(navigationBarPresenter, navigationBarMenu.f864a);
        getContext();
        navigationBarPresenter.f18462b.f18435D = navigationBarMenu;
        if (m10160e.m967p(5)) {
            bottomNavigationMenuView.setIconTintList(m10160e.m954c(5));
        } else {
            bottomNavigationMenuView.setIconTintList(bottomNavigationMenuView.m10199c(R.attr.textColorSecondary));
        }
        setItemIconSize(m10160e.m957f(4, getResources().getDimensionPixelSize(C2507R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (m10160e.m967p(10)) {
            setItemTextAppearanceInactive(m10160e.m964m(10, 0));
        }
        if (m10160e.m967p(9)) {
            setItemTextAppearanceActive(m10160e.m964m(9, 0));
        }
        if (m10160e.m967p(11)) {
            setItemTextColor(m10160e.m954c(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.m10301x(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.m10296s(context2);
            ViewCompat.m2204i0(this, materialShapeDrawable);
        }
        if (m10160e.m967p(7)) {
            setItemPaddingTop(m10160e.m957f(7, 0));
        }
        if (m10160e.m967p(6)) {
            setItemPaddingBottom(m10160e.m957f(6, 0));
        }
        if (m10160e.m967p(1)) {
            setElevation(m10160e.m957f(1, 0));
        }
        DrawableCompat.m1842n(getBackground().mutate(), MaterialResources.m10241b(context2, m10160e, 0));
        setLabelVisibilityMode(m10160e.m962k(12, -1));
        int m964m = m10160e.m964m(3, 0);
        if (m964m != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(m964m);
        } else {
            setItemRippleColor(MaterialResources.m10241b(context2, m10160e, 8));
        }
        int m964m2 = m10160e.m964m(2, 0);
        if (m964m2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m964m2, C1195R.styleable.f17304E);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(MaterialResources.m10240a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.m10311a(context2, obtainStyledAttributes.getResourceId(4, 0), 0).m10320a());
            obtainStyledAttributes.recycle();
        }
        if (m10160e.m967p(13)) {
            int m964m3 = m10160e.m964m(13, 0);
            navigationBarPresenter.f18463c = true;
            getMenuInflater().inflate(m964m3, navigationBarMenu);
            navigationBarPresenter.f18463c = false;
            navigationBarPresenter.mo559d(true);
        }
        m10160e.f1582b.recycle();
        addView(bottomNavigationMenuView);
        navigationBarMenu.f868e = new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            /* renamed from: a */
            public boolean mo429a(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                if (NavigationBarView.this.f18472g == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    OnItemSelectedListener onItemSelectedListener = NavigationBarView.this.f18471f;
                    return (onItemSelectedListener == null || onItemSelectedListener.mo10203a(menuItem)) ? false : true;
                }
                NavigationBarView.this.f18472g.mo10202b(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            /* renamed from: b */
            public void mo431b(MenuBuilder menuBuilder) {
            }
        };
    }

    private MenuInflater getMenuInflater() {
        if (this.f18470e == null) {
            this.f18470e = new SupportMenuInflater(getContext());
        }
        return this.f18470e;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f18468c.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f18468c.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f18468c.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f18468c.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f18468c.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f18468c.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f18468c.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f18468c.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f18468c.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f18468c.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f18468c.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f18468c.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f18468c.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f18468c.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f18468c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f18468c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f18467b;
    }

    @NonNull
    @RestrictTo
    public MenuView getMenuView() {
        return this.f18468c;
    }

    @NonNull
    @RestrictTo
    public NavigationBarPresenter getPresenter() {
        return this.f18469d;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f18468c.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.m10309c(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        this.f18467b.m620v(savedState.f18474d);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f18474d = bundle;
        this.f18467b.m622x(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.m10308b(this, f2);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f18468c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f18468c.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int i2) {
        this.f18468c.setItemActiveIndicatorHeight(i2);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i2) {
        this.f18468c.setItemActiveIndicatorMarginHorizontal(i2);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f18468c.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i2) {
        this.f18468c.setItemActiveIndicatorWidth(i2);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f18468c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        this.f18468c.setItemBackgroundRes(i2);
    }

    public void setItemIconSize(@Dimension int i2) {
        this.f18468c.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(@DimenRes int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f18468c.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i2) {
        this.f18468c.setItemPaddingBottom(i2);
    }

    public void setItemPaddingTop(@Px int i2) {
        this.f18468c.setItemPaddingTop(i2);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f18468c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i2) {
        this.f18468c.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i2) {
        this.f18468c.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f18468c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f18468c.getLabelVisibilityMode() != i2) {
            this.f18468c.setLabelVisibilityMode(i2);
            this.f18469d.mo559d(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.f18472g = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.f18471f = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i2) {
        MenuItem findItem = this.f18467b.findItem(i2);
        if (findItem == null || this.f18467b.m616r(findItem, this.f18469d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
