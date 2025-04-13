package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {

    /* renamed from: b */
    public MenuBuilder f857b;

    /* renamed from: c */
    public int f858c = -1;

    /* renamed from: d */
    public boolean f859d;

    /* renamed from: e */
    public final boolean f860e;

    /* renamed from: f */
    public final LayoutInflater f861f;

    /* renamed from: g */
    public final int f862g;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f860e = z;
        this.f861f = layoutInflater;
        this.f857b = menuBuilder;
        this.f862g = i2;
        m595a();
    }

    /* renamed from: a */
    public void m595a() {
        MenuBuilder menuBuilder = this.f857b;
        MenuItemImpl menuItemImpl = menuBuilder.f885v;
        if (menuItemImpl != null) {
            menuBuilder.m607i();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.f873j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == menuItemImpl) {
                    this.f858c = i2;
                    return;
                }
            }
        }
        this.f858c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MenuItemImpl getItem(int i2) {
        ArrayList<MenuItemImpl> m610l;
        if (this.f860e) {
            MenuBuilder menuBuilder = this.f857b;
            menuBuilder.m607i();
            m610l = menuBuilder.f873j;
        } else {
            m610l = this.f857b.m610l();
        }
        int i3 = this.f858c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return m610l.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> m610l;
        if (this.f860e) {
            MenuBuilder menuBuilder = this.f857b;
            menuBuilder.m607i();
            m610l = menuBuilder.f873j;
        } else {
            m610l = this.f857b.m610l();
        }
        return this.f858c < 0 ? m610l.size() : m610l.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f861f.inflate(this.f862g, viewGroup, false);
        }
        int i3 = getItem(i2).f896b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f857b.mo611m() && i3 != (i4 >= 0 ? getItem(i4).f896b : i3));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f859d) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.mo550f(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m595a();
        super.notifyDataSetChanged();
    }
}
