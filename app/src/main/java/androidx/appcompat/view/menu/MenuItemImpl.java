package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {

    /* renamed from: A */
    public ActionProvider f891A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f892B;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f894D;

    /* renamed from: a */
    public final int f895a;

    /* renamed from: b */
    public final int f896b;

    /* renamed from: c */
    public final int f897c;

    /* renamed from: d */
    public final int f898d;

    /* renamed from: e */
    public CharSequence f899e;

    /* renamed from: f */
    public CharSequence f900f;

    /* renamed from: g */
    public Intent f901g;

    /* renamed from: h */
    public char f902h;

    /* renamed from: j */
    public char f904j;

    /* renamed from: l */
    public Drawable f906l;

    /* renamed from: n */
    public MenuBuilder f908n;

    /* renamed from: o */
    public SubMenuBuilder f909o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f910p;

    /* renamed from: q */
    public CharSequence f911q;

    /* renamed from: r */
    public CharSequence f912r;

    /* renamed from: y */
    public int f919y;

    /* renamed from: z */
    public View f920z;

    /* renamed from: i */
    public int f903i = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k */
    public int f905k = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m */
    public int f907m = 0;

    /* renamed from: s */
    public ColorStateList f913s = null;

    /* renamed from: t */
    public PorterDuff.Mode f914t = null;

    /* renamed from: u */
    public boolean f915u = false;

    /* renamed from: v */
    public boolean f916v = false;

    /* renamed from: w */
    public boolean f917w = false;

    /* renamed from: x */
    public int f918x = 16;

    /* renamed from: C */
    public boolean f893C = false;

    public MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f919y = 0;
        this.f908n = menuBuilder;
        this.f895a = i3;
        this.f896b = i2;
        this.f897c = i4;
        this.f898d = i5;
        this.f899e = charSequence;
        this.f919y = i6;
    }

    /* renamed from: c */
    public static void m625c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    @NonNull
    /* renamed from: a */
    public SupportMenuItem mo545a(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f891A;
        if (actionProvider2 != null) {
            actionProvider2.f3574b = null;
            actionProvider2.f3573a = null;
        }
        this.f920z = null;
        this.f891A = actionProvider;
        this.f908n.mo614p(true);
        ActionProvider actionProvider3 = this.f891A;
        if (actionProvider3 != null) {
            actionProvider3.mo644h(new ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z) {
                    MenuBuilder menuBuilder = MenuItemImpl.this.f908n;
                    menuBuilder.f871h = true;
                    menuBuilder.mo614p(true);
                }
            });
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    /* renamed from: b */
    public ActionProvider mo546b() {
        return this.f891A;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f919y & 8) == 0) {
            return false;
        }
        if (this.f920z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f892B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f908n.mo602d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m626d(Drawable drawable) {
        if (drawable != null && this.f917w && (this.f915u || this.f916v)) {
            drawable = DrawableCompat.m1845q(drawable).mutate();
            if (this.f915u) {
                DrawableCompat.m1842n(drawable, this.f913s);
            }
            if (this.f916v) {
                DrawableCompat.m1843o(drawable, this.f914t);
            }
            this.f917w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public char m627e() {
        return this.f908n.mo612n() ? this.f904j : this.f902h;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!m628f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f892B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f908n.mo604f(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m628f() {
        ActionProvider actionProvider;
        if ((this.f919y & 8) == 0) {
            return false;
        }
        if (this.f920z == null && (actionProvider = this.f891A) != null) {
            this.f920z = actionProvider.mo642d(this);
        }
        return this.f920z != null;
    }

    /* renamed from: g */
    public boolean m629g() {
        return (this.f918x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.f920z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f891A;
        if (actionProvider == null) {
            return null;
        }
        View mo642d = actionProvider.mo642d(this);
        this.f920z = mo642d;
        return mo642d;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f905k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f904j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f911q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f896b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f906l;
        if (drawable != null) {
            return m626d(drawable);
        }
        int i2 = this.f907m;
        if (i2 == 0) {
            return null;
        }
        Drawable m497b = AppCompatResources.m497b(this.f908n.f864a, i2);
        this.f907m = 0;
        this.f906l = m497b;
        return m626d(m497b);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f913s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f914t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f901g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f895a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f894D;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f903i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f902h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f897c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f909o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f899e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f900f;
        return charSequence != null ? charSequence : this.f899e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f912r;
    }

    /* renamed from: h */
    public boolean m630h() {
        return (this.f918x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f909o != null;
    }

    @NonNull
    /* renamed from: i */
    public SupportMenuItem m631i(View view) {
        int i2;
        this.f920z = view;
        this.f891A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f895a) > 0) {
            view.setId(i2);
        }
        MenuBuilder menuBuilder = this.f908n;
        menuBuilder.f874k = true;
        menuBuilder.mo614p(true);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f893C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f918x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f918x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f918x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.f891A;
        return (actionProvider == null || !actionProvider.mo643g()) ? (this.f918x & 8) == 0 : (this.f918x & 8) == 0 && this.f891A.mo641b();
    }

    /* renamed from: j */
    public void m632j(boolean z) {
        int i2 = this.f918x;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.f918x = i3;
        if (i2 != i3) {
            this.f908n.mo614p(false);
        }
    }

    /* renamed from: k */
    public void m633k(boolean z) {
        this.f918x = (z ? 4 : 0) | (this.f918x & (-5));
    }

    /* renamed from: l */
    public void m634l(boolean z) {
        if (z) {
            this.f918x |= 32;
        } else {
            this.f918x &= -33;
        }
    }

    /* renamed from: m */
    public boolean m635m(boolean z) {
        int i2 = this.f918x;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.f918x = i3;
        return i2 != i3;
    }

    /* renamed from: n */
    public boolean m636n() {
        return this.f908n.mo613o() && m627e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m631i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f904j == c2) {
            return this;
        }
        this.f904j = Character.toLowerCase(c2);
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.f918x;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.f918x = i3;
        if (i2 != i3) {
            this.f908n.mo614p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f918x & 4) != 0) {
            MenuBuilder menuBuilder = this.f908n;
            Objects.requireNonNull(menuBuilder);
            int groupId = getGroupId();
            int size = menuBuilder.f869f.size();
            menuBuilder.m598B();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = menuBuilder.f869f.get(i2);
                if (menuItemImpl.f896b == groupId && menuItemImpl.m630h() && menuItemImpl.isCheckable()) {
                    menuItemImpl.m632j(menuItemImpl == this);
                }
            }
            menuBuilder.m597A();
        } else {
            m632j(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f911q = charSequence;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f918x |= 16;
        } else {
            this.f918x &= -17;
        }
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f907m = 0;
        this.f906l = drawable;
        this.f917w = true;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f913s = colorStateList;
        this.f915u = true;
        this.f917w = true;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f914t = mode;
        this.f916v = true;
        this.f917w = true;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f901g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f902h == c2) {
            return this;
        }
        this.f902h = c2;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f892B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f910p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f902h = c2;
        this.f904j = Character.toLowerCase(c3);
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f919y = i2;
        MenuBuilder menuBuilder = this.f908n;
        menuBuilder.f874k = true;
        menuBuilder.mo614p(true);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f899e = charSequence;
        this.f908n.mo614p(false);
        SubMenuBuilder subMenuBuilder = this.f909o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f900f = charSequence;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f912r = charSequence;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m635m(z)) {
            MenuBuilder menuBuilder = this.f908n;
            menuBuilder.f871h = true;
            menuBuilder.mo614p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f899e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setActionView(int i2) {
        Context context = this.f908n.f864a;
        m631i(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f911q = charSequence;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f912r = charSequence;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f904j == c2 && this.f905k == i2) {
            return this;
        }
        this.f904j = Character.toLowerCase(c2);
        this.f905k = KeyEvent.normalizeMetaState(i2);
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f902h == c2 && this.f903i == i2) {
            return this;
        }
        this.f902h = c2;
        this.f903i = KeyEvent.normalizeMetaState(i2);
        this.f908n.mo614p(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f902h = c2;
        this.f903i = KeyEvent.normalizeMetaState(i2);
        this.f904j = Character.toLowerCase(c3);
        this.f905k = KeyEvent.normalizeMetaState(i3);
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f906l = null;
        this.f907m = i2;
        this.f917w = true;
        this.f908n.mo614p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.f908n.f864a.getString(i2));
        return this;
    }
}
