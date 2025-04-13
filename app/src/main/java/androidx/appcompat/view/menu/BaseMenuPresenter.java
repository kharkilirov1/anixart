package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {

    /* renamed from: b */
    public Context f780b;

    /* renamed from: c */
    public Context f781c;

    /* renamed from: d */
    public MenuBuilder f782d;

    /* renamed from: e */
    public LayoutInflater f783e;

    /* renamed from: f */
    public MenuPresenter.Callback f784f;

    /* renamed from: g */
    public int f785g;

    /* renamed from: h */
    public int f786h;

    /* renamed from: i */
    public MenuView f787i;

    /* renamed from: j */
    public int f788j;

    public BaseMenuPresenter(Context context, int i2, int i3) {
        this.f780b = context;
        this.f783e = LayoutInflater.from(context);
        this.f785g = i2;
        this.f786h = i3;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f784f;
        if (callback != null) {
            callback.mo439b(menuBuilder, z);
        }
    }

    /* renamed from: c */
    public abstract void mo558c(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f787i;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f782d;
        int i2 = 0;
        if (menuBuilder != null) {
            menuBuilder.m607i();
            ArrayList<MenuItemImpl> m610l = this.f782d.m610l();
            int size = m610l.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemImpl menuItemImpl = m610l.get(i4);
                if (mo568o(i3, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i3);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View mo567n = mo567n(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        mo567n.setPressed(false);
                        mo567n.jumpDrawablesToCurrentState();
                    }
                    if (mo567n != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) mo567n.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(mo567n);
                        }
                        ((ViewGroup) this.f787i).addView(mo567n, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!mo565k(viewGroup, i2)) {
                i2++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: e */
    public boolean mo560e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: f */
    public boolean mo561f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: g */
    public boolean mo562g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f788j;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: h */
    public void mo563h(MenuPresenter.Callback callback) {
        this.f784f = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: i */
    public void mo564i(Context context, MenuBuilder menuBuilder) {
        this.f781c = context;
        LayoutInflater.from(context);
        this.f782d = menuBuilder;
    }

    /* renamed from: k */
    public boolean mo565k(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.MenuBuilder] */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.f784f;
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            subMenuBuilder2 = this.f782d;
        }
        return callback.mo440c(subMenuBuilder2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public View mo567n(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.f783e.inflate(this.f786h, viewGroup, false);
        mo558c(menuItemImpl, itemView);
        return (View) itemView;
    }

    /* renamed from: o */
    public boolean mo568o(int i2, MenuItemImpl menuItemImpl) {
        return true;
    }
}
