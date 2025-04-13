package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* renamed from: d */
    public final SupportMenuItem f922d;

    /* renamed from: e */
    public Method f923e;

    public class ActionProviderWrapper extends ActionProvider {

        /* renamed from: c */
        public final android.view.ActionProvider f924c;

        public ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f924c = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: a */
        public boolean mo637a() {
            return this.f924c.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: c */
        public View mo638c() {
            return this.f924c.onCreateActionView();
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: e */
        public boolean mo639e() {
            return this.f924c.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: f */
        public void mo640f(SubMenu subMenu) {
            this.f924c.onPrepareSubMenu(MenuItemWrapperICS.this.m570d(subMenu));
        }
    }

    @RequiresApi
    public class ActionProviderWrapperJB extends ActionProviderWrapper implements ActionProvider.VisibilityListener {

        /* renamed from: e */
        public ActionProvider.VisibilityListener f926e;

        public ActionProviderWrapperJB(MenuItemWrapperICS menuItemWrapperICS, Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: b */
        public boolean mo641b() {
            return this.f924c.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: d */
        public View mo642d(MenuItem menuItem) {
            return this.f924c.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: g */
        public boolean mo643g() {
            return this.f924c.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        /* renamed from: h */
        public void mo644h(ActionProvider.VisibilityListener visibilityListener) {
            this.f926e = visibilityListener;
            this.f924c.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.VisibilityListener visibilityListener = this.f926e;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }
    }

    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {

        /* renamed from: b */
        public final android.view.CollapsibleActionView f927b;

        /* JADX WARN: Multi-variable type inference failed */
        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f927b = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        /* renamed from: c */
        public void mo527c() {
            this.f927b.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        /* renamed from: d */
        public void mo528d() {
            this.f927b.onActionViewCollapsed();
        }
    }

    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f928a;

        public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f928a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f928a.onMenuItemActionCollapse(MenuItemWrapperICS.this.m569c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f928a.onMenuItemActionExpand(MenuItemWrapperICS.this.m569c(menuItem));
        }
    }

    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem.OnMenuItemClickListener f930b;

        public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f930b = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f930b.onMenuItemClick(MenuItemWrapperICS.this.m569c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f922d = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f922d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f922d.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider mo546b = this.f922d.mo546b();
        if (mo546b instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) mo546b).f924c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f922d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? (View) ((CollapsibleActionViewWrapper) actionView).f927b : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f922d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f922d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f922d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f922d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f922d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f922d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f922d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f922d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f922d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f922d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f922d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f922d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f922d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m570d(this.f922d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f922d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f922d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f922d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f922d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f922d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f922d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f922d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f922d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f922d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapperJB actionProviderWrapperJB = new ActionProviderWrapperJB(this, this.f789a, actionProvider);
        SupportMenuItem supportMenuItem = this.f922d;
        if (actionProvider == null) {
            actionProviderWrapperJB = null;
        }
        supportMenuItem.mo545a(actionProviderWrapperJB);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f922d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f922d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f922d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f922d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f922d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f922d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f922d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f922d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f922d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f922d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f922d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f922d.setOnActionExpandListener(onActionExpandListener != null ? new OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f922d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f922d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f922d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f922d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f922d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f922d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f922d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f922d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f922d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f922d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f922d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f922d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f922d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f922d.setActionView(i2);
        View actionView = this.f922d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f922d.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
