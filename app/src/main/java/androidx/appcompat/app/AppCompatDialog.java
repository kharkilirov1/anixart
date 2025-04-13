package androidx.appcompat.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;

/* loaded from: classes.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {

    /* renamed from: d */
    public AppCompatDelegate f519d;

    /* renamed from: e */
    public final KeyEventDispatcher.Component f520e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatDialog(@androidx.annotation.NonNull android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968982(0x7f040196, float:1.7546633E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            androidx.appcompat.app.a r2 = new androidx.appcompat.app.a
            r2.<init>()
            r4.f520e = r2
            androidx.appcompat.app.AppCompatDelegate r2 = r4.m454d()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.mo382B(r6)
            r5 = 0
            r2.mo396n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDialog.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m454d().mo385c(view, layoutParams);
    }

    @NonNull
    /* renamed from: d */
    public AppCompatDelegate m454d() {
        if (this.f519d == null) {
            int i2 = AppCompatDelegate.f417b;
            this.f519d = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f519d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m454d().mo397o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m2089b(this.f520e, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public boolean m455e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public boolean m456f(int i2) {
        return m454d().mo403v(i2);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i2) {
        return (T) m454d().mo388f(i2);
    }

    @Override // android.app.Dialog
    @RestrictTo
    public void invalidateOptionsMenu() {
        m454d().mo394l();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m454d().mo393k();
        super.onCreate(bundle);
        m454d().mo396n(bundle);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        m454d().mo402t();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i2) {
        m454d().mo404w(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m454d().mo383C(charSequence);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@NonNull View view) {
        m454d().mo405x(view);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m454d().mo406y(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        m454d().mo383C(getContext().getString(i2));
    }
}
