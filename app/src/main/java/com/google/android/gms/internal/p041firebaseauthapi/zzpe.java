package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpe> CREATOR = new zzpf();

    /* renamed from: b */
    @SafeParcelable.Field
    public final zzxq f16658b;

    @SafeParcelable.Constructor
    public zzpe(@SafeParcelable.Param zzxq zzxqVar) {
        this.f16658b = zzxqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16658b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
