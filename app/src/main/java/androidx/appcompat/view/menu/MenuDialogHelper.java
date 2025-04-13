package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;

/* loaded from: classes.dex */
class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {

    /* renamed from: b */
    public MenuBuilder f888b;

    /* renamed from: c */
    public AlertDialog f889c;

    /* renamed from: d */
    public ListMenuPresenter f890d;

    public MenuDialogHelper(MenuBuilder menuBuilder) {
        this.f888b = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    /* renamed from: b */
    public void mo439b(@NonNull MenuBuilder menuBuilder, boolean z) {
        AlertDialog alertDialog;
        if ((z || menuBuilder == this.f888b) && (alertDialog = this.f889c) != null) {
            alertDialog.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    /* renamed from: c */
    public boolean mo440c(@NonNull MenuBuilder menuBuilder) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f888b.m615q((MenuItemImpl) this.f890d.m591a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ListMenuPresenter listMenuPresenter = this.f890d;
        MenuBuilder menuBuilder = this.f888b;
        MenuPresenter.Callback callback = listMenuPresenter.f853h;
        if (callback != null) {
            callback.mo439b(menuBuilder, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f889c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f889c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f888b.m601c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f888b.performShortcut(i2, keyEvent, 0);
    }
}
