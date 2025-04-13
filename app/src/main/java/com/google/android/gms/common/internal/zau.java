package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zau implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final zat createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                account = (Account) SafeParcelReader.m8144g(parcel, readInt, Account.CREATOR);
            } else if (c2 == 3) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m8144g(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zat(i2, account, i3, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i2) {
        return new zat[i2];
    }
}
