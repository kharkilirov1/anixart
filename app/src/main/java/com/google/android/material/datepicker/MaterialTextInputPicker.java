package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: c */
    @StyleRes
    public int f18007c;

    /* renamed from: d */
    @Nullable
    public DateSelector<S> f18008d;

    /* renamed from: e */
    @Nullable
    public CalendarConstraints f18009e;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f18007c = bundle.getInt("THEME_RES_ID_KEY");
        this.f18008d = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f18009e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f18008d.mo9983R(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f18007c)), viewGroup, bundle, this.f18009e, new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            /* renamed from: a */
            public void mo10008a() {
                Iterator<OnSelectionChangedListener<S>> it = MaterialTextInputPicker.this.f18035b.iterator();
                while (it.hasNext()) {
                    it.next().mo10008a();
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            /* renamed from: b */
            public void mo10009b(S s) {
                Iterator<OnSelectionChangedListener<S>> it = MaterialTextInputPicker.this.f18035b.iterator();
                while (it.hasNext()) {
                    it.next().mo10009b(s);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f18007c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f18008d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f18009e);
    }
}
