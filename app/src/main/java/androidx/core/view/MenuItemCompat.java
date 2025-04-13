package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;

/* loaded from: classes.dex */
public final class MenuItemCompat {

    /* renamed from: androidx.core.view.MenuItemCompat$1 */
    class MenuItemOnActionExpandListenerC02541 implements MenuItem.OnActionExpandListener {
        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            throw null;
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2117a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m2118b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @DoNotInline
        /* renamed from: c */
        public static ColorStateList m2119c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @DoNotInline
        /* renamed from: d */
        public static PorterDuff.Mode m2120d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2121e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @DoNotInline
        /* renamed from: f */
        public static CharSequence m2122f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @DoNotInline
        /* renamed from: g */
        public static MenuItem m2123g(MenuItem menuItem, char c2, int i2) {
            return menuItem.setAlphabeticShortcut(c2, i2);
        }

        @DoNotInline
        /* renamed from: h */
        public static MenuItem m2124h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @DoNotInline
        /* renamed from: i */
        public static MenuItem m2125i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: j */
        public static MenuItem m2126j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @DoNotInline
        /* renamed from: k */
        public static MenuItem m2127k(MenuItem menuItem, char c2, int i2) {
            return menuItem.setNumericShortcut(c2, i2);
        }

        @DoNotInline
        /* renamed from: l */
        public static MenuItem m2128l(MenuItem menuItem, char c2, char c3, int i2, int i3) {
            return menuItem.setShortcut(c2, c3, i2, i3);
        }

        @DoNotInline
        /* renamed from: m */
        public static MenuItem m2129m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    public interface OnActionExpandListener {
    }

    /* renamed from: a */
    public static void m2111a(@NonNull MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2123g(menuItem, c2, i2);
        }
    }

    /* renamed from: b */
    public static void m2112b(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2124h(menuItem, charSequence);
        }
    }

    /* renamed from: c */
    public static void m2113c(@NonNull MenuItem menuItem, @Nullable ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2125i(menuItem, colorStateList);
        }
    }

    /* renamed from: d */
    public static void m2114d(@NonNull MenuItem menuItem, @Nullable PorterDuff.Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2126j(menuItem, mode);
        }
    }

    /* renamed from: e */
    public static void m2115e(@NonNull MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2127k(menuItem, c2, i2);
        }
    }

    /* renamed from: f */
    public static void m2116f(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m2129m(menuItem, charSequence);
        }
    }
}
