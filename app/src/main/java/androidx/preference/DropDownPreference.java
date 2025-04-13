package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: a0 */
    public final Context f4904a0;

    /* renamed from: b0 */
    public final ArrayAdapter f4905b0;

    /* renamed from: c0 */
    public Spinner f4906c0;

    /* renamed from: d0 */
    public final AdapterView.OnItemSelectedListener f4907d0;

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.dropdownPreferenceStyle, 0);
        this.f4907d0 = new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
                if (i2 >= 0) {
                    String charSequence = DropDownPreference.this.f4921W[i2].toString();
                    if (charSequence.equals(DropDownPreference.this.f4922X) || !DropDownPreference.this.m3376a(charSequence)) {
                        return;
                    }
                    DropDownPreference.this.m3365U(charSequence);
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f4904a0 = context;
        this.f4905b0 = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        m3343W();
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* renamed from: B */
    public void mo3339B() {
        this.f4906c0.performClick();
    }

    @Override // androidx.preference.ListPreference
    /* renamed from: T */
    public void mo3341T(@NonNull CharSequence[] charSequenceArr) {
        this.f4920V = charSequenceArr;
        m3343W();
    }

    @Override // androidx.preference.ListPreference
    /* renamed from: V */
    public void mo3342V(int i2) {
        m3365U(this.f4921W[i2].toString());
    }

    /* renamed from: W */
    public final void m3343W() {
        this.f4905b0.clear();
        CharSequence[] charSequenceArr = this.f4920V;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f4905b0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public void mo3344o() {
        super.mo3344o();
        ArrayAdapter arrayAdapter = this.f4905b0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(C2507R.id.spinner);
        this.f4906c0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f4905b0);
        this.f4906c0.setOnItemSelectedListener(this.f4907d0);
        Spinner spinner2 = this.f4906c0;
        String str = this.f4922X;
        CharSequence[] charSequenceArr = this.f4921W;
        int i2 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i2 = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i2);
        super.mo3338t(preferenceViewHolder);
    }
}
