package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* renamed from: A */
    public static final Interpolator f567A = new AccelerateInterpolator();

    /* renamed from: B */
    public static final Interpolator f568B = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f569a;

    /* renamed from: b */
    public Context f570b;

    /* renamed from: c */
    public Activity f571c;

    /* renamed from: d */
    public ActionBarOverlayLayout f572d;

    /* renamed from: e */
    public ActionBarContainer f573e;

    /* renamed from: f */
    public DecorToolbar f574f;

    /* renamed from: g */
    public ActionBarContextView f575g;

    /* renamed from: h */
    public View f576h;

    /* renamed from: i */
    public boolean f577i;

    /* renamed from: j */
    public ActionModeImpl f578j;

    /* renamed from: k */
    public ActionMode f579k;

    /* renamed from: l */
    public ActionMode.Callback f580l;

    /* renamed from: m */
    public boolean f581m;

    /* renamed from: n */
    public ArrayList<ActionBar.OnMenuVisibilityListener> f582n;

    /* renamed from: o */
    public boolean f583o;

    /* renamed from: p */
    public int f584p;

    /* renamed from: q */
    public boolean f585q;

    /* renamed from: r */
    public boolean f586r;

    /* renamed from: s */
    public boolean f587s;

    /* renamed from: t */
    public boolean f588t;

    /* renamed from: u */
    public ViewPropertyAnimatorCompatSet f589u;

    /* renamed from: v */
    public boolean f590v;

    /* renamed from: w */
    public boolean f591w;

    /* renamed from: x */
    public final ViewPropertyAnimatorListener f592x;

    /* renamed from: y */
    public final ViewPropertyAnimatorListener f593y;

    /* renamed from: z */
    public final ViewPropertyAnimatorUpdateListener f594z;

    @RestrictTo
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {

        /* renamed from: d */
        public final Context f598d;

        /* renamed from: e */
        public final MenuBuilder f599e;

        /* renamed from: f */
        public ActionMode.Callback f600f;

        /* renamed from: g */
        public WeakReference<View> f601g;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f598d = context;
            this.f600f = callback;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.f875l = 1;
            this.f599e = menuBuilder;
            menuBuilder.f868e = this;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: a */
        public boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            ActionMode.Callback callback = this.f600f;
            if (callback != null) {
                return callback.mo444d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        /* renamed from: b */
        public void mo431b(@NonNull MenuBuilder menuBuilder) {
            if (this.f600f == null) {
                return;
            }
            mo488i();
            WindowDecorActionBar.this.f575g.m668i();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: c */
        public void mo482c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f578j != this) {
                return;
            }
            if (!windowDecorActionBar.f586r) {
                this.f600f.mo441a(this);
            } else {
                windowDecorActionBar.f579k = this;
                windowDecorActionBar.f580l = this.f600f;
            }
            this.f600f = null;
            WindowDecorActionBar.this.m470A(false);
            ActionBarContextView actionBarContextView = WindowDecorActionBar.this.f575g;
            if (actionBarContextView.f996l == null) {
                actionBarContextView.m666g();
            }
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.f572d.setHideOnContentScrollEnabled(windowDecorActionBar2.f591w);
            WindowDecorActionBar.this.f578j = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: d */
        public View mo483d() {
            WeakReference<View> weakReference = this.f601g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: e */
        public Menu mo484e() {
            return this.f599e;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: f */
        public MenuInflater mo485f() {
            return new SupportMenuInflater(this.f598d);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: g */
        public CharSequence mo486g() {
            return WindowDecorActionBar.this.f575g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: h */
        public CharSequence mo487h() {
            return WindowDecorActionBar.this.f575g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: i */
        public void mo488i() {
            if (WindowDecorActionBar.this.f578j != this) {
                return;
            }
            this.f599e.m598B();
            try {
                this.f600f.mo443c(this, this.f599e);
            } finally {
                this.f599e.m597A();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: j */
        public boolean mo489j() {
            return WindowDecorActionBar.this.f575g.f1004t;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: k */
        public void mo490k(View view) {
            WindowDecorActionBar.this.f575g.setCustomView(view);
            this.f601g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: l */
        public void mo491l(int i2) {
            WindowDecorActionBar.this.f575g.setSubtitle(WindowDecorActionBar.this.f569a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: m */
        public void mo492m(CharSequence charSequence) {
            WindowDecorActionBar.this.f575g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: n */
        public void mo493n(int i2) {
            WindowDecorActionBar.this.f575g.setTitle(WindowDecorActionBar.this.f569a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: o */
        public void mo494o(CharSequence charSequence) {
            WindowDecorActionBar.this.f575g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: p */
        public void mo495p(boolean z) {
            this.f680c = z;
            WindowDecorActionBar.this.f575g.setTitleOptional(z);
        }
    }

    @RestrictTo
    public class TabImpl extends ActionBar.Tab {
        @Override // androidx.appcompat.app.ActionBar.Tab
        /* renamed from: a */
        public CharSequence mo349a() {
            return null;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        /* renamed from: b */
        public View mo350b() {
            return null;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        /* renamed from: c */
        public Drawable mo351c() {
            return null;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        /* renamed from: d */
        public CharSequence mo352d() {
            return null;
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        /* renamed from: e */
        public void mo353e() {
            throw null;
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        new ArrayList();
        this.f582n = new ArrayList<>();
        this.f584p = 0;
        this.f585q = true;
        this.f588t = true;
        this.f592x = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.1
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: b */
            public void mo436b(View view) {
                View view2;
                WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
                if (windowDecorActionBar.f585q && (view2 = windowDecorActionBar.f576h) != null) {
                    view2.setTranslationY(0.0f);
                    WindowDecorActionBar.this.f573e.setTranslationY(0.0f);
                }
                WindowDecorActionBar.this.f573e.setVisibility(8);
                WindowDecorActionBar.this.f573e.setTransitioning(false);
                WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
                windowDecorActionBar2.f589u = null;
                ActionMode.Callback callback = windowDecorActionBar2.f580l;
                if (callback != null) {
                    callback.mo441a(windowDecorActionBar2.f579k);
                    windowDecorActionBar2.f579k = null;
                    windowDecorActionBar2.f580l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f572d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m2192c0(actionBarOverlayLayout);
                }
            }
        };
        this.f593y = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.2
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: b */
            public void mo436b(View view) {
                WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
                windowDecorActionBar.f589u = null;
                windowDecorActionBar.f573e.requestLayout();
            }
        };
        this.f594z = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            /* renamed from: a */
            public void mo481a(View view) {
                ((View) WindowDecorActionBar.this.f573e.getParent()).invalidate();
            }
        };
        this.f571c = activity;
        View decorView = activity.getWindow().getDecorView();
        m471B(decorView);
        if (z) {
            return;
        }
        this.f576h = decorView.findViewById(R.id.content);
    }

    /* renamed from: A */
    public void m470A(boolean z) {
        ViewPropertyAnimatorCompat mo841q;
        ViewPropertyAnimatorCompat m667h;
        if (z) {
            if (!this.f587s) {
                this.f587s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f572d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m474E(false);
            }
        } else if (this.f587s) {
            this.f587s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f572d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m474E(false);
        }
        if (!ViewCompat.m2174N(this.f573e)) {
            if (z) {
                this.f574f.setVisibility(4);
                this.f575g.setVisibility(0);
                return;
            } else {
                this.f574f.setVisibility(0);
                this.f575g.setVisibility(8);
                return;
            }
        }
        if (z) {
            m667h = this.f574f.mo841q(4, 100L);
            mo841q = this.f575g.m667h(0, 200L);
        } else {
            mo841q = this.f574f.mo841q(0, 200L);
            m667h = this.f575g.m667h(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.f739a.add(m667h);
        View view = m667h.f3672a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = mo841q.f3672a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        viewPropertyAnimatorCompatSet.f739a.add(mo841q);
        viewPropertyAnimatorCompatSet.m540b();
    }

    /* renamed from: B */
    public final void m471B(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C2507R.id.decor_content_parent);
        this.f572d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C2507R.id.action_bar);
        if (findViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder m24u = C0000a.m24u("Can't make a decor toolbar out of ");
                m24u.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(m24u.toString());
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f574f = wrapper;
        this.f575g = (ActionBarContextView) view.findViewById(C2507R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C2507R.id.action_bar_container);
        this.f573e = actionBarContainer;
        DecorToolbar decorToolbar = this.f574f;
        if (decorToolbar == null || this.f575g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f569a = decorToolbar.mo831g();
        boolean z = (this.f574f.mo845u() & 4) != 0;
        if (z) {
            this.f577i = true;
        }
        Context context = this.f569a;
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(context);
        this.f574f.mo844t((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m473D(actionBarPolicy.m526b());
        TypedArray obtainStyledAttributes = this.f569a.obtainStyledAttributes(null, C0055R.styleable.f290a, C2507R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f572d;
            if (!actionBarOverlayLayout2.f1017i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f591w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.m2212m0(this.f573e, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: C */
    public void m472C(int i2, int i3) {
        int mo845u = this.f574f.mo845u();
        if ((i3 & 4) != 0) {
            this.f577i = true;
        }
        this.f574f.mo837m((i2 & i3) | ((~i3) & mo845u));
    }

    /* renamed from: D */
    public final void m473D(boolean z) {
        this.f583o = z;
        if (z) {
            this.f573e.setTabContainer(null);
            this.f574f.mo835k(null);
        } else {
            this.f574f.mo835k(null);
            this.f573e.setTabContainer(null);
        }
        boolean z2 = false;
        boolean z3 = this.f574f.mo840p() == 2;
        this.f574f.mo848x(!this.f583o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f572d;
        if (!this.f583o && z3) {
            z2 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: E */
    public final void m474E(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f587s || !this.f586r)) {
            if (this.f588t) {
                this.f588t = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f589u;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.m539a();
                }
                if (this.f584p != 0 || (!this.f590v && !z)) {
                    this.f592x.mo436b(null);
                    return;
                }
                this.f573e.setAlpha(1.0f);
                this.f573e.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f2 = -this.f573e.getHeight();
                if (z) {
                    this.f573e.getLocationInWindow(new int[]{0, 0});
                    f2 -= r9[1];
                }
                ViewPropertyAnimatorCompat m2189b = ViewCompat.m2189b(this.f573e);
                m2189b.m2394g(f2);
                m2189b.m2393f(this.f594z);
                if (!viewPropertyAnimatorCompatSet2.f743e) {
                    viewPropertyAnimatorCompatSet2.f739a.add(m2189b);
                }
                if (this.f585q && (view = this.f576h) != null) {
                    ViewPropertyAnimatorCompat m2189b2 = ViewCompat.m2189b(view);
                    m2189b2.m2394g(f2);
                    if (!viewPropertyAnimatorCompatSet2.f743e) {
                        viewPropertyAnimatorCompatSet2.f739a.add(m2189b2);
                    }
                }
                Interpolator interpolator = f567A;
                boolean z2 = viewPropertyAnimatorCompatSet2.f743e;
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f741c = interpolator;
                }
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f740b = 250L;
                }
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.f592x;
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f742d = viewPropertyAnimatorListener;
                }
                this.f589u = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.m540b();
                return;
            }
            return;
        }
        if (this.f588t) {
            return;
        }
        this.f588t = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.f589u;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.m539a();
        }
        this.f573e.setVisibility(0);
        if (this.f584p == 0 && (this.f590v || z)) {
            this.f573e.setTranslationY(0.0f);
            float f3 = -this.f573e.getHeight();
            if (z) {
                this.f573e.getLocationInWindow(new int[]{0, 0});
                f3 -= r9[1];
            }
            this.f573e.setTranslationY(f3);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat m2189b3 = ViewCompat.m2189b(this.f573e);
            m2189b3.m2394g(0.0f);
            m2189b3.m2393f(this.f594z);
            if (!viewPropertyAnimatorCompatSet4.f743e) {
                viewPropertyAnimatorCompatSet4.f739a.add(m2189b3);
            }
            if (this.f585q && (view3 = this.f576h) != null) {
                view3.setTranslationY(f3);
                ViewPropertyAnimatorCompat m2189b4 = ViewCompat.m2189b(this.f576h);
                m2189b4.m2394g(0.0f);
                if (!viewPropertyAnimatorCompatSet4.f743e) {
                    viewPropertyAnimatorCompatSet4.f739a.add(m2189b4);
                }
            }
            Interpolator interpolator2 = f568B;
            boolean z3 = viewPropertyAnimatorCompatSet4.f743e;
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f741c = interpolator2;
            }
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f740b = 250L;
            }
            ViewPropertyAnimatorListener viewPropertyAnimatorListener2 = this.f593y;
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f742d = viewPropertyAnimatorListener2;
            }
            this.f589u = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.m540b();
        } else {
            this.f573e.setAlpha(1.0f);
            this.f573e.setTranslationY(0.0f);
            if (this.f585q && (view2 = this.f576h) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f593y.mo436b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f572d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m2192c0(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: a */
    public void mo475a() {
        if (this.f586r) {
            this.f586r = false;
            m474E(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: b */
    public void mo476b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: c */
    public void mo477c(boolean z) {
        this.f585q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: d */
    public void mo478d() {
        if (this.f586r) {
            return;
        }
        this.f586r = true;
        m474E(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: e */
    public void mo479e() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f589u;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.m539a();
            this.f589u = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    /* renamed from: f */
    public void mo480f(int i2) {
        this.f584p = i2;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo329h() {
        DecorToolbar decorToolbar = this.f574f;
        if (decorToolbar == null || !decorToolbar.mo836l()) {
            return false;
        }
        this.f574f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo330i(boolean z) {
        if (z == this.f581m) {
            return;
        }
        this.f581m = z;
        int size = this.f582n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f582n.get(i2).m348a(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo331j() {
        return this.f574f.mo845u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo332k() {
        if (this.f570b == null) {
            TypedValue typedValue = new TypedValue();
            this.f569a.getTheme().resolveAttribute(C2507R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f570b = new ContextThemeWrapper(this.f569a, i2);
            } else {
                this.f570b = this.f569a;
            }
        }
        return this.f570b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo334m(Configuration configuration) {
        m473D(new ActionBarPolicy(this.f569a).m526b());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo336o(int i2, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ActionModeImpl actionModeImpl = this.f578j;
        if (actionModeImpl == null || (menuBuilder = actionModeImpl.f599e) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo339r(Drawable drawable) {
        this.f573e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo340s(boolean z) {
        if (this.f577i) {
            return;
        }
        m472C(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo341t(boolean z) {
        m472C(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo342u(boolean z) {
        m472C(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo343v(boolean z) {
        m472C(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo344w(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f590v = z;
        if (z || (viewPropertyAnimatorCompatSet = this.f589u) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.m539a();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo345x(CharSequence charSequence) {
        this.f574f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public void mo346y(CharSequence charSequence) {
        this.f574f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: z */
    public ActionMode mo347z(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.f578j;
        if (actionModeImpl != null) {
            actionModeImpl.mo482c();
        }
        this.f572d.setHideOnContentScrollEnabled(false);
        this.f575g.m666g();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f575g.getContext(), callback);
        actionModeImpl2.f599e.m598B();
        try {
            if (!actionModeImpl2.f600f.mo442b(actionModeImpl2, actionModeImpl2.f599e)) {
                return null;
            }
            this.f578j = actionModeImpl2;
            actionModeImpl2.mo488i();
            this.f575g.m664e(actionModeImpl2);
            m470A(true);
            return actionModeImpl2;
        } finally {
            actionModeImpl2.f599e.m597A();
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.f582n = new ArrayList<>();
        this.f584p = 0;
        this.f585q = true;
        this.f588t = true;
        this.f592x = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.1
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: b */
            public void mo436b(View view) {
                View view2;
                WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
                if (windowDecorActionBar.f585q && (view2 = windowDecorActionBar.f576h) != null) {
                    view2.setTranslationY(0.0f);
                    WindowDecorActionBar.this.f573e.setTranslationY(0.0f);
                }
                WindowDecorActionBar.this.f573e.setVisibility(8);
                WindowDecorActionBar.this.f573e.setTransitioning(false);
                WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
                windowDecorActionBar2.f589u = null;
                ActionMode.Callback callback = windowDecorActionBar2.f580l;
                if (callback != null) {
                    callback.mo441a(windowDecorActionBar2.f579k);
                    windowDecorActionBar2.f579k = null;
                    windowDecorActionBar2.f580l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f572d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m2192c0(actionBarOverlayLayout);
                }
            }
        };
        this.f593y = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.WindowDecorActionBar.2
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            /* renamed from: b */
            public void mo436b(View view) {
                WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
                windowDecorActionBar.f589u = null;
                windowDecorActionBar.f573e.requestLayout();
            }
        };
        this.f594z = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            /* renamed from: a */
            public void mo481a(View view) {
                ((View) WindowDecorActionBar.this.f573e.getParent()).invalidate();
            }
        };
        m471B(dialog.getWindow().getDecorView());
    }
}
