package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.m10011c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    };

    /* renamed from: b */
    @NonNull
    public final Calendar f18011b;

    /* renamed from: c */
    public final int f18012c;

    /* renamed from: d */
    public final int f18013d;

    /* renamed from: e */
    public final int f18014e;

    /* renamed from: f */
    public final int f18015f;

    /* renamed from: g */
    public final long f18016g;

    /* renamed from: h */
    @Nullable
    public String f18017h;

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar m10031d = UtcDates.m10031d(calendar);
        this.f18011b = m10031d;
        this.f18012c = m10031d.get(2);
        this.f18013d = m10031d.get(1);
        this.f18014e = m10031d.getMaximum(7);
        this.f18015f = m10031d.getActualMaximum(5);
        this.f18016g = m10031d.getTimeInMillis();
    }

    @NonNull
    /* renamed from: c */
    public static Month m10011c(int i2, int i3) {
        Calendar m10036i = UtcDates.m10036i();
        m10036i.set(1, i2);
        m10036i.set(2, i3);
        return new Month(m10036i);
    }

    @NonNull
    /* renamed from: d */
    public static Month m10012d(long j2) {
        Calendar m10036i = UtcDates.m10036i();
        m10036i.setTimeInMillis(j2);
        return new Month(m10036i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f18011b.compareTo(month.f18011b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f18012c == month.f18012c && this.f18013d == month.f18013d;
    }

    /* renamed from: f */
    public long m10014f(int i2) {
        Calendar m10031d = UtcDates.m10031d(this.f18011b);
        m10031d.set(5, i2);
        return m10031d.getTimeInMillis();
    }

    @NonNull
    /* renamed from: h */
    public String m10015h() {
        if (this.f18017h == null) {
            this.f18017h = DateUtils.formatDateTime(null, this.f18011b.getTimeInMillis(), 8228);
        }
        return this.f18017h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18012c), Integer.valueOf(this.f18013d)});
    }

    @NonNull
    /* renamed from: i */
    public Month m10016i(int i2) {
        Calendar m10031d = UtcDates.m10031d(this.f18011b);
        m10031d.add(2, i2);
        return new Month(m10031d);
    }

    /* renamed from: k */
    public int m10017k(@NonNull Month month) {
        if (!(this.f18011b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f18012c - this.f18012c) + ((month.f18013d - this.f18013d) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.f18013d);
        parcel.writeInt(this.f18012c);
    }
}
