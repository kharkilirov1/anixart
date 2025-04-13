package com.google.android.material.internal;

import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationMenu extends MenuBuilder {
    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) mo599a(i2, i3, i4, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(this.f864a, this, menuItemImpl);
        menuItemImpl.f909o = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(menuItemImpl.f899e);
        return navigationSubMenu;
    }
}
