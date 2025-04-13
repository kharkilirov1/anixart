package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                z = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 2) {
                z2 = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 3) {
                z3 = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 4) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 1000) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new CredentialPickerConfig(i2, z, z2, z3, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new CredentialPickerConfig[i2];
    }
}
