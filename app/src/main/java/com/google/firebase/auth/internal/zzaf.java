package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ArrayList arrayList = null;
        zzag zzagVar = null;
        String str = null;
        com.google.firebase.auth.zze zzeVar = null;
        zzx zzxVar = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                arrayList = SafeParcelReader.m8149l(parcel, readInt, PhoneMultiFactorInfo.CREATOR);
            } else if (c2 == 2) {
                zzagVar = (zzag) SafeParcelReader.m8144g(parcel, readInt, zzag.CREATOR);
            } else if (c2 == 3) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 4) {
                zzeVar = (com.google.firebase.auth.zze) SafeParcelReader.m8144g(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zzxVar = (zzx) SafeParcelReader.m8144g(parcel, readInt, zzx.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzae(arrayList, zzagVar, str, zzeVar, zzxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzae[i2];
    }
}
