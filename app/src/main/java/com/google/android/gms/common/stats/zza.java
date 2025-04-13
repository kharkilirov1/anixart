package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final WakeLockEvent createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    i4 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 6:
                    arrayList = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case '\b':
                    j3 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case '\n':
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 11:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case '\f':
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\r':
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 14:
                    i5 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 15:
                    f2 = SafeParcelReader.m8152o(parcel, readInt);
                    break;
                case 16:
                    j4 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 17:
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 18:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new WakeLockEvent(i2, j2, i3, str, i4, arrayList, str2, j3, i5, str3, str4, f2, j4, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
