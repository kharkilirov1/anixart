package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        while (parcel.dataPosition() < m8159v) {
            SafeParcelReader.m8158u(parcel, parcel.readInt());
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new PhoneAuthProvider.ForceResendingToken();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new PhoneAuthProvider.ForceResendingToken[i2];
    }
}
