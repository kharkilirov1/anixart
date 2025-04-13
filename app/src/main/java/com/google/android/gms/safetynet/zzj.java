package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzj implements Parcelable.Creator<SafeBrowsingData> {
    /* renamed from: a */
    public static void m9684a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, safeBrowsingData.f17187b, false);
        SafeParcelWriter.m8167f(parcel, 3, safeBrowsingData.f17188c, i2, false);
        SafeParcelWriter.m8167f(parcel, 4, safeBrowsingData.f17189d, i2, false);
        long j2 = safeBrowsingData.f17190e;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        SafeParcelWriter.m8164c(parcel, 6, safeBrowsingData.f17191f, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @Override // android.os.Parcelable.Creator
    public final SafeBrowsingData createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 2) {
                str = SafeParcelReader.m8145h(parcel, readInt);
            } else if (c2 == 3) {
                dataHolder = (DataHolder) SafeParcelReader.m8144g(parcel, readInt, DataHolder.CREATOR);
            } else if (c2 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m8144g(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c2 == 5) {
                j2 = SafeParcelReader.m8155r(parcel, readInt);
            } else if (c2 != 6) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                bArr = SafeParcelReader.m8141d(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeBrowsingData[] newArray(int i2) {
        return new SafeBrowsingData[i2];
    }
}
