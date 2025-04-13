package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        zzwl zzwlVar = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                zzwlVar = (zzwl) SafeParcelReader.m8144g(parcel, readInt, zzwl.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzwh(zzwlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzwh[i2];
    }
}
