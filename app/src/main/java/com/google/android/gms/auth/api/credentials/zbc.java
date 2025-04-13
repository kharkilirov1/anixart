package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            char c2 = (char) readInt;
            if (c2 != 1000) {
                switch (c2) {
                    case 1:
                        z = SafeParcelReader.m8151n(parcel, readInt);
                        break;
                    case 2:
                        strArr = SafeParcelReader.m8146i(parcel, readInt);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m8144g(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.m8144g(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.m8151n(parcel, readInt);
                        break;
                    case 6:
                        str = SafeParcelReader.m8145h(parcel, readInt);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m8145h(parcel, readInt);
                        break;
                    case '\b':
                        z3 = SafeParcelReader.m8151n(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.m8158u(parcel, readInt);
                        break;
                }
            } else {
                i2 = SafeParcelReader.m8154q(parcel, readInt);
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new CredentialRequest(i2, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new CredentialRequest[i2];
    }
}
