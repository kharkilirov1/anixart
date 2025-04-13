package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzl implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final ConnectionTelemetryConfiguration createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m8144g(parcel, readInt, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 3:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 4:
                    iArr = SafeParcelReader.m8142e(parcel, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m8142e(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i2, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionTelemetryConfiguration[] newArray(int i2) {
        return new ConnectionTelemetryConfiguration[i2];
    }
}
