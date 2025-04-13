package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaj implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.common.server.converter.zaa zaaVar = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 4:
                    i4 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    i5 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (com.google.android.gms.common.server.converter.zaa) SafeParcelReader.m8144g(parcel, readInt, com.google.android.gms.common.server.converter.zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new FastJsonResponse.Field(i2, i3, z, i4, z2, str, i5, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i2) {
        return new FastJsonResponse.Field[i2];
    }
}
