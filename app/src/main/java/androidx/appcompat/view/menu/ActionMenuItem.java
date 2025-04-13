package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.recyclerview.widget.RecyclerView;

@RestrictTo
/* loaded from: classes.dex */
public class ActionMenuItem implements SupportMenuItem {

    /* renamed from: a */
    public final int f749a;

    /* renamed from: b */
    public final int f750b;

    /* renamed from: c */
    public final int f751c;

    /* renamed from: d */
    public CharSequence f752d;

    /* renamed from: e */
    public CharSequence f753e;

    /* renamed from: f */
    public Intent f754f;

    /* renamed from: g */
    public char f755g;

    /* renamed from: i */
    public char f757i;

    /* renamed from: k */
    public Drawable f759k;

    /* renamed from: l */
    public Context f760l;

    /* renamed from: m */
    public CharSequence f761m;

    /* renamed from: n */
    public CharSequence f762n;

    /* renamed from: h */
    public int f756h = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j */
    public int f758j = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: o */
    public ColorStateList f763o = null;

    /* renamed from: p */
    public PorterDuff.Mode f764p = null;

    /* renamed from: q */
    public boolean f765q = false;

    /* renamed from: r */
    public boolean f766r = false;

    /* renamed from: s */
    public int f767s = 16;

    public ActionMenuItem(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f760l = context;
        this.f749a = i3;
        this.f750b = i2;
        this.f751c = i4;
        this.f752d = charSequence;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    /* renamed from: a */
    public SupportMenuItem mo545a(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    /* renamed from: b */
    public ActionProvider mo546b() {
        return null;
    }

    /* renamed from: c */
    public final void m547c() {
        Drawable drawable = this.f759k;
        if (drawable != null) {
            if (this.f765q || this.f766r) {
                Drawable m1845q = DrawableCompat.m1845q(drawable);
                this.f759k = m1845q;
                Drawable mutate = m1845q.mutate();
                this.f759k = mutate;
                if (this.f765q) {
                    DrawableCompat.m1842n(mutate, this.f763o);
                }
                if (this.f766r) {
                    DrawableCompat.m1843o(this.f759k, this.f764p);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f758j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f757i;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f761m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f750b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f759k;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f763o;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f764p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f754f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f749a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f756h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f755g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f751c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f752d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f753e;
        return charSequence != null ? charSequence : this.f752d;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f762n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f767s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f767s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f767s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f767s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f757i = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f767s = (z ? 1 : 0) | (this.f767s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f767s = (z ? 2 : 0) | (this.f767s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f761m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f767s = (z ? 16 : 0) | (this.f767s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f759k = drawable;
        m547c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f763o = colorStateList;
        this.f765q = true;
        m547c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f764p = mode;
        this.f766r = true;
        m547c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f754f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f755g = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f755g = c2;
        this.f757i = Character.toLowerCase(c3);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f752d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f753e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f762n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f767s = (this.f767s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f757i = Character.toLowerCase(c2);
        this.f758j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f761m = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f755g = c2;
        this.f756h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f752d = this.f760l.getResources().getString(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f762n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f759k = ContextCompat.m1671d(this.f760l, i2);
        m547c();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f755g = c2;
        this.f756h = KeyEvent.normalizeMetaState(i2);
        this.f757i = Character.toLowerCase(c3);
        this.f758j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
