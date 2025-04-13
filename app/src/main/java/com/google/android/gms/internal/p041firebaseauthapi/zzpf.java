package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzpf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        zzxq zzxqVar = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zzxqVar = (zzxq) SafeParcelReader.m8144g(parcel, readInt, zzxq.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzpe(zzxqVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzpe[i2];
    }
}
