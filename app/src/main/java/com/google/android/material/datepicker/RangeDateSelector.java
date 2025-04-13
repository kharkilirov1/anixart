package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
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
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;

@RestrictTo
/* loaded from: classes.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f18037c = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f18038d = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i2) {
            return new RangeDateSelector[i2];
        }
    };

    /* renamed from: b */
    public String f18036b;

    /* renamed from: c */
    @Nullable
    public Long f18037c = null;

    /* renamed from: d */
    @Nullable
    public Long f18038d = null;

    /* renamed from: e */
    @Nullable
    public Long f18039e = null;

    /* renamed from: f */
    @Nullable
    public Long f18040f = null;

    /* renamed from: a */
    public static void m10026a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l2 = rangeDateSelector.f18039e;
        if (l2 == null || rangeDateSelector.f18040f == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f18036b.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            onSelectionChangedListener.mo10008a();
            return;
        }
        if (!rangeDateSelector.m10027c(l2.longValue(), rangeDateSelector.f18040f.longValue())) {
            textInputLayout.setError(rangeDateSelector.f18036b);
            textInputLayout2.setError(" ");
            onSelectionChangedListener.mo10008a();
        } else {
            Long l3 = rangeDateSelector.f18039e;
            rangeDateSelector.f18037c = l3;
            Long l4 = rangeDateSelector.f18040f;
            rangeDateSelector.f18038d = l4;
            onSelectionChangedListener.mo10009b(new Pair(l3, l4));
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: D0 */
    public void mo9981D0(long j2) {
        Long l2 = this.f18037c;
        if (l2 == null) {
            this.f18037c = Long.valueOf(j2);
        } else if (this.f18038d == null && m10027c(l2.longValue(), j2)) {
            this.f18038d = Long.valueOf(j2);
        } else {
            this.f18038d = null;
            this.f18037c = Long.valueOf(j2);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: N */
    public Collection<Pair<Long, Long>> mo9982N() {
        if (this.f18037c == null || this.f18038d == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f18037c, this.f18038d));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: R */
    public View mo9983R(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(C2507R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C2507R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C2507R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.m10147a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f18036b = inflate.getResources().getString(C2507R.string.mtrl_picker_invalid_range);
        SimpleDateFormat m10032e = UtcDates.m10032e();
        Long l2 = this.f18037c;
        if (l2 != null) {
            editText.setText(m10032e.format(l2));
            this.f18039e = this.f18037c;
        }
        Long l3 = this.f18038d;
        if (l3 != null) {
            editText2.setText(m10032e.format(l3));
            this.f18040f = this.f18038d;
        }
        String m10033f = UtcDates.m10033f(inflate.getResources(), m10032e);
        textInputLayout.setPlaceholderText(m10033f);
        textInputLayout2.setPlaceholderText(m10033f);
        editText.addTextChangedListener(new DateFormatTextWatcher(m10033f, m10032e, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: a */
            public void mo9978a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f18039e = null;
                RangeDateSelector.m10026a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: b */
            public void mo9979b(@Nullable Long l4) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f18039e = l4;
                RangeDateSelector.m10026a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(m10033f, m10032e, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: a */
            public void mo9978a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f18040f = null;
                RangeDateSelector.m10026a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            /* renamed from: b */
            public void mo9979b(@Nullable Long l4) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f18040f = l4;
                RangeDateSelector.m10026a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        C1295d.m10039a(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: X */
    public int mo9984X(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.m10238c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C2507R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C2507R.attr.materialCalendarTheme : C2507R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: Z */
    public boolean mo9985Z() {
        Long l2 = this.f18037c;
        return (l2 == null || this.f18038d == null || !m10027c(l2.longValue(), this.f18038d.longValue())) ? false : true;
    }

    /* renamed from: c */
    public final boolean m10027c(long j2, long j3) {
        return j2 <= j3;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: d0 */
    public Collection<Long> mo9986d0() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.f18037c;
        if (l2 != null) {
            arrayList.add(l2);
        }
        Long l3 = this.f18038d;
        if (l3 != null) {
            arrayList.add(l3);
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
        Pair pair;
        Pair pair2;
        Resources resources = context.getResources();
        Long l2 = this.f18037c;
        if (l2 == null && this.f18038d == null) {
            return resources.getString(C2507R.string.mtrl_picker_range_header_unselected);
        }
        Long l3 = this.f18038d;
        if (l3 == null) {
            return resources.getString(C2507R.string.mtrl_picker_range_header_only_start_selected, DateStrings.m9989a(l2.longValue()));
        }
        if (l2 == null) {
            return resources.getString(C2507R.string.mtrl_picker_range_header_only_end_selected, DateStrings.m9989a(l3.longValue()));
        }
        if (l2 == null && l3 == null) {
            pair = new Pair(null, null);
        } else {
            if (l2 == null) {
                pair2 = new Pair(null, DateStrings.m9990b(l3.longValue(), null));
            } else if (l3 == null) {
                pair2 = new Pair(DateStrings.m9990b(l2.longValue(), null), null);
            } else {
                Calendar m10035h = UtcDates.m10035h();
                Calendar m10036i = UtcDates.m10036i();
                m10036i.setTimeInMillis(l2.longValue());
                Calendar m10036i2 = UtcDates.m10036i();
                m10036i2.setTimeInMillis(l3.longValue());
                pair = m10036i.get(1) == m10036i2.get(1) ? m10036i.get(1) == m10035h.get(1) ? new Pair(DateStrings.m9991c(l2.longValue(), Locale.getDefault()), DateStrings.m9991c(l3.longValue(), Locale.getDefault())) : new Pair(DateStrings.m9991c(l2.longValue(), Locale.getDefault()), DateStrings.m9992d(l3.longValue(), Locale.getDefault())) : new Pair(DateStrings.m9992d(l2.longValue(), Locale.getDefault()), DateStrings.m9992d(l3.longValue(), Locale.getDefault()));
            }
            pair = pair2;
        }
        return resources.getString(C2507R.string.mtrl_picker_range_header_selected, pair.f3552a, pair.f3553b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: n0 */
    public Pair<Long, Long> mo9988n0() {
        return new Pair<>(this.f18037c, this.f18038d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeValue(this.f18037c);
        parcel.writeValue(this.f18038d);
    }
}
