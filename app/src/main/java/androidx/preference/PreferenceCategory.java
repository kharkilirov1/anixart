package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.m1749a(context, C2507R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: O */
    public boolean mo3349O() {
        return !super.mo3386n();
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public boolean mo3386n() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        if (Build.VERSION.SDK_INT >= 28) {
            preferenceViewHolder.itemView.setAccessibilityHeading(true);
        }
    }
}
