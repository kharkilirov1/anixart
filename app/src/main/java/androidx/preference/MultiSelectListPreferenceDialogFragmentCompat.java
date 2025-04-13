package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: j */
    public Set<String> f4944j = new HashSet();

    /* renamed from: k */
    public boolean f4945k;

    /* renamed from: l */
    public CharSequence[] f4946l;

    /* renamed from: m */
    public CharSequence[] f4947m;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: A3 */
    public void mo3355A3(boolean z) {
        if (z && this.f4945k) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m3398n3();
            if (multiSelectListPreference.m3376a(this.f4944j)) {
                multiSelectListPreference.m3369R(this.f4944j);
            }
        }
        this.f4945k = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: c4 */
    public void mo3368c4(@NonNull AlertDialog.Builder builder) {
        int length = this.f4947m.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f4944j.contains(this.f4947m[i2].toString());
        }
        builder.mo370d(this.f4946l, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                if (z) {
                    MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat.f4945k = multiSelectListPreferenceDialogFragmentCompat.f4944j.add(multiSelectListPreferenceDialogFragmentCompat.f4947m[i3].toString()) | multiSelectListPreferenceDialogFragmentCompat.f4945k;
                } else {
                    MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat2.f4945k = multiSelectListPreferenceDialogFragmentCompat2.f4944j.remove(multiSelectListPreferenceDialogFragmentCompat2.f4947m[i3].toString()) | multiSelectListPreferenceDialogFragmentCompat2.f4945k;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4944j.clear();
            this.f4944j.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f4945k = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f4946l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f4947m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m3398n3();
        if (multiSelectListPreference.f4935V == null || multiSelectListPreference.f4936W == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f4944j.clear();
        this.f4944j.addAll(multiSelectListPreference.f4937X);
        this.f4945k = false;
        this.f4946l = multiSelectListPreference.f4935V;
        this.f4947m = multiSelectListPreference.f4936W;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f4944j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f4945k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f4946l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f4947m);
    }
}
