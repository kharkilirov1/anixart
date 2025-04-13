package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final TokenData createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        Long l2 = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    l2 = SafeParcelReader.m8156s(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new TokenData(i2, str, l2, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenData[] newArray(int i2) {
        return new TokenData[i2];
    }
}
