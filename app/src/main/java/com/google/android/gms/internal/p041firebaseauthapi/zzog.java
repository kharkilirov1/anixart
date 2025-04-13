package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzog extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzog> CREATOR = new zzoh();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PhoneAuthCredential f16637b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16638c;

    @SafeParcelable.Constructor
    public zzog(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param String str) {
        this.f16637b = phoneAuthCredential;
        this.f16638c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16637b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16638c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
