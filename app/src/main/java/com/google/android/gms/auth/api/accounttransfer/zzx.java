package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzx implements Parcelable.Creator<DeviceMetaData> {
    @Override // android.os.Parcelable.Creator
    public final DeviceMetaData createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                z = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 3) {
                j2 = SafeParcelReader.m8155r(parcel, readInt);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                z2 = SafeParcelReader.m8151n(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new DeviceMetaData(i2, z, j2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceMetaData[] newArray(int i2) {
        return new DeviceMetaData[i2];
    }
}
