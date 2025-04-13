package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzns extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzns> CREATOR = new zznt();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16620b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16621c;

    @SafeParcelable.Constructor
    public zzns(@SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f16620b = str;
        this.f16621c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16620b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16621c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
