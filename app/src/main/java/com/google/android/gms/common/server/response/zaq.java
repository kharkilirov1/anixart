package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaq implements Parcelable.Creator<SafeParcelResponse> {
    @Override // android.os.Parcelable.Creator
    public final SafeParcelResponse createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        Parcel parcel2 = null;
        zan zanVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                parcel2 = SafeParcelReader.m8143f(parcel, readInt);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zanVar = (zan) SafeParcelReader.m8144g(parcel, readInt, zan.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new SafeParcelResponse(i2, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeParcelResponse[] newArray(int i2) {
        return new SafeParcelResponse[i2];
    }
}
