package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator<AccountChangeEventsResponse> {
    @Override // android.os.Parcelable.Creator
    public final AccountChangeEventsResponse createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m8149l(parcel, readInt, AccountChangeEvent.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new AccountChangeEventsResponse(i2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountChangeEventsResponse[] newArray(int i2) {
        return new AccountChangeEventsResponse[i2];
    }
}
