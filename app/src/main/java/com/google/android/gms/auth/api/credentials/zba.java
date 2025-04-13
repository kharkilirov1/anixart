package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m8144g(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m8149l(parcel, readInt, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                case '\b':
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
                case '\t':
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\n':
                    str6 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new Credential[i2];
    }
}
