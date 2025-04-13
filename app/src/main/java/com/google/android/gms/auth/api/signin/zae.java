package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zae implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.m8149l(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m8144g(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 6:
                    z3 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\b':
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.m8149l(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new GoogleSignInOptions(i2, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.m7858o(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
