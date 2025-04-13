package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f17184b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final byte[] f17185c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f17186d;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param String str, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i2) {
        this.f17184b = str;
        this.f17185c = bArr;
        this.f17186d = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f17184b, false);
        SafeParcelWriter.m8164c(parcel, 3, this.f17185c, false);
        int i3 = this.f17186d;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
