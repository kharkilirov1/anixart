package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final zzr createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzr(i2, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzr[] newArray(int i2) {
        return new zzr[i2];
    }
}
