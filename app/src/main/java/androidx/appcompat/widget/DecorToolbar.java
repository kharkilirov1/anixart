package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo
/* loaded from: classes.dex */
public interface DecorToolbar {
    /* renamed from: a */
    void mo825a(Menu menu, MenuPresenter.Callback callback);

    /* renamed from: b */
    void mo826b(Drawable drawable);

    /* renamed from: c */
    boolean mo827c();

    void collapseActionView();

    /* renamed from: d */
    void mo828d();

    /* renamed from: e */
    boolean mo829e();

    /* renamed from: f */
    boolean mo830f();

    /* renamed from: g */
    Context mo831g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo832h();

    /* renamed from: i */
    boolean mo833i();

    /* renamed from: j */
    void mo834j();

    /* renamed from: k */
    void mo835k(ScrollingTabContainerView scrollingTabContainerView);

    /* renamed from: l */
    boolean mo836l();

    /* renamed from: m */
    void mo837m(int i2);

    /* renamed from: n */
    Menu mo838n();

    /* renamed from: o */
    void mo839o(int i2);

    /* renamed from: p */
    int mo840p();

    /* renamed from: q */
    ViewPropertyAnimatorCompat mo841q(int i2, long j2);

    /* renamed from: r */
    void mo842r(MenuPresenter.Callback callback, MenuBuilder.Callback callback2);

    /* renamed from: s */
    ViewGroup mo843s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i2);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo844t(boolean z);

    /* renamed from: u */
    int mo845u();

    /* renamed from: v */
    void mo846v();

    /* renamed from: w */
    void mo847w();

    /* renamed from: x */
    void mo848x(boolean z);
}
