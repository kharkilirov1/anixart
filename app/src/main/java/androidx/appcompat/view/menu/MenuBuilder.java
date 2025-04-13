package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo
/* loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {

    /* renamed from: y */
    public static final int[] f863y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f864a;

    /* renamed from: b */
    public final Resources f865b;

    /* renamed from: c */
    public boolean f866c;

    /* renamed from: d */
    public boolean f867d;

    /* renamed from: e */
    public Callback f868e;

    /* renamed from: f */
    public ArrayList<MenuItemImpl> f869f;

    /* renamed from: g */
    public ArrayList<MenuItemImpl> f870g;

    /* renamed from: h */
    public boolean f871h;

    /* renamed from: i */
    public ArrayList<MenuItemImpl> f872i;

    /* renamed from: j */
    public ArrayList<MenuItemImpl> f873j;

    /* renamed from: k */
    public boolean f874k;

    /* renamed from: m */
    public CharSequence f876m;

    /* renamed from: n */
    public Drawable f877n;

    /* renamed from: o */
    public View f878o;

    /* renamed from: v */
    public MenuItemImpl f885v;

    /* renamed from: x */
    public boolean f887x;

    /* renamed from: l */
    public int f875l = 0;

    /* renamed from: p */
    public boolean f879p = false;

    /* renamed from: q */
    public boolean f880q = false;

    /* renamed from: r */
    public boolean f881r = false;

    /* renamed from: s */
    public boolean f882s = false;

    /* renamed from: t */
    public ArrayList<MenuItemImpl> f883t = new ArrayList<>();

    /* renamed from: u */
    public CopyOnWriteArrayList<WeakReference<MenuPresenter>> f884u = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    public boolean f886w = false;

    @RestrictTo
    public interface Callback {
        /* renamed from: a */
        boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);

        /* renamed from: b */
        void mo431b(@NonNull MenuBuilder menuBuilder);
    }

    @RestrictTo
    public interface ItemInvoker {
        /* renamed from: a */
        boolean mo587a(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        boolean z = false;
        this.f864a = context;
        Resources resources = context.getResources();
        this.f865b = resources;
        this.f869f = new ArrayList<>();
        this.f870g = new ArrayList<>();
        this.f871h = true;
        this.f872i = new ArrayList<>();
        this.f873j = new ArrayList<>();
        this.f874k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.m2365e(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.f867d = z;
    }

    /* renamed from: A */
    public void m597A() {
        this.f879p = false;
        if (this.f880q) {
            this.f880q = false;
            mo614p(this.f881r);
        }
    }

    /* renamed from: B */
    public void m598B() {
        if (this.f879p) {
            return;
        }
        this.f879p = true;
        this.f880q = false;
        this.f881r = false;
    }

    /* renamed from: a */
    public MenuItem mo599a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = f863y;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                MenuItemImpl menuItemImpl = new MenuItemImpl(this, i2, i3, i4, i7, charSequence, this.f875l);
                ArrayList<MenuItemImpl> arrayList = this.f869f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i5 = 0;
                        break;
                    }
                    if (arrayList.get(size).f898d <= i7) {
                        i5 = size + 1;
                        break;
                    }
                }
                arrayList.add(i5, menuItemImpl);
                mo614p(true);
                return menuItemImpl;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo599a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f864a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m600b(MenuPresenter menuPresenter, Context context) {
        this.f884u.add(new WeakReference<>(menuPresenter));
        menuPresenter.mo564i(context, this);
        this.f874k = true;
    }

    /* renamed from: c */
    public final void m601c(boolean z) {
        if (this.f882s) {
            return;
        }
        this.f882s = true;
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.f884u.remove(next);
            } else {
                menuPresenter.mo557b(this, z);
            }
        }
        this.f882s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.f885v;
        if (menuItemImpl != null) {
            mo602d(menuItemImpl);
        }
        this.f869f.clear();
        mo614p(true);
    }

    public void clearHeader() {
        this.f877n = null;
        this.f876m = null;
        this.f878o = null;
        mo614p(false);
    }

    @Override // android.view.Menu
    public void close() {
        m601c(true);
    }

    /* renamed from: d */
    public boolean mo602d(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (!this.f884u.isEmpty() && this.f885v == menuItemImpl) {
            m598B();
            Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.f884u.remove(next);
                } else {
                    z = menuPresenter.mo561f(this, menuItemImpl);
                    if (z) {
                        break;
                    }
                }
            }
            m597A();
            if (z) {
                this.f885v = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo603e(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        Callback callback = this.f868e;
        return callback != null && callback.mo429a(menuBuilder, menuItem);
    }

    /* renamed from: f */
    public boolean mo604f(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.f884u.isEmpty()) {
            return false;
        }
        m598B();
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.f884u.remove(next);
            } else {
                z = menuPresenter.mo562g(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        m597A();
        if (z) {
            this.f885v = menuItemImpl;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = this.f869f.get(i3);
            if (menuItemImpl.f895a == i2) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.f909o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public MenuItemImpl m605g(int i2, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.f883t;
        arrayList.clear();
        m606h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo612n = mo612n();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = arrayList.get(i3);
            char c2 = mo612n ? menuItemImpl.f904j : menuItemImpl.f902h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (mo612n && c2 == '\b' && i2 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f869f.get(i2);
    }

    /* renamed from: h */
    public void m606h(List<MenuItemImpl> list, int i2, KeyEvent keyEvent) {
        boolean mo612n = mo612n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f869f.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = this.f869f.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    menuItemImpl.f909o.m606h(list, i2, keyEvent);
                }
                char c2 = mo612n ? menuItemImpl.f904j : menuItemImpl.f902h;
                if (((modifiers & 69647) == ((mo612n ? menuItemImpl.f905k : menuItemImpl.f903i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (mo612n && c2 == '\b' && i2 == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f887x) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f869f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m607i() {
        ArrayList<MenuItemImpl> m610l = m610l();
        if (this.f874k) {
            Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.f884u.remove(next);
                } else {
                    z |= menuPresenter.mo560e();
                }
            }
            if (z) {
                this.f872i.clear();
                this.f873j.clear();
                int size = m610l.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = m610l.get(i2);
                    if (menuItemImpl.m629g()) {
                        this.f872i.add(menuItemImpl);
                    } else {
                        this.f873j.add(menuItemImpl);
                    }
                }
            } else {
                this.f872i.clear();
                this.f873j.clear();
                this.f873j.addAll(m610l());
            }
            this.f874k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m605g(i2, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo608j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public MenuBuilder mo609k() {
        return this;
    }

    @NonNull
    /* renamed from: l */
    public ArrayList<MenuItemImpl> m610l() {
        if (!this.f871h) {
            return this.f870g;
        }
        this.f870g.clear();
        int size = this.f869f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f869f.get(i2);
            if (menuItemImpl.isVisible()) {
                this.f870g.add(menuItemImpl);
            }
        }
        this.f871h = false;
        this.f874k = true;
        return this.f870g;
    }

    /* renamed from: m */
    public boolean mo611m() {
        return this.f886w;
    }

    /* renamed from: n */
    public boolean mo612n() {
        return this.f866c;
    }

    /* renamed from: o */
    public boolean mo613o() {
        return this.f867d;
    }

    /* renamed from: p */
    public void mo614p(boolean z) {
        if (this.f879p) {
            this.f880q = true;
            if (z) {
                this.f881r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f871h = true;
            this.f874k = true;
        }
        if (this.f884u.isEmpty()) {
            return;
        }
        m598B();
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.f884u.remove(next);
            } else {
                menuPresenter.mo559d(z);
            }
        }
        m597A();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return m615q(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemImpl m605g = m605g(i2, keyEvent);
        boolean m616r = m605g != null ? m616r(m605g, null, i3) : false;
        if ((i3 & 2) != 0) {
            m601c(true);
        }
        return m616r;
    }

    /* renamed from: q */
    public boolean m615q(MenuItem menuItem, int i2) {
        return m616r(menuItem, null, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m616r(android.view.MenuItem r7, androidx.appcompat.view.menu.MenuPresenter r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.MenuItemImpl r7 = (androidx.appcompat.view.menu.MenuItemImpl) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f910p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L21
        L19:
            androidx.appcompat.view.menu.MenuBuilder r1 = r7.f908n
            boolean r1 = r1.mo603e(r1, r7)
            if (r1 == 0) goto L23
        L21:
            r1 = 1
            goto L43
        L23:
            android.content.Intent r1 = r7.f901g
            if (r1 == 0) goto L37
            androidx.appcompat.view.menu.MenuBuilder r3 = r7.f908n     // Catch: android.content.ActivityNotFoundException -> L2f
            android.content.Context r3 = r3.f864a     // Catch: android.content.ActivityNotFoundException -> L2f
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2f
            goto L21
        L2f:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L37:
            androidx.core.view.ActionProvider r1 = r7.f891A
            if (r1 == 0) goto L42
            boolean r1 = r1.mo639e()
            if (r1 == 0) goto L42
            goto L21
        L42:
            r1 = 0
        L43:
            androidx.core.view.ActionProvider r3 = r7.f891A
            if (r3 == 0) goto L4f
            boolean r4 = r3.mo637a()
            if (r4 == 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            boolean r5 = r7.m628f()
            if (r5 == 0) goto L62
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.m601c(r2)
            goto Ld1
        L62:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L73
            if (r4 == 0) goto L6b
            goto L73
        L6b:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.m601c(r2)
            goto Ld1
        L73:
            r9 = r9 & 4
            if (r9 != 0) goto L7a
            r6.m601c(r0)
        L7a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8e
            androidx.appcompat.view.menu.SubMenuBuilder r9 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r5 = r6.f864a
            r9.<init>(r5, r6, r7)
            r7.f909o = r9
            java.lang.CharSequence r5 = r7.f899e
            r9.setHeaderTitle(r5)
        L8e:
            androidx.appcompat.view.menu.SubMenuBuilder r7 = r7.f909o
            if (r4 == 0) goto L95
            r3.mo640f(r7)
        L95:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r9 = r6.f884u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L9e
            goto Lcb
        L9e:
            if (r8 == 0) goto La4
            boolean r0 = r8.mo566l(r7)
        La4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r8 = r6.f884u
            java.util.Iterator r8 = r8.iterator()
        Laa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto Lc4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r6.f884u
            r3.remove(r9)
            goto Laa
        Lc4:
            if (r0 != 0) goto Laa
            boolean r0 = r3.mo566l(r7)
            goto Laa
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.m601c(r2)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.m616r(android.view.MenuItem, androidx.appcompat.view.menu.MenuPresenter, int):boolean");
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f869f.get(i3).f896b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f869f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f869f.get(i3).f896b != i2) {
                    break;
                }
                m617s(i3, false);
                i4 = i5;
            }
            mo614p(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f869f.get(i3).f895a == i2) {
                break;
            } else {
                i3++;
            }
        }
        m617s(i3, true);
    }

    /* renamed from: s */
    public final void m617s(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f869f.size()) {
            return;
        }
        this.f869f.remove(i2);
        if (z) {
            mo614p(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f869f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = this.f869f.get(i3);
            if (menuItemImpl.f896b == i2) {
                menuItemImpl.m633k(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f886w = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f869f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = this.f869f.get(i3);
            if (menuItemImpl.f896b == i2) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f869f.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = this.f869f.get(i3);
            if (menuItemImpl.f896b == i2 && menuItemImpl.m635m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo614p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f866c = z;
        mo614p(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f869f.size();
    }

    /* renamed from: t */
    public void m618t(MenuPresenter menuPresenter) {
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter2 = next.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.f884u.remove(next);
            }
        }
    }

    /* renamed from: u */
    public void m619u(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo608j());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).m619u(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: v */
    public void m620v(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f884u.isEmpty()) {
            return;
        }
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.f884u.remove(next);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    menuPresenter.mo573j(parcelable);
                }
            }
        }
    }

    /* renamed from: w */
    public void m621w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).m621w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo608j(), sparseArray);
        }
    }

    /* renamed from: x */
    public void m622x(Bundle bundle) {
        Parcelable mo575m;
        if (this.f884u.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<MenuPresenter>> it = this.f884u.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.f884u.remove(next);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (mo575m = menuPresenter.mo575m()) != null) {
                    sparseArray.put(id2, mo575m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: y */
    public void mo623y(Callback callback) {
        this.f868e = callback;
    }

    /* renamed from: z */
    public final void m624z(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f865b;
        if (view != null) {
            this.f878o = view;
            this.f876m = null;
            this.f877n = null;
        } else {
            if (i2 > 0) {
                this.f876m = resources.getText(i2);
            } else if (charSequence != null) {
                this.f876m = charSequence;
            }
            if (i3 > 0) {
                this.f877n = ContextCompat.m1671d(this.f864a, i3);
            } else if (drawable != null) {
                this.f877n = drawable;
            }
            this.f878o = null;
        }
        mo614p(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return mo599a(0, 0, 0, this.f865b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f865b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return mo599a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) mo599a(i2, i3, i4, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f864a, this, menuItemImpl);
        menuItemImpl.f909o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(menuItemImpl.f899e);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return mo599a(i2, i3, i4, this.f865b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f865b.getString(i5));
    }
}
