package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class ActionMode {

    /* renamed from: b */
    public Object f679b;

    /* renamed from: c */
    public boolean f680c;

    public interface Callback {
        /* renamed from: a */
        void mo441a(ActionMode actionMode);

        /* renamed from: b */
        boolean mo442b(ActionMode actionMode, Menu menu);

        /* renamed from: c */
        boolean mo443c(ActionMode actionMode, Menu menu);

        /* renamed from: d */
        boolean mo444d(ActionMode actionMode, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo482c();

    /* renamed from: d */
    public abstract View mo483d();

    /* renamed from: e */
    public abstract Menu mo484e();

    /* renamed from: f */
    public abstract MenuInflater mo485f();

    /* renamed from: g */
    public abstract CharSequence mo486g();

    /* renamed from: h */
    public abstract CharSequence mo487h();

    /* renamed from: i */
    public abstract void mo488i();

    /* renamed from: j */
    public boolean mo489j() {
        return false;
    }

    /* renamed from: k */
    public abstract void mo490k(View view);

    /* renamed from: l */
    public abstract void mo491l(int i2);

    /* renamed from: m */
    public abstract void mo492m(CharSequence charSequence);

    /* renamed from: n */
    public abstract void mo493n(int i2);

    /* renamed from: o */
    public abstract void mo494o(CharSequence charSequence);

    /* renamed from: p */
    public void mo495p(boolean z) {
        this.f680c = z;
    }
}
