package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    };

    /* renamed from: b */
    @NonNull
    public final Month f17893b;

    /* renamed from: c */
    @NonNull
    public final Month f17894c;

    /* renamed from: d */
    @NonNull
    public final DateValidator f17895d;

    /* renamed from: e */
    @Nullable
    public Month f17896e;

    /* renamed from: f */
    public final int f17897f;

    /* renamed from: g */
    public final int f17898g;

    /* renamed from: h */
    public final int f17899h;

    public interface DateValidator extends Parcelable {
        /* renamed from: j */
        boolean mo9974j(long j2);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i2, C12601 c12601) {
        this.f17893b = month;
        this.f17894c = month2;
        this.f17896e = month3;
        this.f17897f = i2;
        this.f17895d = dateValidator;
        if (month3 != null && month.f18011b.compareTo(month3.f18011b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f18011b.compareTo(month2.f18011b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > UtcDates.m10036i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f17899h = month.m10017k(month2) + 1;
        this.f17898g = (month2.f18013d - month.f18013d) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f17893b.equals(calendarConstraints.f17893b) && this.f17894c.equals(calendarConstraints.f17894c) && ObjectsCompat.m2022a(this.f17896e, calendarConstraints.f17896e) && this.f17897f == calendarConstraints.f17897f && this.f17895d.equals(calendarConstraints.f17895d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17893b, this.f17894c, this.f17896e, Integer.valueOf(this.f17897f), this.f17895d});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f17893b, 0);
        parcel.writeParcelable(this.f17894c, 0);
        parcel.writeParcelable(this.f17896e, 0);
        parcel.writeParcelable(this.f17895d, 0);
        parcel.writeInt(this.f17897f);
    }

    public static final class Builder {

        /* renamed from: f */
        public static final long f17900f = UtcDates.m10028a(Month.m10011c(1900, 0).f18016g);

        /* renamed from: g */
        public static final long f17901g = UtcDates.m10028a(Month.m10011c(2100, 11).f18016g);

        /* renamed from: a */
        public long f17902a;

        /* renamed from: b */
        public long f17903b;

        /* renamed from: c */
        public Long f17904c;

        /* renamed from: d */
        public int f17905d;

        /* renamed from: e */
        public DateValidator f17906e;

        public Builder() {
            this.f17902a = f17900f;
            this.f17903b = f17901g;
            this.f17906e = new DateValidatorPointForward(Long.MIN_VALUE);
        }

        public Builder(@NonNull CalendarConstraints calendarConstraints) {
            this.f17902a = f17900f;
            this.f17903b = f17901g;
            this.f17906e = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f17902a = calendarConstraints.f17893b.f18016g;
            this.f17903b = calendarConstraints.f17894c.f18016g;
            this.f17904c = Long.valueOf(calendarConstraints.f17896e.f18016g);
            this.f17905d = calendarConstraints.f17897f;
            this.f17906e = calendarConstraints.f17895d;
        }
    }
}
