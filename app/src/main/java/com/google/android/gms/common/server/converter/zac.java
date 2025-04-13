package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15845b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15846c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15847d;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3) {
        this.f15845b = i2;
        this.f15846c = str;
        this.f15847d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15845b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15846c, false);
        int i4 = this.f15847d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zac(String str, int i2) {
        this.f15845b = 1;
        this.f15846c = str;
        this.f15847d = i2;
    }
}
