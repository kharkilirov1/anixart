package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ShareActionProvider;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class ActionProvider {

    /* renamed from: a */
    public SubUiVisibilityListener f3573a;

    /* renamed from: b */
    public VisibilityListener f3574b;

    @RestrictTo
    public interface SubUiVisibilityListener {
        /* renamed from: a */
        void mo688a(boolean z);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public ActionProvider(@NonNull Context context) {
    }

    /* renamed from: a */
    public boolean mo637a() {
        return this instanceof ShareActionProvider;
    }

    /* renamed from: b */
    public boolean mo641b() {
        return true;
    }

    @NonNull
    /* renamed from: c */
    public abstract View mo638c();

    @NonNull
    /* renamed from: d */
    public View mo642d(@NonNull MenuItem menuItem) {
        return mo638c();
    }

    /* renamed from: e */
    public boolean mo639e() {
        return false;
    }

    /* renamed from: f */
    public void mo640f(@NonNull SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo643g() {
        return false;
    }

    /* renamed from: h */
    public void mo644h(@Nullable VisibilityListener visibilityListener) {
        if (this.f3574b != null) {
            StringBuilder m24u = C0000a.m24u("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            m24u.append(getClass().getSimpleName());
            m24u.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", m24u.toString());
        }
        this.f3574b = visibilityListener;
    }

    @RestrictTo
    /* renamed from: i */
    public void m2052i(boolean z) {
        SubUiVisibilityListener subUiVisibilityListener = this.f3573a;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.mo688a(z);
        }
    }
}
