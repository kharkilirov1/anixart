package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzbx implements Parcelable.Creator<zzbw> {
    @Override // android.os.Parcelable.Creator
    public final zzbw createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str = SafeParcelReader.m8145h(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzbw(i2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbw[] newArray(int i2) {
        return new zzbw[i2];
    }
}
