package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f18475g = 0;

    /* renamed from: c */
    public OnNavigationItemSelectedListener f18476c;

    /* renamed from: d */
    public MenuInflater f18477d;

    /* renamed from: e */
    public boolean f18478e;

    /* renamed from: f */
    public boolean f18479f;

    /* renamed from: com.google.android.material.navigation.NavigationView$1 */
    class C13411 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: a */
        public boolean mo429a(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: b */
        public void mo431b(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$2 */
    class ViewTreeObserverOnGlobalLayoutListenerC13422 implements ViewTreeObserver.OnGlobalLayoutListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i2 = NavigationView.f18475g;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface OnNavigationItemSelectedListener {
    }

    private MenuInflater getMenuInflater() {
        if (this.f18477d == null) {
            this.f18477d = new SupportMenuInflater(getContext());
        }
        return this.f18477d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        throw null;
    }

    @Px
    public int getDividerInsetEnd() {
        throw null;
    }

    @Px
    public int getDividerInsetStart() {
        throw null;
    }

    public int getHeaderCount() {
        throw null;
    }

    @Nullable
    public Drawable getItemBackground() {
        throw null;
    }

    @Dimension
    public int getItemHorizontalPadding() {
        throw null;
    }

    @Dimension
    public int getItemIconPadding() {
        throw null;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemMaxLines() {
        throw null;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        throw null;
    }

    @Px
    public int getItemVerticalPadding() {
        throw null;
    }

    @NonNull
    public Menu getMenu() {
        return null;
    }

    @Px
    public int getSubheaderInsetEnd() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Px
    public int getSubheaderInsetStart() {
        throw null;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.m10309c(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), 0), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState) parcelable).f3875b);
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f18480d = new Bundle();
        throw null;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        boolean z = getParent() instanceof DrawerLayout;
        throw null;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f18479f = z;
    }

    public void setCheckedItem(@IdRes int i2) {
        throw null;
    }

    public void setDividerInsetEnd(@Px int i2) {
        throw null;
    }

    public void setDividerInsetStart(@Px int i2) {
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.m10308b(this, f2);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        setItemBackground(ContextCompat.m1671d(getContext(), i2));
    }

    public void setItemHorizontalPadding(@Dimension int i2) {
        throw null;
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setItemIconPadding(@Dimension int i2) {
        throw null;
    }

    public void setItemIconPaddingResource(int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setItemIconSize(@Dimension int i2) {
        throw null;
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setItemMaxLines(int i2) {
        throw null;
    }

    public void setItemTextAppearance(@StyleRes int i2) {
        throw null;
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setItemVerticalPadding(@Px int i2) {
        throw null;
    }

    public void setItemVerticalPaddingResource(@DimenRes int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f18476c = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
    }

    public void setSubheaderInsetEnd(@Px int i2) {
        throw null;
    }

    public void setSubheaderInsetStart(@Px int i2) {
        throw null;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f18478e = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle f18480d;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18480d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeBundle(this.f18480d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        menuItem.getItemId();
        throw null;
    }
}
