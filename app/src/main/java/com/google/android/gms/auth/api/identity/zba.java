package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) SafeParcelReader.m8144g(parcel, readInt, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (c2 == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) SafeParcelReader.m8144g(parcel, readInt, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (c2 == 3) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 4) {
                z = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new BeginSignInRequest[i2];
    }
}
