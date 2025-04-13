package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* renamed from: a */
    public final Context f693a;

    /* renamed from: b */
    public final ActionMode f694b;

    @RestrictTo
    public static class CallbackWrapper implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f695a;

        /* renamed from: b */
        public final Context f696b;

        /* renamed from: c */
        public final ArrayList<SupportActionModeWrapper> f697c = new ArrayList<>();

        /* renamed from: d */
        public final SimpleArrayMap<Menu, Menu> f698d = new SimpleArrayMap<>();

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.f696b = context;
            this.f695a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo441a(ActionMode actionMode) {
            this.f695a.onDestroyActionMode(m532e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo442b(ActionMode actionMode, Menu menu) {
            return this.f695a.onCreateActionMode(m532e(actionMode), m533f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo443c(ActionMode actionMode, Menu menu) {
            return this.f695a.onPrepareActionMode(m532e(actionMode), m533f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo444d(ActionMode actionMode, MenuItem menuItem) {
            return this.f695a.onActionItemClicked(m532e(actionMode), new MenuItemWrapperICS(this.f696b, (SupportMenuItem) menuItem));
        }

        /* renamed from: e */
        public android.view.ActionMode m532e(ActionMode actionMode) {
            int size = this.f697c.size();
            for (int i2 = 0; i2 < size; i2++) {
                SupportActionModeWrapper supportActionModeWrapper = this.f697c.get(i2);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f694b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f696b, actionMode);
            this.f697c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }

        /* renamed from: f */
        public final Menu m533f(Menu menu) {
            Menu menu2 = this.f698d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuWrapperICS menuWrapperICS = new MenuWrapperICS(this.f696b, (SupportMenu) menu);
            this.f698d.put(menu, menuWrapperICS);
            return menuWrapperICS;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f693a = context;
        this.f694b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f694b.mo482c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f694b.mo483d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuWrapperICS(this.f693a, (SupportMenu) this.f694b.mo484e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f694b.mo485f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f694b.mo486g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f694b.f679b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f694b.mo487h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f694b.f680c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f694b.mo488i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f694b.mo489j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f694b.mo490k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f694b.mo492m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f694b.f679b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f694b.mo494o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f694b.mo495p(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f694b.mo491l(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f694b.mo493n(i2);
    }
}
