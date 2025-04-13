package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final zzn createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        ArrayList arrayList = null;
        zzr zzrVar = null;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
                hashSet.add(1);
            } else if (c2 == 2) {
                arrayList = SafeParcelReader.m8149l(parcel, readInt, zzt.CREATOR);
                hashSet.add(2);
            } else if (c2 == 3) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
                hashSet.add(3);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zzrVar = (zzr) SafeParcelReader.m8144g(parcel, readInt, zzr.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == m8159v) {
            return new zzn(hashSet, i2, arrayList, i3, zzrVar);
        }
        throw new SafeParcelReader.ParseException(C0576a.m4111j(37, "Overread allowed size end=", m8159v), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn[] newArray(int i2) {
        return new zzn[i2];
    }
}
