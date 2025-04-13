package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    /* renamed from: b */
    @SafeParcelable.Field
    public final long f17193b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final HarmfulAppsData[] f17194c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f17195d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f17196e;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param long j2, @SafeParcelable.Param HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z) {
        this.f17193b = j2;
        this.f17194c = harmfulAppsDataArr;
        this.f17196e = z;
        if (z) {
            this.f17195d = i2;
        } else {
            this.f17195d = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        long j2 = this.f17193b;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        SafeParcelWriter.m8171j(parcel, 3, this.f17194c, i2, false);
        int i3 = this.f17195d;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        boolean z = this.f17196e;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
