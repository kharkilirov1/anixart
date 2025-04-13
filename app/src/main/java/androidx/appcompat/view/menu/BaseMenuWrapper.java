package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* loaded from: classes.dex */
abstract class BaseMenuWrapper {

    /* renamed from: a */
    public final Context f789a;

    /* renamed from: b */
    public SimpleArrayMap<SupportMenuItem, MenuItem> f790b;

    /* renamed from: c */
    public SimpleArrayMap<SupportSubMenu, SubMenu> f791c;

    public BaseMenuWrapper(Context context) {
        this.f789a = context;
    }

    /* renamed from: c */
    public final MenuItem m569c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f790b == null) {
            this.f790b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = this.f790b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f789a, supportMenuItem);
        this.f790b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* renamed from: d */
    public final SubMenu m570d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f791c == null) {
            this.f791c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.f791c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f789a, supportSubMenu);
        this.f791c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
