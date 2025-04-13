package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zao implements Parcelable.Creator<zan> {
    @Override // android.os.Parcelable.Creator
    public final zan createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                arrayList = SafeParcelReader.m8149l(parcel, readInt, zal.CREATOR);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                str = SafeParcelReader.m8145h(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zan(i2, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zan[] newArray(int i2) {
        return new zan[i2];
    }
}
