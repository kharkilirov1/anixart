package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo
/* loaded from: classes.dex */
public class NavigationSubMenu extends SubMenuBuilder {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, MenuItemImpl menuItemImpl) {
        super(context, navigationMenu, menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    /* renamed from: p */
    public void mo614p(boolean z) {
        super.mo614p(z);
        this.f970z.mo614p(z);
    }
}
