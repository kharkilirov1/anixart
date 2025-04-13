package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzu implements Parcelable.Creator {
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
        boolean z = false;
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
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    str6 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case '\b':
                    str7 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzt(str, str2, str3, str4, str5, str6, z, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzt[i2];
    }
}
