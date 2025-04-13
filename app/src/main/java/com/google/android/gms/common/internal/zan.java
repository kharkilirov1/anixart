package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zan implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final MethodInvocation createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 3:
                    i4 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 5:
                    j3 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\b':
                    i5 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case '\t':
                    i6 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new MethodInvocation(i2, i3, i4, j2, j3, str, str2, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i2) {
        return new MethodInvocation[i2];
    }
}
