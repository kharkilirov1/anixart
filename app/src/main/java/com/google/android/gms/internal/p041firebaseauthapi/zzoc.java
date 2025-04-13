package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoc> CREATOR = new zzod();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16633b;

    @SafeParcelable.Constructor
    public zzoc(@SafeParcelable.Param String str) {
        this.f16633b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16633b, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
