package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0055R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {

    /* renamed from: A */
    public ColorStateList f1584A;

    /* renamed from: B */
    public ColorStateList f1585B;

    /* renamed from: C */
    public boolean f1586C;

    /* renamed from: D */
    public boolean f1587D;

    /* renamed from: E */
    public final ArrayList<View> f1588E;

    /* renamed from: F */
    public final ArrayList<View> f1589F;

    /* renamed from: G */
    public final int[] f1590G;

    /* renamed from: H */
    public final MenuHostHelper f1591H;

    /* renamed from: I */
    public ArrayList<MenuItem> f1592I;

    /* renamed from: J */
    public OnMenuItemClickListener f1593J;

    /* renamed from: K */
    public final ActionMenuView.OnMenuItemClickListener f1594K;

    /* renamed from: L */
    public ToolbarWidgetWrapper f1595L;

    /* renamed from: M */
    public ActionMenuPresenter f1596M;

    /* renamed from: N */
    public ExpandedActionViewMenuPresenter f1597N;

    /* renamed from: O */
    public MenuPresenter.Callback f1598O;

    /* renamed from: P */
    public MenuBuilder.Callback f1599P;

    /* renamed from: Q */
    public boolean f1600Q;

    /* renamed from: R */
    public final Runnable f1601R;

    /* renamed from: b */
    public ActionMenuView f1602b;

    /* renamed from: c */
    public TextView f1603c;

    /* renamed from: d */
    public TextView f1604d;

    /* renamed from: e */
    public ImageButton f1605e;

    /* renamed from: f */
    public ImageView f1606f;

    /* renamed from: g */
    public Drawable f1607g;

    /* renamed from: h */
    public CharSequence f1608h;

    /* renamed from: i */
    public ImageButton f1609i;

    /* renamed from: j */
    public View f1610j;

    /* renamed from: k */
    public Context f1611k;

    /* renamed from: l */
    public int f1612l;

    /* renamed from: m */
    public int f1613m;

    /* renamed from: n */
    public int f1614n;

    /* renamed from: o */
    public int f1615o;

    /* renamed from: p */
    public int f1616p;

    /* renamed from: q */
    public int f1617q;

    /* renamed from: r */
    public int f1618r;

    /* renamed from: s */
    public int f1619s;

    /* renamed from: t */
    public int f1620t;

    /* renamed from: u */
    public RtlSpacingHelper f1621u;

    /* renamed from: v */
    public int f1622v;

    /* renamed from: w */
    public int f1623w;

    /* renamed from: x */
    public int f1624x;

    /* renamed from: y */
    public CharSequence f1625y;

    /* renamed from: z */
    public CharSequence f1626z;

    public class ExpandedActionViewMenuPresenter implements MenuPresenter {

        /* renamed from: b */
        public MenuBuilder f1630b;

        /* renamed from: c */
        public MenuItemImpl f1631c;

        public ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: b */
        public void mo557b(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: d */
        public void mo559d(boolean z) {
            if (this.f1631c != null) {
                MenuBuilder menuBuilder = this.f1630b;
                boolean z2 = false;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f1630b.getItem(i2) == this.f1631c) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                mo561f(this.f1630b, this.f1631c);
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
            KeyEvent.Callback callback = Toolbar.this.f1610j;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo528d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1610j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1609i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1610j = null;
            int size = toolbar3.f1589F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f1589F.clear();
                    this.f1631c = null;
                    Toolbar.this.requestLayout();
                    menuItemImpl.f893C = false;
                    menuItemImpl.f908n.mo614p(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f1589F.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: g */
        public boolean mo562g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.m972c();
            ViewParent parent = Toolbar.this.f1609i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1609i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1609i);
            }
            Toolbar.this.f1610j = menuItemImpl.getActionView();
            this.f1631c = menuItemImpl;
            ViewParent parent2 = Toolbar.this.f1610j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1610j);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f316a = 8388611 | (toolbar4.f1615o & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                generateDefaultLayoutParams.f1633b = 2;
                toolbar4.f1610j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1610j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).f1633b != 2 && childAt != toolbar6.f1602b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f1589F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            menuItemImpl.f893C = true;
            menuItemImpl.f908n.mo614p(false);
            KeyEvent.Callback callback = Toolbar.this.f1610j;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo527c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: i */
        public void mo564i(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f1630b;
            if (menuBuilder2 != null && (menuItemImpl = this.f1631c) != null) {
                menuBuilder2.mo602d(menuItemImpl);
            }
            this.f1630b = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: j */
        public void mo573j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: l */
        public boolean mo566l(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* renamed from: m */
        public Parcelable mo575m() {
            return null;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.toolbarStyle);
        this.f1624x = 8388627;
        this.f1588E = new ArrayList<>();
        this.f1589F = new ArrayList<>();
        this.f1590G = new int[2];
        this.f1591H = new MenuHostHelper(new RunnableC0142a(this, 2));
        this.f1592I = new ArrayList<>();
        this.f1594K = new ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (Toolbar.this.f1591H.m2107d(menuItem)) {
                    return true;
                }
                OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.f1593J;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.f1601R = new Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.m992w();
            }
        };
        Context context2 = getContext();
        int[] iArr = C0055R.styleable.f315z;
        TintTypedArray m951r = TintTypedArray.m951r(context2, attributeSet, iArr, C2507R.attr.toolbarStyle, 0);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, m951r.f1582b, C2507R.attr.toolbarStyle, 0);
        this.f1613m = m951r.m964m(28, 0);
        this.f1614n = m951r.m964m(19, 0);
        this.f1624x = m951r.m962k(0, this.f1624x);
        this.f1615o = m951r.m962k(2, 48);
        int m956e = m951r.m956e(22, 0);
        m956e = m951r.m967p(27) ? m951r.m956e(27, m956e) : m956e;
        this.f1620t = m956e;
        this.f1619s = m956e;
        this.f1618r = m956e;
        this.f1617q = m956e;
        int m956e2 = m951r.m956e(25, -1);
        if (m956e2 >= 0) {
            this.f1617q = m956e2;
        }
        int m956e3 = m951r.m956e(24, -1);
        if (m956e3 >= 0) {
            this.f1618r = m956e3;
        }
        int m956e4 = m951r.m956e(26, -1);
        if (m956e4 >= 0) {
            this.f1619s = m956e4;
        }
        int m956e5 = m951r.m956e(23, -1);
        if (m956e5 >= 0) {
            this.f1620t = m956e5;
        }
        this.f1616p = m951r.m957f(13, -1);
        int m956e6 = m951r.m956e(9, Integer.MIN_VALUE);
        int m956e7 = m951r.m956e(5, Integer.MIN_VALUE);
        int m957f = m951r.m957f(7, 0);
        int m957f2 = m951r.m957f(8, 0);
        m973d();
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        rtlSpacingHelper.f1417h = false;
        if (m957f != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1414e = m957f;
            rtlSpacingHelper.f1410a = m957f;
        }
        if (m957f2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.f1415f = m957f2;
            rtlSpacingHelper.f1411b = m957f2;
        }
        if (m956e6 != Integer.MIN_VALUE || m956e7 != Integer.MIN_VALUE) {
            rtlSpacingHelper.m897a(m956e6, m956e7);
        }
        this.f1622v = m951r.m956e(10, Integer.MIN_VALUE);
        this.f1623w = m951r.m956e(6, Integer.MIN_VALUE);
        this.f1607g = m951r.m958g(4);
        this.f1608h = m951r.m966o(3);
        CharSequence m966o = m951r.m966o(21);
        if (!TextUtils.isEmpty(m966o)) {
            setTitle(m966o);
        }
        CharSequence m966o2 = m951r.m966o(18);
        if (!TextUtils.isEmpty(m966o2)) {
            setSubtitle(m966o2);
        }
        this.f1611k = getContext();
        setPopupTheme(m951r.m964m(17, 0));
        Drawable m958g = m951r.m958g(16);
        if (m958g != null) {
            setNavigationIcon(m958g);
        }
        CharSequence m966o3 = m951r.m966o(15);
        if (!TextUtils.isEmpty(m966o3)) {
            setNavigationContentDescription(m966o3);
        }
        Drawable m958g2 = m951r.m958g(11);
        if (m958g2 != null) {
            setLogo(m958g2);
        }
        CharSequence m966o4 = m951r.m966o(12);
        if (!TextUtils.isEmpty(m966o4)) {
            setLogoDescription(m966o4);
        }
        if (m951r.m967p(29)) {
            setTitleTextColor(m951r.m954c(29));
        }
        if (m951r.m967p(20)) {
            setSubtitleTextColor(m951r.m954c(20));
        }
        if (m951r.m967p(14)) {
            getMenuInflater().inflate(m951r.m964m(14, 0), getMenu());
        }
        m951r.f1582b.recycle();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    /* renamed from: a */
    public final void m970a(List<View> list, int i2) {
        boolean z = ViewCompat.m2231w(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, ViewCompat.m2231w(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1633b == 0 && m991v(childAt) && m979j(layoutParams.f316a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1633b == 0 && m991v(childAt2) && m979j(layoutParams2.f316a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        MenuHostHelper menuHostHelper = this.f1591H;
        menuHostHelper.f3621b.add(menuProvider);
        menuHostHelper.f3620a.run();
    }

    /* renamed from: b */
    public final void m971b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.f1633b = 1;
        if (!z || this.f1610j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f1589F.add(view);
        }
    }

    /* renamed from: c */
    public void m972c() {
        if (this.f1609i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C2507R.attr.toolbarNavigationButtonStyle);
            this.f1609i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1607g);
            this.f1609i.setContentDescription(this.f1608h);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f316a = 8388611 | (this.f1615o & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            generateDefaultLayoutParams.f1633b = 2;
            this.f1609i.setLayoutParams(generateDefaultLayoutParams);
            this.f1609i.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = Toolbar.this.f1597N;
                    MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f1631c;
                    if (menuItemImpl != null) {
                        menuItemImpl.collapseActionView();
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final void m973d() {
        if (this.f1621u == null) {
            this.f1621u = new RtlSpacingHelper();
        }
    }

    /* renamed from: e */
    public final void m974e() {
        m975f();
        ActionMenuView actionMenuView = this.f1602b;
        if (actionMenuView.f1065q == null) {
            MenuBuilder menuBuilder = (MenuBuilder) actionMenuView.getMenu();
            if (this.f1597N == null) {
                this.f1597N = new ExpandedActionViewMenuPresenter();
            }
            this.f1602b.setExpandedActionViewsExclusive(true);
            menuBuilder.m600b(this.f1597N, this.f1611k);
        }
    }

    /* renamed from: f */
    public final void m975f() {
        if (this.f1602b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1602b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1612l);
            this.f1602b.setOnMenuItemClickListener(this.f1594K);
            ActionMenuView actionMenuView2 = this.f1602b;
            MenuPresenter.Callback callback = this.f1598O;
            MenuBuilder.Callback callback2 = this.f1599P;
            actionMenuView2.f1070v = callback;
            actionMenuView2.f1071w = callback2;
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f316a = 8388613 | (this.f1615o & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1602b.setLayoutParams(generateDefaultLayoutParams);
            m971b(this.f1602b, false);
        }
    }

    /* renamed from: g */
    public final void m976g() {
        if (this.f1605e == null) {
            this.f1605e = new AppCompatImageButton(getContext(), null, C2507R.attr.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f316a = 8388611 | (this.f1615o & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1605e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1609i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1609i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1416g ? rtlSpacingHelper.f1410a : rtlSpacingHelper.f1411b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1623w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1410a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1411b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f1416g ? rtlSpacingHelper.f1411b : rtlSpacingHelper.f1410a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1622v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        ActionMenuView actionMenuView = this.f1602b;
        return actionMenuView != null && (menuBuilder = actionMenuView.f1065q) != null && menuBuilder.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1623w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return ViewCompat.m2231w(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return ViewCompat.m2231w(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1622v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1606f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1606f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m974e();
        return this.f1602b.getMenu();
    }

    @Nullable
    @RestrictTo
    public View getNavButtonView() {
        return this.f1605e;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1605e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1605e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1596M;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        m974e();
        return this.f1602b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1611k;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f1612l;
    }

    public CharSequence getSubtitle() {
        return this.f1626z;
    }

    @Nullable
    @RestrictTo
    public final TextView getSubtitleTextView() {
        return this.f1604d;
    }

    public CharSequence getTitle() {
        return this.f1625y;
    }

    public int getTitleMarginBottom() {
        return this.f1620t;
    }

    public int getTitleMarginEnd() {
        return this.f1618r;
    }

    public int getTitleMarginStart() {
        return this.f1617q;
    }

    public int getTitleMarginTop() {
        return this.f1619s;
    }

    @Nullable
    @RestrictTo
    public final TextView getTitleTextView() {
        return this.f1603c;
    }

    @RestrictTo
    public DecorToolbar getWrapper() {
        if (this.f1595L == null) {
            this.f1595L = new ToolbarWidgetWrapper(this, true);
        }
        return this.f1595L;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: j */
    public final int m979j(int i2) {
        int m2231w = ViewCompat.m2231w(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, m2231w) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : m2231w == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int m980k(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = layoutParams.f316a & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1624x & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    /* renamed from: l */
    public final int m981l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.m2090a(marginLayoutParams) + MarginLayoutParamsCompat.m2091b(marginLayoutParams);
    }

    /* renamed from: m */
    public final int m982m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public void m983n(@MenuRes int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    @MainThread
    /* renamed from: o */
    public void m984o() {
        Iterator<MenuItem> it = this.f1592I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1591H.m2106c(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1592I = currentMenuItems2;
        this.f1591H.m2108e(menu);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1601R);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1587D = false;
        }
        if (!this.f1587D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1587D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1587D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029f A[LOOP:0: B:40:0x029d->B:41:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c1 A[LOOP:1: B:44:0x02bf->B:45:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e6 A[LOOP:2: B:48:0x02e4->B:49:0x02e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0338 A[LOOP:3: B:57:0x0336->B:58:0x0338, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0291  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3875b);
        ActionMenuView actionMenuView = this.f1602b;
        MenuBuilder menuBuilder = actionMenuView != null ? actionMenuView.f1065q : null;
        int i2 = savedState.f1634d;
        if (i2 != 0 && this.f1597N != null && menuBuilder != null && (findItem = menuBuilder.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1635e) {
            removeCallbacks(this.f1601R);
            post(this.f1601R);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m973d();
        RtlSpacingHelper rtlSpacingHelper = this.f1621u;
        boolean z = i2 == 1;
        if (z == rtlSpacingHelper.f1416g) {
            return;
        }
        rtlSpacingHelper.f1416g = z;
        if (!rtlSpacingHelper.f1417h) {
            rtlSpacingHelper.f1410a = rtlSpacingHelper.f1414e;
            rtlSpacingHelper.f1411b = rtlSpacingHelper.f1415f;
            return;
        }
        if (z) {
            int i3 = rtlSpacingHelper.f1413d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rtlSpacingHelper.f1414e;
            }
            rtlSpacingHelper.f1410a = i3;
            int i4 = rtlSpacingHelper.f1412c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = rtlSpacingHelper.f1415f;
            }
            rtlSpacingHelper.f1411b = i4;
            return;
        }
        int i5 = rtlSpacingHelper.f1412c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rtlSpacingHelper.f1414e;
        }
        rtlSpacingHelper.f1410a = i5;
        int i6 = rtlSpacingHelper.f1413d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = rtlSpacingHelper.f1415f;
        }
        rtlSpacingHelper.f1411b = i6;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f1597N;
        if (expandedActionViewMenuPresenter != null && (menuItemImpl = expandedActionViewMenuPresenter.f1631c) != null) {
            savedState.f1634d = menuItemImpl.f895a;
        }
        savedState.f1635e = m986q();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1586C = false;
        }
        if (!this.f1586C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1586C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1586C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m985p(View view) {
        return view.getParent() == this || this.f1589F.contains(view);
    }

    /* renamed from: q */
    public boolean m986q() {
        ActionMenuView actionMenuView = this.f1602b;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f1069u;
            if (actionMenuPresenter != null && actionMenuPresenter.m691r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final int m987r(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int m980k = m980k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m980k, max + measuredWidth, view.getMeasuredHeight() + m980k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f1591H.m2109f(menuProvider);
    }

    /* renamed from: s */
    public final int m988s(View view, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int m980k = m980k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m980k, max, view.getMeasuredHeight() + m980k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public void setCollapseContentDescription(@StringRes int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(@DrawableRes int i2) {
        setCollapseIcon(AppCompatResources.m497b(getContext(), i2));
    }

    @RestrictTo
    public void setCollapsible(boolean z) {
        this.f1600Q = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1623w) {
            this.f1623w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1622v) {
            this.f1622v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i2) {
        setLogo(AppCompatResources.m497b(getContext(), i2));
    }

    public void setLogoDescription(@StringRes int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(@StringRes int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(@DrawableRes int i2) {
        setNavigationIcon(AppCompatResources.m497b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m976g();
        this.f1605e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1593J = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        m974e();
        this.f1602b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.f1612l != i2) {
            this.f1612l = i2;
            if (i2 == 0) {
                this.f1611k = getContext();
            } else {
                this.f1611k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(@StringRes int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(@ColorInt int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(@StringRes int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1620t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1618r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1617q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1619s = i2;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* renamed from: t */
    public final int m989t(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: u */
    public final void m990u(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: v */
    public final boolean m991v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: w */
    public boolean m992w() {
        ActionMenuView actionMenuView = this.f1602b;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f1069u;
            if (actionMenuPresenter != null && actionMenuPresenter.m692s()) {
                return true;
            }
        }
        return false;
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f1633b;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1633b = 0;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f1633b = 0;
            this.f316a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1633b = 0;
            this.f1633b = layoutParams.f1633b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1633b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1633b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1633b = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m972c();
        }
        ImageButton imageButton = this.f1609i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m972c();
            this.f1609i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1609i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1607g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1606f == null) {
                this.f1606f = new AppCompatImageView(getContext(), null);
            }
            if (!m985p(this.f1606f)) {
                m971b(this.f1606f, true);
            }
        } else {
            ImageView imageView = this.f1606f;
            if (imageView != null && m985p(imageView)) {
                removeView(this.f1606f);
                this.f1589F.remove(this.f1606f);
            }
        }
        ImageView imageView2 = this.f1606f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1606f == null) {
            this.f1606f = new AppCompatImageView(getContext(), null);
        }
        ImageView imageView = this.f1606f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m976g();
        }
        ImageButton imageButton = this.f1605e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.m998a(this.f1605e, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            m976g();
            if (!m985p(this.f1605e)) {
                m971b(this.f1605e, true);
            }
        } else {
            ImageButton imageButton = this.f1605e;
            if (imageButton != null && m985p(imageButton)) {
                removeView(this.f1605e);
                this.f1589F.remove(this.f1605e);
            }
        }
        ImageButton imageButton2 = this.f1605e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1604d;
            if (textView != null && m985p(textView)) {
                removeView(this.f1604d);
                this.f1589F.remove(this.f1604d);
            }
        } else {
            if (this.f1604d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1604d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1604d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1614n;
                if (i2 != 0) {
                    this.f1604d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1585B;
                if (colorStateList != null) {
                    this.f1604d.setTextColor(colorStateList);
                }
            }
            if (!m985p(this.f1604d)) {
                m971b(this.f1604d, true);
            }
        }
        TextView textView2 = this.f1604d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1626z = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1585B = colorStateList;
        TextView textView = this.f1604d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1603c;
            if (textView != null && m985p(textView)) {
                removeView(this.f1603c);
                this.f1589F.remove(this.f1603c);
            }
        } else {
            if (this.f1603c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1603c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1603c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1613m;
                if (i2 != 0) {
                    this.f1603c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1584A;
                if (colorStateList != null) {
                    this.f1603c.setTextColor(colorStateList);
                }
            }
            if (!m985p(this.f1603c)) {
                m971b(this.f1603c, true);
            }
        }
        TextView textView2 = this.f1603c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1625y = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1584A = colorStateList;
        TextView textView = this.f1603c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: d */
        public int f1634d;

        /* renamed from: e */
        public boolean f1635e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1634d = parcel.readInt();
            this.f1635e = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3875b, i2);
            parcel.writeInt(this.f1634d);
            parcel.writeInt(this.f1635e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
