package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {

    /* renamed from: F */
    public static Method f1387F;

    /* renamed from: E */
    public MenuItemHoverListener f1388E;

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m878a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m879b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m880a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    @RestrictTo
    public static class MenuDropDownListView extends DropDownListView {

        /* renamed from: o */
        public final int f1389o;

        /* renamed from: p */
        public final int f1390p;

        /* renamed from: q */
        public MenuItemHoverListener f1391q;

        /* renamed from: r */
        public MenuItem f1392r;

        @RequiresApi
        public static class Api17Impl {
            @DoNotInline
            /* renamed from: a */
            public static int m881a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == Api17Impl.m881a(context.getResources().getConfiguration())) {
                this.f1389o = 21;
                this.f1390p = 22;
            } else {
                this.f1389o = 22;
                this.f1390p = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            MenuAdapter menuAdapter;
            int pointToPosition;
            int i3;
            if (this.f1391q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    menuAdapter = (MenuAdapter) adapter;
                }
                MenuItemImpl menuItemImpl = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < menuAdapter.getCount()) {
                    menuItemImpl = menuAdapter.getItem(i3);
                }
                MenuItem menuItem = this.f1392r;
                if (menuItem != menuItemImpl) {
                    MenuBuilder menuBuilder = menuAdapter.f857b;
                    if (menuItem != null) {
                        this.f1391q.mo586i(menuBuilder, menuItem);
                    }
                    this.f1392r = menuItemImpl;
                    if (menuItemImpl != null) {
                        this.f1391q.mo585f(menuBuilder, menuItemImpl);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1389o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f1390p) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter) adapter).f857b.m601c(false);
            return true;
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.f1391q = menuItemHoverListener;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1387F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, null, i2, i3);
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    /* renamed from: f */
    public void mo585f(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1388E;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.mo585f(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    /* renamed from: i */
    public void mo586i(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1388E;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.mo586i(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    /* renamed from: q */
    public DropDownListView mo869q(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    /* renamed from: t */
    public void m875t(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.m878a(this.f1354A, null);
        }
    }

    /* renamed from: u */
    public void m876u(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.m879b(this.f1354A, null);
        }
    }

    /* renamed from: v */
    public void m877v(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            Api29Impl.m880a(this.f1354A, z);
            return;
        }
        Method method = f1387F;
        if (method != null) {
            try {
                method.invoke(this.f1354A, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
