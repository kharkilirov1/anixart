package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    pendingIntent = (PendingIntent) SafeParcelReader.m8144g(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new SaveAccountLinkingTokenRequest[i2];
    }
}
