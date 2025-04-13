package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 2) {
                str2 = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 3) {
                str3 = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                j2 = SafeParcelReader.m8155r(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzwu(str, str2, str3, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzwu[i2];
    }
}
