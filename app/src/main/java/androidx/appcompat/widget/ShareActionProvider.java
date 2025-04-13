package androidx.appcompat.widget;

import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import java.util.Objects;

/* loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {

    public interface OnShareTargetSelectedListener {
    }

    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
    }

    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Override // androidx.core.view.ActionProvider
    /* renamed from: c */
    public View mo638c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(null);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.m701d(null, null));
        }
        new TypedValue();
        throw null;
    }

    @Override // androidx.core.view.ActionProvider
    /* renamed from: f */
    public void mo640f(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel.m701d(null, null);
        throw null;
    }
}
