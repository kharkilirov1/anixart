package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a */
    public Toolbar f1636a;

    /* renamed from: b */
    public int f1637b;

    /* renamed from: c */
    public View f1638c;

    /* renamed from: d */
    public View f1639d;

    /* renamed from: e */
    public Drawable f1640e;

    /* renamed from: f */
    public Drawable f1641f;

    /* renamed from: g */
    public Drawable f1642g;

    /* renamed from: h */
    public boolean f1643h;

    /* renamed from: i */
    public CharSequence f1644i;

    /* renamed from: j */
    public CharSequence f1645j;

    /* renamed from: k */
    public CharSequence f1646k;

    /* renamed from: l */
    public Window.Callback f1647l;

    /* renamed from: m */
    public boolean f1648m;

    /* renamed from: n */
    public ActionMenuPresenter f1649n;

    /* renamed from: o */
    public int f1650o;

    /* renamed from: p */
    public Drawable f1651p;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f1650o = 0;
        this.f1636a = toolbar;
        this.f1644i = toolbar.getTitle();
        this.f1645j = toolbar.getSubtitle();
        this.f1643h = this.f1644i != null;
        this.f1642g = toolbar.getNavigationIcon();
        TintTypedArray m951r = TintTypedArray.m951r(toolbar.getContext(), null, C0055R.styleable.f290a, C2507R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.f1651p = m951r.m958g(15);
        if (z) {
            CharSequence m966o = m951r.m966o(27);
            if (!TextUtils.isEmpty(m966o)) {
                setTitle(m966o);
            }
            CharSequence m966o2 = m951r.m966o(25);
            if (!TextUtils.isEmpty(m966o2)) {
                this.f1645j = m966o2;
                if ((this.f1637b & 8) != 0) {
                    this.f1636a.setSubtitle(m966o2);
                }
            }
            Drawable m958g = m951r.m958g(20);
            if (m958g != null) {
                this.f1641f = m958g;
                m995C();
            }
            Drawable m958g2 = m951r.m958g(17);
            if (m958g2 != null) {
                this.f1640e = m958g2;
                m995C();
            }
            if (this.f1642g == null && (drawable = this.f1651p) != null) {
                this.f1642g = drawable;
                m994B();
            }
            mo837m(m951r.m961j(10, 0));
            int m964m = m951r.m964m(9, 0);
            if (m964m != 0) {
                View inflate = LayoutInflater.from(this.f1636a.getContext()).inflate(m964m, (ViewGroup) this.f1636a, false);
                View view = this.f1639d;
                if (view != null && (this.f1637b & 16) != 0) {
                    this.f1636a.removeView(view);
                }
                this.f1639d = inflate;
                if (inflate != null && (this.f1637b & 16) != 0) {
                    this.f1636a.addView(inflate);
                }
                mo837m(this.f1637b | 16);
            }
            int m963l = m951r.m963l(13, 0);
            if (m963l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1636a.getLayoutParams();
                layoutParams.height = m963l;
                this.f1636a.setLayoutParams(layoutParams);
            }
            int m956e = m951r.m956e(7, -1);
            int m956e2 = m951r.m956e(3, -1);
            if (m956e >= 0 || m956e2 >= 0) {
                Toolbar toolbar2 = this.f1636a;
                int max = Math.max(m956e, 0);
                int max2 = Math.max(m956e2, 0);
                toolbar2.m973d();
                toolbar2.f1621u.m897a(max, max2);
            }
            int m964m2 = m951r.m964m(28, 0);
            if (m964m2 != 0) {
                Toolbar toolbar3 = this.f1636a;
                Context context = toolbar3.getContext();
                toolbar3.f1613m = m964m2;
                TextView textView = toolbar3.f1603c;
                if (textView != null) {
                    textView.setTextAppearance(context, m964m2);
                }
            }
            int m964m3 = m951r.m964m(26, 0);
            if (m964m3 != 0) {
                Toolbar toolbar4 = this.f1636a;
                Context context2 = toolbar4.getContext();
                toolbar4.f1614n = m964m3;
                TextView textView2 = toolbar4.f1604d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, m964m3);
                }
            }
            int m964m4 = m951r.m964m(22, 0);
            if (m964m4 != 0) {
                this.f1636a.setPopupTheme(m964m4);
            }
        } else {
            if (this.f1636a.getNavigationIcon() != null) {
                this.f1651p = this.f1636a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f1637b = i2;
        }
        m951r.f1582b.recycle();
        if (C2507R.string.abc_action_bar_up_description != this.f1650o) {
            this.f1650o = C2507R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f1636a.getNavigationContentDescription())) {
                m996y(this.f1650o);
            }
        }
        this.f1646k = this.f1636a.getNavigationContentDescription();
        this.f1636a.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1

            /* renamed from: b */
            public final ActionMenuItem f1652b;

            {
                this.f1652b = new ActionMenuItem(ToolbarWidgetWrapper.this.f1636a.getContext(), 0, R.id.home, 0, ToolbarWidgetWrapper.this.f1644i);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.f1647l;
                if (callback == null || !toolbarWidgetWrapper.f1648m) {
                    return;
                }
                callback.onMenuItemSelected(0, this.f1652b);
            }
        });
    }

    /* renamed from: A */
    public final void m993A() {
        if ((this.f1637b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1646k)) {
                this.f1636a.setNavigationContentDescription(this.f1650o);
            } else {
                this.f1636a.setNavigationContentDescription(this.f1646k);
            }
        }
    }

    /* renamed from: B */
    public final void m994B() {
        if ((this.f1637b & 4) == 0) {
            this.f1636a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1636a;
        Drawable drawable = this.f1642g;
        if (drawable == null) {
            drawable = this.f1651p;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: C */
    public final void m995C() {
        Drawable drawable;
        int i2 = this.f1637b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1641f;
            if (drawable == null) {
                drawable = this.f1640e;
            }
        } else {
            drawable = this.f1640e;
        }
        this.f1636a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: a */
    public void mo825a(Menu menu, MenuPresenter.Callback callback) {
        MenuItemImpl menuItemImpl;
        if (this.f1649n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1636a.getContext());
            this.f1649n = actionMenuPresenter;
            actionMenuPresenter.f788j = C2507R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f1649n;
        actionMenuPresenter2.f784f = callback;
        Toolbar toolbar = this.f1636a;
        MenuBuilder menuBuilder = (MenuBuilder) menu;
        if (menuBuilder == null && toolbar.f1602b == null) {
            return;
        }
        toolbar.m975f();
        MenuBuilder menuBuilder2 = toolbar.f1602b.f1065q;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.m618t(toolbar.f1596M);
            menuBuilder2.m618t(toolbar.f1597N);
        }
        if (toolbar.f1597N == null) {
            toolbar.f1597N = toolbar.new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter2.f1046s = true;
        if (menuBuilder != null) {
            menuBuilder.m600b(actionMenuPresenter2, toolbar.f1611k);
            menuBuilder.m600b(toolbar.f1597N, toolbar.f1611k);
        } else {
            actionMenuPresenter2.mo564i(toolbar.f1611k, null);
            Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = toolbar.f1597N;
            MenuBuilder menuBuilder3 = expandedActionViewMenuPresenter.f1630b;
            if (menuBuilder3 != null && (menuItemImpl = expandedActionViewMenuPresenter.f1631c) != null) {
                menuBuilder3.mo602d(menuItemImpl);
            }
            expandedActionViewMenuPresenter.f1630b = null;
            actionMenuPresenter2.mo559d(true);
            toolbar.f1597N.mo559d(true);
        }
        toolbar.f1602b.setPopupTheme(toolbar.f1612l);
        toolbar.f1602b.setPresenter(actionMenuPresenter2);
        toolbar.f1596M = actionMenuPresenter2;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: b */
    public void mo826b(Drawable drawable) {
        ViewCompat.m2204i0(this.f1636a, drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: c */
    public boolean mo827c() {
        return this.f1636a.m986q();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f1636a.f1597N;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f1631c;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: d */
    public void mo828d() {
        this.f1648m = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: e */
    public boolean mo829e() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1636a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1602b) != null && actionMenuView.f1068t;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo830f() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1636a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1602b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.f1069u
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r3 = r0.f1050w
            if (r3 != 0) goto L19
            boolean r0 = r0.m691r()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ToolbarWidgetWrapper.mo830f():boolean");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: g */
    public Context mo831g() {
        return this.f1636a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.f1636a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: h */
    public boolean mo832h() {
        ActionMenuView actionMenuView = this.f1636a.f1602b;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f1069u;
        return actionMenuPresenter != null && actionMenuPresenter.m690q();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: i */
    public boolean mo833i() {
        return this.f1636a.m992w();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: j */
    public void mo834j() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f1636a.f1602b;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f1069u) == null) {
            return;
        }
        actionMenuPresenter.m689p();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: k */
    public void mo835k(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f1638c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1636a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1638c);
            }
        }
        this.f1638c = null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: l */
    public boolean mo836l() {
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f1636a.f1597N;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.f1631c == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: m */
    public void mo837m(int i2) {
        View view;
        int i3 = this.f1637b ^ i2;
        this.f1637b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m993A();
                }
                m994B();
            }
            if ((i3 & 3) != 0) {
                m995C();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f1636a.setTitle(this.f1644i);
                    this.f1636a.setSubtitle(this.f1645j);
                } else {
                    this.f1636a.setTitle((CharSequence) null);
                    this.f1636a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f1639d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f1636a.addView(view);
            } else {
                this.f1636a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: n */
    public Menu mo838n() {
        return this.f1636a.getMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: o */
    public void mo839o(int i2) {
        this.f1641f = i2 != 0 ? AppCompatResources.m497b(mo831g(), i2) : null;
        m995C();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: p */
    public int mo840p() {
        return 0;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: q */
    public ViewPropertyAnimatorCompat mo841q(final int i2, long j2) {
        ViewPropertyAnimatorCompat m2189b = ViewCompat.m2189b(this.f1636a);
        m2189b.m2388a(i2 == 0 ? 1.0f : 0.0f);
        m2189b.m2390c(j2);
        ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2

            /* renamed from: a */
            public boolean f1654a = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: a */
            public void mo661a(View view) {
                this.f1654a = true;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: b */
            public void mo436b(View view) {
                if (this.f1654a) {
                    return;
                }
                ToolbarWidgetWrapper.this.f1636a.setVisibility(i2);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: c */
            public void mo437c(View view) {
                ToolbarWidgetWrapper.this.f1636a.setVisibility(0);
            }
        };
        View view = m2189b.f3672a.get();
        if (view != null) {
            m2189b.m2392e(view, viewPropertyAnimatorListenerAdapter);
        }
        return m2189b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: r */
    public void mo842r(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        Toolbar toolbar = this.f1636a;
        toolbar.f1598O = callback;
        toolbar.f1599P = callback2;
        ActionMenuView actionMenuView = toolbar.f1602b;
        if (actionMenuView != null) {
            actionMenuView.f1070v = callback;
            actionMenuView.f1071w = callback2;
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: s */
    public ViewGroup mo843s() {
        return this.f1636a;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int i2) {
        this.f1640e = i2 != 0 ? AppCompatResources.m497b(mo831g(), i2) : null;
        m995C();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.f1643h = true;
        m997z(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int i2) {
        this.f1636a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.f1647l = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1643h) {
            return;
        }
        m997z(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: t */
    public void mo844t(boolean z) {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: u */
    public int mo845u() {
        return this.f1637b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: v */
    public void mo846v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: w */
    public void mo847w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    /* renamed from: x */
    public void mo848x(boolean z) {
        this.f1636a.setCollapsible(z);
    }

    /* renamed from: y */
    public void m996y(int i2) {
        this.f1646k = i2 == 0 ? null : mo831g().getString(i2);
        m993A();
    }

    /* renamed from: z */
    public final void m997z(CharSequence charSequence) {
        this.f1644i = charSequence;
        if ((this.f1637b & 8) != 0) {
            this.f1636a.setTitle(charSequence);
            if (this.f1643h) {
                ViewCompat.m2202h0(this.f1636a.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.f1640e = drawable;
        m995C();
    }
}
