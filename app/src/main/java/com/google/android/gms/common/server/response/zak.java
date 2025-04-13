package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zak implements Parcelable.Creator<zam> {
    @Override // android.os.Parcelable.Creator
    public final zam createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 != 3) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.m8144g(parcel, readInt, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zam(i2, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zam[] newArray(int i2) {
        return new zam[i2];
    }
}
