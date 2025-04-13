package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzbc implements Parcelable.Creator<zzbb> {
    @Override // android.os.Parcelable.Creator
    public final zzbb createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzbb(str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbb[] newArray(int i2) {
        return new zzbb[i2];
    }
}
