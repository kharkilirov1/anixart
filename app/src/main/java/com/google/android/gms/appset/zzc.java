package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15014b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15015c;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param int i2) {
        this.f15014b = str;
        this.f15015c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15014b, false);
        int i3 = this.f15015c;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
