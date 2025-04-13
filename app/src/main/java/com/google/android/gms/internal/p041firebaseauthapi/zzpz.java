package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.UserProfileChangeRequest;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzpz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) SafeParcelReader.m8144g(parcel, readInt, UserProfileChangeRequest.CREATOR);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str = SafeParcelReader.m8145h(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzpy(userProfileChangeRequest, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzpy[i2];
    }
}
