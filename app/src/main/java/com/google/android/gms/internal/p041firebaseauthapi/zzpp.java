package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzpp implements Parcelable.Creator {
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
        boolean z3 = false;
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
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 7:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\b':
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\t':
                    z3 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzpo(str, str2, str3, j2, z, z2, str4, str5, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzpo[i2];
    }
}
