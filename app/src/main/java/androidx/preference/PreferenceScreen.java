package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceManager;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: X */
    public boolean f5093X;

    @RestrictTo
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.m1749a(context, C2507R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.f5093X = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3339B() {
        PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener;
        if (this.f4976n != null || this.f4977o != null || m3427U() == 0 || (onNavigateToScreenListener = this.f4965c.f5088j) == null) {
            return;
        }
        onNavigateToScreenListener.mo3400E2(this);
    }
}
