package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case '\b':
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzxd(str, j2, z, str2, str3, str4, z2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzxd[i2];
    }
}
