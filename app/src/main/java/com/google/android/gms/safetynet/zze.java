package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zze implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final zzd createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        long j2 = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                j2 = SafeParcelReader.m8155r(parcel, readInt);
            } else if (c2 == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) SafeParcelReader.m8148k(parcel, readInt, HarmfulAppsData.CREATOR);
            } else if (c2 == 4) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                z = SafeParcelReader.m8151n(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzd(j2, harmfulAppsDataArr, i2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i2) {
        return new zzd[i2];
    }
}
