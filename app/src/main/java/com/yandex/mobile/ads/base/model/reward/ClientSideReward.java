package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ClientSideReward implements Parcelable {
    public static final Parcelable.Creator<ClientSideReward> CREATOR = new C4651a();

    /* renamed from: a */
    private final int f47744a;

    /* renamed from: b */
    @NonNull
    private final String f47745b;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.ClientSideReward$a */
    public class C4651a implements Parcelable.Creator<ClientSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ClientSideReward createFromParcel(@NonNull Parcel parcel) {
            return new ClientSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientSideReward[] newArray(int i2) {
            return new ClientSideReward[i2];
        }
    }

    public ClientSideReward(int i2, @NonNull String str) {
        this.f47744a = i2;
        this.f47745b = str;
    }

    /* renamed from: c */
    public final int m21926c() {
        return this.f47744a;
    }

    @NonNull
    /* renamed from: d */
    public final String m21927d() {
        return this.f47745b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.f47744a);
        parcel.writeString(this.f47745b);
    }

    public ClientSideReward(@NonNull Parcel parcel) {
        this.f47744a = parcel.readInt();
        this.f47745b = parcel.readString();
    }
}
