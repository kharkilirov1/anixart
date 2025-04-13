package com.yandex.mobile.ads.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AdImpressionData implements ImpressionData, Parcelable {
    public static final Parcelable.Creator<AdImpressionData> CREATOR = new C4656a();

    /* renamed from: a */
    @NonNull
    private final String f47759a;

    /* renamed from: com.yandex.mobile.ads.common.AdImpressionData$a */
    public class C4656a implements Parcelable.Creator<AdImpressionData> {
        @Override // android.os.Parcelable.Creator
        public final AdImpressionData createFromParcel(Parcel parcel) {
            return new AdImpressionData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdImpressionData[] newArray(int i2) {
            return new AdImpressionData[i2];
        }
    }

    public AdImpressionData(@NonNull String str) {
        this.f47759a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f47759a.equals(((AdImpressionData) obj).f47759a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    @NonNull
    public final String getRawData() {
        return this.f47759a;
    }

    public final int hashCode() {
        return this.f47759a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f47759a);
    }

    public AdImpressionData(Parcel parcel) {
        this.f47759a = parcel.readString();
    }
}
