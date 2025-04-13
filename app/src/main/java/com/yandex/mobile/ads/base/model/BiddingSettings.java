package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BiddingSettings implements Parcelable {
    public static final Parcelable.Creator<BiddingSettings> CREATOR = new C4649a();

    /* renamed from: a */
    @NonNull
    private final List<AdUnitIdBiddingSettings> f47741a;

    /* renamed from: com.yandex.mobile.ads.base.model.BiddingSettings$a */
    public class C4649a implements Parcelable.Creator<BiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final BiddingSettings createFromParcel(Parcel parcel) {
            return new BiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiddingSettings[] newArray(int i2) {
            return new BiddingSettings[i2];
        }
    }

    public BiddingSettings(@NonNull ArrayList arrayList) {
        this.f47741a = arrayList;
    }

    @NonNull
    /* renamed from: c */
    public final List<AdUnitIdBiddingSettings> m21923c() {
        return this.f47741a;
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
        return this.f47741a.equals(((BiddingSettings) obj).f47741a);
    }

    public final int hashCode() {
        return this.f47741a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f47741a);
    }

    public BiddingSettings(Parcel parcel) {
        this.f47741a = parcel.createTypedArrayList(AdUnitIdBiddingSettings.CREATOR);
    }
}
