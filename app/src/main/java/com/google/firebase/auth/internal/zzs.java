package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        zzx zzxVar = null;
        zzp zzpVar = null;
        com.google.firebase.auth.zze zzeVar = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                zzxVar = (zzx) SafeParcelReader.m8144g(parcel, readInt, zzx.CREATOR);
            } else if (c2 == 2) {
                zzpVar = (zzp) SafeParcelReader.m8144g(parcel, readInt, zzp.CREATOR);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zzeVar = (com.google.firebase.auth.zze) SafeParcelReader.m8144g(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzr(zzxVar, zzpVar, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzr[i2];
    }
}
