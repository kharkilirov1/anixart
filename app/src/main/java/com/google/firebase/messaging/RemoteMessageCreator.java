package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    @Nullable
    public RemoteMessage createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                bundle = SafeParcelReader.m8140c(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @Nullable
    public RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }
}
