package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ActionProvider;

@RestrictTo
/* loaded from: classes.dex */
public interface SupportMenuItem extends MenuItem {
    @NonNull
    /* renamed from: a */
    SupportMenuItem mo545a(@Nullable ActionProvider actionProvider);

    @Nullable
    /* renamed from: b */
    ActionProvider mo546b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i2);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    @NonNull
    SupportMenuItem setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    void setShowAsAction(int i2);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i2);

    @Override // android.view.MenuItem
    @NonNull
    SupportMenuItem setTooltipText(@Nullable CharSequence charSequence);
}
