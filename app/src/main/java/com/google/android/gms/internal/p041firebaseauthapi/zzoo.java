package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzop();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16645b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final zzxq f16646c;

    @SafeParcelable.Constructor
    public zzoo(@SafeParcelable.Param String str, @SafeParcelable.Param zzxq zzxqVar) {
        this.f16645b = str;
        this.f16646c = zzxqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16645b, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f16646c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
