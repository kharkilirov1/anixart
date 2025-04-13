package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {

    /* renamed from: j */
    public EditText f4912j;

    /* renamed from: k */
    public CharSequence f4913k;

    @Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @Override // androidx.preference.PreferenceDialogFragment
    /* renamed from: b */
    public void mo3352b(@NonNull View view) {
        super.mo3352b(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f4912j = editText;
        editText.requestFocus();
        EditText editText2 = this.f4912j;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f4913k);
        EditText editText3 = this.f4912j;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    /* renamed from: c */
    public void mo3353c(boolean z) {
        if (z) {
            String obj = this.f4912j.getText().toString();
            if (m3354e().m3376a(obj)) {
                m3354e().m3350R(obj);
            }
        }
    }

    /* renamed from: e */
    public final EditTextPreference m3354e() {
        return (EditTextPreference) m3396a();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f4913k = m3354e().f4909V;
        } else {
            this.f4913k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f4913k);
    }
}
