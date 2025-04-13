package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m8149l(parcel, readInt, zzww.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzwy(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzwy[i2];
    }
}
