package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.swiftsoft.anixartd.C2507R;
import java.util.Arrays;

/* loaded from: classes.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i2) {
            return new TimeModel[i2];
        }
    };

    /* renamed from: b */
    public final MaxInputValidator f19240b;

    /* renamed from: c */
    public final MaxInputValidator f19241c;

    /* renamed from: d */
    public final int f19242d;

    /* renamed from: e */
    public int f19243e;

    /* renamed from: f */
    public int f19244f;

    /* renamed from: g */
    public int f19245g;

    /* renamed from: h */
    public int f19246h;

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    /* renamed from: a */
    public static String m10549a(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    @StringRes
    /* renamed from: c */
    public int m10550c() {
        return this.f19242d == 1 ? C2507R.string.material_hour_24h_suffix : C2507R.string.material_hour_suffix;
    }

    /* renamed from: d */
    public int m10551d() {
        if (this.f19242d == 1) {
            return this.f19243e % 24;
        }
        int i2 = this.f19243e;
        if (i2 % 12 == 0) {
            return 12;
        }
        return this.f19246h == 1 ? i2 - 12 : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f19243e == timeModel.f19243e && this.f19244f == timeModel.f19244f && this.f19242d == timeModel.f19242d && this.f19245g == timeModel.f19245g;
    }

    /* renamed from: f */
    public void m10552f(int i2) {
        if (this.f19242d == 1) {
            this.f19243e = i2;
        } else {
            this.f19243e = (i2 % 12) + (this.f19246h != 1 ? 0 : 12);
        }
    }

    /* renamed from: g */
    public void m10553g(int i2) {
        if (i2 != this.f19246h) {
            this.f19246h = i2;
            int i3 = this.f19243e;
            if (i3 < 12 && i2 == 1) {
                this.f19243e = i3 + 12;
            } else {
                if (i3 < 12 || i2 != 0) {
                    return;
                }
                this.f19243e = i3 - 12;
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19242d), Integer.valueOf(this.f19243e), Integer.valueOf(this.f19244f), Integer.valueOf(this.f19245g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f19243e);
        parcel.writeInt(this.f19244f);
        parcel.writeInt(this.f19245g);
        parcel.writeInt(this.f19242d);
    }

    public TimeModel(int i2, int i3, int i4, int i5) {
        this.f19243e = i2;
        this.f19244f = i3;
        this.f19245g = i4;
        this.f19242d = i5;
        this.f19246h = i2 >= 12 ? 1 : 0;
        this.f19240b = new MaxInputValidator(59);
        this.f19241c = new MaxInputValidator(i5 == 1 ? 24 : 12);
    }
}
