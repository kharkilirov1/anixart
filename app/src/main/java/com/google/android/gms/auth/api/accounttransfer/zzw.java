package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzw implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final zzv createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i3 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = SafeParcelReader.m8141d(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.m8144g(parcel, readInt, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == m8159v) {
            return new zzv(hashSet, i2, str, i3, bArr, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(C0576a.m4111j(37, "Overread allowed size end=", m8159v), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzv[] newArray(int i2) {
        return new zzv[i2];
    }
}
