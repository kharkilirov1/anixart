package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<AccountChangeEventsRequest> {
    @Override // android.os.Parcelable.Creator
    public final AccountChangeEventsRequest createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        Account account = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 3) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 != 4) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                account = (Account) SafeParcelReader.m8144g(parcel, readInt, Account.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new AccountChangeEventsRequest(i2, i3, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountChangeEventsRequest[] newArray(int i2) {
        return new AccountChangeEventsRequest[i2];
    }
}
