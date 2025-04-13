package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuPopupWindow;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c */
    public final Context f947c;

    /* renamed from: d */
    public final MenuBuilder f948d;

    /* renamed from: e */
    public final MenuAdapter f949e;

    /* renamed from: f */
    public final boolean f950f;

    /* renamed from: g */
    public final int f951g;

    /* renamed from: h */
    public final int f952h;

    /* renamed from: i */
    public final int f953i;

    /* renamed from: j */
    public final MenuPopupWindow f954j;

    /* renamed from: m */
    public PopupWindow.OnDismissListener f957m;

    /* renamed from: n */
    public View f958n;

    /* renamed from: o */
    public View f959o;

    /* renamed from: p */
    public MenuPresenter.Callback f960p;

    /* renamed from: q */
    public ViewTreeObserver f961q;

    /* renamed from: r */
    public boolean f962r;

    /* renamed from: s */
    public boolean f963s;

    /* renamed from: t */
    public int f964t;

    /* renamed from: v */
    public boolean f966v;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f955k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (StandardMenuPopup.this.mo572c()) {
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                if (standardMenuPopup.f954j.f1379z) {
                    return;
                }
                View view = standardMenuPopup.f959o;
                if (view == null || !view.isShown()) {
                    StandardMenuPopup.this.dismiss();
                } else {
                    StandardMenuPopup.this.f954j.mo571a();
                }
            }
        }
    };

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f956l = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.f961q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.f961q = view.getViewTreeObserver();
                }
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                standardMenuPopup.f961q.removeGlobalOnLayoutListener(standardMenuPopup.f955k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: u */
    public int f965u = 0;

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i2, int i3, boolean z) {
        this.f947c = context;
        this.f948d = menuBuilder;
        this.f950f = z;
        this.f949e = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, C2507R.layout.abc_popup_menu_item_layout);
        this.f952h = i2;
        this.f953i = i3;
        Resources resources = context.getResources();
        this.f951g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2507R.dimen.abc_config_prefDialogWidth));
        this.f958n = view;
        this.f954j = new MenuPopupWindow(context, null, i2, i3);
        menuBuilder.m600b(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ca  */
    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo571a() {
        /*
            r7 = this;
            boolean r0 = r7.mo572c()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc7
        Lb:
            boolean r0 = r7.f962r
            if (r0 != 0) goto Lc7
            android.view.View r0 = r7.f958n
            if (r0 != 0) goto L15
            goto Lc7
        L15:
            r7.f959o = r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            android.widget.PopupWindow r0 = r0.f1354A
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            r0.f1370q = r7
            r0.m871s(r2)
            android.view.View r0 = r7.f959o
            android.view.ViewTreeObserver r3 = r7.f961q
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f961q = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f955k
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f956l
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.MenuPopupWindow r3 = r7.f954j
            r3.f1369p = r0
            int r0 = r7.f965u
            r3.f1366m = r0
            boolean r0 = r7.f963s
            r3 = 0
            if (r0 != 0) goto L5b
            androidx.appcompat.view.menu.MenuAdapter r0 = r7.f949e
            android.content.Context r4 = r7.f947c
            int r5 = r7.f951g
            int r0 = androidx.appcompat.view.menu.MenuPopup.m645o(r0, r3, r4, r5)
            r7.f964t = r0
            r7.f963s = r2
        L5b:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            int r4 = r7.f964t
            r0.m870r(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            r4 = 2
            android.widget.PopupWindow r0 = r0.f1354A
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            android.graphics.Rect r4 = r7.f932b
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L79
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L7a
        L79:
            r5 = r3
        L7a:
            r0.f1378y = r5
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            r0.mo571a()
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            androidx.appcompat.widget.DropDownListView r0 = r0.f1357d
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f966v
            if (r4 == 0) goto Lb9
            androidx.appcompat.view.menu.MenuBuilder r4 = r7.f948d
            java.lang.CharSequence r4 = r4.f876m
            if (r4 == 0) goto Lb9
            android.content.Context r4 = r7.f947c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131558418(0x7f0d0012, float:1.8742151E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb3
            androidx.appcompat.view.menu.MenuBuilder r6 = r7.f948d
            java.lang.CharSequence r6 = r6.f876m
            r5.setText(r6)
        Lb3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb9:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            androidx.appcompat.view.menu.MenuAdapter r1 = r7.f949e
            r0.mo777p(r1)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.f954j
            r0.mo571a()
            goto L8
        Lc7:
            if (r1 == 0) goto Lca
            return
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.StandardMenuPopup.mo571a():void");
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f948d) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f960p;
        if (callback != null) {
            callback.mo439b(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: c */
    public boolean mo572c() {
        return !this.f962r && this.f954j.mo572c();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        this.f963s = false;
        MenuAdapter menuAdapter = this.f949e;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if (mo572c()) {
            this.f954j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: e */
    public boolean mo560e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: h */
    public void mo563h(MenuPresenter.Callback callback) {
        this.f960p = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: k */
    public ListView mo574k() {
        return this.f954j.f1357d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo566l(androidx.appcompat.view.menu.SubMenuBuilder r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L71
            androidx.appcompat.view.menu.MenuPopupHelper r0 = new androidx.appcompat.view.menu.MenuPopupHelper
            android.content.Context r3 = r9.f947c
            android.view.View r5 = r9.f959o
            boolean r6 = r9.f950f
            int r7 = r9.f952h
            int r8 = r9.f953i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.MenuPresenter$Callback r2 = r9.f960p
            r0.m652f(r2)
            boolean r2 = androidx.appcompat.view.menu.MenuPopup.m646w(r10)
            r0.m651e(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.f957m
            r0.f943k = r2
            r2 = 0
            r9.f957m = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r9.f948d
            r2.m601c(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.f954j
            int r3 = r2.f1360g
            boolean r4 = r2.f1363j
            if (r4 != 0) goto L3a
            r2 = 0
            goto L3c
        L3a:
            int r2 = r2.f1361h
        L3c:
            int r4 = r9.f965u
            android.view.View r5 = r9.f958n
            int r5 = androidx.core.view.ViewCompat.m2231w(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L54
            android.view.View r4 = r9.f958n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L54:
            boolean r4 = r0.m649c()
            r5 = 1
            if (r4 == 0) goto L5d
        L5b:
            r0 = 1
            goto L67
        L5d:
            android.view.View r4 = r0.f938f
            if (r4 != 0) goto L63
            r0 = 0
            goto L67
        L63:
            r0.m654h(r3, r2, r5, r5)
            goto L5b
        L67:
            if (r0 == 0) goto L71
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r9.f960p
            if (r0 == 0) goto L70
            r0.mo440c(r10)
        L70:
            return r5
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.StandardMenuPopup.mo566l(androidx.appcompat.view.menu.SubMenuBuilder):boolean");
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: m */
    public Parcelable mo575m() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: n */
    public void mo576n(MenuBuilder menuBuilder) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f962r = true;
        this.f948d.close();
        ViewTreeObserver viewTreeObserver = this.f961q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f961q = this.f959o.getViewTreeObserver();
            }
            this.f961q.removeGlobalOnLayoutListener(this.f955k);
            this.f961q = null;
        }
        this.f959o.removeOnAttachStateChangeListener(this.f956l);
        PopupWindow.OnDismissListener onDismissListener = this.f957m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: p */
    public void mo577p(View view) {
        this.f958n = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: q */
    public void mo578q(boolean z) {
        this.f949e.f859d = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: r */
    public void mo579r(int i2) {
        this.f965u = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: s */
    public void mo580s(int i2) {
        this.f954j.f1360g = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: t */
    public void mo581t(PopupWindow.OnDismissListener onDismissListener) {
        this.f957m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: u */
    public void mo582u(boolean z) {
        this.f966v = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: v */
    public void mo583v(int i2) {
        MenuPopupWindow menuPopupWindow = this.f954j;
        menuPopupWindow.f1361h = i2;
        menuPopupWindow.f1363j = true;
    }
}
