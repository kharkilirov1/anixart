package com.google.android.gms.internal.p039authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                credential = (Credential) SafeParcelReader.m8144g(parcel, readInt, Credential.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zbp(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zbp[i2];
    }
}
