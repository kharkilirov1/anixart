package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaj implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final zai createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zatVar = (zat) SafeParcelReader.m8144g(parcel, readInt, zat.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zai(i2, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i2) {
        return new zai[i2];
    }
}
