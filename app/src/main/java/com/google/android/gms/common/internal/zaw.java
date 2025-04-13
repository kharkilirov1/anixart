package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaw implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final zav createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                iBinder = SafeParcelReader.m8153p(parcel, readInt);
            } else if (c2 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m8144g(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c2 == 4) {
                z = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                z2 = SafeParcelReader.m8151n(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zav(i2, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i2) {
        return new zav[i2];
    }
}
