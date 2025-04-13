package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.qd0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AdUnitIdBiddingSettings implements Parcelable {
    public static final Parcelable.Creator<AdUnitIdBiddingSettings> CREATOR = new C4648a();

    /* renamed from: a */
    @NonNull
    private final String f47738a;

    /* renamed from: b */
    @NonNull
    private final List<qd0> f47739b;

    /* renamed from: c */
    @NonNull
    private final String f47740c;

    /* renamed from: com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings$a */
    public class C4648a implements Parcelable.Creator<AdUnitIdBiddingSettings> {
        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings createFromParcel(Parcel parcel) {
            return new AdUnitIdBiddingSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdUnitIdBiddingSettings[] newArray(int i2) {
            return new AdUnitIdBiddingSettings[i2];
        }
    }

    public AdUnitIdBiddingSettings(@NonNull String str, @NonNull String str2, @NonNull ArrayList arrayList) {
        this.f47738a = str;
        this.f47739b = arrayList;
        this.f47740c = str2;
    }

    @NonNull
    /* renamed from: c */
    public final String m21920c() {
        return this.f47738a;
    }

    @NonNull
    /* renamed from: d */
    public final List<qd0> m21921d() {
        return this.f47739b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    /* renamed from: e */
    public final String m21922e() {
        return this.f47740c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdUnitIdBiddingSettings adUnitIdBiddingSettings = (AdUnitIdBiddingSettings) obj;
        return this.f47738a.equals(adUnitIdBiddingSettings.f47738a) && this.f47739b.equals(adUnitIdBiddingSettings.f47739b);
    }

    public final int hashCode() {
        return this.f47739b.hashCode() + (this.f47738a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f47739b);
        parcel.writeString(this.f47738a);
        parcel.writeString(this.f47740c);
    }

    public AdUnitIdBiddingSettings(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f47739b = arrayList;
        parcel.readList(arrayList, qd0.class.getClassLoader());
        this.f47738a = parcel.readString();
        this.f47740c = parcel.readString();
    }
}
