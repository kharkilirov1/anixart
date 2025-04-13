package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaf implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final DataHolder createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 == 1) {
                strArr = SafeParcelReader.m8146i(parcel, readInt);
            } else if (c2 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m8148k(parcel, readInt, CursorWindow.CREATOR);
            } else if (c2 == 3) {
                i4 = SafeParcelReader.m8154q(parcel, readInt);
            } else if (c2 == 4) {
                bundle = SafeParcelReader.m8140c(parcel, readInt);
            } else if (c2 != 1000) {
                SafeParcelReader.m8158u(parcel, readInt);
            } else {
                i3 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        DataHolder dataHolder = new DataHolder(i3, strArr, cursorWindowArr, i4, bundle);
        dataHolder.f15628d = new Bundle();
        int i5 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f15627c;
            if (i5 >= strArr2.length) {
                break;
            }
            dataHolder.f15628d.putInt(strArr2[i5], i5);
            i5++;
        }
        dataHolder.f15632h = new int[dataHolder.f15629e.length];
        int i6 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.f15629e;
            if (i2 >= cursorWindowArr2.length) {
                dataHolder.f15633i = i6;
                return dataHolder;
            }
            dataHolder.f15632h[i2] = i6;
            i6 += dataHolder.f15629e[i2].getNumRows() - (i6 - cursorWindowArr2[i2].getStartPosition());
            i2++;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
