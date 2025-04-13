package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator<HarmfulAppsData> {
    @Override // android.os.Parcelable.Creator
    public final HarmfulAppsData createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 3) {
                bArr = SafeParcelReader.m8141d(parcel, readInt);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new HarmfulAppsData(str, bArr, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HarmfulAppsData[] newArray(int i2) {
        return new HarmfulAppsData[i2];
    }
}
