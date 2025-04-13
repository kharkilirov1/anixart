package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: j */
    public int f4931j;

    /* renamed from: k */
    public CharSequence[] f4932k;

    /* renamed from: l */
    public CharSequence[] f4933l;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: A3 */
    public void mo3355A3(boolean z) {
        int i2;
        if (!z || (i2 = this.f4931j) < 0) {
            return;
        }
        String charSequence = this.f4933l[i2].toString();
        ListPreference listPreference = (ListPreference) m3398n3();
        if (listPreference.m3376a(charSequence)) {
            listPreference.m3365U(charSequence);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: c4 */
    public void mo3368c4(@NonNull AlertDialog.Builder builder) {
        builder.mo376j(this.f4932k, this.f4931j, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.f4931j = i2;
                listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.mo375i(null, null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4931j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f4932k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f4933l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m3398n3();
        if (listPreference.f4920V == null || listPreference.f4921W == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f4931j = listPreference.m3363R(listPreference.f4922X);
        this.f4932k = listPreference.f4920V;
        this.f4933l = listPreference.f4921W;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f4931j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f4932k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f4933l);
    }
}
