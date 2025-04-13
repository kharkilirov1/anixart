package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

@RestrictTo
/* loaded from: classes.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f18049b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public SingleDateSelector[] newArray(int i2) {
            return new SingleDateSelector[i2];
        }
    };

    /* renamed from: b */
    @Nullable
    public Long f18049b;

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: D0 */
    public void mo9981D0(long j2) {
        this.f18049b = Long.valueOf(j2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: N */
    public Collection<Pair<Long, Long>> mo9982N() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: R */
    public View mo9983R(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(C2507R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C2507R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.m10147a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat m10032e = UtcDates.m10032e();
        String m10033f = UtcDates.m10033f(inflate.getResources(), m10032e);
        textInputLayout.setPlaceholderText(m10033f);
        Long l2 = this.f18049b;
        if (l2 != null) {
            editText.setText(m10032e.format(l2));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(m10033f, m10032e, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: a */
            public void mo9978a() {
                onSelectionChangedListener.mo10008a();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: b */
            public void mo9979b(@Nullable Long l3) {
                if (l3 == null) {
                    SingleDateSelector.this.f18049b = null;
                } else {
                    SingleDateSelector.this.f18049b = Long.valueOf(l3.longValue());
                }
                onSelectionChangedListener.mo10009b(SingleDateSelector.this.f18049b);
            }
        });
        C1295d.m10039a(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: X */
    public int mo9984X(Context context) {
        return MaterialAttributes.m10238c(context, C2507R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: Z */
    public boolean mo9985Z() {
        return this.f18049b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: d0 */
    public Collection<Long> mo9986d0() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.f18049b;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: e */
    public String mo9987e(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l2 = this.f18049b;
        return l2 == null ? resources.getString(C2507R.string.mtrl_picker_date_header_unselected) : resources.getString(C2507R.string.mtrl_picker_date_header_selected, DateStrings.m9992d(l2.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    /* renamed from: n0 */
    public Long mo9988n0() {
        return this.f18049b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeValue(this.f18049b);
    }
}
