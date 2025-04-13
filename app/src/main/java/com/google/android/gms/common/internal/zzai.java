package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzai implements Parcelable.Creator<RootTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final RootTelemetryConfiguration createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 2) {
                z = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 3) {
                z2 = SafeParcelReader.m8151n(parcel, readInt);
            } else if (c2 == 4) {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 != 5) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i4 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new RootTelemetryConfiguration(i2, z, z2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RootTelemetryConfiguration[] newArray(int i2) {
        return new RootTelemetryConfiguration[i2];
    }
}
