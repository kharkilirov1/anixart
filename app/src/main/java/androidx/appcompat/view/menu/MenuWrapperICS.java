package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

@RestrictTo
/* loaded from: classes.dex */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {

    /* renamed from: d */
    public final SupportMenu f946d;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f946d = supportMenu;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m569c(this.f946d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f946d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m569c(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m570d(this.f946d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.f790b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<SupportSubMenu, SubMenu> simpleArrayMap2 = this.f791c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
        this.f946d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f946d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return m569c(this.f946d.findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return m569c(this.f946d.getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f946d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f946d.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return this.f946d.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f946d.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        if (this.f790b != null) {
            int i3 = 0;
            while (i3 < this.f790b.size()) {
                if (this.f790b.m1122i(i3).getGroupId() == i2) {
                    this.f790b.mo1124k(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f946d.removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        if (this.f790b != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f790b.size()) {
                    break;
                }
                if (this.f790b.m1122i(i3).getItemId() == i2) {
                    this.f790b.mo1124k(i3);
                    break;
                }
                i3++;
            }
        }
        this.f946d.removeItem(i2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        this.f946d.setGroupCheckable(i2, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        this.f946d.setGroupEnabled(i2, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        this.f946d.setGroupVisible(i2, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f946d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f946d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return m569c(this.f946d.add(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return m570d(this.f946d.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m569c(this.f946d.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return m570d(this.f946d.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return m569c(this.f946d.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return m570d(this.f946d.addSubMenu(i2, i3, i4, i5));
    }
}
