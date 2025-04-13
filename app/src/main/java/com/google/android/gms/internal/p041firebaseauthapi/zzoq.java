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
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16647b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final PhoneAuthCredential f16648c;

    @SafeParcelable.Constructor
    public zzoq(@SafeParcelable.Param String str, @SafeParcelable.Param PhoneAuthCredential phoneAuthCredential) {
        this.f16647b = str;
        this.f16648c = phoneAuthCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16647b, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f16648c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
