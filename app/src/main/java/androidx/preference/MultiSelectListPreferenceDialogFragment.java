package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {

    /* renamed from: j */
    public Set<String> f4939j = new HashSet();

    /* renamed from: k */
    public boolean f4940k;

    /* renamed from: l */
    public CharSequence[] f4941l;

    /* renamed from: m */
    public CharSequence[] f4942m;

    @Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    /* renamed from: c */
    public void mo3353c(boolean z) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m3396a();
        if (z && this.f4940k) {
            Set<String> set = this.f4939j;
            if (multiSelectListPreference.m3376a(set)) {
                multiSelectListPreference.m3369R(set);
            }
        }
        this.f4940k = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    /* renamed from: d */
    public void mo3367d(@NonNull AlertDialog.Builder builder) {
        int length = this.f4942m.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f4939j.contains(this.f4942m[i2].toString());
        }
        builder.setMultiChoiceItems(this.f4941l, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i3, boolean z) {
                if (z) {
                    MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment.f4940k = multiSelectListPreferenceDialogFragment.f4939j.add(multiSelectListPreferenceDialogFragment.f4942m[i3].toString()) | multiSelectListPreferenceDialogFragment.f4940k;
                } else {
                    MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment2 = MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment2.f4940k = multiSelectListPreferenceDialogFragment2.f4939j.remove(multiSelectListPreferenceDialogFragment2.f4942m[i3].toString()) | multiSelectListPreferenceDialogFragment2.f4940k;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4939j.clear();
            this.f4939j.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.f4940k = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.f4941l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.f4942m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m3396a();
        if (multiSelectListPreference.f4935V == null || multiSelectListPreference.f4936W == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f4939j.clear();
        this.f4939j.addAll(multiSelectListPreference.f4937X);
        this.f4940k = false;
        this.f4941l = multiSelectListPreference.f4935V;
        this.f4942m = multiSelectListPreference.f4936W;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f4939j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f4940k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f4941l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f4942m);
    }
}
