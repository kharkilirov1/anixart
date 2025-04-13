package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public interface MenuView {

    public interface ItemView {
        /* renamed from: f */
        void mo550f(MenuItemImpl menuItemImpl, int i2);

        MenuItemImpl getItemData();
    }

    /* renamed from: b */
    void mo588b(MenuBuilder menuBuilder);
}
