package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpm> CREATOR = new zzpn();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PhoneAuthCredential f16665b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f16666c;

    @SafeParcelable.Constructor
    public zzpm(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @Nullable @SafeParcelable.Param String str) {
        this.f16665b = phoneAuthCredential;
        this.f16666c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16665b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16666c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
