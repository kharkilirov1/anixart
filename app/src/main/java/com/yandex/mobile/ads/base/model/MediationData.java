package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.qd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediationData implements Parcelable {
    public static final Parcelable.Creator<MediationData> CREATOR = new C4650a();

    /* renamed from: a */
    @NonNull
    private final List<qd0> f47742a;

    /* renamed from: b */
    @NonNull
    private final Map<String, String> f47743b;

    /* renamed from: com.yandex.mobile.ads.base.model.MediationData$a */
    public class C4650a implements Parcelable.Creator<MediationData> {
        @Override // android.os.Parcelable.Creator
        public final MediationData createFromParcel(Parcel parcel) {
            return new MediationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData[] newArray(int i2) {
            return new MediationData[i2];
        }
    }

    public MediationData(@NonNull ArrayList arrayList, @NonNull HashMap hashMap) {
        this.f47742a = arrayList;
        this.f47743b = hashMap;
    }

    @NonNull
    /* renamed from: c */
    public final List<qd0> m21924c() {
        return this.f47742a;
    }

    @NonNull
    /* renamed from: d */
    public final Map<String, String> m21925d() {
        return this.f47743b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f47742a);
        parcel.writeInt(this.f47743b.size());
        for (Map.Entry<String, String> entry : this.f47743b.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MediationData(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f47742a = arrayList;
        parcel.readList(arrayList, qd0.class.getClassLoader());
        int readInt = parcel.readInt();
        this.f47743b = new HashMap(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f47743b.put(parcel.readString(), parcel.readString());
        }
    }
}
