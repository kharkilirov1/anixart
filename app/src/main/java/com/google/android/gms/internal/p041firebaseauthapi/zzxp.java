package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m8147j(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzxo(i2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzxo[i2];
    }
}
