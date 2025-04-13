package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class CascadingMenuPopup extends MenuPopup implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public PopupWindow.OnDismissListener f792A;

    /* renamed from: B */
    public boolean f793B;

    /* renamed from: c */
    public final Context f794c;

    /* renamed from: d */
    public final int f795d;

    /* renamed from: e */
    public final int f796e;

    /* renamed from: f */
    public final int f797f;

    /* renamed from: g */
    public final boolean f798g;

    /* renamed from: h */
    public final Handler f799h;

    /* renamed from: p */
    public View f807p;

    /* renamed from: q */
    public View f808q;

    /* renamed from: r */
    public int f809r;

    /* renamed from: s */
    public boolean f810s;

    /* renamed from: t */
    public boolean f811t;

    /* renamed from: u */
    public int f812u;

    /* renamed from: v */
    public int f813v;

    /* renamed from: x */
    public boolean f815x;

    /* renamed from: y */
    public MenuPresenter.Callback f816y;

    /* renamed from: z */
    public ViewTreeObserver f817z;

    /* renamed from: i */
    public final List<MenuBuilder> f800i = new ArrayList();

    /* renamed from: j */
    public final List<CascadingMenuInfo> f801j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f802k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.mo572c() || CascadingMenuPopup.this.f801j.size() <= 0 || CascadingMenuPopup.this.f801j.get(0).f825a.f1379z) {
                return;
            }
            View view = CascadingMenuPopup.this.f808q;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator<CascadingMenuInfo> it = CascadingMenuPopup.this.f801j.iterator();
            while (it.hasNext()) {
                it.next().f825a.mo571a();
            }
        }
    };

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f803l = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f817z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f817z = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f817z.removeGlobalOnLayoutListener(cascadingMenuPopup.f802k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: m */
    public final MenuItemHoverListener f804m = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        /* renamed from: f */
        public void mo585f(@NonNull final MenuBuilder menuBuilder, @NonNull final MenuItem menuItem) {
            CascadingMenuPopup.this.f799h.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f801j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (menuBuilder == CascadingMenuPopup.this.f801j.get(i2).f826b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            final CascadingMenuInfo cascadingMenuInfo = i3 < CascadingMenuPopup.this.f801j.size() ? CascadingMenuPopup.this.f801j.get(i3) : null;
            CascadingMenuPopup.this.f799h.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public void run() {
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        CascadingMenuPopup.this.f793B = true;
                        cascadingMenuInfo2.f826b.m601c(false);
                        CascadingMenuPopup.this.f793B = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.m615q(menuItem, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        /* renamed from: i */
        public void mo586i(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f799h.removeCallbacksAndMessages(menuBuilder);
        }
    };

    /* renamed from: n */
    public int f805n = 0;

    /* renamed from: o */
    public int f806o = 0;

    /* renamed from: w */
    public boolean f814w = false;

    public static class CascadingMenuInfo {

        /* renamed from: a */
        public final MenuPopupWindow f825a;

        /* renamed from: b */
        public final MenuBuilder f826b;

        /* renamed from: c */
        public final int f827c;

        public CascadingMenuInfo(@NonNull MenuPopupWindow menuPopupWindow, @NonNull MenuBuilder menuBuilder, int i2) {
            this.f825a = menuPopupWindow;
            this.f826b = menuBuilder;
            this.f827c = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i2, @StyleRes int i3, boolean z) {
        this.f794c = context;
        this.f807p = view;
        this.f796e = i2;
        this.f797f = i3;
        this.f798g = z;
        this.f809r = ViewCompat.m2231w(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f795d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2507R.dimen.abc_config_prefDialogWidth));
        this.f799h = new Handler();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: a */
    public void mo571a() {
        if (mo572c()) {
            return;
        }
        Iterator<MenuBuilder> it = this.f800i.iterator();
        while (it.hasNext()) {
            m584x(it.next());
        }
        this.f800i.clear();
        View view = this.f807p;
        this.f808q = view;
        if (view != null) {
            boolean z = this.f817z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f817z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f802k);
            }
            this.f808q.addOnAttachStateChangeListener(this.f803l);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: b */
    public void mo557b(MenuBuilder menuBuilder, boolean z) {
        int size = this.f801j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuBuilder == this.f801j.get(i2).f826b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.f801j.size()) {
            this.f801j.get(i3).f826b.m601c(false);
        }
        CascadingMenuInfo remove = this.f801j.remove(i2);
        remove.f826b.m618t(this);
        if (this.f793B) {
            remove.f825a.m876u(null);
            remove.f825a.f1354A.setAnimationStyle(0);
        }
        remove.f825a.dismiss();
        int size2 = this.f801j.size();
        if (size2 > 0) {
            this.f809r = this.f801j.get(size2 - 1).f827c;
        } else {
            this.f809r = ViewCompat.m2231w(this.f807p) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.f801j.get(0).f826b.m601c(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f816y;
        if (callback != null) {
            callback.mo439b(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.f817z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f817z.removeGlobalOnLayoutListener(this.f802k);
            }
            this.f817z = null;
        }
        this.f808q.removeOnAttachStateChangeListener(this.f803l);
        this.f792A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: c */
    public boolean mo572c() {
        return this.f801j.size() > 0 && this.f801j.get(0).f825a.mo572c();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: d */
    public void mo559d(boolean z) {
        Iterator<CascadingMenuInfo> it = this.f801j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f825a.f1357d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f801j.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) this.f801j.toArray(new CascadingMenuInfo[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i2];
                if (cascadingMenuInfo.f825a.mo572c()) {
                    cascadingMenuInfo.f825a.dismiss();
                }
            }
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
        this.f816y = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: j */
    public void mo573j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* renamed from: k */
    public ListView mo574k() {
        if (this.f801j.isEmpty()) {
            return null;
        }
        return this.f801j.get(r0.size() - 1).f825a.f1357d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: l */
    public boolean mo566l(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.f801j) {
            if (subMenuBuilder == cascadingMenuInfo.f826b) {
                cascadingMenuInfo.f825a.f1357d.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        subMenuBuilder.m600b(this, this.f794c);
        if (mo572c()) {
            m584x(subMenuBuilder);
        } else {
            this.f800i.add(subMenuBuilder);
        }
        MenuPresenter.Callback callback = this.f816y;
        if (callback != null) {
            callback.mo440c(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    /* renamed from: m */
    public Parcelable mo575m() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: n */
    public void mo576n(MenuBuilder menuBuilder) {
        menuBuilder.m600b(this, this.f794c);
        if (mo572c()) {
            m584x(menuBuilder);
        } else {
            this.f800i.add(menuBuilder);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        int size = this.f801j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = this.f801j.get(i2);
            if (!cascadingMenuInfo.f825a.mo572c()) {
                break;
            } else {
                i2++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.f826b.m601c(false);
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
    public void mo577p(@NonNull View view) {
        if (this.f807p != view) {
            this.f807p = view;
            this.f806o = Gravity.getAbsoluteGravity(this.f805n, ViewCompat.m2231w(view));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: q */
    public void mo578q(boolean z) {
        this.f814w = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: r */
    public void mo579r(int i2) {
        if (this.f805n != i2) {
            this.f805n = i2;
            this.f806o = Gravity.getAbsoluteGravity(i2, ViewCompat.m2231w(this.f807p));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: s */
    public void mo580s(int i2) {
        this.f810s = true;
        this.f812u = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: t */
    public void mo581t(PopupWindow.OnDismissListener onDismissListener) {
        this.f792A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: u */
    public void mo582u(boolean z) {
        this.f815x = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    /* renamed from: v */
    public void mo583v(int i2) {
        this.f811t = true;
        this.f813v = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
    
        if (((r7.getWidth() + r8[0]) + r2) > r9.right) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0124, code lost:
    
        if ((r8[0] - r2) < 0) goto L53;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m584x(@androidx.annotation.NonNull androidx.appcompat.view.menu.MenuBuilder r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.CascadingMenuPopup.m584x(androidx.appcompat.view.menu.MenuBuilder):void");
    }
}
