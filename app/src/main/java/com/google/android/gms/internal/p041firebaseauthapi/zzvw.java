package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        zzxo zzxoVar = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    zzxoVar = (zzxo) SafeParcelReader.m8144g(parcel, readInt, zzxo.CREATOR);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzvv(str, z, str2, z2, zzxoVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzvv[i2];
    }
}
