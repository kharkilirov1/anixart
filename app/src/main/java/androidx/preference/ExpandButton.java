package androidx.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ExpandButton extends Preference {

    /* renamed from: P */
    public long f4919P;

    public ExpandButton(@NonNull Context context, List<Preference> list, long j2) {
        super(context);
        this.f4954F = C2507R.layout.expand_button;
        Drawable m497b = AppCompatResources.m497b(this.f4964b, C2507R.drawable.ic_arrow_down_24dp);
        if (this.f4974l != m497b) {
            this.f4974l = m497b;
            this.f4973k = 0;
            mo3344o();
        }
        this.f4973k = C2507R.drawable.ic_arrow_down_24dp;
        String string = this.f4964b.getString(C2507R.string.expand_button_title);
        if (!TextUtils.equals(string, this.f4971i)) {
            this.f4971i = string;
            mo3344o();
        }
        if (999 != this.f4970h) {
            this.f4970h = 999;
            m3388q();
        }
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence charSequence2 = preference.f4971i;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f4958J)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = charSequence == null ? charSequence2 : this.f4964b.getString(C2507R.string.summary_collapsed_preference_list, charSequence, charSequence2);
            }
        }
        mo3362M(charSequence);
        this.f4919P = j2 + 1000000;
    }

    @Override // androidx.preference.Preference
    /* renamed from: e */
    public long mo3361e() {
        return this.f4919P;
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        preferenceViewHolder.f5097d = false;
    }
}
