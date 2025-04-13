package com.yandex.mobile.ads.base.model.reward;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class RewardData implements Parcelable {
    public static final Parcelable.Creator<RewardData> CREATOR = new C4652a();

    /* renamed from: a */
    private final boolean f47746a;

    /* renamed from: b */
    @Nullable
    private final ClientSideReward f47747b;

    /* renamed from: c */
    @Nullable
    private final ServerSideReward f47748c;

    /* renamed from: com.yandex.mobile.ads.base.model.reward.RewardData$a */
    public class C4652a implements Parcelable.Creator<RewardData> {
        @Override // android.os.Parcelable.Creator
        public final RewardData createFromParcel(@NonNull Parcel parcel) {
            return new RewardData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardData[] newArray(int i2) {
            return new RewardData[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.model.reward.RewardData$b */
    public static class C4653b {

        /* renamed from: a */
        private boolean f47749a;

        /* renamed from: b */
        @Nullable
        private ClientSideReward f47750b;

        /* renamed from: c */
        @Nullable
        private ServerSideReward f47751c;

        @NonNull
        /* renamed from: a */
        public final RewardData m21937a() {
            return new RewardData(this, 0);
        }

        @NonNull
        /* renamed from: a */
        public final C4653b m21936a(boolean z) {
            this.f47749a = z;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C4653b m21934a(@Nullable ClientSideReward clientSideReward) {
            this.f47750b = clientSideReward;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C4653b m21935a(@Nullable ServerSideReward serverSideReward) {
            this.f47751c = serverSideReward;
            return this;
        }
    }

    public /* synthetic */ RewardData(C4653b c4653b, int i2) {
        this(c4653b);
    }

    @Nullable
    /* renamed from: c */
    public final ClientSideReward m21928c() {
        return this.f47747b;
    }

    @Nullable
    /* renamed from: d */
    public final ServerSideReward m21929d() {
        return this.f47748c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m21930e() {
        return this.f47746a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeByte(this.f47746a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f47747b, i2);
        parcel.writeParcelable(this.f47748c, i2);
    }

    private RewardData(@NonNull C4653b c4653b) {
        this.f47747b = c4653b.f47750b;
        this.f47748c = c4653b.f47751c;
        this.f47746a = c4653b.f47749a;
    }

    public RewardData(@NonNull Parcel parcel) {
        this.f47746a = parcel.readByte() != 0;
        this.f47747b = (ClientSideReward) parcel.readParcelable(ClientSideReward.class.getClassLoader());
        this.f47748c = (ServerSideReward) parcel.readParcelable(ServerSideReward.class.getClassLoader());
    }
}
