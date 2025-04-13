package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 4) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m8144g(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (c2 != '\b') {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str2 = SafeParcelReader.m8145h(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
