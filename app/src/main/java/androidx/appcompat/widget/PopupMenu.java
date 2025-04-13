package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

/* loaded from: classes.dex */
public class PopupMenu {

    /* renamed from: a */
    public final Context f1393a;

    /* renamed from: b */
    public final MenuBuilder f1394b;

    /* renamed from: c */
    public final MenuPopupHelper f1395c;

    /* renamed from: d */
    public OnMenuItemClickListener f1396d;

    /* renamed from: androidx.appcompat.widget.PopupMenu$3 */
    class C01213 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: b */
        public ShowableListMenu mo554b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: c */
        public boolean mo555c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: d */
        public boolean mo693d() {
            throw null;
        }
    }

    public interface OnDismissListener {
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view) {
        this(context, view, 0, C2507R.attr.popupMenuStyle, 0);
    }

    @NonNull
    /* renamed from: a */
    public MenuInflater m882a() {
        return new SupportMenuInflater(this.f1393a);
    }

    public PopupMenu(@NonNull Context context, @NonNull View view, int i2, @AttrRes int i3, @StyleRes int i4) {
        this.f1393a = context;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.f1394b = menuBuilder;
        menuBuilder.mo623y(new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            /* renamed from: a */
            public boolean mo429a(@NonNull MenuBuilder menuBuilder2, @NonNull MenuItem menuItem) {
                OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.f1396d;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            /* renamed from: b */
            public void mo431b(@NonNull MenuBuilder menuBuilder2) {
            }
        });
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, view, false, i3, i4);
        this.f1395c = menuPopupHelper;
        menuPopupHelper.f939g = i2;
        menuPopupHelper.f943k = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                Objects.requireNonNull(PopupMenu.this);
            }
        };
    }
}
