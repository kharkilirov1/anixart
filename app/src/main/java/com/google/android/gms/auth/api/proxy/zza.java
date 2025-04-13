package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator<ProxyRequest> {
    @Override // android.os.Parcelable.Creator
    public final ProxyRequest createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 2) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 3) {
                j2 = SafeParcelReader.m8155r(parcel, readInt);
            } else if (c2 == 4) {
                bArr = SafeParcelReader.m8141d(parcel, readInt);
            } else if (c2 == 5) {
                bundle = SafeParcelReader.m8140c(parcel, readInt);
            } else if (c2 != 1000) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new ProxyRequest(i2, str, i3, j2, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProxyRequest[] newArray(int i2) {
        return new ProxyRequest[i2];
    }
}
