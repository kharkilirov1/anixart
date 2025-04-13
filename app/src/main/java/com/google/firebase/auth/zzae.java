package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
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
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new PhoneAuthCredential(str, str2, z, str3, z2, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new PhoneAuthCredential[i2];
    }
}
