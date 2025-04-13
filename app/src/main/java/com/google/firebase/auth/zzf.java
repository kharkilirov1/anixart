package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p041firebaseauthapi.zzxq;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzxq zzxqVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    zzxqVar = (zzxq) SafeParcelReader.m8144g(parcel, readInt, zzxq.CREATOR);
                    break;
                case 5:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zze(str, str2, str3, zzxqVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zze[i2];
    }
}
