package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ServerSideReward implements Parcelable {
    public static final Parcelable.Creator<ServerSideReward> CREATOR = new C4654a();

    /* renamed from: a */
    @NonNull
    private final String f47752a;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.ServerSideReward$a */
    public class C4654a implements Parcelable.Creator<ServerSideReward> {
        @Override // android.os.Parcelable.Creator
        public final ServerSideReward createFromParcel(@NonNull Parcel parcel) {
            return new ServerSideReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerSideReward[] newArray(int i2) {
            return new ServerSideReward[i2];
        }
    }

    public ServerSideReward(@NonNull String str) {
        this.f47752a = str;
    }

    @NonNull
    /* renamed from: c */
    public final String m21938c() {
        return this.f47752a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeString(this.f47752a);
    }

    public ServerSideReward(@NonNull Parcel parcel) {
        this.f47752a = parcel.readString();
    }
}
