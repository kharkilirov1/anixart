package androidx.appcompat.widget;

import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;

@RestrictTo
/* loaded from: classes.dex */
public interface DecorContentParent {
    /* renamed from: a */
    void mo669a(Menu menu, MenuPresenter.Callback callback);

    /* renamed from: c */
    boolean mo671c();

    /* renamed from: d */
    void mo672d();

    /* renamed from: e */
    boolean mo673e();

    /* renamed from: f */
    boolean mo674f();

    /* renamed from: h */
    boolean mo676h();

    /* renamed from: i */
    boolean mo677i();

    /* renamed from: j */
    void mo678j(int i2);

    /* renamed from: k */
    void mo679k();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
