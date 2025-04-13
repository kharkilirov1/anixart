package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zab implements Parcelable.Creator<zaa> {
    @Override // android.os.Parcelable.Creator
    public final zaa createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.m8144g(parcel, readInt, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zaa(i2, stringToIntConverter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaa[] newArray(int i2) {
        return new zaa[i2];
    }
}
