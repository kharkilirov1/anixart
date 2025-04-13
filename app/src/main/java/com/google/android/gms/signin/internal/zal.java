package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zal implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final zak createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m8144g(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zavVar = (zav) SafeParcelReader.m8144g(parcel, readInt, zav.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zak(i2, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i2) {
        return new zak[i2];
    }
}
