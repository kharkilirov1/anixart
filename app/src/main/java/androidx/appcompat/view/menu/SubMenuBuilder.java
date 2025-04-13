package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo
/* loaded from: classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: A */
    public MenuItemImpl f969A;

    /* renamed from: z */
    public MenuBuilder f970z;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f970z = menuBuilder;
        this.f969A = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: d */
    public boolean mo602d(MenuItemImpl menuItemImpl) {
        return this.f970z.mo602d(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: e */
    public boolean mo603e(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        return super.mo603e(menuBuilder, menuItem) || this.f970z.mo603e(menuBuilder, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: f */
    public boolean mo604f(MenuItemImpl menuItemImpl) {
        return this.f970z.mo604f(menuItemImpl);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f969A;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: j */
    public String mo608j() {
        MenuItemImpl menuItemImpl = this.f969A;
        int i2 = menuItemImpl != null ? menuItemImpl.f895a : 0;
        if (i2 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i2;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: k */
    public MenuBuilder mo609k() {
        return this.f970z.mo609k();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: m */
    public boolean mo611m() {
        return this.f970z.mo611m();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: n */
    public boolean mo612n() {
        return this.f970z.mo612n();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: o */
    public boolean mo613o() {
        return this.f970z.mo613o();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f970z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m624z(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m624z(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m624z(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f969A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f970z.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: y */
    public void mo623y(MenuBuilder.Callback callback) {
        this.f970z.mo623y(callback);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        m624z(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        m624z(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.f969A.setIcon(i2);
        return this;
    }
}
