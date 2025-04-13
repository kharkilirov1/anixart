package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator<AccountChangeEvent> {
    @Override // android.os.Parcelable.Creator
    public final AccountChangeEvent createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 5:
                    i4 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new AccountChangeEvent(i2, j2, str, i3, i4, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountChangeEvent[] newArray(int i2) {
        return new AccountChangeEvent[i2];
    }
}
