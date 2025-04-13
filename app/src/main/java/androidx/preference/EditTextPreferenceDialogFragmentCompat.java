package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Objects;

/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: j */
    public EditText f4914j;

    /* renamed from: k */
    public CharSequence f4915k;

    /* renamed from: l */
    public final Runnable f4916l = new Runnable() { // from class: androidx.preference.EditTextPreferenceDialogFragmentCompat.1
        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.m3358n4();
        }
    };

    /* renamed from: m */
    public long f4917m = -1;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: A3 */
    public void mo3355A3(boolean z) {
        if (z) {
            String obj = this.f4914j.getText().toString();
            EditTextPreference m3357m4 = m3357m4();
            if (m3357m4.m3376a(obj)) {
                m3357m4.m3350R(obj);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo
    /* renamed from: e4 */
    public void mo3356e4() {
        m3359o4(true);
        m3358n4();
    }

    /* renamed from: m4 */
    public final EditTextPreference m3357m4() {
        return (EditTextPreference) m3398n3();
    }

    @RestrictTo
    /* renamed from: n4 */
    public void m3358n4() {
        long j2 = this.f4917m;
        if (j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f4914j;
            if (editText == null || !editText.isFocused()) {
                m3359o4(false);
            } else if (((InputMethodManager) this.f4914j.getContext().getSystemService("input_method")).showSoftInput(this.f4914j, 0)) {
                m3359o4(false);
            } else {
                this.f4914j.removeCallbacks(this.f4916l);
                this.f4914j.postDelayed(this.f4916l, 50L);
            }
        }
    }

    /* renamed from: o4 */
    public final void m3359o4(boolean z) {
        this.f4917m = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f4915k = m3357m4().f4909V;
        } else {
            this.f4915k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f4915k);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    /* renamed from: u3 */
    public void mo3360u3(@NonNull View view) {
        super.mo3360u3(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f4914j = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f4914j.setText(this.f4915k);
        EditText editText2 = this.f4914j;
        editText2.setSelection(editText2.getText().length());
        Objects.requireNonNull(m3357m4());
    }
}
