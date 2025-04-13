package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzu implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final zzt createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        zzv zzvVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
                hashSet.add(1);
            } else if (c2 == 2) {
                zzvVar = (zzv) SafeParcelReader.m8144g(parcel, readInt, zzv.CREATOR);
                hashSet.add(2);
            } else if (c2 == 3) {
                str = SafeParcelReader.m8145h(parcel, readInt);
                hashSet.add(3);
            } else if (c2 == 4) {
                str2 = SafeParcelReader.m8145h(parcel, readInt);
                hashSet.add(4);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str3 = SafeParcelReader.m8145h(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == m8159v) {
            return new zzt(hashSet, i2, zzvVar, str, str2, str3);
        }
        throw new SafeParcelReader.ParseException(C0576a.m4111j(37, "Overread allowed size end=", m8159v), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt[] newArray(int i2) {
        return new zzt[i2];
    }
}
