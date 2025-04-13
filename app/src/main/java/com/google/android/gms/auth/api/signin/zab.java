package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zab implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m8144g(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\b':
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case '\t':
                    str6 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\n':
                    arrayList = SafeParcelReader.m8149l(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\f':
                    str8 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
