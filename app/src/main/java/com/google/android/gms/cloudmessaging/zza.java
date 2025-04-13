package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final CloudMessage createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                intent = (Intent) SafeParcelReader.m8144g(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i2) {
        return new CloudMessage[i2];
    }
}
