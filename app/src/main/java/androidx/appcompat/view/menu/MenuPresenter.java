package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public interface MenuPresenter {

    public interface Callback {
        /* renamed from: b */
        void mo439b(@NonNull MenuBuilder menuBuilder, boolean z);

        /* renamed from: c */
        boolean mo440c(@NonNull MenuBuilder menuBuilder);
    }

    /* renamed from: b */
    void mo557b(MenuBuilder menuBuilder, boolean z);

    /* renamed from: d */
    void mo559d(boolean z);

    /* renamed from: e */
    boolean mo560e();

    /* renamed from: f */
    boolean mo561f(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    /* renamed from: g */
    boolean mo562g(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    int getId();

    /* renamed from: h */
    void mo563h(Callback callback);

    /* renamed from: i */
    void mo564i(Context context, MenuBuilder menuBuilder);

    /* renamed from: j */
    void mo573j(Parcelable parcelable);

    /* renamed from: l */
    boolean mo566l(SubMenuBuilder subMenuBuilder);

    /* renamed from: m */
    Parcelable mo575m();
}
