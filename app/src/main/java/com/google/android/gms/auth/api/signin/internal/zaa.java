package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaa implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                bundle = SafeParcelReader.m8140c(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new GoogleSignInOptionsExtensionParcelable(i2, i3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i2) {
        return new GoogleSignInOptionsExtensionParcelable[i2];
    }
}
