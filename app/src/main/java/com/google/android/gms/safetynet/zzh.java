package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f17198b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f17199c;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param int i2, @SafeParcelable.Param boolean z) {
        this.f17198b = i2;
        this.f17199c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f17198b;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        boolean z = this.f17199c;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
