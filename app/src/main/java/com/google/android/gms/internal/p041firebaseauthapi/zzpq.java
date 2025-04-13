package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new zzpr();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PhoneMultiFactorInfo f16676b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16677c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f16678d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final long f16679e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f16680f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f16681g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f16682h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f16683i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final boolean f16684j;

    @SafeParcelable.Constructor
    public zzpq(@SafeParcelable.Param PhoneMultiFactorInfo phoneMultiFactorInfo, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z3) {
        this.f16676b = phoneMultiFactorInfo;
        this.f16677c = str;
        this.f16678d = str2;
        this.f16679e = j2;
        this.f16680f = z;
        this.f16681g = z2;
        this.f16682h = str3;
        this.f16683i = str4;
        this.f16684j = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16676b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16677c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16678d, false);
        long j2 = this.f16679e;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        boolean z = this.f16680f;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f16681g;
        parcel.writeInt(262150);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 7, this.f16682h, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f16683i, false);
        boolean z3 = this.f16684j;
        parcel.writeInt(262153);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
