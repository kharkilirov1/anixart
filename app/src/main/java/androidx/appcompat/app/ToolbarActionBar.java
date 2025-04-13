package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
class ToolbarActionBar extends ActionBar {

    /* renamed from: a */
    public final DecorToolbar f542a;

    /* renamed from: b */
    public final Window.Callback f543b;

    /* renamed from: c */
    public final AppCompatDelegateImpl.ActionBarMenuCallback f544c;

    /* renamed from: d */
    public boolean f545d;

    /* renamed from: e */
    public boolean f546e;

    /* renamed from: f */
    public boolean f547f;

    /* renamed from: g */
    public ArrayList<ActionBar.OnMenuVisibilityListener> f548g = new ArrayList<>();

    /* renamed from: h */
    public final Runnable f549h = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public void run() {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            Menu m466A = toolbarActionBar.m466A();
            MenuBuilder menuBuilder = m466A instanceof MenuBuilder ? (MenuBuilder) m466A : null;
            if (menuBuilder != null) {
                menuBuilder.m598B();
            }
            try {
                m466A.clear();
                if (!toolbarActionBar.f543b.onCreatePanelMenu(0, m466A) || !toolbarActionBar.f543b.onPreparePanel(0, null, m466A)) {
                    m466A.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.m597A();
                }
            }
        }
    };

    /* renamed from: i */
    public final Toolbar.OnMenuItemClickListener f550i;

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {

        /* renamed from: b */
        public boolean f553b;

        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: b */
        public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
            if (this.f553b) {
                return;
            }
            this.f553b = true;
            ToolbarActionBar.this.f542a.mo834j();
            ToolbarActionBar.this.f543b.onPanelClosed(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            this.f553b = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        /* renamed from: c */
        public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
            ToolbarActionBar.this.f543b.onMenuOpened(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            return true;
        }
    }

    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: a */
        public boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: b */
        public void mo431b(@NonNull MenuBuilder menuBuilder) {
            if (ToolbarActionBar.this.f542a.mo827c()) {
                ToolbarActionBar.this.f543b.onPanelClosed(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            } else if (ToolbarActionBar.this.f543b.onPreparePanel(0, null, menuBuilder)) {
                ToolbarActionBar.this.f543b.onMenuOpened(C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, menuBuilder);
            }
        }
    }

    public class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        public ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        /* renamed from: a */
        public boolean mo438a(int i2) {
            if (i2 != 0) {
                return false;
            }
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            if (toolbarActionBar.f545d) {
                return false;
            }
            toolbarActionBar.f542a.mo828d();
            ToolbarActionBar.this.f545d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(ToolbarActionBar.this.f542a.mo831g());
            }
            return null;
        }
    }

    public ToolbarActionBar(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.f543b.onMenuItemSelected(0, menuItem);
            }
        };
        this.f550i = onMenuItemClickListener;
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f542a = toolbarWidgetWrapper;
        Objects.requireNonNull(callback);
        this.f543b = callback;
        toolbarWidgetWrapper.f1647l = callback;
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        if (!toolbarWidgetWrapper.f1643h) {
            toolbarWidgetWrapper.m997z(charSequence);
        }
        this.f544c = new ToolbarMenuCallback();
    }

    /* renamed from: A */
    public final Menu m466A() {
        if (!this.f546e) {
            this.f542a.mo842r(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.f546e = true;
        }
        return this.f542a.mo838n();
    }

    /* renamed from: B */
    public void m467B(int i2, int i3) {
        this.f542a.mo837m((i2 & i3) | ((~i3) & this.f542a.mo845u()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo328g() {
        return this.f542a.mo832h();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo329h() {
        if (!this.f542a.mo836l()) {
            return false;
        }
        this.f542a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo330i(boolean z) {
        if (z == this.f547f) {
            return;
        }
        this.f547f = z;
        int size = this.f548g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f548g.get(i2).m348a(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo331j() {
        return this.f542a.mo845u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo332k() {
        return this.f542a.mo831g();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public boolean mo333l() {
        this.f542a.mo843s().removeCallbacks(this.f549h);
        ViewCompat.m2184X(this.f542a.mo843s(), this.f549h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo334m(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo335n() {
        this.f542a.mo843s().removeCallbacks(this.f549h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo336o(int i2, KeyEvent keyEvent) {
        Menu m466A = m466A();
        if (m466A == null) {
            return false;
        }
        m466A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m466A.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo337p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f542a.mo833i();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo338q() {
        return this.f542a.mo833i();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo339r(@Nullable Drawable drawable) {
        this.f542a.mo826b(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo340s(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo341t(boolean z) {
        m467B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo342u(boolean z) {
        m467B(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo343v(boolean z) {
        m467B(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo344w(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo345x(CharSequence charSequence) {
        this.f542a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public void mo346y(CharSequence charSequence) {
        this.f542a.setWindowTitle(charSequence);
    }
}
