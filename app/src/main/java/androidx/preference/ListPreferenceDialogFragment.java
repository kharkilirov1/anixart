package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {

    /* renamed from: j */
    public int f4927j;

    /* renamed from: k */
    public CharSequence[] f4928k;

    /* renamed from: l */
    public CharSequence[] f4929l;

    @Deprecated
    public ListPreferenceDialogFragment() {
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    /* renamed from: c */
    public void mo3353c(boolean z) {
        int i2;
        ListPreference listPreference = (ListPreference) m3396a();
        if (!z || (i2 = this.f4927j) < 0) {
            return;
        }
        String charSequence = this.f4929l[i2].toString();
        if (listPreference.m3376a(charSequence)) {
            listPreference.m3365U(charSequence);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment
    /* renamed from: d */
    public void mo3367d(@NonNull AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f4928k, this.f4927j, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragment listPreferenceDialogFragment = ListPreferenceDialogFragment.this;
                listPreferenceDialogFragment.f4927j = i2;
                listPreferenceDialogFragment.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4927j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f4928k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f4929l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m3396a();
        if (listPreference.f4920V == null || listPreference.f4921W == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f4927j = listPreference.m3363R(listPreference.f4922X);
        this.f4928k = listPreference.f4920V;
        this.f4929l = listPreference.f4921W;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f4927j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f4928k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f4929l);
    }
}
