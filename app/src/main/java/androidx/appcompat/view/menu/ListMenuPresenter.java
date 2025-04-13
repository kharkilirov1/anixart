package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f847b;

    /* renamed from: c */
    public LayoutInflater f848c;

    /* renamed from: d */
    public MenuBuilder f849d;

    /* renamed from: e */
    public ExpandedMenuView f850e;

    /* renamed from: f */
    public int f851f = 0;

    /* renamed from: g */
    public int f852g;

    /* renamed from: h */
    public MenuPresenter.Callback f853h;

    /* renamed from: i */
    public MenuAdapter f854i;

    public class MenuAdapter extends BaseAdapter {

        /* renamed from: b */
        public int f855b = -1;

        public MenuAdapter() {
            m593a();
        }

        /* renamed from: a */
        public void m593a() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f849d;
            MenuItemImpl menuItemImpl = menuBuilder.f885v;
            if (menuItemImpl != null) {
                menuBuilder.m607i();
                ArrayList<MenuItemImpl> arrayList = menuBuilder.f873j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == menuItemImpl) {
                        this.f855b = i2;
                        return;
                    }
                }
            }
            this.f855b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItemImpl getItem(int i2) {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f849d;
            menuBuilder.m607i();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.f873j;
            Objects.requireNonNull(ListMenuPresenter.this);
            int i3 = i2 + 0;
            int i4 = this.f855b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f849d;
            menuBuilder.m607i();
            int size = menuBuilder.f873j.size();
            Objects.requireNonNull(ListMenuPresenter.this);
            int i2 = size + 0;
            return this.f855b < 0 ? i2 : i2 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f848c.inflate(listMenuPresenter.f852g, viewGroup, false);
            }
            ((MenuView.ItemView) view).mo550f(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m593a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i2) {
        this.f852g = i2;
        this.f847b = context;
        this.f848c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m591a() {
        if (this.f854i == null) {
            this.f854i = new MenuAdapter();
        }
        return this.f854i;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f853h;
        if (callback != null) {
            callback.mo439b(menuBuilder, z);
        }
    }

    /* renamed from: c */
    public MenuView m592c(ViewGroup viewGroup) {
        if (this.f850e == null) {
            this.f850e = (ExpandedMenuView) this.f848c.inflate(C2507R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f854i == null) {
                this.f854i = new MenuAdapter();
            }
            this.f850e.setAdapter((ListAdapter) this.f854i);
            this.f850e.setOnItemClickListener(this);
        }
        return this.f850e;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        MenuAdapter menuAdapter = this.f854i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
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
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: h */
    public void mo563h(MenuPresenter.Callback callback) {
        this.f853h = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: i */
    public void mo564i(Context context, MenuBuilder menuBuilder) {
        if (this.f851f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f851f);
            this.f847b = contextThemeWrapper;
            this.f848c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f847b != null) {
            this.f847b = context;
            if (this.f848c == null) {
                this.f848c = LayoutInflater.from(context);
            }
        }
        this.f849d = menuBuilder;
        MenuAdapter menuAdapter = this.f854i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f850e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper(subMenuBuilder);
        AlertDialog.Builder builder = new AlertDialog.Builder(subMenuBuilder.f864a);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext(), C2507R.layout.abc_list_menu_item_layout);
        menuDialogHelper.f890d = listMenuPresenter;
        listMenuPresenter.f853h = menuDialogHelper;
        MenuBuilder menuBuilder = menuDialogHelper.f888b;
        menuBuilder.m600b(listMenuPresenter, menuBuilder.f864a);
        ListAdapter m591a = menuDialogHelper.f890d.m591a();
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f389r = m591a;
        alertParams.f390s = menuDialogHelper;
        View view = subMenuBuilder.f878o;
        if (view != null) {
            alertParams.f376e = view;
        } else {
            alertParams.f374c = subMenuBuilder.f877n;
            builder.setTitle(subMenuBuilder.f876m);
        }
        builder.f413a.f387p = menuDialogHelper;
        AlertDialog create = builder.create();
        menuDialogHelper.f889c = create;
        create.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.f889c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.f889c.show();
        MenuPresenter.Callback callback = this.f853h;
        if (callback == null) {
            return true;
        }
        callback.mo440c(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: m */
    public Parcelable mo575m() {
        if (this.f850e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f850e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f849d.m616r(this.f854i.getItem(i2), this, 0);
    }
}
