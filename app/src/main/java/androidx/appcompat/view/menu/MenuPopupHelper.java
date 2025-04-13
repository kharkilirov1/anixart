package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class MenuPopupHelper implements MenuHelper {

    /* renamed from: a */
    public final Context f933a;

    /* renamed from: b */
    public final MenuBuilder f934b;

    /* renamed from: c */
    public final boolean f935c;

    /* renamed from: d */
    public final int f936d;

    /* renamed from: e */
    public final int f937e;

    /* renamed from: f */
    public View f938f;

    /* renamed from: g */
    public int f939g;

    /* renamed from: h */
    public boolean f940h;

    /* renamed from: i */
    public MenuPresenter.Callback f941i;

    /* renamed from: j */
    public MenuPopup f942j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f943k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f944l;

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m656a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view) {
        this(context, menuBuilder, view, false, C2507R.attr.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public void m647a() {
        if (m649c()) {
            this.f942j.dismiss();
        }
    }

    @NonNull
    @RestrictTo
    /* renamed from: b */
    public MenuPopup m648b() {
        if (this.f942j == null) {
            Display defaultDisplay = ((WindowManager) this.f933a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            Api17Impl.m656a(defaultDisplay, point);
            MenuPopup cascadingMenuPopup = Math.min(point.x, point.y) >= this.f933a.getResources().getDimensionPixelSize(C2507R.dimen.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.f933a, this.f938f, this.f936d, this.f937e, this.f935c) : new StandardMenuPopup(this.f933a, this.f934b, this.f938f, this.f936d, this.f937e, this.f935c);
            cascadingMenuPopup.mo576n(this.f934b);
            cascadingMenuPopup.mo581t(this.f944l);
            cascadingMenuPopup.mo577p(this.f938f);
            cascadingMenuPopup.mo563h(this.f941i);
            cascadingMenuPopup.mo578q(this.f940h);
            cascadingMenuPopup.mo579r(this.f939g);
            this.f942j = cascadingMenuPopup;
        }
        return this.f942j;
    }

    /* renamed from: c */
    public boolean m649c() {
        MenuPopup menuPopup = this.f942j;
        return menuPopup != null && menuPopup.mo572c();
    }

    /* renamed from: d */
    public void mo650d() {
        this.f942j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f943k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void m651e(boolean z) {
        this.f940h = z;
        MenuPopup menuPopup = this.f942j;
        if (menuPopup != null) {
            menuPopup.mo578q(z);
        }
    }

    /* renamed from: f */
    public void m652f(@Nullable MenuPresenter.Callback callback) {
        this.f941i = callback;
        MenuPopup menuPopup = this.f942j;
        if (menuPopup != null) {
            menuPopup.mo563h(callback);
        }
    }

    /* renamed from: g */
    public void m653g() {
        if (!m655i()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: h */
    public final void m654h(int i2, int i3, boolean z, boolean z2) {
        MenuPopup m648b = m648b();
        m648b.mo582u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f939g, ViewCompat.m2231w(this.f938f)) & 7) == 5) {
                i2 -= this.f938f.getWidth();
            }
            m648b.mo580s(i2);
            m648b.mo583v(i3);
            int i4 = (int) ((this.f933a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m648b.f932b = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        m648b.mo571a();
    }

    /* renamed from: i */
    public boolean m655i() {
        if (m649c()) {
            return true;
        }
        if (this.f938f == null) {
            return false;
        }
        m654h(0, 0, false, false);
        return true;
    }

    public MenuPopupHelper(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i2, @StyleRes int i3) {
        this.f939g = 8388611;
        this.f944l = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                MenuPopupHelper.this.mo650d();
            }
        };
        this.f933a = context;
        this.f934b = menuBuilder;
        this.f938f = view;
        this.f935c = z;
        this.f936d = i2;
        this.f937e = i3;
    }
}
