package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new SaveAccountLinkingTokenResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new SaveAccountLinkingTokenResult[i2];
    }
}
