package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {

    /* renamed from: d */
    public Context f687d;

    /* renamed from: e */
    public ActionBarContextView f688e;

    /* renamed from: f */
    public ActionMode.Callback f689f;

    /* renamed from: g */
    public WeakReference<View> f690g;

    /* renamed from: h */
    public boolean f691h;

    /* renamed from: i */
    public MenuBuilder f692i;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.f687d = context;
        this.f688e = actionBarContextView;
        this.f689f = callback;
        MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
        menuBuilder.f875l = 1;
        this.f692i = menuBuilder;
        menuBuilder.f868e = this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    /* renamed from: a */
    public boolean mo429a(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        return this.f689f.mo444d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    /* renamed from: b */
    public void mo431b(@NonNull MenuBuilder menuBuilder) {
        mo488i();
        this.f688e.m668i();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: c */
    public void mo482c() {
        if (this.f691h) {
            return;
        }
        this.f691h = true;
        this.f689f.mo441a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: d */
    public View mo483d() {
        WeakReference<View> weakReference = this.f690g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: e */
    public Menu mo484e() {
        return this.f692i;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: f */
    public MenuInflater mo485f() {
        return new SupportMenuInflater(this.f688e.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: g */
    public CharSequence mo486g() {
        return this.f688e.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: h */
    public CharSequence mo487h() {
        return this.f688e.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: i */
    public void mo488i() {
        this.f689f.mo443c(this, this.f692i);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: j */
    public boolean mo489j() {
        return this.f688e.f1004t;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: k */
    public void mo490k(View view) {
        this.f688e.setCustomView(view);
        this.f690g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: l */
    public void mo491l(int i2) {
        this.f688e.setSubtitle(this.f687d.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: m */
    public void mo492m(CharSequence charSequence) {
        this.f688e.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: n */
    public void mo493n(int i2) {
        this.f688e.setTitle(this.f687d.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: o */
    public void mo494o(CharSequence charSequence) {
        this.f688e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: p */
    public void mo495p(boolean z) {
        this.f680c = z;
        this.f688e.setTitleOptional(z);
    }
}
