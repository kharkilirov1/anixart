package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final ProxyResponse createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
            } else if (c2 == 3) {
                i4 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 4) {
                bundle = SafeParcelReader.m8140c(parcel, readInt);
            } else if (c2 == 5) {
                bArr = SafeParcelReader.m8141d(parcel, readInt);
            } else if (c2 != 1000) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new ProxyResponse(i2, i3, pendingIntent, i4, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProxyResponse[] newArray(int i2) {
        return new ProxyResponse[i2];
    }
}
