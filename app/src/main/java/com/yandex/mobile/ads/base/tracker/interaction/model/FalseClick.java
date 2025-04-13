package com.yandex.mobile.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class FalseClick implements Parcelable {
    public static final Parcelable.Creator<FalseClick> CREATOR = new C4655a();

    /* renamed from: a */
    @NonNull
    private final String f47753a;

    /* renamed from: b */
    private final long f47754b;

    /* renamed from: com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick$a */
    public class C4655a implements Parcelable.Creator<FalseClick> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final FalseClick createFromParcel(@NonNull Parcel parcel) {
            return new FalseClick(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final FalseClick[] newArray(int i2) {
            return new FalseClick[i2];
        }
    }

    public FalseClick(@NonNull String str, long j2) {
        this.f47753a = str;
        this.f47754b = j2;
    }

    /* renamed from: c */
    public final long m21939c() {
        return this.f47754b;
    }

    @NonNull
    /* renamed from: d */
    public final String m21940d() {
        return this.f47753a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FalseClick falseClick = (FalseClick) obj;
        if (this.f47754b != falseClick.f47754b) {
            return false;
        }
        return this.f47753a.equals(falseClick.f47753a);
    }

    public final int hashCode() {
        int hashCode = this.f47753a.hashCode() * 31;
        long j2 = this.f47754b;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f47753a);
        parcel.writeLong(this.f47754b);
    }

    public FalseClick(@NonNull Parcel parcel) {
        this.f47753a = parcel.readString();
        this.f47754b = parcel.readLong();
    }
}
