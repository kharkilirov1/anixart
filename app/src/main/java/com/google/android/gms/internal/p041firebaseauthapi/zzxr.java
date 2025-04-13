package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
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
                case '\b':
                    str7 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\t':
                    str8 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\n':
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 11:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\r':
                    str10 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 14:
                    str11 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 15:
                    str12 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 16:
                    z3 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 17:
                    str13 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzxq(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzxq[i2];
    }
}
