package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final zza createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str = SafeParcelReader.m8145h(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zza(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i2) {
        return new zza[i2];
    }
}
