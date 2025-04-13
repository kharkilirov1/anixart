package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: b */
    public final LinkedHashSet<OnSelectionChangedListener<S>> f18035b = new LinkedHashSet<>();

    /* renamed from: n3 */
    public boolean mo9996n3(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f18035b.add(onSelectionChangedListener);
    }
}
