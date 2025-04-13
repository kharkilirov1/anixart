package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: b */
    @NonNull
    public final Operator f17923b;

    /* renamed from: c */
    @NonNull
    public final List<CalendarConstraints.DateValidator> f17924c;

    /* renamed from: d */
    public static final Operator f17921d = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        /* renamed from: a */
        public boolean mo9977a(@NonNull List<CalendarConstraints.DateValidator> list, long j2) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.mo9974j(j2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }
    };

    /* renamed from: e */
    public static final Operator f17922e = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        /* renamed from: a */
        public boolean mo9977a(@NonNull List<CalendarConstraints.DateValidator> list, long j2) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.mo9974j(j2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            Operator operator = readInt == 2 ? CompositeDateValidator.f17922e : readInt == 1 ? CompositeDateValidator.f17921d : CompositeDateValidator.f17922e;
            Objects.requireNonNull(readArrayList);
            return new CompositeDateValidator(readArrayList, operator, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator[] newArray(int i2) {
            return new CompositeDateValidator[i2];
        }
    };

    public interface Operator {
        /* renamed from: a */
        boolean mo9977a(@NonNull List<CalendarConstraints.DateValidator> list, long j2);

        int getId();
    }

    public CompositeDateValidator(List list, Operator operator, C12611 c12611) {
        this.f17924c = list;
        this.f17923b = operator;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f17924c.equals(compositeDateValidator.f17924c) && this.f17923b.getId() == compositeDateValidator.f17923b.getId();
    }

    public int hashCode() {
        return this.f17924c.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: j */
    public boolean mo9974j(long j2) {
        return this.f17923b.mo9977a(this.f17924c, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeList(this.f17924c);
        parcel.writeInt(this.f17923b.getId());
    }
}
