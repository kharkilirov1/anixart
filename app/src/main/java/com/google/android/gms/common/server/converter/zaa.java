package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15843b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final StringToIntConverter f15844c;

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i2, @SafeParcelable.Param StringToIntConverter stringToIntConverter) {
        this.f15843b = i2;
        this.f15844c = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15843b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f15844c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f15843b = 1;
        this.f15844c = stringToIntConverter;
    }
}
