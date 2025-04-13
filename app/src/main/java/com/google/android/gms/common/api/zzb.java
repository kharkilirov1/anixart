package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
            } else if (c2 == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m8144g(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c2 != 1000) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new Status(i2, i3, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }
}
